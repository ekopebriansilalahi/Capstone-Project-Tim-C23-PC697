Cloud Computing: Creation of an API using JavaScript Express. The backend API is deployed using App Engine, and the API is tested using Postman. Data is stored in an SQL Server, which is connected to the system. Additionally, the deployment of the machine learning model is accomplished using FastAPI.  


ANAKOSEHAT

URL MODEL ML : https://fastapi-model-ml-ba76dh6chq-et.a.run.app/

URL API           	: https://capstone-388811.et.r.appspot.com

1. Sign Up Endpoint:
   - Method: POST
   - URL: `/auth/signup`
   - Body (raw JSON):
 	```json
 	{
   	"name": "contoh",
   	"email": "contoh@example.com",
   	"password": "password123"
 	}
 	```
   - Response:
 	```json
 	{
   	"message": "Sign up successful"
 	}
 	```
 
2. Sign In Endpoint:
   - Method: POST
   - URL: `/auth/signin`
   - Body (raw JSON):
 	```json
 	{
   	"email": "contoh@example.com",
   	"password": "password123"
 	}
 	```
   - Response:
 	```json
 	{
   	"message": "Sign in successful"
 	}
 	```
 
3. calculateCalories:
   - Method: Post
   - URL: `calorie/calculate`
  - Body (raw JSON):
 	```json
 	 "sex": "male",
  "weight": 47,
  "height": 171,
  "age": 21
}


   - Response:
 	Success:
message: "Calories calculated successfully"
Error:
message: "Failed to calculate calories"
 
4. allergy Endpoint:
   - Method: POST
   - URL: `/allergy/add`
  - Body (raw JSON):
 	```json
 {
  "userId": "user6",
  "allergies": ["peanuts", "shellfish", "dairy"]
}

   - Response:
 	success response:
   { message: "Allergies added successfully" }
  
  error response:
    { message: "Failed to add allergies" }
5. allergy Endpoint:
   - Method: GET
   - URL: `/food/recommendations`
 
