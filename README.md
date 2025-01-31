# logtrack

## Criar Ambiente de Persistência
```sh
$ docker run -p 9200:9200 \
  -e "discovery.type=single-node" \
  -e "xpack.security.enabled=false" \
  docker.elastic.co/elasticsearch/elasticsearch:8.8.1
```