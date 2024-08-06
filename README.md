# TeacheazyApplication
Simple Student and Subjects connection project using Spring 

Initially run "TecheazyProjectApplication.java" file

1) Create a Subjects
     - POST
     - http://localhost:8080/subject/save
     - input in postman -
         {
             "subName": "Python"
         }

3) Display Subjects
     - GET
     - http://localhost:8080/subject/getAll
       
2) Creating a Student
     - POST
     - http://localhost:8080/student/save
     - input in postman -
       {
         "name": "Shreyash Pawar",
         "city": "Pune",
         "subjects": [
          {
              "id": 1
          },
          {
              "id": 1
          }  
         ]
       }

   3) Display a Students
        - GET
        - http://localhost:8080/student/getAll
          
