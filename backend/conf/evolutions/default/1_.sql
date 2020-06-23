# --- !Ups

CREATE TABLE "AppUser" (
	"Id"	TEXT NOT NULL UNIQUE,
	"Email"	TEXT NOT NULL,
	"FirstName"	TEXT,
	"LastName"	TEXT,
    "Role"	TEXT NOT NULL,
	PRIMARY KEY("Id")
);

CREATE TABLE "LoginInfo" (
	"Id"	TEXT NOT NULL UNIQUE,
	"ProviderId"	TEXT NOT NULL,
	"ProviderKey"	TEXT NOT NULL
);

CREATE TABLE "UserLoginInfo" (
	"UserId"	TEXT NOT NULL,
	"LoginInfoId"	TEXT NOT NULL,
	FOREIGN KEY("UserId") REFERENCES "AppUser"("Id"),
	FOREIGN KEY("LoginInfoId") REFERENCES "LoginInfo"("Id")
);


CREATE TABLE "PasswordInfo" (
	"Hasher"	TEXT NOT NULL,
	"Password"	TEXT NOT NULL,
	"Salt"	TEXT,
	"LoginInfoId"	TEXT NOT NULL,
	FOREIGN KEY("LoginInfoId") REFERENCES "LoginInfo"("Id")
);

CREATE TABLE "OAuth2Info" (
	"Id"	TEXT NOT NULL UNIQUE,
	"AccessToken"	TEXT NOT NULL,
	"TokenType"	TEXT,
	"ExpiresIn"	INTEGER,
	"RefreshToken"	TEXT,
	"LoginInfoId"	TEXT NOT NULL,
	PRIMARY KEY("Id"),
	FOREIGN KEY("LoginInfoId") REFERENCES "LoginInfo"("Id")
);


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



CREATE TABLE "newsletter" (
  "id"   INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
  "mail" VARCHAR NOT NULL
);

CREATE TABLE "notify" (
  "id"   INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
  "mail" VARCHAR NOT NULL,
  "product" INT NOT NULL, FOREIGN KEY(product) references product(id)
);

CREATE TABLE "contact"(
 "id"   INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
 "address" VARCHAR NOT NULL,
 "phone" VARCHAR NOT NULL,
 "email" VARCHAR NOT NULL
);

CREATE TABLE "about"(
 "id"   INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
 "about" VARCHAR NOT NULL

);

CREATE TABLE "product" (
  "id"          INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
  "name"        VARCHAR NOT NULL,
  "reference" TEXT    NOT NULL,
  "description" TEXT    NOT NULL,
  "quantity" INT NOT NULL,
  "price"       FLOAT   NUL NULL,
  "status"       VARCHAR   NUL NULL,
  "category"    INT     NOT NULL,
  "image" TEXT NOT NULL,
  FOREIGN KEY (category) references category (id)
);


CREATE TABLE "favourites" (
  "user" VARCHAR NOT NULL,
  "product" INTEGER NOT NULL,
  FOREIGN KEY (user) references user (id),
  FOREIGN KEY (product) references product (id)

);

CREATE TABLE "sizes" (
  "product"   INTEGER NOT NULL,
  "value" VARCHAR NOT NULL,
    FOREIGN KEY (product) references product (id)
);


CREATE TABLE "userAccount" (
 "user" VARCHAR NOT NULL,
   "firstName"   VARCHAR NOT NULL,
  "lastName" VARCHAR NOT NULL,
  "address" VARCHAR NOT NULL,
  "zip" VARCHAR NOT NULL,
  "phone" VARCHAR NOT NULL,
  "email" VARCHAR NOT NULL

);

# --- !Downs

DROP TABLE "category";
DROP TABLE "product";
DROP TABLE "opinion";
DROP TABLE "quantity";
DROP TABLE "favourites";
DROP TABLE "opinion";
DROP TABLE "newsletter";

