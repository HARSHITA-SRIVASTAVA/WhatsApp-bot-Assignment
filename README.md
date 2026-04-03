# WhatsApp-bot-Assignment
Assignment:  Jarurat Care
Build a simple WhatsApp chatbot backend simulation using Java and Spring Boot.

#Requirements:
Create a REST API endpoint (/webhook) to receive POST requests
Accept JSON input simulating WhatsApp messages
Respond with predefined replies (Hi → Hello, Bye → Goodbye)
Log all incoming messages

#Features:
Rest API endpoint/webhook
Accepts JSON input
Logs incoming messages

#Tech: Java , Spring Boot , Maven

#API details :

EndPoint: POST/webhook

Request Body:
{ "message" : "Hi" } -reponse-> Hello
{ "message" : "Bye" } -reponse-> GoodBye
{ "message" : "Other" } -reponse-> Sorry, I didn't understand

#How to run:
-Clone the repository 
-Open in IntelliJ IDEA
-Run WhatsAppBotApplication.java
-Use Postman to test API

#Testing:

Use Postman: 
-Method:POST
-URL: http://localhost:8080/webhook
-Body(JSON) : 

{
"message":"Hi"
}

#Deployment:
This project is tested and working locally. Deployment attempt was made on Render and Railway but faced environment-related issues.

AUTHOR:
Harshita Srivastava



