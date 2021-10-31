# docker常用命令
docker --help
docker ps # 这个命令可以查看正在运行的容器， 如果想要查看以及停止的容器， 加个参数 -a 即可
docker images # 查看拉取的镜像

docker create ubuntu # 创建容器
docker start 9d # 启动容器
docker restart 9d #重新启动容器
docker run -it ubuntu #创建+启动容器， 并进入容器， 默认/bin/bash, ，-t: 选项让 Docker 分配一个伪终端并绑定到容器的标准输入上, -i: 让容器的标准输入保持打开
docker stop b7 # 停止容器
docker logs 6d # 查看容器输出
docker kill Name/ID

docker exec -it db3 /bin/sh  db3是后台容器的NAMES
docker exec -it d48b21a7e439 /bin/sh   d48b21a7e439是容器的进程ID  CONTAINER ID


docker pull hello-world # 从远程仓库拉取一个入门镜像， 不写TAG默认是latest
docker tag hello-world xxd_hello_world:1.0 #给镜像打个标签
docker inspect fce # 这里的docker inspect命令是查询镜像详情，fec 是镜像的ID
docker rmi miko2u/centos6:latest # 根据全名删除镜像， 可选参数：-f 强制删除
docker image prune  # Docker使用一段时间后 会遗留一些临时的镜像文件， 以及一些没有被使用的镜像， 该命令来进行清理

