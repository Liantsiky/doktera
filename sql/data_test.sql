--symptome
insert into symptome values
('S1','loha'),
('S2','temperature'),
('S3','kibo'),
('S4','nify');

--medicament
insert into medicament values
('M1','paracetamol',800,1),
('M2','fervex',1600,1),
('M3','charbon',500,1),
('M4','ibuprofene',750,1);

--patient
insert into patient values
('P1','Pauline','2002-05-01');

--patient_symptomes
insert into patient_symptomes values
('PS1','P1','2024-01-11');

--patient_symptomes_details
insert into patient_symptomes_details (id_patient_symptomes,id_symptome,level_pain) values
('PS1','S1',4),
('PS1','S2',3),
('PS1','S4',6);

--medicament_symptome
insert into medicament_symptome (id_medicament,id_symptome,unite) values
--paracetamol [loha,temperature,nify]
('M1','S1',4),
('M1','S2',2),
('M1','S4',2),
--fervex [temperature,nify]
('M2','S2',4),
('M2','S4',3),
--charbon [kibo]
('M3','S3',4),
--ibuprofene [loha,nify]
('M4','S1',2),
('M4','S4',6);