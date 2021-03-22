<p align="center">
 <img width=350px height=100px src="https://www.dariawan.com/media/images/tech-spring-boot.width-1024.png" alt="Logo do Projeto">
</p>

<h3 align="center">SPRING BOOT - DESAFIO</h3>

<div align="center">

[![GitHub Issues](https://img.shields.io/github/issues/GiovaniCeron/nlw-ecoleta)](https://github.com/GiovaniCeron/nlw-ecoleta/issues)
[![GitHub Pull Requests](https://img.shields.io/github/issues-pr/GiovaniCeron/nlw-ecoleta)](https://github.com/GiovaniCeron/nlw-ecoleta/pulls)
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](/LICENSE)

</div>

---

<p align="center"> 
REST API em Spring boot de Usuários e Empresas
<br> 
</p>

## Tabela de Conteudos

- [Tabela de Conteudos](#tabela-de-conteudos)
- [Sobre <a name = "sobre"></a>](#sobre-)
- [Iniciando <a name = "iniciando"></a>](#iniciando-)
- [Preparando o Ambiente <a name = "ambiente"></a>](#preparando-o-ambiente-)
- [Executando <a name = "executando"></a>](#executando-)
- [Testes <a name = "testes"></a>](#testes-)
  - [Usuário <a name = "usuario"></a>](#usuário-)
  - [Empresa <a name = "empresa"></a>](#empresa-)
- [Tecnologias Utilizadas <a name = "tecnologias"></a>](#tecnologias-utilizadas-)
- [Autor <a name = "autor"></a>](#autor-)

## Sobre <a name = "sobre"></a>

Projeto desenvolvido em Spring Boot, sendo um REST API que contém operações sobre Usuário e Empresa. 

## Iniciando <a name = "iniciando"></a>

Antes de começar, é necessário ter em sua máquina o [GIT](https://git-scm.com/downloads) e o [Java JDK 11](https://www.oracle.com/br/java/technologies/javase-jdk11-downloads.html) instalados.
Recomendo também a utilização do editor [VSCode](https://code.visualstudio.com/download), [Netbeans](https://netbeans.apache.org/download/index.html) ou similar.

Possuindo esses requisitos, agora pode ser feito o clone do repositório utilizando o git no seu terminal.

``` bash
#Clone do repositório
$git clone https://github.com/GiovaniCeron/spring-boot-desafio.git

#Acesse a pasta do projeto
$cd spring-boot-desafio

#Acesse a pasta da API
$cd serverdesafio
```

## Preparando o Ambiente <a name = "ambiente"></a>

Antes de acessar o projeto utilizando o seu editor de código, precisamos preparar o ambiente para o projeto ser compilado.

Primeiro vamos baixar e configurar o [Maven](https://maven.apache.org/download.cgi) que é o repositório das dependências do projeto.
Após baixar o Maven com a versão de sua preferência é necessário configurar o mesmo para o JDK o encontrar.
Aqui disponibilizo alguns links com tutoriais de configuração para cada sistema Operacional.

- [Windows](https://dicasdejava.com.br/como-instalar-o-maven-no-windows/)
- [Linux](https://www.hostinger.com.br/tutoriais/install-maven-ubuntu?__cf_chl_jschl_tk__=9776c9404a9043aa078e787d2fb0d34e97c4af48-1616346542-0-Ac_m-OI9y1P3gORPqFh1pgbsNX6mnMo6-8dinBFCSIFoGGz432HtDL0OeGWEnAlJkXHsMBVppg-nWC9W9RcrPyooVYy3zed7i1vcNIdHIuQfwPaxztj5afty6pwZ9nvxx88PrpKKAsYI4T8M3wwSQacUolMpL1IRumuxv93MgC6bvnLQtwMnebPExRkeYQo-qyGLbRvpbj3ozuixMLXuxdy3rM7BN1oNkH6Uqy8DU8U7orfQMZC_zH7E4DGhXG6LLnTQpocUasv-V2SfjIqDxHbqq1bzwOY2Y5hVrKPesakPDAyaiEsc1l2hXkq8th05DpCXZ-0hjMJcCOVv_DpKgol50vOqZuszgmtdX58oLbFV)
- [MacOS](https://loiane.com/2015/05/instalando-maven-no-mac-os-yosemite)

Além do Maven precisamos configurar a Base de Dados e executar os SQLs bases.
Nesse projeto utilizamos o [DOCKER](https://www.docker.com/products/docker-desktop) junto com o Docker Compose para criar os containers necessários.

Após baixar, instalar e configurar o Docker é necessário instalar o Docker Compose que será utilizado para a criação tanto do container da Base de Dados quando do Database Manager.
[Aqui](https://docs.docker.com/compose/install/) você encontra a documentação de instalação do mesmo.

Antes da execução será necessário ajustar o caminho do Volume onde do docker irá salvar as informações da base de dados.

- Service *mysql-database*: Ajustar a propriedade *Volume*


Agora sim podemos executar nosso arquivo yml do compose.

```bash
#Acesse a pasta serverdesafio
$cd serverdesafio

#Execute o docker compose 
$serverdesafio/ sudo docker-compose up -d
```

Será criado dois containers, um do banco de dados [MYSQL](https://www.mysql.com/) na porta 3306 e outro do [Adminer](https://www.adminer.org/) na porta 8081.

## Executando <a name = "executando"></a>

Estamos com o ambiente pronto para que o Maven encontre as dependências e as baixe automaticamente. Dependendo do seu Editor alguns arquivos serão criados e esse processo pode levar alguns minutos.

Antes da Execução temos que criar as tabelas necessárias na nossa Base de Dados.
No Adminer existe uma opção de "Comando SQL" para a execução dos scripts. 

```bash
#Acesse a pasta dos sqls 
$ cd src/others/sql
```
Execute nessa ordem os sqls:

- company.sql
- user.sql

Agora, com o container da base de dados levantada e as tabelas criadas podemos executar nossa aplicação pelo Editor.

Por padrão nossa API estará acessível na porta 8080.
Recomendamos a utilização de algum programa de Requisições HTTP para facilitar os testes. Pode ser utilizado o [Insomnia](https://insomnia.rest/download) ou o [Postman](https://www.postman.com/).

## Testes <a name = "testes"></a>

Algumas orienttações para os testes da API.
Foram utilizados endpoints para cada situação requisitada.

### Usuário <a name = "usuario"></a>

- Create (POST) : http://localhost:8080/user/
  ```
  {
    "name": "Teste",
    "mail": "teste@teste.com",
    "login": "teste",
    "password": "123abc",
    "companyId": 1
  }
  ```
- Update (PUT) : http://localhost:8080/user/
  ```
  {
    "userId": 2,
    "name": "Giovani",
    "mail": "giovani@gmail.com",
    "login": "giovani123",
    "password": "123456"
  }
  ```
- List (GET) : http://localhost:8080/user/
- FindOne (GET) : http://localhost:8080/user/1
- Delete (DELETE) : http://localhost:8080/user/1

### Empresa <a name = "empresa"></a>

- Create (POST) : http://localhost:8080/company/
  ``` 
  {
    "name" : "Teste SA",
    "cnpj": 51262306200
  }
  ```
- Check CNPJ (GET) : http://localhost:8080/company/cnpj/00000000000000
- Update (PUT) : http://localhost:8080/company/
  ```
  {
    "companyId": 1,
    "name" : "Super SA"
  }
  ```
- List (GET) : http://localhost:8080/company/
- FindOne (GET) : http://localhost:8080/company/1



## Tecnologias Utilizadas <a name = "tecnologias"></a>

- [Java](https://www.java.com/pt-BR/) - Linguagem
- [Spring Boot](https://spring.io/projects/spring-boot) - Framework do Servidor
- [Maven](https://maven.apache.org/) - Repositorio
- [Feign](https://spring.io/projects/spring-cloud-openfeign) - Integração Externa com API
- [MYSQL](https://www.mysql.com/) - Base de dados
- [Adminer](https://www.adminer.org/) - Gerenciador de Base de Dados
- [Docker](https://www.docker.com/) - Ambiente Virtual - Container

## Autor <a name = "autor"></a>

- [@giovaniceron](https://github.com/GiovaniCeron)