CREATE TABLE  PAINTERS
(
  PAINTER_ID NUMBER(10) NOT NULL,
  FIRST_NAME VARCHAR2(255) NOT NULL,
  LAST_NAME VARCHAR2(255) NOT NULL,
  PSEUDONYM VARCHAR2(255) NOT NULL,
  BIRTH_DATE DATE ,
  DATE_OF_DEATH DATE,
  PICTURE VARCHAR2(4096),
  VERSION NUMBER(6)
);
CREATE UNIQUE INDEX PK_PAINTERS_ID ON PAINTERS(PAINTER_ID);
--If a painter clashes on all of these, we will treat them as the same person.
CREATE UNIQUE INDEX UK_PAINTERS_DETAILS ON PAINTERS(FIRST_NAME, LAST_NAME, PSEUDONYM);

CREATE SEQUENCE SEQ_PAINTERS
    MINVALUE 10
    MAXVALUE 9999999999
    START WITH 10
    INCREMENT BY 1;

INSERT INTO PAINTERS values  (1, 'Vincent', 'van Gogh', 'The Little Painter Fellow', NULL, NULL, 'https://upload.wikimedia.org/wikipedia/commons/d/df/Van_Gogh_self_portrait_as_an_artist.jpg',0);
INSERT INTO PAINTERS values  (2, 'San', 'of Africa', 'Pre-historic San People', NULL, NULL, 'https://en.wikipedia.org/wiki/San_people#/media/File:Namibian_Bushmen_Girls.JPG',0);

create table surface_types (
    id number (4) not null,
    name varchar(255),
    description varchar(4096)
);

insert into surface_types values (1, 'Canvas', 'Cloth stretched over a frame.');
insert into surface_types values (2, 'Rock', 'A natural rock-face, usually inside a cave, well protected from the elements.');


create table medium_types (
    id number (4) not null,
    name varchar(255),
    description varchar(4096)
);
insert into medium_types values (1, 'Thick Brush', 'A thick brush');
insert into medium_types values (2, 'Natural', 'Naturally occurring pigments, applied using naturally occurring applicators, such as leaves and twigs.');

CREATE TABLE PAINTINGS
(
  PAINTING_ID NUMBER(15) NOT NULL,
  PAINTING_NAME VARCHAR2(255),
  PAINTER_ID NUMBER(10), -- FOR UNKNOWN ARTISTS
  YEAR_FINISHED NUMBER(4) NOT NULL,
  SURFACE_TYPE NUMBER(4) NOT NULL,
  MEDIUM_TYPE NUMBER (4) NOT NULL,
  URL VARCHAR2(255)
);

CREATE SEQUENCE SEQ_PAINTINGS
    MINVALUE 10
    MAXVALUE 9999999999
    START WITH 10
    INCREMENT BY 1;

CREATE UNIQUE INDEX PK_PAINTINGS_ID ON PAINTINGS(PAINTING_ID);

insert into paintings values (1, 'View of Arles with Irises', 10, 1888, 1,1,
 'https://upload.wikimedia.org/wikipedia/commons/9/9f/VanGogh-View_of_Arles_with_Irises.jpg');

create table LOB_STORE(LOB_ID NUMBER(15) NOT NULL, BLOB_DATA BLOB);

insert into lob_store(lob_id, blob_data) values(1,null);
