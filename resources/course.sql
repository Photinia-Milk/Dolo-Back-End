/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2020/7/10 13:53:31                           */
/*==============================================================*/

SET FOREIGN_KEY_CHECKS = 0;

drop table if exists administrators;

drop table if exists course;

drop table if exists department;

drop table if exists section;

drop table if exists student;

drop table if exists takes;

drop table if exists teach;

drop table if exists teacher;

drop table if exists timeslot;

drop table if exists userauth;

/*==============================================================*/
/* Table: administrators                                        */
/*==============================================================*/
create table administrators
(
   user_name            varchar(16) not null,
   name                 varchar(16),
   primary key (user_name)
);

/*==============================================================*/
/* Table: course                                                */
/*==============================================================*/
create table course
(
   courseID             varchar(16) not null,
   deptID               varchar(16),
   coursename           varchar(128),
   description          varchar(1024),
   primary key (courseID)
);

/*==============================================================*/
/* Table: department                                            */
/*==============================================================*/
create table department
(
   deptID               varchar(16) not null,
   dept_name            varchar(64),
   primary key (deptID)
);

/*===================================================bu===========*/
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
   credits              numeric(2,1),
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
   name                 varchar(16),
   user_name            varchar(16) not null,
   deptID               varchar(16),
   phone                varchar(16),
   address              varchar(128),
   gender               bool,
   birthday             date,
   admisson_date        date,
   document_type        varchar(64),
   country              varchar(64),
   academic_year        varchar(4),
   primary key (user_name)
);

/*==============================================================*/
/* Table: takes                                                 */
/*==============================================================*/
create table takes
(
   secID                varchar(16) not null,
   semester             varchar(8) not null,
   year                 varchar(4) not null,
   timeslotID           varchar(16) not null,
   courseID             varchar(16) not null,
   user_name            varchar(16) not null,
   grade                numeric(3,0),
   gpa                  numeric(3,2),
   primary key (secID, semester, year, timeslotID, courseID, user_name)
);

/*==============================================================*/
/* Table: teach                                                 */
/*==============================================================*/
create table teach
(
   secID                varchar(16) not null,
   semester             varchar(8) not null,
   year                 varchar(4) not null,
   timeslotID           varchar(16) not null,
   courseID             varchar(16) not null,
   user_name            varchar(16) not null,
   primary key (secID, semester, year, timeslotID, courseID, user_name)
);

/*==============================================================*/
/* Table: teacher                                               */
/*==============================================================*/
create table teacher
(
   user_name            varchar(16) not null,
   deptID               varchar(16),
   name                 varchar(16),
   primary key (user_name)
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

/*==============================================================*/
/* Table: userauth                                              */
/*==============================================================*/
create table userauth
(
   user_name            varchar(16) not null,
   password             varchar(16),
   type                 varchar(8),
   primary key (user_name)
);

SET FOREIGN_KEY_CHECKS = 1;

alter table administrators add constraint FK_Reference_9 foreign key (user_name)
      references userauth (user_name) on delete restrict on update restrict;

alter table course add constraint FK_Reference_10 foreign key (deptID)
      references department (deptID) on delete restrict on update restrict;

alter table section add constraint FK_Relationship_1 foreign key (courseID)
      references course (courseID) on delete restrict on update restrict;

alter table section add constraint FK_Relationship_2 foreign key (timeslotID)
      references timeslot (timeslotID) on delete restrict on update restrict;

alter table student add constraint FK_Reference_11 foreign key (deptID)
      references department (deptID) on delete restrict on update restrict;

alter table student add constraint FK_Reference_7 foreign key (user_name)
      references userauth (user_name) on delete restrict on update restrict;

alter table takes add constraint FK_takes foreign key (secID, semester, year, timeslotID, courseID)
      references section (secID, semester, year, timeslotID, courseID) on delete restrict on update restrict;

alter table takes add constraint FK_takes2 foreign key (user_name)
      references student (user_name) on delete restrict on update restrict;

alter table teach add constraint FK_Reference_6 foreign key (user_name)
      references teacher (user_name) on delete restrict on update restrict;

alter table teach add constraint FK_teach2 foreign key (secID, semester, year, timeslotID, courseID)
      references section (secID, semester, year, timeslotID, courseID) on delete restrict on update restrict;

alter table teacher add constraint FK_Reference_12 foreign key (deptID)
      references department (deptID) on delete restrict on update restrict;

alter table teacher add constraint FK_Reference_8 foreign key (user_name)
      references userauth (user_name) on delete restrict on update restrict;
			


