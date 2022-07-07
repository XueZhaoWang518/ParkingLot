USE PARKINGLOT;
CREATE table if not exists `car` (
                                `id` int(11) NOT NULL AUTO_INCREMENT,
                                `color` VARCHAR(200) NOT NULL,
                                `plate_number` VARCHAR(200) NOT NULL,
                                `parking_lot_id` int(11),
                                PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE if not exists `staff` (
                                `id` int(11) NOT NULL AUTO_INCREMENT,
                                `name` VARCHAR(200) NOT NULL,
                                PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE if not exists `parking_lot` (
                                `id` int(11) NOT NULL AUTO_INCREMENT,
                                `size` int(11) NOT NULL,
                                `staff_id` int(11),
                                PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;