ALTER TABLE AMERICA	ADD COLUMN FOLDER_VALUE	INT;
ALTER TABLE AMERICA	ADD COLUMN PROGRESSION_STRING	varchar;

ALTER TABLE GERMANY	add column FOLDER_VALUE INT(6);
ALTER TABLE GERMANY	add column PROGRESSION_STRING	char(36);

ALTER TABLE UNITED_KINGDOM add column FOLDER_VALUE	INT(6);
ALTER TABLE UNITED_KINGDOM add column PROGRESSION_STRING	char(36);

ALTER TABLE RUSSIAN	add column	FOLDER_VALUE INT(6);
ALTER TABLE RUSSIAN	add column	PROGRESSION_STRING	char(36);

ALTER TABLE JAPAN add column FOLDER_VALUE	INT(6);
ALTER TABLE JAPAN add column PROGRESSION_STRING	char(36);

ALTER TABLE CHINA add column FOLDER_VALUE	INT(6);
ALTER TABLE CHINA add column PROGRESSION_STRING	char(36);

ALTER TABLE ITALY add column FOLDER_VALUE	INT(6);
ALTER TABLE ITALY add column PROGRESSION_STRING	char(36);

ALTER TABLE SWEDEN add column FOLDER_VALUE	INT(6);
ALTER TABLE SWEDEN add column PROGRESSION_STRING	char(36);

ALTER TABLE FRANCE add column FOLDER_VALUE	INT(6);
ALTER TABLE FRANCE add column PROGRESSION_STRING	char(36);

commit;

