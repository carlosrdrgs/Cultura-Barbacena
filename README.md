# Sistema de Agendamento de Visitas a Museus  
### Módulo Web (JSF)

<p align="center">
  <img src="https://img.shields.io/badge/Java-25-orange" />
  <img src="https://img.shields.io/badge/Jakarta%20EE-10-blue" />
  <img src="https://img.shields.io/badge/JSF-PrimeFaces%2013-purple" />
  <img src="https://img.shields.io/badge/PostgreSQL-Database-blue" />
  <img src="https://img.shields.io/badge/Tomcat-11-yellow" />
</p>

---

## 📝 Descrição

Aplicação Web desenvolvida para a **gestão e agendamento de visitas** aos museus de Barbacena  
(**Museu Municipal** e **Museu da Loucura**).

Este módulo é responsável pela:

- Interface administrativa  
- Interface pública de agendamento  
- Gerenciamento de visitantes e horários  
- Controle de capacidade por museu  

---

## 🚀 Tecnologias Utilizadas

- **Java 25**  
- **Jakarta EE 10 (Web API)**  
- **JSF (Jakarta Server Faces)**  
- **PrimeFaces 13**  
- **JPA / Hibernate**  
- **PostgreSQL**  
- **Maven**  
- **Apache Tomcat 11**  

---

## ⚙️ Configuração do Banco de Dados

1. Instale o **PostgreSQL**  
2. Crie o banco de dados:

```sql
CREATE DATABASE museus_db;
```

3. Restaure o backup:

```bash
backup_museus_final.sql
```

OU configure o `persistence.xml` para:

```xml
<property name="hibernate.hbm2ddl.auto" value="update"/>
```

4. Credenciais padrão:

| Campo     | Valor     |
|-----------|-----------|
| Usuário   | postgres  |
| Senha     | aluno     |

---

## 📦 Como Executar

1. Importe o projeto no **Eclipse** como **Maven Project**  
2. Atualize as dependências:

```bash
Maven → Update Project
```

3. Execute no **Tomcat 11**  
4. Acesse:

```
http://localhost:8080/sistema-museus/
```

---

## 🔐 Acesso Administrativo

| Campo  | Valor |
|--------|--------|
| Login  | admin  |
| Senha  | admin  |

---

## 📌 Funcionalidades

- Cadastro de museus  
- Agendamento de visitas  
- Controle de capacidade  
- Gestão de visitantes  
- Painel administrativo  
- Interface pública  

---
