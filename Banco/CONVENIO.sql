
CREATE DATABASE IF NOT EXISTS gerenciar_convenios;
USE gerenciar_convenios;

CREATE TABLE convenio (
  idconvenio INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
  nomeconvenio VARCHAR(100) NOT NULL,
  codigoconvenio INT NOT NULL,
  descricao VARCHAR(200) NOT NULL,
  datainicio DATE NOT NULL,
  datatermino DATE NOT NULL,
  status BOOLEAN DEFAULT NULL
)
