Lord Mendoza - SWE 645 - HW 3

The following URL is where the Spring Boot application resides where you can use Postman to perform CRUD operations:
http://3.228.98.74:31020/hw3-latest/api/surveys/

ex.
1. (GET) http://3.228.98.74:31020/hw3-latest/api/surveys/getAllSurveyEntries
2. (POST) http://3.228.98.74:31020/hw3-latest/api/surveys/submit-survey
  - Body:
    {
    "firstName": "lord",
    "lastName": "mendoza",
    "streetAddress": "street",
    "city": "city",
    "zip": 22015,
    "state": "state",
    "telephoneNo": "phone",
    "email": "email",
    "dateOfSurvey": "2024-07-16",
    "likedMostAboutUniversity": "school, work",
    "recommendLikelihood": "likely",
    "moreFeedback": "this was a good survey"
    }