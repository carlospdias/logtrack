# logtrack

## Criar Ambiente de Persistência
```sh
$ docker run -p 9200:9200 \
  -e "discovery.type=single-node" \
  -e "xpack.security.enabled=false" \
  docker.elastic.co/elasticsearch/elasticsearch:8.
  ```
  
## Suba a aplicação
Faça da maneira que preferir. Mas a melhor maneira é executar pelo Maven

```sh
$ mvn spring-boot:run

```


## Teste
```sh

$ curl localhost:8081/log

```



## Links 
-  [Set Password and user with Docker-compose](https://discuss.elastic.co/t/set-password-and-user-with-docker-compose/225075)
-  [Introduction to Datafaker](https://www.baeldung.com/java-datafaker)
-  [Datafaker Documentation](https://www.datafaker.net/documentation/getting-started/)
-  [docker]https://github.com/elastic/elasticsearch/blob/8.17/docs/reference/setup/install/docker/.env
-  