--databse 
create database doktera;

\c doktera

--table 
	--symptome
	create table symptome (
		id varchar(7) primary key,
		designation varchar(50)
	);
	--medicament
	create table medicament (
		id varchar(7) primary key,
		designation varchar(50),
		prix double precision,
		age_minimum int
	);
	--patient
	create table patient (
		id varchar(7) primary key,
		nom varchar(50),
		date_de_naissance date
	);
	--patient_symptomes
	create table patient_symptomes (
		id varchar(7) primary key,
		id_patient varchar(7),
		date_visite date,
		foreign key (id_patient) references patient(id)
	);
	--patient_symptomes_details
	create table patient_symptomes_details (
		id serial primary key,
		id_patient_symptomes varchar(7),
		id_symptome varchar(7),
		level_pain int,
		foreign key (id_patient_symptomes) references patient_symptomes(id),
		foreign key (id_symptome) references symptome(id)
	);
	--medicament_symptome
	create table medicament_symptome (
		id serial primary key,
		id_medicament varchar(7),
		id_symptome varchar(7),
		unite int,
		foreign key (id_medicament) references medicament(id),
		foreign key (id_symptome) references symptome(id)
	);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	