1. 访问： http://localhost:8080/zhenghe/ 

2. log存储位置：G://log/log.log，配置文件位置：src/log4j.properties

3. mysql相关配置：src/com/util/DBconn.java line9-11

4. 数据库相关

   ```mysql
   create table admin_(
       ad_id varchar(25) not null,
       ad_password varchar(25),
       ad_state int(1),
       primary key(ad_id)
   );
   ## 因为有的版本数据表不能命名为admin，故表名设计文档不同，将表名称修改为admin_
   
   create table li_require (
       id varchar(25) not null,
       password varchar(25),
       state int
   );
   ## 为了与恢复修改图馆密码而存储图馆的请求
   
   ```

   ```mysql
   create table librarian (
       li_id varchar(25) not null,
       li_password varchar(25) not null,
       li_state int,
       question varchar(25) not null,
       answer varchar(25) not null,
   );
   
   create table systems(
       sys_fine int,
       sys_return_time int,
       sys_deposit int
   );

   ```
   
   

