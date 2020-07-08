/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2020/7/7 15:52:33                            */
/*==============================================================*/


drop table if exists administrators;

drop table if exists course;

drop table if exists section;

drop table if exists student;

drop table if exists takes;

drop table if exists teach;

drop table if exists teacher;

drop table if exists timeslot;

/*==============================================================*/
/* Table: administrators                                        */
/*==============================================================*/
create table administrators
(
   adminID              varchar(16) not null,
   name                 varchar(16),
   userID               varchar(16) not null,
   password             varchar(16) not null,
   primary key (adminID)
);

/*==============================================================*/
/* Table: course                                                */
/*==============================================================*/
create table course
(
   courseID             varchar(16) not null,
   coursename           varchar(128),
   description          varchar(1024),
   primary key (courseID)
);

/*==============================================================*/
/* Table: section                                               */
/*==============================================================*/
create table section
(
   secID                varchar(16) not null,
   semester             varchar(8) not null,
   year                 varchar(4) not null,
   timeslotID           varchar(16) not null,
   courseID             varchar(16) not null,
   building             varchar(32),
   roomnumber           varchar(4),
   credits              int,
   weeks                varchar(1024),
   maxnum               int,
   currentnum           int,
   primary key (secID, semester, year, timeslotID, courseID)
);

/*==============================================================*/
/* Table: student                                               */
/*==============================================================*/
create table student
(
   studentID            varchar(16) not null,
   name                 varchar(16),
   userID               varchar(16) not null,
   password             varchar(16) not null,
   phone                varchar(16),
   address              varchar(128),
   gender               bool,
   birthday             date,
   admisson_date        date,  
   document_type        varchar(64), 
   country              varchar(64),
   primary key (studentID)
);

/*==============================================================*/
/* Table: takes                                                 */
/*==============================================================*/
create table takes
(
   secID            varchar(16) not null,
   semester         varchar(8) not null,
   year             varchar(4) not null,
   timeslotID           varchar(16) not null,
   courseID             varchar(16) not null,
   studentID        varchar(16) not null,
   grade                numeric(3,0),
   gpa                  numeric(3,2),
   primary key (secID, semester, year, timeslotID, courseID, studentID)
);

/*==============================================================*/
/* Table: teach                                                 */
/*==============================================================*/
create table teach
(
   secID            varchar(16) not null,
   semester         varchar(8) not null,
   year             varchar(4) not null,
   timeslotID           varchar(16) not null,
   teacherID        varchar(16) not null,
   courseID             varchar(16) not null,
   primary key (secID, semester, year, timeslotID, courseID, teacherID)
);

/*==============================================================*/
/* Table: teacher                                               */
/*==============================================================*/
create table teacher
(
   teacherID            varchar(16) not null,
   name                 varchar(16),
   userID               varchar(16),
   password             varchar(16),
   primary key (teacherID)
);

/*==============================================================*/
/* Table: timeslot                                              */
/*==============================================================*/
create table timeslot
(
   timeslotID           varchar(16) not null,
   day                  varchar(4),
   starttime            time,
   endtime              time,
   primary key (timeslotID) 
);

alter table section add constraint FK_Relationship_1 foreign key (courseID)
      references course (courseID) on delete restrict on update restrict;

alter table section add constraint FK_Relationship_2 foreign key (timeslotID)
      references timeslot (timeslotID) on delete restrict on update restrict;

alter table takes add constraint FK_takes foreign key (secID, semester, year, timeslotID, courseID)
      references section (secID, semester, year, timeslotID, courseID) on delete restrict on update restrict;

alter table takes add constraint FK_takes2 foreign key (studentID)
      references student (studentID) on delete restrict on update restrict;

alter table teach add constraint FK_Reference_6 foreign key (teacherID)
      references teacher (teacherID) on delete restrict on update restrict;

alter table teach add constraint FK_teach2 foreign key (secID, semester, year, timeslotID, courseID)
      references section (secID, semester, year, timeslotID, courseID) on delete restrict on update restrict;

