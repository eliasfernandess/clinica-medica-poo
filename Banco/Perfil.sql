
CREATE DATABASE IF NOT EXISTS sistema_clinica;



CREATE TABLE perfis (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL
);


CREATE TABLE permissoes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    perfil_id INT NOT NULL,
    recurso VARCHAR(50) NOT NULL, -- Exemplo: 'Funcionário', 'Paciente', etc.
    acao VARCHAR(20) NOT NULL,   -- Exemplo: 'Cadastrar', 'Ler', etc.
    FOREIGN KEY (perfil_id) REFERENCES perfis(id) ON DELETE CASCADE
);

-- exemplo
INSERT INTO perfis (nome) VALUES ('Administrador');

-- exemplo
INSERT INTO permissoes (perfil_id, recurso, acao)
VALUES
    (1, 'Funcionário', 'Cadastrar'),
    (1, 'Funcionário', 'Ler'),
    (1, 'Funcionário', 'Atualizar'),
    (1, 'Funcionário', 'Deletar'),
    (1, 'Funcionário', 'Listar'),
    (1, 'Paciente', 'Cadastrar'),
    (1, 'Paciente', 'Ler'),
    (1, 'Paciente', 'Atualizar'),
    (1, 'Paciente', 'Deletar'),
    (1, 'Paciente', 'Listar'),
    (1, 'Consulta', 'Cadastrar'),
    (1, 'Consulta', 'Ler'),
    (1, 'Consulta', 'Atualizar'),
    (1, 'Consulta', 'Deletar'),
    (1, 'Consulta', 'Listar');
