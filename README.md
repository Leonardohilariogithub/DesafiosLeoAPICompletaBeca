# becaDesafiosLeo
## Projeto API Completa Em 8 Desafios

<div>
<div style="display: inline_block"><br>
  <img align="center" alt="Rafa-Js" height="30" width="40" src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white">
  
</div>

<div> 
  <a href="https://www.instagram.com/hilarioleozinho/?hl=pt" target="_blank"><img src="https://img.shields.io/badge/-Instagram-%23E4405F?style=for-the-badge&logo=instagram&logoColor=white" target="_blank"></a>
 	<a href="https://www.linkedin.com/in/leonardoanalistadesuporte/" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a> 
</div>

## Sumário
- [O que você vai aprender](#O-que-você-vai-aprender)
- [Pré-requisitos](#Pré-requisitos)
- [Enunciado dos DESAFIOS](#Enunciado-do-exercício)
- [Diagramas](#Diagramas)
  - [Modelo conceitual](#Modelo-conceitual)
  - [Instâncias](#Instância)

## O que você vai aprender
-01 Desafio POO 
- Modelar o projeto e criar entidades
Crie uma modelagem e um pequeno resumo sobre oque será baseada sua API.
Crie um projeto spring Boot
Crie um repositório no seu git pessoal “becaDesafiosSeuNome” e utilize para entrega de todos os desafios.
Commit seu código na branch “main” junto com o arquivo README.md, personalize o documento,
adicionando o que seu sistema irá realizar e uma modelagem das suas entidades. 

-02 Desafio Controller 
- Entendimento dos protocolos http e confecção das controllers,
Crie as classes de controllers na sua API (CRUD);
Implementar o OpenAPI na sua Spring Rest API;
Implementar ResponseEntity nos retornos das suas chamadas!

-03 Desafio Service 
- Indrodução e confecção servive,
Crie as classes de service na sua API;
Implementar interfaces e declara os metódos que irá ser utilizadas;
Faça a integração com a camada de controller;

-04 Desafio Repository 
- Conexão com base de dados utilizando JPA,
Crie as classes de repository;
Configure o banco de dados H2 na sua API
Use a configuração: spring.datasource.url=jdbc:h2:mem:testdb);
Implementar na camada service;
Faça os testes para certificar que sua base de dados está integrado;

-05 Desafio DTO 
- Aplicar conceitos de DTO no projeto,
Aplique os conceitos de DTO na sua aplicação;
Faça um relacionamento de tabelas na sua API;
Crie um novo end-point para retornar um DTO personalizado,
agrupamento de várias informações em diferentes tabelas da sua base de dados;

-06 Desafio Tratamento de dados 
- Conceitos de validação, tratamento e manipulação de dados de forma otimizada,
  Adicione validações de dados na sua API;
  Adicione Mapper em sua aplicação para a conversão de objetos;
  Implementar Lombook em sua aplicação.

-07 Desafio de Exeções- Entendimento de como tratar possiveis erros na API
- Faça o tratamento das exception utilizando try catch e si necessário finally;
Agora faça o tratamento utilizando throw e @ExceptionHandler;
Aproveitando o método criado com @ExceptionHandler,
crie sua própria classe para tratamento de exceptions utilizando @ControllerAdvice;
Realize novos testes, verifique o resultado final e escreva sua própria conclusão sobre exceptions.

<h3>-08 Desafio Dokcker - Integração da API com docker</h3>
 - Crie um docker-compose.yml;
  Suba um container contendo uma base de dados;
  Integre sua Api com a base de dados;
  Faça os testes de integração com a nova base de dados;

## Pré-requisitos

- Vontade de aprender JAVA

## Enunciado dos DESAFIOS

![myImage](https://github.com/Leonardohilariogithub/becaDesafiosLeo/blob/main/enuciado.PNG)

## Diagramas

### Modelo conceitual

![myImage](https://github.com/Leonardohilariogithub/becaDesafiosLeo/blob/main/modelo.PNG)

### Instâncias

![myImage](https://github.com/Leonardohilariogithub/becaDesafiosLeo/blob/main/instancias.PNG)

# Endpoints

| Requisições                                  | Descrição                                                    |
| -------------------------------------------- | ------------------------------------------------------------ |
| POST `/titulos/cadastrar`                      | Cadastra Titulos novos.|
| GET `/titulos/obter`    | Retorna uma titulo desejado. |
| PATCH `/titulos/atualizar` | Retorna titulo atualizado.        |
| DELETE `/titulos/deletar/`                     |Retorna titulo deletado atráves do id.                   |
| GET `/titulos`                          | Retorna uma lista com todos os titulos criados.           |
| POST `/categoria/cadastrar`                        | Retorna para cadastro de uma categoria.    |
| GET `/categoria/obter/23`        | Retorna lista de uma categoria através do id. |
| PATCH `/categoria/atualizar/89'`     | Retorna uma categoria atualizada através do id.        |
| GET `/categoria`    | Retorna uma lista com todas as categorias. |
| DELETE `/categoria/deletar/233`    | Retorna uma categoria deletada através do id. |
| POST `/usuarios/cadastrarUsuarios`    | Retorna para cadastro de um usuario. |
| GET `/usuarios/obterUsuarios/2`    | Retorna uma lista com usuário pelo id. |
| PATCH `/usuarios/atualizarUsuarios/39`    | Retorna  um usuário atualiado pelo id. |
| DELETE `/usuarios/deletarUsuarios/231`    | Retorna usuario deletado atraves do id. |
| GET `/assistidos/obterTtituloAssistido/2`    | Retorna uma lista titulo  já assistido atraves do id. |
| PATCH `/assistidos/atualizarTitulosAssistido/8`    | Retorna  titulo atualizado   atraves do id. |
| GET `/assistidos`    | Retorna uma lista com todos os titulos já assistidos. |
| DELETE `/assistidos/deletar/2`    | Retorna uma titulo já assistido deletado atrás do id. |
| GET `/assistindo/obter/2`    | Retorna uma titulo que está em andamento pelo id. |
| PATCH `/assistindo/mudarStatus/89`    | Retorna titulo pelo id e seu status concluido ou em andamento. |
| GET `/assistindo`    | Retorna uma lista com todos os titulos que estão sendo assistidos no momento. |
| DELETE `/assistindo/deletar/23`    | Retorna titulo deletado pelo id. |

## Tecnologias Usadas

Java.
GitHub.
Intelij.
Draw.io.
Postman.
Spring Boot.
