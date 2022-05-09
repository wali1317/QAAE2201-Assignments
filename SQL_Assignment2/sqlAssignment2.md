# SQL Assignment 2

To run the following query I logged in to pg admin 4 and went to dvdrental database.

1. Write a query to get all data of actor.

Ans. `SELECT * FROM actor`

![Plot](1.JPG)

2. Write a query to get email and last name of customer.

Ans. `SELECT email, last_name FROM customer`

![Plot](2.JPG)

3. Write a query to get title, description and release year of film.

Ans. `SELECT title, description, release_year FROM film`

![Plot](3.JPG)

4. Query city and country id in the city table.

Ans. `SELECT city, country_id FROM city`

![Plot](4.JPG)

5. Write a query to get amount, payment date and customer id from payment table.

Ans. `SELECT amount, payment_date, customer_id FROM payment`

![Plot](5a.JPG)

6. Write a query to get all data of language.

Ans. `SELECT * FROM language`

![Plot](6.JPG)

7. Query all columns for a payment in payment table with customer id 10.

Ans. `SELECT * FROM payment WHERE customer_id='10'`

![Plot](7.JPG)

8. Query last name and first name of customers in customer table whose first names are "Mary"

Ans. `SELECT last_name, first_name FROM customer WHERE first_name='Mary'`

![Plot](8.JPG)

9. Query last name and first name of customers in customer table whose first names are "Mary" and last names are "Smith".

Ans. `SELECT last_name, first_name FROM customer WHERE first_name='Mary' and last_name='Smith'`

![Plot](9.JPG)

10. Query last name and first name of customers in customer table whose first names are "Susan" or last names are "Jones".

Ans. `SELECT last_name, first_name FROM customer WHERE first_name='Susan' or last_name='Jones'`

![Plot](10.JPG)

11. Query email of customers in customer table whose first name is "Mar", "Mary" or "Mari".

Ans. `SELECT email FROM customer WHERE first_name='Mar' or first_name='Mary' or first_name='Mari'`

![Plot](11.JPG)

12. Query last name and first name of customers in customer table whose first names start with "Ma".

Ans. `SELECT last_name, first_name FROM customer WHERE first_name like 'Ma%'`

![Plot](12.JPG)

13. Write a query to get staff id, first name and username of staff in staff table whose staff id is 10.

Ans. `SELECT staff_id, first_name, username FROM staff WHERE staff_id=10`

![Plot](13.JPG)

14. Query last name and first name of customers in customer table whose first name start with letter "M" and contains 3 to 5 characters.

Ans. `SELECT last_name, first_name FROM customer WHERE first_name LIKE 'M%' and LENGTH(first_name) between 3 and 5`

![Plot](14.JPG)

15. Query last name and first name of customers in customer table whose first names start with "Bra" and last names are not "Motley".

Ans. `SELECT last_name, first_name FROM customer WHERE first_name LIKE 'Bra%' and last_name!='Motley'`

![Plot](15.JPG)

16. Query store id of stores that have more than 300 customers in customer table.

Ans. `SELECT store_id, COUNT (customer_id) FROM customer GROUP BY store_id HAVING COUNT (customer_id) > 300`

![Plot](16.JPG)

17. Write a query to select all details of the only customers who have been spending more than 200 in payment table.

Ans. `SELECT customer_id, SUM (amount) FROM payment GROUP BY customer_id HAVING SUM (amount) > 200`

![Plot](17.JPG)

18. Query all columns in film table where the film_id is less than 4.

Ans. `SELECT * FROM film WHERE film_id<3`

![Plot](18.JPG)

19. Write a query to get all data from address table.

Ans. `SELECT * FROM address`

![Plot](19.JPG)

20. Query rental date, customer id and rental id in rental table when rental date is 2005-05-25.

Ans. `SELECT rental_date, customer_id rental_id FROM rental  WHERE rental_date between '2005-05-25 00:00:00' and '2005-05-25 24:00:00'`

![Plot](20.JPG)

21. Query all columns for customers in customer table with store id 2 or customer id 7.

Ans. `SELECT * FROM customer WHERE store_id=2 or customer_id=7`

![Plot](21.JPG)

22. Query all columns for customers in customer table who have spent amount more than $200.

Ans. `SELECT customer_id FROM payment GROUP BY customer_id Having SUM(amount) >200`

![Plot](22.JPG)

`SELECT * FROM payment WHERE amount > 200`

![Plot](22a.JPG)

Note: If I follow the 2nd command, sum of amount of customer could not be found. on the other hand, by using first command sum of amount 
found out, but all columns could not be shown.

23. Query amount and payment_date from payment where the amount paid was less than $2.

Ans. `SELECT amount, payment_date FROM payment WHERE amount > 2`

![Plot](23.JPG)

24. Write a query to get a list of actors with the first name Chris, Cameron, or Cuba.

Ans. `SELECT * FROM actor WHERE first_name='Chris' or first_name='Cameron' or first_name='Cuba'`

![Plot](24.JPG)

25. Query last name of customers in customer table whose first names are "John".

Ans. `SELECT last_name FROM customer WHERE first_name='John'`

![Plot](25.JPG)

26. Write a query to get staff id, first name and username of staff in staff table whose store id is less than 6.

Ans. `SELECT staff_id, first_name, username FROM staff WHERE store_id < 6`

![Plot](26.JPG)

27. Write a query to get release year, rental duration and rental rate of films in film table.

Ans. `SELECT title, release_year, rental_duration, rental_rate FROM film`

![Plot](27.JPG)

28. Write a query to get city id and country id of country in country table whose name is "New York".

Ans. `SELECT city_id, country_id, city FROM city WHERE city='New york'`

![Plot](28.JPG)

29. Write a query to get all data of city table.

Ans. `SELECT * FROM city`

![Plot](29.JPG)

30. Write a query to get film id of film in film_category table with category_id 2.

Ans. `SELECT film_id FROM film_category WHERE category_id=2`

![Plot](30.JPG)