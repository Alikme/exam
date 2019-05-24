INSERT INTO CATALOG_ENTITY (ID, DESCRIPTION, TITLE) VALUES (1, 'First catalog description example', 'Catalog title');
INSERT INTO CATALOG_ENTITY (ID, DESCRIPTION, TITLE) VALUES (2, 'Second catalog description example', 'Catalog title');
INSERT INTO USER_ENTITY (ID, BODY, TITLE, AUTHOR, TOPIC_ID) VALUES (1, 'First User text example', 'User title', 'Karlis', 1);
INSERT INTO USER_ENTITY (ID, BODY, TITLE, AUTHOR, TOPIC_ID) VALUES (2, 'Second User text example', 'User title', 'Peteris', 1);
INSERT INTO USER_ENTITY (ID, BODY, TITLE, AUTHOR, TOPIC_ID) VALUES (3, 'First User in 2nd topic text example', 'User title', 'Janis', 2);
INSERT INTO USER_ENTITY (ID, BODY, TITLE, AUTHOR, TOPIC_ID) VALUES (4, 'Second User in 2nd topic text example', 'User cool title', 'Andris', 2);
INSERT INTO COMMENT_ENTITY (ID, BODY, AUTHOR, POST_ID) VALUES (1, 'First comment!', 'Andris', 2);