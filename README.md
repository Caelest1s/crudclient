# CRUD Client

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/Caelest1s/crudclient/blob/main/LICENSE)

# Sobre o projeto

Projeto Spring Boot + Web Services REST utilizando CRUD para acessar recurso de clientes, contendo as cinco operações: Create, Retrieve, Update, Delete and Search.
Sendo desenvolvida durante curso da [DevSuperior](https://devsuperior.com.br) finalizando mais uma etapa.

## Modelo conceitual
![Modelo Conceitual](https://github.com/Caelest1s/crudclient/blob/main/src/main/assets/modelo%20conceitual.jpg)

## Desafio do projeto

A proposta do projeto é implementar um CRUD com Web Services a fim de retornar um relatório, quando:
1. Busca por id retorna cliente existente
2. Busca por id retorna 404 para cliente inexistente
3. Busca paginada retorna listagem paginada corretamente
4. Inserção de cliente com dados válidos
5. Inserção de cliente retorna 422 e mensagens customizadas com dados inválidos
6. Atualização de cliente com dados válidos
7. Atualização de cliente retorna 404 para cliente inexistente
8. Atualização de cliente retorna 422 e mensagens customizadas com dados inválidos
9. Deleção de cliente existente
10. Deleção de cliente retorna 404 para cliente inexistente

# Tecnologias Utilizadas
## Back End
- Java
- Spring Boot
- Spring Web
- JPA / Hibernate 
- Maven
- Banco de Dados: H2

## Dependências/Bibliotecas
- Jakarta - Bean Validation

## Repositório
```bash
# clonar repositório
git clone https://github.com/Caelest1s/crudclient
```

# Autor
Jefferson Nascimento de Jesus Celestino

<a href="https://www.linkedin.com/in/caelestis/" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>
