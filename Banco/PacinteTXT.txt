
CREATE DATABASE IF NOT EXISTS clinica;
USE clinica;

CREATE TABLE pacientes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    sexo ENUM('Masculino', 'Feminino', 'Outro') NOT NULL,
    rua VARCHAR(150) NOT NULL,
    cpf VARCHAR(14) NOT NULL UNIQUE,
    numero INT NOT NULL,
    complemento VARCHAR(100),
    bairro VARCHAR(100) NOT NULL,
    estado VARCHAR(2) NOT NULL,
    contato VARCHAR(15) NOT NULL,
    email VARCHAR(100) NOT NULL,
    data_nascimento DATE NOT NULL
);

-- Exemplo
INSERT INTO pacientes (nome, sexo, rua, cpf, numero, complemento, bairro, estado, contato, email, data_nascimento) 
VALUES 
('João Silva', 'Masculino', 'Rua das Flores', '123.456.789-00', 123, 'Apt 4', 'Centro', 'MG', '(31)98765-4321', 'joao@gmail.com', '1985-10-20'),
('Maria Oliveira', 'Feminino', 'Av. Principal', '987.654.321-11', 456, NULL, 'Jardim', 'SP', '(11)97654-3210', 'maria@gmail.com', '1990-05-15');
