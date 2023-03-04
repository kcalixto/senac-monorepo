# Lab 10 - Trabalhando com campos do tipo Data e JCalendar
Objetivo: Apresentar validações de campos do tipo java.utils.Date e conversão para java.sql.Date

### Pré-Requisitos
Crie uma base chamada basenotafiscal com uma tabela notafiscal

```
CREATE SCHEMA IF NOT EXISTS `basenotafiscal`;

USE `basenotafiscal`;

CREATE TABLE IF NOT EXISTS `basenotafiscal`.`notafiscal` (
  `IdNota` INT NOT NULL AUTO_INCREMENT,
  `NumeroNota` INT NOT NULL,
  `ValorNota` DOUBLE NOT NULL,
  `DataEmissao` Date NOT NULL,
  `DataEntrada` Date NOT NULL,
  PRIMARY KEY (`IdNota`)
);

```

### Tarefa 1 - NotaFiscalView
1.1 Não permita que a data de entrada seja menor do que a data de emissão da Nota Fiscal
```
if(dataEntrada.before(dataEmissao)){
            JOptionPane.showMessageDialog(this, "A data de entrada deve ser posterior à data de emissão!");
            return;
        }
```

### Tarefa 2 - Observe a conversão de datas na NotaFiscalDAO
2.1 Veja as conversões necessárias para converter o tipo java.utils.Date para java.sql.Date

```
//Converter a dataEmissao da nota fiscal para o padrão java.sql.Date
instrucaoSQL.setDate(3, new java.sql.Date(pNotaFiscal.getDataEmissao().getTime()));
instrucaoSQL.setDate(4, new java.sql.Date(pNotaFiscal.getDataEntrada().getTime()));

```
