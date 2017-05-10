

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



INSERT INTO user VALUES ('100', '123456', 'admin', '', '', '', '', '', '', '', 'admin@qq.com', 'admin', '', '0'); 

INSERT INTO user VALUES ('101', '223456', 'teacher1', 'Ů', '', '�����ѧԺ', '', '', '', '', 'teacher1@qq.com', 'teacher1', '', '1'); 

INSERT INTO user VALUES ('102', '323456', 'teacher2', '��', '', '����ѧԺ', '', '', '', '', 'teacher2@qq.com', 'teacher2', '', '1'); 

INSERT INTO user VALUES ('103', '423456', '����Դ', '��', '2016', '����ѧԺ', '��������', '����1601', '419765734', '17600221164', 'laihuiyuan@qq.com', 'laihuiyuan', '��������', '2');

INSERT INTO user VALUES ('104', '523456', '������', 'Ů', '2016', '�����ѧԺ', '����ҽѧ����', '��ҽ1602', '2385878750', '17600110437', 'wangchunliu@qq.com', 'wangchunliu', '������Դ', '2');



CREATE TABLE notes(

notes_id int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,

title varchar(50) NOT NULL,

start_time varchar(12) NOT NULL,

stop_time varchar(12) NOT NULL,

description varchar(1000) NOT NULL

)CHARSET=utf8;



INSERT INTO notes VALUES ('105', '����ȫУ��һͬѧ��ѡ��֪ͨ', '2017-02-16', '2017-02-23', '�˴�ѡ�ν�����һ�ܵ�ʱ�䣬�����λ��ᣬ��ͬѧ�ǰ�ʱ��ѡ�Ρ�ע����һ��ÿѧ�����ѡ���ſΣ�');



CREATE TABLE classroom(

classroom_id int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,

capacity  int(5) NOT NULL,

location varchar(10) NOT NULL

)CHARSET=utf8;



INSERT INTO classroom VALUES ('106', '80', '3#101');

INSERT INTO classroom VALUES ('107', '160', '3#206');

INSERT INTO classroom VALUES ('108', '80', '4#101');

INSERT INTO classroom VALUES ('109', '160', '5#206');



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



INSERT INTO cource VALUES('110', '���ѧϰ', '3', '101', '106', '����9,10�ڣ�����7,8��;[��14-20��]');

INSERT INTO cource VALUES('111', '���ϻ���', '4', '102', '107', '����9,10�ڣ�����9,10�ڣ�[��5-10��]');

INSERT INTO cource VALUES('112', '�����ھ�', '3', '101', '108', '��һ3,4�ڣ��ܶ�5,6�ڣ�[��5-12��]');

INSERT INTO cource VALUES('113', '������ѧ', '4', '102', '109', '�ܶ�7,8�ڣ�����3,4�ڣ�[��8-10��]');


