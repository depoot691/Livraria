# Sistema de Livraria - Java + MySQL

Projeto simples de um sistema de livraria desenvolvido em **Java com interface gráfica (GUI)** e **banco de dados MySQL**.

Funcionalidades

* Exibe os livros disponíveis ao iniciar o programa
* Permite realizar cadastro de usuários
* Armazena os dados cadastrados no banco de dados MySQL
* Interface gráfica para interação com o usuário

Tecnologias utilizadas

* Java
* Java GUI (Swing)
* MySQL
* JDBC

Estrutura do Projeto

```
src/
 ├── metodos/
 │    └── CadastroPOJO.java        # Classe POJO
 │
 ├── metodos/
 │    └── CadastroDAO.java     # Operações de comandos SQL 
 │
 ├── BDconexao/
 │    └── ConexaoMySQL1.java   # Classe de conexão com o banco
 │
 ├── metodos/
 │    └── Cadastro.java        # Interface gráfica
 │
 ├── dominio/
      └──LivrariaPrincipal.java     # Classe principal
```

Banco de Dados

O projeto utiliza MySQL para armazenar os dados dos usuários cadastrados.

Exemplo de tabela

```sql
CREATE DATABASE livraria;

USE livraria;

CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    cpf VARCHAR(100),
    endereco VARCHAR(20),
    idade INT NOT NULL,
    livro VARCHAR(100) NOT NULL
);
```

Como executar:

1. Clone o repositório

```
git clone https://github.com/depoot691/Livraria.git
```

2. Crie o banco de dados no MySQL.

3. Configure os dados de conexão na classe:

```
ConexaoMySQL1.java
```

Exemplo:

```java
String url = "jdbc:mysql://localhost:3306/livraria";
String user = "root";
String password = "senha";
```

4. Execute a classe `LivrariaPrincipal.java`.

## Licença

Este projeto está sob a licença MIT.
