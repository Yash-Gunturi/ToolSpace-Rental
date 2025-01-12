# ToolSpace-Rental
Rental app for tools


Database design: 
-----------------
CREATE TABLE user_type (
	type_id int NOT NULL AUTO_INCREMENT,
	type varchar(10),
	PRIMARY KEY (type_id)
);


CREATE TABLE user_db (
	user_id int NOT NULL AUTO_INCREMENT,
	firstname varchar(50),
	lastname varchar(50),
	user_type int,
	address varchar(255),
	city varchar(50),
	province varchar(50),
	country varchar(50),
	reg_date TIMESTAMP,
	PRIMARY KEY (user_id),
	FOREIGN KEY (user_type) REFERENCES user_type(type_id)

);


CREATE TABLE tool_db (
	tool_id int NOT NULL AUTO_INCREMENT,
	tool_name varchar(50),
	tool_description varchar(255),
	tool_brand varchar(50),
	tool_manufacturer varchar(50),
	tool_owner int,
	PRIMARY KEY (tool_id),
	FOREIGN KEY (tool_owner) REFERENCES user_db(user_id)
);



CREATE TABLE rental (
	tool_id int,
	rented_by int,
	start_time TIMESTAMP,
	end_time TIMESTAMP,
	FOREIGN KEY (tool_id) REFERENCES tool_db(tool_id),
	FOREIGN KEY (rented_by) REFERENCES user_db(user_id)
	
);


Run docker
----------

#Create Image
docker build -t toolspace .

#Run Container
docker run -p 8080:8080 toolspace