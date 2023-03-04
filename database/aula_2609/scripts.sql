USE clinica;
SELECT * FROM pacientes;
SELECT nome, idade FROM pacientes WHERE idade >= 25;
SELECT nome as "Nome do paciente" FROM pacientes;
SELECT * FROM funcionarios;
SELECT nome, salario, (salario * 0.12) as "Imposto" FROM funcionarios ORDER BY nome;

/* quantos pacientes possuem mais de 25 anos */
SELECT count(*) FROM pacientes WHERE idade >= 25;
SELECT count(*) as 'Total' FROM pacientes WHERE idade >= 25;
SELECT * FROM funcionarios;
INSERT INTO funcionarios (nome, idade) VALUE ("Antonio", "23");
SELECT COUNT(salarios) FROM funcionarios;
SELECT * FROM funcionarios;
SELECT sum(salario) FROM funcionarios;
SELECT avg(salario) FROM funcionarios;
SELECT sum(salerio)/count(*) FROM funcionarios;
SELECT max(salario) from funcionarios;
SELECT especialidade FROM medicos;
SELECT DISTINCT especialidade FROM medicos ORDER BY especialidade;
SELECT DISTINCT especialidade FROM medicos WHERE nroa = 2 ORDER BY especialidade;
SELECT * FROM medicos;
SELECT * FROM ambulatorio;
SELECT * FROM medicos, ambulatorio WHERE medicos.nroa = ambulatorio.nroa;
SELECT * FROM consultas;
/* gere uma listagem das consultas com o nome do paciente */
SELECT * FROM pacientes;
SELECT * FROM consultas;
SELECT * FROM consultas, pacientes WHERE consultas.codp = pacientes.codp AND pacientes.nome = "Ana" ORDER BY data;
SELECT C.*, P.* FROM consulta as C, paciente as P WHERE C.codp=P = P.codp;
/* complement a listagem com o nome do médico */
SELECT * FROM medicos;
SELECT * FROM consultas;
SELECT * FROM pacientes;
SELECT medicos.nome as "Nome do Médico", pacientes.*, consultas.* FROM consultas, pacientes, medicos WHERE consultas.codp = pacientes.codp AND consultas.codm = medicos.codm AND pacientes.nome = "Ana" ORDER BY data;

/* gere um relatorio de consultas do medico carlos ordenado por data */
SELECT * FROM medicos m INNER JOIN consultas c ON c.codm = m.codm INNER JOIN pacientes p ON c.codp = p.codp WHERE m.nome = "Joao" ORDER BY data;
SELECT medicos.nome as "Nome do Médico", pacientes.*, consultas.* FROM consultas, pacientes, medicos WHERE consultas.codp = pacientes.codp AND consultas.codm = medicos.codm AND medicos.nome like "Carlos" ORDER BY data;

/* listagem dos pacientes da cidade de Joinville */
SELECT * FROM pacientes WHERE cidade = "Joinville";

/* listagem  das consulta apos 17:00, com o nome do medico */
SELECT medicos.nome as "Nome do medico", consultas.* FROM consultas, medicos WHERE hora > "17:00";

/* media dos salarios dos funcionarios que trabalham no ambulatorio 2 */
SELECT * FROM funcionarios;
SELECT avg(salario) as "media salarial" FROM funcionarios WHERE nroa = 2;