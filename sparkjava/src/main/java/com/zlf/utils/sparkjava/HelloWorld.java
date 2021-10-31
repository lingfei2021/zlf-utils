package com.zlf.utils.sparkjava;
import com.google.gson.Gson;

import static spark.Spark.*;

/**
 * spark是最容易建立一个java web应用的开发框架，但它提供了对大多数类型的项目来说足够的功能。
 *
 * 一个spark应用的主要模块就是一组路由。路由有三部分组成：
 *  　　　一个方法。（get,post,put,delete,head,trace,connect,options）.
 * 　　　 一个路径。(例如/hello, /users/:name)
 * 　　　 一个回调。(request,response)->{}
 *
 *  　　路由的匹配是按照路由的定义顺序匹配的。请求会触发第一个匹配的路由。
 */
public class HelloWorld {

    public static void main(String[] args) {
        port(80);
        //Static files location must be configured before route mapping.
        //If your application has no routes, init() must be called manually after location is set.
        sparkStaticFiles();
        sparkThreadPool();

        sparkGet();
        sparkFilter();
        sparkException();
        sparkResponseTransformer();

        // Wait for server to be initialized.
        // IllegalStateException: Server has not been properly initialized
        awaitInitialization();
    }
    private static void sparkThreadPool(){
        int maxThreads = 8;
        int minThreads = 2;
        int timeOutMillis = 30000;
        threadPool(maxThreads, minThreads, timeOutMillis);
    }
    private static void sparkResponseTransformer(){
        Gson gson = new Gson();
        get("/response/transformer",
                (request, response) -> new MyMessage(1,"Hello World"));
        get("/response/transformer/1",
                (request, response) -> new MyMessage(1,"Hello World"),
                gson::toJson);
    }
    private static void sparkStaticFiles(){
        //使用staticFileLocation方法，你可以在classpath中指定一个文件夹为静态文件提供服务。
        //注意，公共目录不要包含在url中。一个文件/public/css/style.css访问路径为：http://{host}:{port}/css/style.css
        staticFileLocation("/static"); // Static files

        //还可以使用externalStaticFileLocationMethod在设置一个外部目录(不在classpath)为静态文件提供服务：
        externalStaticFileLocation("/Users/zhanglingfei/Downloads"); // Static files
    }
    private static void sparkException(){
        get("/throwexception", (request, response) -> {
            throw new NoSuchMethodException();
        });
        //处理配置的所有的过滤器和路由的异常：
        exception(NoSuchMethodException.class, (e, request, response) -> {
            response.status(404);
            response.body("Resource not found ...");
        });
    }
    private static void sparkFilter(){
        //前置过滤器在请求处理前进行处理，可以读取请求，读取/修改响应。
        before((request, response) -> {
            boolean authenticated = true;
            // ... check if authenticated
            if (!authenticated) {
                halt(401, "You are not welcome here");
            }
        });
        before("/protected/*", (request, response) -> {
            // ... check if authenticated
            halt(401, "Go Away!");
        });

        //后置过滤器在请求处理后进行，可以读取请求，读取/修改响应：
        after((request, response) -> {
            response.header("foo", "set by after filter");
        });

    }
    private static void sparkGet(){
        get("/hello", (req, res) -> "Hello World");

        // matches "GET /hello/foo" and "GET /hello/bar"
        // request.params(":name") is 'foo' or 'bar'
        get("/hello/:name", (request, response) -> {
            response.header("name", request.params(":name"));
            return "Hello: " + request.params(":name");
        });

        // matches "GET /say/hello/to/world"
        // request.splat()[0] is 'hello' and request.splat()[1] 'world'
        get("/say/*/to/*", (request, response) -> {
            return "Number of splat parameters: " + request.splat().length+
                    ", request.splat()[0]="+request.splat()[0]+
                    ", request.splat()[1]="+request.splat()[1];
        });

        get("/req/res", (req, res) -> {
            String name = req.params("name");
            System.out.println("req.params: name="+name);
            res.redirect("/redirect");
            return res;
        });

        get("/redirect", (req, res) -> {
            String body = req.body();
            String body1 = res.body();
            return body+" - "+body1;
        });
    }
}
