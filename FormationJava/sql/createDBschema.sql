#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------


#------------------------------------------------------------
# Table: Author
#------------------------------------------------------------

CREATE TABLE Author(
        id        int (11) Auto_increment  NOT NULL ,
        firstName Varchar (255) NOT NULL ,
        lastName  Varchar (255) NOT NULL ,
        PRIMARY KEY (id ) ,
        INDEX (lastName )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Publisher
#------------------------------------------------------------

CREATE TABLE Publisher(
        id       int (11) Auto_increment  NOT NULL ,
        name     Varchar (255) NOT NULL ,
        siret    Int NOT NULL ,
        webSite  Varchar (100) ,
        phoneStd Varchar (100) ,
        mailStd  Varchar (100) ,
        PRIMARY KEY (id ) ,
        INDEX (name )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Media
#------------------------------------------------------------

CREATE TABLE Media(
        id              int (11) Auto_increment  NOT NULL ,
        title           Varchar (100) NOT NULL ,
        price           Double NOT NULL ,
        nbPage          Int ,
        isbn            Varchar (25) ,
        category        Int ,
        publicationDate Date ,
        language        Char (25) ,
        nbTrack         Int ,
        type            Int NOT NULL ,
        id_Publisher    Int NOT NULL ,
        PRIMARY KEY (id ) ,
        INDEX (price ,category ,type ) ,
        UNIQUE (isbn )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Cart
#------------------------------------------------------------

CREATE TABLE Cart(
        id int (11) Auto_increment  NOT NULL ,
        PRIMARY KEY (id )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Page
#------------------------------------------------------------

CREATE TABLE Page(
        id       int (11) Auto_increment  NOT NULL ,
        id_Media Int NOT NULL ,
        PRIMARY KEY (id )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: is written by
#------------------------------------------------------------

CREATE TABLE is_written_by(
        id       Int NOT NULL ,
        id_Media Int NOT NULL ,
        PRIMARY KEY (id ,id_Media )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: can have
#------------------------------------------------------------

CREATE TABLE can_have(
        id       Int NOT NULL ,
        id_Media Int NOT NULL ,
        PRIMARY KEY (id ,id_Media )
)ENGINE=InnoDB;

ALTER TABLE Media ADD CONSTRAINT FK_Media_id_Publisher FOREIGN KEY (id_Publisher) REFERENCES Publisher(id);
ALTER TABLE Page ADD CONSTRAINT FK_Page_id_Media FOREIGN KEY (id_Media) REFERENCES Media(id);
ALTER TABLE is_written_by ADD CONSTRAINT FK_is_written_by_id FOREIGN KEY (id) REFERENCES Author(id);
ALTER TABLE is_written_by ADD CONSTRAINT FK_is_written_by_id_Media FOREIGN KEY (id_Media) REFERENCES Media(id);
ALTER TABLE can_have ADD CONSTRAINT FK_can_have_id FOREIGN KEY (id) REFERENCES Cart(id);
ALTER TABLE can_have ADD CONSTRAINT FK_can_have_id_Media FOREIGN KEY (id_Media) REFERENCES Media(id);

ALTER TABLE `media`.`publisher` 
CHANGE COLUMN `siret` `siret` VARCHAR(25) NOT NULL COMMENT '' ;
