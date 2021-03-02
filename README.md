# API-QUIZGAME
API Rest desenvolvido usando Java com Spring Boot e banco de dados H2. 

* Método GET ("/quiz"): Retorna uma lista de perguntas e suas respectivas respostas


## Iniciando no Projeto

* 1 - Clone ou faça o download do repositorio **QuizGame** para sua maquína.
* 2 - Descompacte a pasta do projeto.
* 2 - Abra o **Spring Tool Suite**.
* 3 - Clique em "*File* > *Open Projects From File System*", no campo "*Import Source*" selecione o diretorio da pasta descompactada.
* 4 - Clique em *Finish*, e aguarde o projeto ser totalmente carregado.
* 5 - Após carregado, selecione o projeto e clique em "*Run* > *Run As* > *Spring boot App*".
* 6 - Você poderá ver os status da inicialização da API no "*Console*" do Spring Boot Tools.
* 7 - Para testar a API, basta fazer uma requisição GET pelo proprio navegador através do caminho "http://localhost:8080/quiz".


### Pré requisitos

Para rodar a API é necessário ter a *Java 8* ou superior instalado na maquina.

```
http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html?ssSourceSiteId=otnpt
```

### OBSERVAÇÕES

* Certifique-se que a porta 8080 não esteja sendo usada por nenhuma outra aplicação. Caso contrario, a API não funcionará corretamente!
* O projeto também poderá ser iniciado e executado por outras IDE's, como **Intellij** ou **Eclipse**. Desde que a máquina/IDE tenham todas as dependências da aplicação.
* A construção do **.jar** pode ser feita com o auxilio do **Maven**.
* No **Spring Tool Suite** basta ir em "*Run* > *Run As* > *Maven Clean*" e depois "*Run* > *Run As* > *Maven Build*".

## Autor

* **Gustavo Jesus Barbosa** - [Linkedin](https://www.linkedin.com/in/gustavo-barbosa-92257a187/)
