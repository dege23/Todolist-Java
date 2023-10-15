# Todolist-Java

Projeto Curso Gratuito e Online de Java da RocketSeat.

## Navegue

<div align="center">
<h4>
<a href="#deploy-do-projeto"> Link Deploy</a>
|
<a href="#como-usar">Como usar</a>
</h4>
</div>

Tecnologias utilizadas:

- Java
- SpringBoot
- Maven
- H2 DataBase
- Lombok
- BCrypt

## Deploy do Projeto

Projeto dísponivel no [Render.com](https://todolist-java-hlg6.onrender.com/)

## Como usar

Faça requisições body HTTP usando POST, GET, PUT com o link do deploy [Render](#deploy-do-projeto) acrescentando mais informações na URL do deploy 

- URL-Deploy/[url](#urls)

### URL's

#### /users/

Use o POST junto com um raw data json:

```json
{
  "username": "SeuUsername",
  "name": "SeuName",
  "password": "SuaSenha"
}
```

#### /tasks/

Use o POST com um Basic Auth com username e password válido e um raw data json:

```json
{
  "title": "Titulo da Tárefa",
  "description": "Descrição da Tárefa",
  "priority": "Prioridade da tárefa",
  "startAt": "Data de ínicio da Tárefa",
  "endAt": "Data de término da Tárefa"
}
```

Use o GET com um Basic Auth com username e password válido para pegar as tárefas criadas pelo usuário.

#### /tasks/{id de alguma tarefa do usuário}

Use o PUT com Basic Auth com username e password válido e um raw data json para alterar dados nessa tarefa:

```json
{
  "propriedadeDaTarefa": "Novo Valor da propriedade",
  "segundaPropriedade": "Novo Valor"
}
```
