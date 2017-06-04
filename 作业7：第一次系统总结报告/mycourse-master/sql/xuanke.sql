create database db_courseselection;


use db_courseselection;


CREATE TABLE `admin` (

  `username` varchar(20) NOT NULL,

  `password` varchar(20) DEFAULT NULL,

  PRIMARY KEY (`username`)

) ENGINE=InnoDB DEFAULT CHARSET=utf8;





INSERT INTO `admin` VALUES ('123', '123');






CREATE TABLE `course` (

  `cid` int(11) NOT NULL,

  `cname` varchar(20) DEFAULT NULL,

  PRIMARY KEY (`cid`)

) ENGINE=InnoDB DEFAULT CHARSET=utf8;





INSERT INTO `course` VALUES ('1', 'DeepLearning');

INSERT INTO `course` VALUES ('2', 'OOAD');







CREATE TABLE `info` (

  `sId` int(20) DEFAULT NULL,

  `cid` int(20) DEFAULT NULL,

  `tid` int(20) DEFAULT NULL

) ENGINE=InnoDB DEFAULT CHARSET=utf8;





INSERT INTO `info` VALUES ('1', '1', '1');

INSERT INTO `info` VALUES ('1', '2', '1');






CREATE TABLE `student` (

  `sid` int(20) NOT NULL,

  `sname` varchar(20) DEFAULT NULL,

  `ssex` varchar(20) DEFAULT NULL,

  `sage` int(20) DEFAULT NULL,

  `sdept` varchar(20) DEFAULT NULL,

  PRIMARY KEY (`sid`)

) ENGINE=InnoDB DEFAULT CHARSET=utf8;




INSERT INTO `student` VALUES ('1', 'Linda', 'Female', '23', 'CS');








CREATE TABLE `teacher` (

  `tid` int(20) NOT NULL,

  `tname` varchar(20) DEFAULT NULL,

  `tsex` varchar(20) DEFAULT NULL,

  `tage` int(20) DEFAULT NULL,

  `tdept` varchar(20) DEFAULT NULL,

  `tpassword` varchar(20) DEFAULT NULL,

  PRIMARY KEY (`tid`)

) ENGINE=InnoDB DEFAULT CHARSET=utf8;





INSERT INTO `teacher` VALUES ('1', 'Tom', 'Male', '35', 'CS', '1');





CREATE TABLE `user` (

  `sid` int(11) NOT NULL,

  `password` varchar(20) DEFAULT NULL,

  PRIMARY KEY (`sid`),

  CONSTRAINT `FK_95hs7lhqpmte0xldfgel0v17j` FOREIGN KEY (`sid`) REFERENCES `student` (`sid`)

) ENGINE=InnoDB DEFAULT CHARSET=utf8;





INSERT INTO `user` VALUES ('1', '1');