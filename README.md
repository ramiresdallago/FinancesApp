# FinancesApp #

# Login #
curl --request POST \
  --url http://localhost:8080/FinancesApp/rest/login/ \
  --header 'content-type: application/json' \
  --data '{
	"email" : "login@teste.com",
	"password" : "senha"
}'

# Register User #
curl --request POST \
  --url http://localhost:8080/FinancesApp/rest/user/register/ \
  --header 'content-type: application/json' \
  --data '{
	"name" : "ramires",
	"email" : "email@teste.com",
	"password" : "senha"
}'

# Find User #
curl --request GET \
  --url http://localhost:8080/FinancesApp/rest/user/find/1
  
# Edit User #
curl --request PUT \
  --url http://localhost:8080/FinancesApp/rest/user/edit/1 \
  --header 'content-type: application/json' \
  --data '{
	"name" : "update1",
	"email" : "update1@teste.com",
	"password" : "update1"
}'

# Delete User #
curl --request POST \
  --url http://localhost:8080/FinancesApp/rest/login/ \
  --header 'content-type: application/json' \
  --data '{
	"email" : "teste@teste.com",
	"password" : "senha"
}'