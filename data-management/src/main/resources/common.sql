
---------- 设置mysql分隔符为//，也就意味着，当遇到下一个//时，整体执行SQL语句
DELIMITER //
DROP PROCEDURE if EXISTS 'test';    # 如果存在test存储过程则删除
CREATE procedure test() # 创建无参存储过程,名称为test
BEGIN
    DECLARE i INT;  # 申明变量
    SET i = 0;  # 变量赋值
    WHILE i<5 DO # 结束循环的条件: 当i大于5时跳出while循环
        INSERT INTO test VALUES(i+11,'test','20');  # 往test表添加数据
        SET i = i+1;    # 循环一次,i加1
    END WHILE;  # 结束while循环
    SELECT * FROM test; # 查看test表数据
END
//  # 结束定义语句
CALL test();    # 调用存储过程
DELIMITER ; # 重新将分隔符设置为;

---------- 原字段值更新
update tablename set column1 = "cc", column2=column2 where id=123;

---------- 数据库数据有更新的时候UPDATE_TIME的时间会自动更新（长事务中UPDATE_TIME取的是update时间点）
ALTER TABLE `t_tablename` ADD COLUMN `update_time` timestamp DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '数据更新时间';