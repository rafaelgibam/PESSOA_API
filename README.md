# PESSOA API

- clone o projeto usando o comando "git https://github.com/rafaelgibam/PESSOA_API.git"
- ABRA A SUA IDEIA E IMPORT O PROJETO PARA SUA WORKSPACE
- CONFIGURE SUA IDE PARA APONTAR PARA JDK8
- EXECUTE O COMANDO MVN CLEAN & INSTALL
- EXECUTE O PROJETO E USE!


- LINK DO PROJETO EM PRODUÇÃO -> http://apipessoa.herokuapp.com/api/v1/

- DOCUMENTAÇÃO WEB -> https://apipessoa.herokuapp.com/api/v1/swagger-ui.html
- DOCUMENTAÇÃO POSTMAN -> https://documenter.getpostman.com/view/4966868/TVK76LYX

- PARA ACESSAR OS RECURSOS DA API VOCÊ PRECISA ESTÁ AUTENTICADO COM UM TOKEN PARA OBTER ESSE TOKEN VOCÊ PRECISAR FAZER UMA REQUISÃO NO ENDPOINT
  /auth/login PASSANDO NO CORPO DA REQUISÃO OS VALORES {"username": "admin", "password": "admin" }

- COM O TOKEN VOCÊ VAI PASSAR EM TODAS AS REQUISÕES NO HEADER "Authorization Bearer {Seu Token}"
