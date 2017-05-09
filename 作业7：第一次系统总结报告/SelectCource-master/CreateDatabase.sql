

CREATE DATABASE sc ;

USE sc;



CREATE TABLE user(

user_id int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,

school_num varchar(20) NOT NULL UNIQUE,

name varchar(50) NOT NULL,

sex varchar(10),

grade varchar(100),

school varchar(100),

major varchar(100),

class varchar(100),

qq varchar(20),

phone varchar(20),

email varchar(60) NOT NULL UNIQUE,

password varchar(120) NOT NULL DEFAULT '123456',

adress varchar(200),

role int(2) NOT NULL DEFAULT '2' 

)CHARSET=utf8;



INSERT INTO user VALUES ('1', '123456', 'admin', '', '', '', '', '', '', '', 'admin@qq.com', 'admin', '', '0'); 

INSERT INTO user VALUES ('2', '223456', 'teacher1', '女', '', '计算机学院', '', '', '', '', 'teacher1@qq.com', 'teacher1', '', '1'); 

INSERT INTO user VALUES ('3', '323456', 'teacher2', '男', '', '材料学院', '', '', '', '', 'teacher2@qq.com', 'teacher2', '', '1'); 

INSERT INTO user VALUES ('4', '423456', '赖辉源', '男', '2016', '材料学院', '材料物理', '材料1601', '419765734', '17600221164', 'laihuiyuan@qq.com', 'laihuiyuan', '海南万宁', '2');

INSERT INTO user VALUES ('5', '523456', '王春柳', '女', '2016', '计算机学院', '生物医学工程', '生医1602', '2385878750', '17600110437', 'wangchunliu@qq.com', 'wangchunliu', '吉林辽源', '2');



CREATE TABLE notes(

notes_id int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,

title varchar(50) NOT NULL,

start_time varchar(12) NOT NULL,

stop_time varchar(12) NOT NULL,

description varchar(1000) NOT NULL

)CHARSET=utf8;



INSERT INTO notes VALUES ('6', '关于全校研一同学的选课通知', '2017-02-16', '2017-02-23', '此次选课将持续一周的时间，共三次机会，请同学们按时限选课。注：研一的每学期最多选两门课！');



CREATE TABLE classroom(

classroom_id int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,

capacity  int(5) NOT NULL,

location varchar(10) NOT NULL

)CHARSET=utf8;



INSERT INTO classroom VALUES ('7', '80', '3#101');

INSERT INTO classroom VALUES ('8', '160', '3#206');

INSERT INTO classroom VALUES ('9', '80', '4#101');

INSERT INTO classroom VALUES ('10', '160', '5#206');


drop table cource if exist 'cource';
CREATE TABLE cource(

cource_id int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,

cource_name varchar(20) NOT NULL,

credit varchar(5) NOT NULL,

teacher int(11) NOT NULL,

classroom int(11) NOT NULL,

schooltime varchar(30) NOT NULL,

CONSTRAINT cource_teacher FOREIGN KEY (teacher) REFERENCES user(user_id),

CONSTRAINT cource_classroom FOREIGN KEY (classroom) REFERENCES classroom(classroom_id)

)CHARSET=utf8;



INSERT INTO cource VALUES('11', '深度学习', '3', '2', '7', '周三9,10节；周五7,8节;[第14-20周]');

INSERT INTO cource VALUES('12', '材料基础', '4', '3', '8', '周三9,10节；周五9,10节；[第5-10周]');

INSERT INTO cource VALUES('13', '数据挖掘', '3', '2', '9', '周一3,4节；周二5,6节；[第5-12周]');

INSERT INTO cource VALUES('14', '流体力学', '4', '3', '10', '周二7,8节；周六3,4节；[第8-10周]');



CREATE TABLE score(

score_id int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,

student int(11) NOT NULL, 

cource int(11) NOT NULL, 

pingshi_score varchar(5) NOT NULL,

qimo_score varchar(5) NOT NULL,

final_score varchar(5) NOT NULL,

CONSTRAINT score_student FOREIGN KEY (student) REFERENCES user(user_id),

CONSTRAINT score_cource FOREIGN KEY (cource) REFERENCES cource(cource_id)

)CHARSET=utf8;



INSERT INTO score VALUES('234', '4', '12', '90', '99', '95');

INSERT INTO score VALUES('235', '4', '14', '70', '55', '60');

INSERT INTO score VALUES('236', '5', '11', '60', '90', '82');

