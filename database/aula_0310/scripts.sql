use sakila;
select * from actor;
select * from customer;
/*
1) Gere uma listagem dos cliente com o endereço completo, ordenado pelo nome do cliente
*/
SELECT * FROM sakila.customer;
SELECT * FROM sakila.address;
select * FROM customer, address where customer.address_id=address.address_id order by customer.first_name;

/*
2) Quais os filmes que a cliente MARY(id : 1) realizou emprestimo
*/
select * FROM rental,inventory, film where rental.customer_id=1 and rental.inventory_id=inventory.inventory_id and inventory.film_id=film.film_id;
select rental_id,customer_id,title FROM rental,inventory, film where rental.customer_id=1 and rental.inventory_id=inventory.inventory_id and inventory.film_id=film.film_id;
/*
3) Quanto a mary gastou com locação de filmes.
*/
select sum(amount) FROM payment where customer_id=1;
/*
4) Quanto faturou o gerente responsavel pela Mary com uma comissao de 5%
*/
select (sum(amount)*0.05) as faturamento FROM payment where customer_id=1;
/*
5) quais os generos de filmes locados pela cliente barbara, informando o genero mais solicitado 
*/
select customer.first_name, category.name,count(category.name) as total  FROM 
customer,
rental,
film,
category,
inventory,
film_category 
	where
		customer.first_name="barbara" 
        and rental.customer_id=customer.customer_id 
	    and rental.inventory_id=inventory.inventory_id 
        and inventory.film_id=film.film_id
        and film_category.film_id=film.film_id 
        and category.category_id=film_category.category_id

            group by category.name 
            order by total desc
	;
/*
6) qual o ator favorito da cliente RITA?
*/

