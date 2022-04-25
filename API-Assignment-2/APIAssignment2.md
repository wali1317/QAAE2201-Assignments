# API LAB

## Overview

#### 1. Send your first request:
##### Can you tell us in your own word what happened after making your first request?

Ans: I sent a get request to postman-echo.com/get from postman. So, postman is acting as client and postman-echo/get is 
acting as API server. After getting the above request, API server processed it and respond back to postman. At last 
postman received the response and displayed in the response body.

![plot](./Images/1.jpg)

#### 2. Create your first collection, Collection Name: api-lab<br>- Save your request from step 1 in collection<br>- Save all your requests in this collection

Ans. First I have created a new collection by clicking the "+" beside collection tab and named it as api-lab. Then I 
saved the request "GET postman-echo.com/get" to that collection.

![plot](./Images/2.jpg)

#### 3. Building Requests

Document was covered thoroughly.

## Make API calls using the following URIs and record the status code and response body for each API call

#### 1. Get authentication token using URI: https://postman-echo.com/basic-auth. <br>How did you get the response?

Ans. When I tried to send request, the response was showing "unauthorized" with status 401-Unauthorized.
<br>Then I got the response by selecting Authorization as Basic Auth with the following username and password:

username: postman<br>
password: password

![plot](./Images/3.jpg)

#### 2. Get information about all users using URI: https://reqres.in/api/users. <br>How many lists can you see in the response body?

Ans: I can see one list "data" in the response body.

![plot](./Images/4.jpg)

#### 3. Get information about the user with id 3 using URI: https://reqres.in/api/users/3.
#### How many lists can you see in the response body? What are the available property(Key) names in the response body?

Ans. There is no list in the response body. 

The primary object have followings property(key):
- data
- support

Within the object of data we have followings property(key):
- id
- email
- first_name
- last_name
- avatar

Within the object of support we have followings property(key):
- url
- text

![plot](./Images/5.jpg)

#### 4. Delete the User with id 9 using URI https://reqres.in/api/users/9
#### What is the response? How many users are now on the users list? https://reqres.in/api/users? Can you see the deleted user record?

Ans. The postman response is 204- No Content.

![plot](./Images/6.jpg)

Still 12 users on the list. Yes, I can see the deleted user record.

#### 5. Get information of the user with id 40 using URI: https://reqres.in/api/users/40
#### How many lists can you see in the response body? What are the available property(Key) names in the response body?

Ans. No list in the response body. No available property was there.

![plot](./Images/7.jpg)

#### 6. Create a new user in a system using URI: https://reqres.in/api/users. name: yourname, job: dreamjob
#### What is the response code: What are the available property(key) names in the response body? What is the value of response Header Etag?

Ans. The response code is 201 Created.

The primary object have followings property(key):
- name
- job
- id
- createdAt

![plot](./Images/8.jpg)

The value of response header Etag is W/"52-cZQo+sNNh9AH7XGp78lQFy52dB4"

![plot](./Images/9.jpg)

#### 7. Sign in to the system using URI: https://reqres.in/api/login and {"email": "peter@klaven"}
#### What is the response code?

Ans. The response code is 400 Bad Request.

![plot](./Images/10.jpg)

#### 8. Sign in to the system using URI: https://reqres.in/api/login and
````json
{
"email": "eve.holt@reqres.in",
"password": "cityslicka"
}
````

#### What is the value of response Header Etag? What is the response?

Ans. The value of response header Etag is W/"1d-lGCrvD6B7Qzk11+2C98+nGhhuec"

![plot](./Images/12.jpg)

The response is as follows:

![plot](./Images/11.jpg)

#### 9. Get information about all planets using URI: https://swapi.dev/api/planets. 
#### Carefully observe the response body and make a list of all attributes and write their data types.
#### How many lists can you see in the response body?

Ans. There is one list I can see in the response body. Every object under that array has two lists.

![plot](./Images/13.jpg)

The data type of the Attributes are given below:

- name: string
- rotation_period: string
- orbital_period: string
- diameter: string
- climate: string
- gravity: string
- terrain: string
- surface_water: string
- population: string
- residents: array
- films: array
- created: string
- edited: string
- url: string

