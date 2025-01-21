# Chapter 4 - Quarkus Panache Repository
This is an example using Quarkus Panache Repository.

## Start up Database
This application expects a PostgreSQL database running on localhost. You can use Docker/Podman to start the database:

```shell
podman run -it --rm=true --name chapter4 -p 5432:5432 -e POSTGRES_USER=fruits -e POSTGRES_PASSWORD=fruits -e POSTGRES_DB=fruits postgres:16
```
