INSERT INTO `media`.`publisher` (`name`, `siret`, `webSite`, `phoneStd`, `mailStd`) VALUES ('Glénat', 'GLE123456789', 'www.glenat.com', ' 04 76 88 75 75', 'standard@glenat.com');
INSERT INTO `media`.`publisher` (`name`, `siret`, `webSite`, `phoneStd`, `mailStd`) VALUES ('Bayard', 'BAY456789123', 'http://www.bayard-jeunesse.com/', '01 74 31 60 60', 'standard@bayard-jeunesse.com');
INSERT INTO `media`.`publisher` (`name`, `siret`, `webSite`, `phoneStd`) VALUES ('Hachette', 'HAC789456132', 'http://www.hachette.com/', '01 12 23 45 56');
INSERT INTO `media`.`publisher` (`name`, `siret`) VALUES ('Sony music', 'SON132789456');

INSERT INTO `media`.`media` (`title`, `price`, `nbPage`, `isbn`, `category`, `publicationDate`, `language`, `type`, `id_Publisher`) VALUES ('The History', '20.89', '200', 'FG456ZTGF', '0', '2001-08-03', 'FR', '0', '2');
INSERT INTO `media`.`media` (`title`, `price`, `nbPage`, `isbn`, `category`, `publicationDate`, `language`, `type`, `id_Publisher`) VALUES ('Mononoke', '9.58', '50', '456RGFD7845', '1', '1998-02-04', 'JAP', '0', '1');
INSERT INTO `media`.`media` (`title`, `price`, `nbPage`, `isbn`, `category`, `publicationDate`, `language`, `nbTrack`, `type`, `id_Publisher`) VALUES ('Back to the moon', '15', NULL, NULL, NULL, '2000-05-16', 'EN', '15', '1', '4');
INSERT INTO `media`.`media` (`title`, `price`, `publicationDate`, `language`, `nbTrack`, `type`, `id_Publisher`) VALUES ('The others', '10.99', '1998-07-23', 'EN', '3', '2', '4');
INSERT INTO `media`.`media` (`title`, `price`, `nbPage`, `isbn`, `category`, `publicationDate`, `language`, `type`, `id_Publisher`) VALUES ('Contes nomades', '14.2', '86', 'SF4786SDF', '2', '1985-05-14', 'FR', '0', '3');
INSERT INTO `media`.`media` (`title`, `price`, `nbPage`, `isbn`, `category`, `publicationDate`, `language`, `type`, `id_Publisher`) VALUES ('Le loukoum à la pistache', '16.5', '456', 'DFEZ4864SFG784634', '2', '1999-12-18', 'EN', '0', '3');


INSERT INTO `media`.`author` (`firstName`, `lastName`) VALUES ('Pierre', 'Dupont');
INSERT INTO `media`.`author` (`firstName`, `lastName`) VALUES ('Paul', 'Gargantua');
INSERT INTO `media`.`author` (`firstName`, `lastName`) VALUES ('Kamui', 'Myzaki');
INSERT INTO `media`.`author` (`firstName`, `lastName`) VALUES ('Kokoro', 'Zenmaki');
INSERT INTO `media`.`author` (`firstName`, `lastName`) VALUES ('François', 'PELTIER ');
INSERT INTO `media`.`author` (`firstName`, `lastName`) VALUES ('Catherine', 'GENDRIN ');
INSERT INTO `media`.`author` (`firstName`, `lastName`) VALUES ('Hélène', 'KÉRILLIS ');
INSERT INTO `media`.`author` (`firstName`, `lastName`) VALUES ('Gail Carson', 'LEVINE ');
INSERT INTO `media`.`author` (`firstName`, `lastName`) VALUES ('Savage', 'GARDEN');
INSERT INTO `media`.`author` (`firstName`, `lastName`) VALUES ('Stéphane', 'DEMEYERE-FOGELGESANG');

INSERT INTO `media`.`is_written_by` (`id`, `id_Media`) VALUES ('10', '6');
INSERT INTO `media`.`is_written_by` (`id`, `id_Media`) VALUES ('12', '6');
INSERT INTO `media`.`is_written_by` (`id`, `id_Media`) VALUES ('13', '7');
INSERT INTO `media`.`is_written_by` (`id`, `id_Media`) VALUES ('14', '9');
INSERT INTO `media`.`is_written_by` (`id`, `id_Media`) VALUES ('15', '9');
INSERT INTO `media`.`is_written_by` (`id`, `id_Media`) VALUES ('16', '9');
INSERT INTO `media`.`is_written_by` (`id`, `id_Media`) VALUES ('18', '8');
INSERT INTO `media`.`is_written_by` (`id`, `id_Media`) VALUES ('19', '10');
INSERT INTO `media`.`is_written_by` (`id`, `id_Media`) VALUES ('11', '11');
