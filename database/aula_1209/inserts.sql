# ALTER TABLE funcionarios ADD COLUMN nroa int;

INSERT INTO ambulatorio(andar, capacidade) VALUES (
	1,
    30
),
(
	1,
    50
),
(
	2,
    40
),
(
	2,
    25
),
(
	2,
    55
)
;

INSERT INTO medicos (nome, idade, especialidade, cpf, cidade, nroa) VALUES 
(
	"Joao",
    40,
    "ortopedia",
    "10000100000",
	"Florianopolis",
	1
),
(
	"Maria",
    42,
    "traumatologia" ,
    "10000110000",
    "Blumenau",
    2
),
(
	"Pedro",
    51,
    "pediatria" ,
    "11000100000",
    "São José",
    2
),
(
	"Carlos",
    28,
    "ortopedia" ,
    "11000110000",
    "Joinville",
    4
),
(
	"Marcia",
    33,
    "neurologia" ,
    "11000111000",
    "Biguacu",
    3
);

INSERT INTO pacientes (nome, idade, cidade, cpf, doenca) VALUES
(
	"Ana",
    20,
    "Florianópolis",
    "20000200000",
    "gripe"
),
(
	"Paulo",
    24,
    "Palhoca",
    "20000220000",
    "fratura"
),
(
	"Lucia",
    30,
    "Biguacu",
    "22000200000",
    "tendinite"
),
(
	"Carlos",
    28,
    "Joinville",
    "11000110000",
    "sarampo"
);

INSERT INTO funcionarios (nome, idade, cidade, salario, cpf, nroa) VALUES 
(
	"Rita",
    32,
    "São José",
    1200,
    "20000100000",
    1
),
(
	"Maria",
    55,
    "Palhoca",
    1220,
    "30000110000",
    2
),
(
	"Caio",
    45,
    "Florianópolis",
    1100,
    "41000100000",
    2
),
(
	"Carlos",
    44,
    "Florianópolis",
    1200,
    "51000110000",
    3
),
(
	"Paula",
    33,
    "Florianópolis",
    2500,
    "61000111000",
    1
);

INSERT INTO consultas(codm, codp, data, hora) VALUES 
(
	1, 1, '2006/06/12', '14:00'
),
(
	1, 4, '2006/06/13', '10:00'
),
(
	2, 1, '2006/06/13', '09:00'
),
(
	2, 2, '2006/06/13', '11:00'
),
(
	2, 3, '2006/06/14', '14:00'
),
(
	2, 4, '2006/06/14', '17:00'
),
(
	3, 1, '2006/06/19', '18:00'
),
(
	3, 3, '2006/06/12', '10:00'
),
(
	3, 4, '2006/06/19', '13:00'
),
(
	4, 4, '2006/06/20', '13:00'
),
(
	4, 4, '2006/06/22', '19:30'
)
;