#### 10. Get information about the third planet using URI: https://swapi.dev/api/planets/3/
#### How many properties you can see in response body?

Ans. 14 properties can be seen here.

![plot](./Images/14.jpg)

#### 11. Get information about all the starships using URI: https://swapi.dev/api/starships. 
#### Carefully observe the response body and make a list of all attributes and write their data types. How many lists can you see in the response body?

Ans. There is one list I can see in the response body. However, every object under that array has two lists.

![plot](./Images/15.jpg)

The data type of the Attributes are given below:

- name: string
- model: string
- manufacturer: string
- cost_in_credits: string
- length: string
- max_atmosphering_speed: string
- crew: string
- passengers: string
- cargo-capacity: string
- consumables: string
- hyperdrive_rating: string
- MGLT: string
- starship_class: string
- pilots: array
- films: array
- created: string
- edited: string
- url: string

#### 12. Get information about the ninth starship using URI: https://swapi.dev/api/starships/9/
#### How many lists can you see in the response body?

Ans. I can see two lists.

#### 13. Get information about all films using URI: https://swapi.dev/api/films. Carefully observe the response body and make a list of all attributes and write their data types.
#### How many lists can you see in the response body?

Ans. There is one list I can see in the response body. However, every object under that array has five lists.

![plot](./Images/16.jpg)

The data type of the Attributes are given below:

- title: string
- episode_id: number
- opening_crawl: string
- director: string
- producer: string
- release_date: string
- characters: array
- planets: array
- starships: array
- vehicles: array
- species: array
- created: string
- edited:string
- url: string

#### 14. Get information about the species using URI: https://swapi.dev/api/species
#### How many lists can you see in the response body?

Ans. I can see one list in the response body.

#### 15. Get all booking ids using URI: https://restful-booker.herokuapp.com/booking
#### How many lists can you see in the response body?

Ans. I can see one list in the response body.

#### 16. Get details about booking id 23 using URI: https://restful-booker.herokuapp.com/booking/23
#### What is the response?

Ans. The response is 200 OK - Standard Response for successful HTTP requests. The response is as follows:

![plot](./Images/17.jpg)

#### 17. Get details about booking id 23 using URI: https://restful-booker.herokuapp.com/booking/3
#### What is the response?

Ans. The response is 200 OK - Standard Response for successful HTTP requests. The response is as follows:

![plot](./Images/18.jpg)

#### 18. Get information about all planets using URI: https://jsonplaceholder.typicode.com/users
#### What is the response? How many lists can you see in the response body?

Ans. The response is 200 OK - Standard Response for successful HTTP requests. The response is as follows:

![plot](./Images/19.jpg)

The response body has one list.

#### 19. Get information about all species using URI: https://swapi.dev/api/species. Carefully observe the response body and make a list of all attributes and write their data types.
#### How many lists can you see in the response body? What is the response?

Ans.  There is one list I can see in the response body. However, every object under that array has two lists.

![plot](./Images/20.jpg)

The data type of the Attributes are given below:

- name: String
- classification: String
- designation: String
- average_height: String
- skin_colors: String
- hair_colors: String
- eye_colors: String
- average_lifespan: String
- homeworld: String
- language: String
- people: array
- films: array
- created: String
- edited: String
- url: String

The response is 200 OK - Standard Response for successful HTTP requests.

####  20. Write JSON path:

a. To retrieve all direct properties of the studio object:
- .studio.movie
- .studio.music

b. To find out the music’s song:
- .studio.music.song

c. To find the rating of all items in the studio:
- .studio.movie[0].rating
- .studio.movie[1].rating
- .studio.movie[2].rating
- .studio.movie[3].rating

d. To retrieve information on all movies
- .studio.movie[0]
- .studio.movie[1]
- .studio.movie[2]
- .studio.movie[3]

e. To find out the titles of all movies
- .studio.movie[0].title
- .studio.movie[1].title
- .studio.movie[2].title
- .studio.movie[3].title

f. To retrieve the titles of all movies by Jack:
- .studio.movie[2].director

g. To retrieve the category of the last movie:
- .studio.movie[3].category

