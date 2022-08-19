-- -----------------------------------------------------
-- Schema crud
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS crud;
USE crud;

-- -----------------------------------------------------
-- Table mydb.contacto
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS contacto (
  cnt_id INT NOT NULL AUTO_INCREMENT,
  cnt_nombre VARCHAR(100) NULL,
  cnt_telefono VARCHAR(10) NULL,
  cnt_correo VARCHAR(100) NULL,
  cnt_nacimiento VARCHAR(10) NULL,
  PRIMARY KEY (cnt_id))
ENGINE = InnoDB;