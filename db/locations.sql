USE `RDCRMS`;

CREATE TABLE `COUNTRY`(
   `COUNTRY_ID` int PRIMARY KEY AUTO_INCREMENT,
   `COUNTRY_NAME` VARCHAR(20) 
);

CREATE TABLE `STATE`(
   `STATE_ID` int PRIMARY KEY AUTO_INCREMENT,
   `STATE_NAME` VARCHAR(25),
   `COUNTRY_ID` INT ,
   FOREIGN KEY (COUNTRY_ID) REFERENCES `COUNTRY`(COUNTRY_ID)  
);

CREATE TABLE `DISTRICT`(
   `DISTRICT_ID` INT PRIMARY KEY AUTO_INCREMENT,
   `DISTRICT_NAME` VARCHAR(30),
   `STATE_ID` INT,
   FOREIGN KEY (STATE_ID) REFERENCES `STATE` (STATE_ID)
);

CREATE TABLE `MANDAL`(
   `MANDAL_ID` INT PRIMARY KEY AUTO_INCREMENT,
   `MANDAL_NAME` VARCHAR(30),
   `DISTRICT_ID` INT,
   FOREIGN KEY (DISTRICT_ID) REFERENCES `DISTRICT`(DISTRICT_ID)
);

CREATE TABLE `VILLAGE`(
  `VILLAGE_ID` INT PRIMARY KEY AUTO_INCREMENT,
  `VILLAGE_NAME` VARCHAR(30),
  `MANDAL_ID` INT,
  FOREIGN KEY (MANDAL_ID) REFERENCES `MANDAL`(MANDAL_ID)
);

INSERT INTO `COUNTRY` (COUNTRY_NAME) VALUES ('INDIA');


INSERT INTO `STATE` (STATE_NAME,COUNTRY_ID) VALUES ('ANDHAR PRADESH',1);
INSERT INTO `STATE` (state_name,country_id) values ('Delhi(UT)',1);


INSERT INTO `DISTRICT` (DISTRICT_NAME,STATE_ID) VALUES ('SPSR NELLORE',1);
INSERT INTO `DISTRICT` (district_name,state_id) values ('Central Delhi',2);
INSERT INTO `DISTRICT` (district_name,state_id) values ('East Delhi ',2);
INSERT INTO `DISTRICT` (district_name,state_id) values ('New Delhi ',2);
INSERT INTO `DISTRICT` (district_name,state_id) values ('North East Delhi ',2);
INSERT INTO `DISTRICT` (district_name,state_id) values ('North West Delhi ',2);
INSERT INTO `DISTRICT` (district_name,state_id) values ('Shahdara',2);
INSERT INTO `DISTRICT` (district_name,state_id) values ('South Delhi',2);
INSERT INTO `DISTRICT` (district_name,state_id) values ('South East Delhi',2);
INSERT INTO `DISTRICT` (district_name,state_id) values ('South West Delhi',2);
INSERT INTO `DISTRICT` (district_name,state_id) values ('West Delhi',2);
INSERT INTO `DISTRICT` (district_name,state_id) values ('North Delhi',2);

  
INSERT INTO `MANDAL` (MANDAL_NAME,DISTRICT_ID) VALUES ('MUTHUKUR',1);
INSERT INTO `MANDAL` (mandal_name,district_id) values ('Karol Bagh',2);
INSERT INTO `MANDAL` (mandal_name,district_id) values ('Civil Lines',2);  
INSERT INTO `MANDAL` (mandal_name,district_id) values ('Kotwali',2);
INSERT INTO `MANDAL` (mandal_name,district_id) values ('Preet Vihar',3);
INSERT INTO `MANDAL` (mandal_name,district_id) values ('Vivek Vihar',3);
INSERT INTO `MANDAL` (mandal_name,district_id) values ('Shahdara',3);
INSERT INTO `MANDAL` (mandal_name,district_id) values ('Kalkaji',3);
INSERT INTO `MANDAL` (mandal_name,district_id) values ('Laxmi Nagar',3);
INSERT INTO `MANDAL` (mandal_name,district_id) values ('Connaught Place',4);
INSERT INTO `MANDAL` (mandal_name,district_id) values ('India Gate',4);
INSERT INTO `MANDAL` (mandal_name,district_id) values ('Chanakyapuri',4);
INSERT INTO `MANDAL` (mandal_name,district_id) values ('Chanakyapuri',4);
INSERT INTO `MANDAL` (mandal_name,district_id) values ('Sadar Bazar',12);
INSERT INTO `MANDAL` (mandal_name,district_id) values ('Civil Lines',12);
INSERT INTO `MANDAL` (mandal_name,district_id) values ('Seelampur',5);
INSERT INTO `MANDAL` (mandal_name,district_id) values ('Gokulpuri',5);
INSERT INTO `MANDAL` (mandal_name,district_id) values ('Loni',5);
INSERT INTO `MANDAL` (mandal_name,district_id) values ('Rohini',6); 
INSERT INTO `MANDAL` (mandal_name,district_id) values ('Model Town',6);
INSERT INTO `MANDAL` (mandal_name,district_id) values ('Alipur',6);
INSERT INTO `MANDAL` (mandal_name,district_id) values ('Bawana',6);
INSERT INTO `MANDAL` (mandal_name,district_id) values ('Kashmere Gate',7);
INSERT INTO `MANDAL` (mandal_name,district_id) values ('Kashmere Gate',7);
INSERT INTO `MANDAL` (mandal_name,district_id) values ('Saidulajab',8);
INSERT INTO `MANDAL` (mandal_name,district_id) values ('Mehrauli',8);
INSERT INTO `MANDAL` (mandal_name,district_id) values ('Ambedkar Nagar',8);
INSERT INTO `MANDAL` (mandal_name,district_id) values ('Lajpat Nagar',9);
INSERT INTO `MANDAL` (mandal_name,district_id) values ('Sarita Vihar',9);

INSERT INTO `VILLAGE` (VILLAGE_NAME,MANDAL_ID) VALUES ('KRISHNAPATNAM',1);
INSERT INTO `VILLAGE` (village_name,mandal_id) values('Karol Bagh',2);
INSERT INTO `VILLAGE` (village_name,mandal_id) values('Dev Nagar',2);
INSERT INTO `VILLAGE` (village_name,mandal_id) values('Shahdara Village',7);
INSERT INTO `VILLAGE` (village_name,mandal_id) values('Bhagwati Garden',7);
INSERT INTO `VILLAGE` (village_name,mandal_id) values('Khasra Village',23);
INSERT INTO `VILLAGE` (village_name,mandal_id) values('Mustafabad',23);
INSERT INTO `VILLAGE` (village_name,mandal_id) values('Maujpur Village',27);
INSERT INTO `VILLAGE` (village_name,mandal_id) values('Jaitpur Village',27); 
INSERT INTO `VILLAGE` (village_name,mandal_id) values('Palla Village',21);
INSERT INTO `VILLAGE` (village_name,mandal_id) values('Rohini Village',21);
