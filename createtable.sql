DROP SCHEMA IF EXISTS oblig4 CASCADE;
CREATE SCHEMA oblig4;
SET search_path = oblig4;

CREATE TABLE deltager
(
	mobil CHARACTER VARYING (20) NOT NULL,
    fornavn CHARACTER VARYING (20) NOT NULL,
    etternavn CHARACTER VARYING (20) NOT NULL,
	kjonn CHARACTER VARYING (20) NOT NULL,
	passord CHARACTER VARYING (256) NOT NULL,
    CONSTRAINT pk_mobil primary key(mobil)
);

insert into
 deltager(mobil, fornavn, etternavn, kjonn, passord)
 VALUES
 ('95772333', 'Anine', 'Hammersborg',  'Kvinne', '123'),
 ('95772444','AM','Gjerdalen','Mann','123'),
 ('95772555','Simen','eNavn','Mann', '123');
