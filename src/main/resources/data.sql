CREATE TABLE IF NOT EXISTS city (
  id INT NOT NULL AUTO_INCREMENT,
  city VARCHAR(45) NOT NULL,
  PRIMARY KEY (id));

CREATE TABLE IF NOT EXISTS zone_data (
  zone_id INT NOT NULL AUTO_INCREMENT,
  zone_name VARCHAR(45) NULL DEFAULT NULL,
  cleanliness_percent INT,
  city_id INT NOT NULL,
  PRIMARY KEY (zone_id),
  CONSTRAINT fk_zone_city1 FOREIGN KEY (city_id) REFERENCES city (id));


CREATE TABLE IF NOT EXISTS cleanliness_drive (
  cid INT NOT NULL AUTO_INCREMENT,
  organizer_name VARCHAR(45) NULL DEFAULT NULL,
  event_name VARCHAR(45) NULL DEFAULT NULL,
  expected_percent INT NULL DEFAULT NULL,
  drive_date Date NULL DEFAULT NULL,
  zone_id INT NOT NULL,
  PRIMARY KEY (cid),
  CONSTRAINT fk_cleanliness_drive_zone1 FOREIGN KEY (zone_id) REFERENCES zone_data (zone_id));


CREATE TABLE IF NOT EXISTS inspection (
  inspection_id INT NOT NULL AUTO_INCREMENT,
  examiner VARCHAR(45) NULL DEFAULT NULL,
  deplete_percent INT NULL DEFAULT NULL,
  inspection_date Date NULL DEFAULT NULL,
  zone_id INT NOT NULL,
  PRIMARY KEY (inspection_id),
  CONSTRAINT fk_inspection_zone1 FOREIGN KEY (zone_id) REFERENCES zone_data (zone_id));
  
INSERT INTO city VALUES (1,'Mumbai'),(2,'Banglore');
INSERT INTO zone_data VALUES (1,49,'Zone 1',1),(2,60,'Zone 2',1),(3,75,'Zone 3',1),(4,68,'Zone 1',2),(5,40,'Zone 2',2),(6,50,'Zone 3',2);
INSERT INTO cleanliness_drive (cid,organizer_name,event_name,expected_percent,drive_date,zone_id) VALUES (1,'Shuddhi ','Swachh Bharat Abhiyan',75,'2020-11-26',1),(2,'Earthlings','Cleanliness Fortnight',92,'2020-11-27',3),(3,'Project Mumbai','Jalllosh-Clean Coast',86,'2020-11-29',2),(4,'Aahwahan','Restore Beauty',80,'2020-11-30',5);
INSERT INTO inspection VALUES (1,76,'Mr.Omkar Vagekar','2020-11-26',1),(2,90,'Mr.Anush Padubidri','2020-11-30',3),(3,88,'Ms.Disha Kolapte','2020-11-24',2),(4,80,'Random Person','2020-11-26',5);
  



