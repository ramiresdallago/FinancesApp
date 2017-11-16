# FinancesApp #

# Login #
```shell
curl --request POST \ --url http://localhost:8080/FinancesApp/rest/login/ \ --header 'content-type: application/json' \ --data '{"email" : "login@teste.com", "password" : "senha"}'
```

# Register User #
```shell
curl --request POST \ --url http://localhost:8080/FinancesApp/rest/user/register/ \ --header 'content-type: application/json' \ --data '{"name" : "ramires", "email" : "email@teste.com", "password" : "senha"}'
```

# Find User #
```shell
curl --request GET \ --url http://localhost:8080/FinancesApp/rest/user/find/1
```

# Edit User #
```shell
curl --request PUT \ --url http://localhost:8080/FinancesApp/rest/user/edit/1 \ --header 'content-type: application/json' \ --data '{"name" : "update1", "email" : "update1@teste.com", "password" : "update1"}'
```

# Delete User #
```shell
curl --request POST \ --url http://localhost:8080/FinancesApp/rest/login/ \ --header 'content-type: application/json' \ --data '{"email" : "teste@teste.com", "password" : "senha"}'
```
