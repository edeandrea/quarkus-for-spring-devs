# Chapter 4 - Spring Data JPA
This is an example using Spring Data JPA.

## Start up Database
This application expects a PostgreSQL database running on localhost. You can use Docker/Podman to start the database:

```shell
podman run -it --rm=true --name chapter4 -p 5432:5432 -e POSTGRES_USER=fruits -e POSTGRES_PASSWORD=fruits -e POSTGRES_DB=fruits postgres:17
```
