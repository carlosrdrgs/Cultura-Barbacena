# Sistema de Agendamento de Visitas a Museus - Módulo Web (JSF)

## 📝 Descrição
Aplicação Web principal desenvolvida para a gestão e agendamento de visitas aos museus de Barbacena (Museu Municipal e Museu da Loucura). Este módulo contém a interface administrativa e pública.

## 🚀 Tecnologias Utilizadas
* **Java 25**
* **Jakarta EE 10** (Web API)
* **JSF (Jakarta Server Faces)** com **PrimeFaces 13**
* **JPA / Hibernate** (Persistência)
* **PostgreSQL** (Banco de Dados)
* **Maven** (Gerenciamento de dependências)
* **Apache Tomcat 11**

## ⚙️ Configuração do Banco de Dados
1.  Certifique-se de ter o **PostgreSQL** instalado.
2.  Crie um banco de dados chamado `museus_db`.
3.  Restaure o backup fornecido (`backup_museus_final.sql`) ou configure o `persistence.xml` para `update` para que as tabelas sejam criadas automaticamente.
4.  Credenciais padrão configuradas no projeto:
    * **User:** `postgres`
    * **Password:** `aluno`

## 📦 Como Executar
1.  Importe o projeto no Eclipse como **Maven Project**.
2.  Atualize as dependências (Maven -> Update Project).
3.  Execute no servidor **Tomcat 11**.
4.  Acesse: `http://localhost:8080/sistema-museus/`

## 🔐 Acesso Administrativo
* **Login:** `admin`
* **Senha:** `admin`
