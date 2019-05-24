INSERT INTO CATALOG_ENTITY (ID, DESCRIPTION, TITLE) VALUES (1, 'Category description example', 'Category title');
INSERT INTO CATALOG_ENTITY (ID, DESCRIPTION, TITLE) VALUES (2, 'Category description example', 'Category title');
INSERT INTO CATALOG_ENTITY (ID, BODY, TITLE, AUTHOR, TOPIC_ID) VALUES (1, 'First movie text example', 'Movie title', 'Karlis', 1);
INSERT INTO MOVIE_ENTITY (ID, BODY, TITLE, AUTHOR, TOPIC_ID) VALUES (2, 'Second movie text example', 'Movie title', 'Peteris', 1);
INSERT INTO MOVIE_ENTITY (ID, BODY, TITLE, AUTHOR, TOPIC_ID) VALUES (3, 'First movie in 2nd topic text example', 'Movie title', 'Janis', 2);
INSERT INTO MOVIE_ENTITY (ID, BODY, TITLE, AUTHOR, TOPIC_ID) VALUES (4, 'Second movie in 2nd topic text example', 'Movie title', 'Andris', 2);
INSERT INTO COMMENT_ENTITY (ID, BODY, AUTHOR, POST_ID) VALUES (1, 'First comment!', 'Andris', 2);