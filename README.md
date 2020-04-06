# Unidades Federativas

## Descrição

Projeto de uma aplicação para listagem e cadastro de unidades federativas.

## Tecnologias utilizadas

- No back-end foi utilizado spring-boot v2.2 com java 8;
- Os teste unitários foram implementados com JUnit e mockito;
- Para documentar a api foi utilizado o swagger;
- Para persistência dos dados em memória foi usado o banco de dados H2;
- Para desenvolvimento do front-end foi utilizado angular.js 1.7 com ES5 e bootstrap;

## Instruções de uso front-end

Para executar o projeto é necessário seguir os requisitos:

- node e npm instalado
- Git instalado

Clonar o projeto localmente e rodar o sequinte comando:

`$ npm install`

Após instalar todas as dependências rodar o comando:

`$ npm start`

Para acessar a api localmente alterar o arquivo config.js e apontar para `http://localhost:8080`

## Instruções de uso back-end

Para executar o projeto é necessário seguir os requisitos:

- Java 8 e maven instalados
- Git instalado

Acessar o arquivo application.properties e trocar as configurações para usar o banco de dados em memória H2

Clonar o projeto localmente e rodar o sequinte comando:

`$ mvn clean install`

Após instalar todas as dependências rodar o comando:

`$ mvn spring-boot:run`

Após todos os procedimentos serem executados com sucesso, acessar a seguinte url:

`http://localhost:8080`

A página de documentação do swagger pode ser acessada pela url:

`http://localhost:8080/swagger-ui.html`

## Acesso ao projeto pelo heroku

Para acesso diretamente pelo heroku estão disponíveis as seguintes urls:

- `https://unidades-federativas-app.herokuapp.com/` (Front-End)
- `https://unidades-federativas-api.herokuapp.com` (Back-End)
- `https://unidades-federativas-api.herokuapp.com/swagger-ui.html/` (Swagger)

