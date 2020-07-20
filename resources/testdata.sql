USE course;
INSERT INTO department VALUES ("1", "SE");
INSERT INTO department VALUES ("2", "CS");

INSERT INTO timeslot VALUES("1","星期一","08:00:00","09:50:00");
INSERT INTO timeslot VALUES("2","星期一", "10:00:00","11:50:00");
INSERT INTO timeslot VALUES("3","星期一", "14:00:00","15:50:00");
INSERT INTO timeslot VALUES("4", "星期一", "16:00:00","17:50:00");
INSERT INTO timeslot VALUES("5","星期二","08:00:00","09:50:00");
INSERT INTO timeslot VALUES("6","星期二", "10:00:00","11:50:00");
INSERT INTO timeslot VALUES("7","星期二", "14:00:00","15:50:00");
INSERT INTO timeslot VALUES("8", "星期二", "16:00:00","17:50:00");

INSERT INTO course VALUES("1", "1", "ICS", "必修");
INSERT INTO course VALUES("2", "1", "SE Practice", "必修");
INSERT INTO course VALUES("3", "2", "Computer Science", "必修");
INSERT INTO course VALUES("4", "1", "Beauty of Software", "选修");
INSERT INTO course VALUES("5", "2", "Computer Hardware", "选修");

INSERT INTO userauth VALUES("admin", "admin", "0");
INSERT INTO userauth VALUES("amadeus", "adadeus", "0");

INSERT INTO student VALUES("Xingyu", "amadeus", "1",null,null,0,null,null,null,null,null);

INSERT INTO section VALUES("1","2","2019","1","1","东上院","202",3.0,"第一周到第十六周",120,1);
INSERT INTO section VALUES("1","2","2019","6","1","东上院","202",3.0,"第一周到第十六周",120,1);
INSERT INTO section VALUES("2","2","2019","2","3","东上院","109",3.0,"第一周到第十六周",60,1);
INSERT INTO section VALUES("2","2","2019","7","3","东上院","109",3.0,"第一周到第十六周",60,1);

INSERT INTO takes VALUES("2","2","2019","2","3","amadeus",null,null);