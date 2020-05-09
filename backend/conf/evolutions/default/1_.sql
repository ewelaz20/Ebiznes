# --- !Ups

CREATE TABLE "user" (
  "id"   INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
  "name" VARCHAR NOT NULL,
  "mail" VARCHAR NOT NULL,
  "password" VARCHAR NOT NULL
);

CREATE TABLE "category" (
  "id"   INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
  "name" VARCHAR NOT NULL
);



CREATE TABLE "product" (
  "id"          INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
  "name"        VARCHAR NOT NULL,
  "description" TEXT    NOT NULL,
  "price"       FLOAT   NUL NULL,
  "status"       VARCHAR   NUL NULL,
  "category"    INT     NOT NULL,
  FOREIGN KEY (category) references category (id)
);

CREATE TABLE "quantity" (
  "product" INTEGER NOT NULL,
  "amount"  INTEGER NOT NULL,
  FOREIGN KEY (product) references product (id)

);

CREATE TABLE "favourites" (
  "user" INTEGER NOT NULL,
  "product" INTEGER NOT NULL,
  FOREIGN KEY (user) references user (id),
  FOREIGN KEY (product) references product (id)

);

# --- !Downs

DROP TABLE "category";
DROP TABLE "product";
DROP TABLE "opinion";
DROP TABLE "quantity";
DROP TABLE "favourites";
DROP TABLE "opinion";

INSERT into category values (1,'blazers');
INSERT into category values (2,'dresses');
INSERT into product values (0,"bluzka","piekna nowa bluzka",100.50,"new",1);
INSERT into product values (1,"buty","piekna nowa bluzka",150.11,"new",1);
INSERT into product values (2,"kaszkiet","piekna nowa bluzka",20.50,"new",1);
INSERT into product values (3,"rajstopy","piekna nowa bluzka",10.99,"new",1);
INSERT into product values (4,"miotacz ognia","piekna nowa bluzka",10.99,"new",1);

INSERT into product values (5,"buty","piekna nowa bluzka",150.11,"new",2);
INSERT into product values (6,"kaszkiet","piekna nowa bluzka",20.50,"new",2);
INSERT into product values (7,"rajstopy","piekna nowa bluzka",10.99,"new",2);
INSERT into product values (8,"miotacz ognia","piekna nowa bluzka",10.99,"new",2);