i. To retrieve all movies that have the isbn property
- .studio.movie[2].isbn
- .studio.movie[3].isbn

#### 21. Get information about all employees using URI: http://dummy.restapiexample.com/api/v1/employees
#### How many lists can you see in the response body?
#### What is the response?
#### What are the available property(Key) names in the response body?
#### Make a list of all attributes and write the data types.

Ans. The response body has one list.

The response is 200 OK - Standard Response for successful HTTP requests.

The primary object have following property(key):
- status
- data
- message

Within the array of data we have following property(key):
- id
- employee_name
- employee_salary
- employee_age
- profile_image

Followings are the data type of all attributes:

- status: string
- data: array
- message: string
- id: number
- employee_name: string
- employee_salary: number
- employee_age: number
- profile_image: string

![plot](./Images/21.jpg)

#### 22. Get a single employee data using URI: http://dummy.restapiexample.com/api/v1/employee/3
#### How many data you can see in response body? What is the response status?

Ans. I can see one data.

The response status is 200 OK

![plot](./Images/22.jpg)

#### 23.Create a new employee in a system by using URI: http://dummy.restapiexample.com/api/v1/create Verb: POST Request Body:

```json
{
"name":"your name",
"salary":"123",
"age":"23"
}
```
#### What is the response? can you see "id" property in the response? if Yes, note the "id" value.

Ans. Standard response for successful HTTP request. Response is as follows:

![plot](./Images/23.jpg)

The id value is 1315.

#### 24. Delete an employee record whose employee id in 2 by using URI http://dummy.restapiexample.com/api/v1/delete/2
#### What is the response?
#### How many employees are now in the employees list? http://dummy.restapiexample.com/api/v1/employees
#### Can you see the deleted employee record?

Ans. The response is as follows:

![plot](./Images/24.jpg)

Still there are 24 employees in the employees list.

Yes, I can see the deleted employee record.

#### Register a user by using URI: https://reqres.in/api/register Verb: POST Request Body:

```json
{
"email": "john.jack@example.com",
"password": "@izaanSchool"
}
```
#### 25. What is the response? What are the available property(Key) names in the response body?

Ans. The response is as follows:

![plot](./Images/25.jpg)

The available property(key) is "error"

#### 26. Get a user Using URL https://reqres.in/api/unknown/2. What is the response?

Ans: The response is as follows:

![plot](./Images/26.jpg)

#### 27. A simple health check endpoint to confirm whether the API is up and running using https://restful-booker.herokuapp.com/ping
#### What is the response?

Ans: The response is as follows:

![plot](./Images/27.jpg)

#### 28. Get information using Delayed Response using URI: https://reqres.in/api/users?delay=3
#### What is the response? How many seconds delay to respond?

Ans: The response is as follows:

![plot](./Images/28.jpg)

Three seconds delay to respond.

#### 29. Get information about vehicles using URL https://swapi.dev/api/vehicles/schema/
#### What type of response it is? What is response status code?

Ans: Type of response: Data Not Found

Status Code: 404

![plot](./Images/29.jpg)

#### 30. Get information about starships using URL https://swapi.dev/api/starships/schema/
#### What type of response it is? Write down the response status code.
#### What are the available property(Key) names in the response body?

Ans. Type of response: Data Not Found

Status Code: 404

Property(Key) name: "detail"

![plot](./Images/30.jpg)

#### 31. Let's try something interesting. Can we remember bash script? Choose any 5 GET API. Use one bash script to make call and save the response in 5 different json file. If you can't achieve it that's fine. This is for fun.Example curl www.google.com >> response1.json

Ans: I have written the bash script named "getapi.sh":

```shell
#!/bin/bash
curl -o users.json https://reqres.in/api/users/3
curl -o planets.json https://swapi.dev/api/planets/3/
curl -o emplyee.json http://dummy.restapiexample.com/api/v1/employee/3
curl -o ping.json https://restful-booker.herokuapp.com/ping
curl -o vehicles.json https://swapi.dev/api/vehicles/schema/
```
Then I ran the bash script by following command

$ sh getapi.sh 

And I found all the .json output in the directory. Those files are available with this directory.
