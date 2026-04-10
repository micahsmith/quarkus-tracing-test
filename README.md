To run:

```sh
./gradlew :shell:build -Dquarkus.container-image.build=true
docker compose up

curl http://localhost:8080/api/v1/central/items/123
```
