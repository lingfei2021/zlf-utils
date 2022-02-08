package com.zlf.utils.springboot;

import com.zlf.utils.springboot.get_bean.ApplicationContextUtil;
import com.zlf.utils.springboot.get_bean.SpringContextUtil;
import com.zlf.utils.springboot.get_bean.UserBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author zlf
 */
@SpringBootApplication
@EnableScheduling
@EnableAsync
public class SpringbootApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);
        SpringContextUtil.setApplicationContext(context);

        UserBean userBean = (UserBean)SpringContextUtil.getBean("userBean");
        System.out.println(userBean.getUser());


        UserBean userBean2 = (UserBean) ApplicationContextUtil.getBean("userBean");
        System.out.println(userBean2.getUser());
    }

}