INSERT into about values (0, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");

INSERT into contact values (1, "Michael I. Days 3756 Preston Street Wichita, KS 67213", "+1-888 705 770", "contactinfo@gmail.com" );

INSERT into category values (1,'blazers');
INSERT into category values (2,'dresses');
INSERT into category values (3,'trousers');
INSERT into category values (4,'skirts');
INSERT into category values (5,'coats');
INSERT into category values (6,'blouses');
INSERT into category values (7,'accessories');
INSERT into category values (8,'shoes');

INSERT into product values (0,"Tweed cotton jacket","43059082-ZLYON-LM","Cotton-blend fabric. Tweed fabric. Fringed finish. Three quarter sleeve. Decorative pocket. Inner lining.

Side length 28.5 cm
Back length 49.5 cm
These measures have been calculated for a S size.

Material: COMPOSITION:85% COTTON,15% POLYESTER. LINING:100% VISCOSE. SLEEVE LINING:100% POLYESTER. FRINGE:100% COTTON",15 ,33.50,"new",1, "https://static.zara.net/photos///2020/V/0/1/p/2687/396/112/72/w/466/2687396112_1_1_1.jpg?ts=1586183728953");
INSERT into product values (1,"Flecked suit blazer","41095726-NIMES-LM", "Structured design. Fabric with linen. Speckled jacquard. Lapels. Long sleeve with buttoned cuffs. Two pockets with flaps. Back-slit hem. Inner lining.

Side length 49.5 cm
Back length 71.0 cm

Material: COMPOSITION:94% POLYESTER,5% LINEN,1% ELASTANE. LINING:55% POLYESTER,45% VISCOSE. SLEEVE LINING:100% POLYESTER",10 ,49.99,"new",1, "https://static.zara.net/photos///2020/V/0/1/p/2864/732/710/75/w/1141/2864732710_2_11_1.jpg?ts=1587842331677");
INSERT into product values (2,"Animal print suit blazer","41077795-CORK-LM","Unstructured design. Linen mix. Animal print. Lapels. Rolled-up three-quarter sleeves. Two side welt pockets. Interior cotton lining.

Side length 47.7 cm
Back length 74.7 cm
These measures have been calculated for a S size.

Material: COMPOSITION:72% VISCOSE,28% LINEN. LINING:100% COTTON. SLEEVE LINING:100% POLYESTER. PIPING:100% COTTON",0 ,39.99,"new",1, "https://static.zara.net/photos///2020/V/0/1/p/2830/867/074/73/w/1141/2830867074_2_16_1.jpg?ts=1586964235914");
INSERT into product values (3,"Striped structured blazer","43038814-LIN-LM","Structured design. Short design. Striped print. Lapels. Long sleeves with slit. Two pockets with flaps. Double back slit. Button fastening on the front section.

Back length 73.5 cm
These measures have been calculated for a S size.

Material: COMPOSITION:46% VISCOSE,29% COTTON,25% LINEN. LINING:100% VISCOSE. PIPING:73% VISCOSE,27% POLYESTER. POCKETS LINING:73% VISCOSE,27% POLYESTER",2,35.99,"new",1, "https://static.zara.net/photos///2020/V/0/1/p/8073/120/401/2/w/1141/8073120401_2_3_1.jpg?ts=1581003780602");
INSERT into product values (4,"Modal-blend suit blazer","41095760-TEMPO-LM","Structured design. Modal fabric. Lapel-collar. Lapel with notch. Long sleeve with buttoned cuffs. Two side pockets with flaps. Inner lining. Double button fastening.

Side length 47.7 cm
Back length 68.0 cm
These measures have been calculated for a 4 size.

Material: COMPOSITION:70% MODAL,30% POLYESTER. LINING:100% POLYESTER", 11 ,69.99,"new",1, "https://static.zara.net/photos///2020/V/0/1/p/2556/878/712/2/w/1141/2556878712_2_1_1.jpg?ts=1582704928466");

INSERT into product values (5,"Structured suit blazer","41080752-OFFICE-LM0", "Structured design. Lapels. Quilted panels on the shoulders. Long sleeve. Two pockets with flaps. Back slit. Inner lining.

Structured design, sharp lapels and discreet shoulder pads. The top piece of the perfect suit, this blazer is made for the office, and for everything else.
Side length 49.4 cm
Back length 66.9 cm

Material: COMPOSITION:76% POLYESTER,18% VISCOSE,6% ELASTANE. LINING:55% POLYESTER,45% VISCOSE. SLEEVE LINING:100% POLYESTER",0,59.99,"new",1, "https://static.zara.net/photos///2020/V/0/1/p/2757/397/403/72/w/1141/2757397403_2_11_1.jpg?ts=1586765845769");
INSERT into product values (6,"Check suit blazer","41057783-MALIA-LM", "Structured design. Check fabric. Lapels. Long sleeve. Two side welt pockets. Chest pocket. Double button fastening. Inner lining.

Side length 50.1 cm
Back length 71.9 cm
These measures have been calculated for a 4 size.

Material: COMPOSITION:55% VISCOSE,42% POLYESTER,3% ELASTANE. LINING:100% POLYESTER",0,65.99,"new",1, "https://static.zara.net/photos///2020/V/0/1/p/2753/129/252/72/w/1141/2753129252_2_11_1.jpg?ts=1586765557615");



//dress

INSERT into product values (7,"Buttoned printed dress","41083749-NEKO-LM", "Straight design. Knitted fabric. Print. V-neck. Short sleeve. Button fastening on the front section.

Side length 66.0 cm
Back length 86.5 cm

Material: COMPOSITION:70% POLYESTER,29% VISCOSE,1% ELASTANE. PIPING:100% VISCOSE",8,29.99,"new",2,"https://static.zara.net/photos///2020/V/0/1/p/3519/001/401/72/w/1141/3519001401_2_15_1.jpg?ts=1588178620389");

INSERT into product values (8,'Flower dress', '9006/065', 'Straight design. Tweed fabric. Cotton fabric. Crossed V-neck. Short sleeve. Two side patch pockets. Side button fastening. Decorative buttons. Inner lining.'|| char(13) || 'Side length 66.0 cm Back length 86.5 cm'|| char(13) || 'Material:COMPOSITION:82% POLYESTER,8% ACRYLIC,6% WOOL,2% VISCOSE,2% POLYAMIDE. LINING:100% POLYESTER',9,39.99,'new',2,'https://static.zara.net/photos///2020/V/0/1/p/9006/065/330/2/w/1141/9006065330_2_15_1.jpg?ts=1586938752227');
INSERT into product values (9,"Jacquard dress", "9006/065", "Straight design. Tweed fabric. Cotton fabric. Crossed V-neck. Short sleeve. Two side patch pockets. Side button fastening. Decorative buttons. Inner lining.

Side length 66.0 cm
Back length 86.5 cm

Material:COMPOSITION:82% POLYESTER,8% ACRYLIC,6% WOOL,2% VISCOSE,2% POLYAMIDE. LINING:100% POLYESTER",5,34.99,"new",2, "https://static.zara.net/photos///2020/V/0/1/p/1822/010/098/2/w/1141/1822010098_2_1_1.jpg?ts=1584452177135");

INSERT into product values (10,"Black dress with embrodiery", "9006/065", "Straight design. Tweed fabric. Cotton fabric. Crossed V-neck. Short sleeve. Two side patch pockets. Side button fastening. Decorative buttons. Inner lining.

Side length 66.0 cm
Back length 86.5 cm

Material:COMPOSITION:82% POLYESTER,8% ACRYLIC,6% WOOL,2% VISCOSE,2% POLYAMIDE. LINING:100% POLYESTER",12,34.99,"new",2, "https://static.zara.net/photos///2020/I/0/1/p/7200/107/800/72/w/1141/7200107800_2_12_1.jpg?ts=1588940619612");


INSERT into product values (11,"Medium violet dress", "9006/065", "Straight design. Tweed fabric. Cotton fabric. Crossed V-neck. Short sleeve. Two side patch pockets. Side button fastening. Decorative buttons. Inner lining.

Side length 66.0 cm
Back length 86.5 cm

Material:COMPOSITION:82% POLYESTER,8% ACRYLIC,6% WOOL,2% VISCOSE,2% POLYAMIDE. LINING:100% POLYESTER",34,34.99,"new",2, "https://static.zara.net/photos///2020/V/0/1/p/9479/065/629/2/w/1141/9479065629_2_1_1.jpg?ts=1584090284954");


//trousers


INSERT into product values (12,"Pants with stitching front", "9006/065", "Straight design. Tweed fabric. Cotton fabric. Crossed V-neck. Short sleeve. Two side patch pockets. Side button fastening. Decorative buttons. Inner lining.

Side length 66.0 cm
Back length 86.5 cm

Material:COMPOSITION:82% POLYESTER,8% ACRYLIC,6% WOOL,2% VISCOSE,2% POLYAMIDE. LINING:100% POLYESTER",8,34.99,"",3, "https://static.zara.net/photos///2020/V/0/1/p/2396/628/250/72/w/1141/2396628250_2_18_1.jpg?ts=1588865642092");


INSERT into product values (13,"Loose pink panths", "9006/065", "Straight design. Tweed fabric. Cotton fabric. Crossed V-neck. Short sleeve. Two side patch pockets. Side button fastening. Decorative buttons. Inner lining.

Side length 66.0 cm
Back length 86.5 cm

Material:COMPOSITION:82% POLYESTER,8% ACRYLIC,6% WOOL,2% VISCOSE,2% POLYAMIDE. LINING:100% POLYESTER",9,34.99,"",3, "https://static.zara.net/photos///2020/V/0/1/p/3279/042/926/2/w/466/3279042926_1_1_1.jpg?ts=1583421556773");



//skirts

INSERT into product values (14,"Pleated skirt", "9006/065", "Straight design. Tweed fabric. Cotton fabric. Crossed V-neck. Short sleeve. Two side patch pockets. Side button fastening. Decorative buttons. Inner lining.

Side length 66.0 cm
Back length 86.5 cm

Material:COMPOSITION:82% POLYESTER,8% ACRYLIC,6% WOOL,2% VISCOSE,2% POLYAMIDE. LINING:100% POLYESTER",7,31.99,"",4, "https://static.zara.net/photos///2020/V/0/1/p/8372/043/612/2/w/1141/8372043612_2_1_1.jpg?ts=1582029191593");


INSERT into product values (15,"Clasic creamy skirt", "9006/065", "Straight design. Tweed fabric. Cotton fabric. Crossed V-neck. Short sleeve. Two side patch pockets. Side button fastening. Decorative buttons. Inner lining.

Side length 66.0 cm
Back length 86.5 cm

Material:COMPOSITION:82% POLYESTER,8% ACRYLIC,6% WOOL,2% VISCOSE,2% POLYAMIDE. LINING:100% POLYESTER",4,41.99,"",4, "https://static.zara.net/photos///2020/V/0/1/p/2636/488/251/2/w/1141/2636488251_2_1_1.jpg?ts=1583314008989");

// coats

INSERT into product values (16,"Classic creamy coat", "9006/065", "Straight design. Tweed fabric. Cotton fabric. Crossed V-neck. Short sleeve. Two side patch pockets. Side button fastening. Decorative buttons. Inner lining.

Side length 66.0 cm
Back length 86.5 cm

Material:COMPOSITION:82% POLYESTER,8% ACRYLIC,6% WOOL,2% VISCOSE,2% POLYAMIDE. LINING:100% POLYESTER",9,71.99,"",5, "https://static.zara.net/photos///2020/V/0/1/p/6318/024/727/4/w/1141/6318024727_1_1_1.jpg?ts=1583949280433");


INSERT into product values (17,"Coat with belt", "9006/065", "Straight design. Tweed fabric. Cotton fabric. Crossed V-neck. Short sleeve. Two side patch pockets. Side button fastening. Decorative buttons. Inner lining.

Side length 66.0 cm
Back length 86.5 cm

Material:COMPOSITION:82% POLYESTER,8% ACRYLIC,6% WOOL,2% VISCOSE,2% POLYAMIDE. LINING:100% POLYESTER",9,56.99,"",5, "https://static.zara.net/photos///2020/V/0/1/p/2194/727/707/2/w/1141/2194727707_1_1_1.jpg?ts=1581009446883");


// blouses


INSERT into product values (18,"Oversize skirt", "9006/065", "Straight design. Tweed fabric. Cotton fabric. Crossed V-neck. Short sleeve. Two side patch pockets. Side button fastening. Decorative buttons. Inner lining.

Side length 66.0 cm
Back length 86.5 cm

Material:COMPOSITION:82% POLYESTER,8% ACRYLIC,6% WOOL,2% VISCOSE,2% POLYAMIDE. LINING:100% POLYESTER",14,31.99,"",6, "https://static.zara.net/photos///2020/V/0/1/p/2614/335/250/4/w/1141/2614335250_1_1_1.jpg?ts=1589214494181");


INSERT into product values (19,"White t-shirt", "9006/065", "Straight design. Tweed fabric. Cotton fabric. Crossed V-neck. Short sleeve. Two side patch pockets. Side button fastening. Decorative buttons. Inner lining.

Side length 66.0 cm
Back length 86.5 cm

Material:COMPOSITION:82% POLYESTER,8% ACRYLIC,6% WOOL,2% VISCOSE,2% POLYAMIDE. LINING:100% POLYESTER",20,16.99,"",6, "https://static.zara.net/photos///2020/V/T/1/p/2348/778/712/2/w/953/2348778712_1_1_1.jpg?ts=1586345949600");

//accessories


INSERT into product values (20,"Bucket hat", "9006/065", "Straight design. Tweed fabric. Cotton fabric. Crossed V-neck. Short sleeve. Two side patch pockets. Side button fastening. Decorative buttons. Inner lining.

Side length 66.0 cm
Back length 86.5 cm

Material:COMPOSITION:82% POLYESTER,8% ACRYLIC,6% WOOL,2% VISCOSE,2% POLYAMIDE. LINING:100% POLYESTER",8,11.99,"",7, "https://static.zara.net/photos///2020/V/0/1/p/0653/035/310/73/w/466/0653035310_2_10_1.jpg?ts=1588267746484");


INSERT into product values (21,"Necklace set", "9006/065", "Straight design. Tweed fabric. Cotton fabric. Crossed V-neck. Short sleeve. Two side patch pockets. Side button fastening. Decorative buttons. Inner lining.

Side length 66.0 cm
Back length 86.5 cm

Material:COMPOSITION:82% POLYESTER,8% ACRYLIC,6% WOOL,2% VISCOSE,2% POLYAMIDE. LINING:100% POLYESTER",0,6.99,"",7, "https://static.zara.net/photos///2020/V/0/1/p/4548/014/303/2/w/1141/4548014303_2_5_1.jpg?ts=1582041630566");



INSERT into product values (22,"Boots with a flat sole", "9006/065", "Straight design. Tweed fabric. Cotton fabric. Crossed V-neck. Short sleeve. Two side patch pockets. Side button fastening. Decorative buttons. Inner lining.

Side length 66.0 cm
Back length 86.5 cm

Material:COMPOSITION:82% POLYESTER,8% ACRYLIC,6% WOOL,2% VISCOSE,2% POLYAMIDE. LINING:100% POLYESTER",9,111.99,"",8, "https://static.zara.net/photos///2020/V/1/1/p/2432/510/002/3/w/1141/2432510002_2_15_1.jpg?ts=1582893327819");


INSERT into product values (23,"Leather sandals", "9006/065", "Straight design. Tweed fabric. Cotton fabric. Crossed V-neck. Short sleeve. Two side patch pockets. Side button fastening. Decorative buttons. Inner lining.

Side length 66.0 cm
Back length 86.5 cm

Material:COMPOSITION:82% POLYESTER,8% ACRYLIC,6% WOOL,2% VISCOSE,2% POLYAMIDE. LINING:100% POLYESTER",6,99.99,"",8, "https://static.zara.net/photos///2020/V/1/1/p/2810/510/001/3/w/1141/2810510001_2_16_1.jpg?ts=1579721826906");

DROP TABLE sizes

INSERT into  sizes values (0,'S');
INSERT into  sizes values (0,'M');
INSERT into  sizes values (0,'XL');

INSERT into  sizes values (1,'S');
INSERT into  sizes values (1,'M');
INSERT into  sizes values (1,'XL');


INSERT into  sizes values (2,'S');
INSERT into  sizes values (2,'M');
INSERT into  sizes values (2,'L');

INSERT into  sizes values (3,'XS');
INSERT into  sizes values (3,'S');
INSERT into  sizes values (3,'M');
INSERT into  sizes values (3,'L');

INSERT into  sizes values (4,'XS');
INSERT into  sizes values (4,'S');
INSERT into  sizes values (4,'M');
INSERT into  sizes values (4,'L');

INSERT into  sizes values (5,'XS');
INSERT into  sizes values (5,'S');
INSERT into  sizes values (5,'M');
INSERT into  sizes values (5,'L');
INSERT into  sizes values (5,'XL');

INSERT into  sizes values (6,'XS');
INSERT into  sizes values (6,'S');
INSERT into  sizes values (6,'M');
INSERT into  sizes values (6,'L');
INSERT into  sizes values (6,'XL');

INSERT into  sizes values (7,'XS');
INSERT into  sizes values (7,'S');
INSERT into  sizes values (7,'M');
INSERT into  sizes values (7,'L');
INSERT into  sizes values (7,'XL');

INSERT into  sizes values (8,'XS');
INSERT into  sizes values (8,'S');
INSERT into  sizes values (8,'M');
INSERT into  sizes values (8,'L');
INSERT into  sizes values (8,'XL');

INSERT into  sizes values (9,'XS');
INSERT into  sizes values (9,'S');
INSERT into  sizes values (9,'M');
INSERT into  sizes values (9,'L');
INSERT into  sizes values (9,'XL');


INSERT into  sizes values (10,'S');
INSERT into  sizes values (10,'M');
INSERT into  sizes values (10,'L');

INSERT into  sizes values (11,'S');
INSERT into  sizes values (11,'M');
INSERT into  sizes values (11,'L');

INSERT into  sizes values (12,'S');
INSERT into  sizes values (12,'M');
INSERT into  sizes values (12,'L');

INSERT into  sizes values (13,'S');
INSERT into  sizes values (13,'M');
INSERT into  sizes values (13,'L');

INSERT into  sizes values (14,'XS');
INSERT into  sizes values (14,'S');
INSERT into  sizes values (14,'M');
INSERT into  sizes values (14,'L');
INSERT into  sizes values (14,'XL');

INSERT into  sizes values (15,'XS');
INSERT into  sizes values (15,'S');
INSERT into  sizes values (15,'M');
INSERT into  sizes values (15,'L');
INSERT into  sizes values (15,'XL');

INSERT into  sizes values (16,'XS');
INSERT into  sizes values (16,'S');
INSERT into  sizes values (16,'M');
INSERT into  sizes values (16,'L');
INSERT into  sizes values (16,'XL');

INSERT into  sizes values (17,'XS');
INSERT into  sizes values (17,'S');
INSERT into  sizes values (17,'M');
INSERT into  sizes values (17,'L');
INSERT into  sizes values (17,'XL');


INSERT into  sizes values (18,'XS');
INSERT into  sizes values (18,'S');
INSERT into  sizes values (18,'M');
INSERT into  sizes values (18,'L');
INSERT into  sizes values (18,'XL');

INSERT into  sizes values (19,'XS');
INSERT into  sizes values (19,'S');
INSERT into  sizes values (19,'M');
INSERT into  sizes values (19,'L');
INSERT into  sizes values (19,'XL');


INSERT into  sizes values (20,'ONE SIZE');
INSERT into  sizes values (21,'ONE SIZE');

INSERT into  sizes values (22,'35');
INSERT into  sizes values (22,'36');
INSERT into  sizes values (22,'37');
INSERT into  sizes values (22,'38');
INSERT into  sizes values (22,'39');
INSERT into  sizes values (22,'40');

INSERT into  sizes values (23,'35');
INSERT into  sizes values (23,'36');
INSERT into  sizes values (23,'37');
INSERT into  sizes values (23,'38');
INSERT into  sizes values (23,'39');
INSERT into  sizes values (23,'40');


