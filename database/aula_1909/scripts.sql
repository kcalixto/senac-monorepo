# 

select * from pacientes;
update pacientes set cidade = "Ilhota" where nome = "Paulo";

/**/

select * from consultas;
update consulta set data = "2006-07-04" where codm = 1 and codp = 4;

/**/

select * from pacientes;
update pacientes set doenca = "hepatite" where nome = "Ana";

/**/

select * from consultas;
update consultas set hora = "" where codm = 3 and codp = 4;

/**/

SELECT * from funcionarios;
delete from funcionarios where codf = 4;

/**/

select * from consulta;
delete from consulta where hora >= '19:30';

/**/

select * from pacientes;
delete from pacientes where doenca like "cancer" and idade < 10;

/**/

select * from medicos;
delete from medicos where cidade = "biguacu" or "palhoca";
delete from medicos where cidade in ("Biguacu", "Palhoca");

/**/

select * from funcionarios; 

/**/

/* gere uma listagem dos pacientes que começam com a letra C */
select * from pacientes;
select * from pacientes where nome like "c%";

/* atualize o salario dos funcionarios em 10%, somente de quem trabalha no ambulatório */
select * from funcionarios;
update funcionarios set salario = salario * 1.10 where nroa = 2;

/**/