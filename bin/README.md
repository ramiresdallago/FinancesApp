# FinancesApp #

# Login - exemple curl #
curl --request POST \
  --url http://localhost:8080/FinancesApp/rest/login/ \
  --header 'content-type: application/json' \
  --data '{
	"email" : "login@teste.com",
	"password" : "senha"
}'

# Register User - exemple curl #
curl --request POST \
  --url http://localhost:8080/FinancesApp/rest/user/register/ \
  --header 'content-type: application/json' \
  --data '{
	"name" : "ramires",
	"email" : "email@teste.com",
	"password" : "senha"
}'