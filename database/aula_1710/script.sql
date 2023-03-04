use sakila;

CREATE TABLE arquivo1 (
	codigo int primary key auto_increment not null,
    nome varchar(20)
);

CREATE TABLE arquivo2 (
	codigo int primary key auto_increment not null,
    nome varchar(20)
);

INSERT INTO arquivo1 (nome) VALUES ("Fernanda"), ("Joseda"), ("Luis"),("Fernando"),("Romulo");
INSERT INTO arquivo2 (nome) VALUES ("Carlos"), ("Manoel"), ("Luiz"),("Fernando"),("Romulo");

SELECT * FROM arquivo1;
SELECT * FROM arquivo2;

SELECT a.Nome, b.Nome FROM arquivo1 as a INNER JOIN arquivo2 as b on a.Nome = b.Nome;

SELECT a.Nome, b.Nome FROM arquivo1 as a LEFT JOIN arquivo2 as b on a.Nome = b.Nome;

SELECT * FROM customer inner join address using(address_id);

SELECT * FROM customer inner join address using(address_id) inner join city using(city_id) inner join country using(country_id);


/* Qual a quantidade de clientes cadastrados? */
select * from customer;
SELECT count(*) FROM customer WHERE active;

/* Qual a quantidade de clientes por país? */
select * from customer;
select * from address;
select * from city;
select * from country;

SELECT country.country, count(*) as total FROM customer inner join address using(address_id) inner join city using(city_id) inner join country using(country_id) group by country_id order by total desc;

/* Gere uma listagem com os nomes dos clientes em ordem alfabética, com seu edereço completo */
select customer.first_name, customer.last_name, address.address from customer
inner join address using(address_id)
order by customer.first_name limit 100;

/* Quais os gêneros de filmes assistidos pela "Mary" */
select * from customer;
select * from film;
select * from payment;
select * from rental;
select * from inventory;
select * from film_category;
select * from category;

select customer.first_name, film.title, category.name as "Gênero", count(category.category_id) as total from customer 
		inner join payment using(customer_id)
        inner join rental using(rental_id) 
        inner join inventory using(inventory_id)
        inner join film using(film_id) 
        inner join film_category using(film_id) 
        inner join category using(category_id) 
	
    where customer.first_name = "Mary" 
    
    group by category.name
    order by total DESC
    ;