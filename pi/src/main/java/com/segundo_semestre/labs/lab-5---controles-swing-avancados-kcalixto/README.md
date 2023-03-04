# Aula 5 - Controles Swing - Avançado
Apresentar controles que mantém estado e exibição em tabelas em uma aplicação Desktop

Utilize o protótipo a seguir como referência
![ADO1](prototipos/aula5_VendaComputadorPrototipo_final.png)

### Tarefa 1 - Controles de Grupo

1.1 Adicione 3 controles _JRadioButtons_ e _1 controle ButtonGroup_ conforme prototótipo acima. 
Para cada _JRadioButton_ defina o mesmo objeto _ButtonGroup_ (Ex: grupoTipoComputador) utilizando a propriedade buttonGroup do JRadioButton.

1.2 Adicione 2 controles _JToggleButton_ para a seleção do sistema operacional (Windows ou Linux). Adicione outro _JButtonGroup_ (Ex: grupoSistemaOperacional) para deixar apenas uma opção ativa.

1.3 Adicione um _JComboBox_ para a seleção da capacidade do HD com as opções “HDD 1TB”, “SSD 256 GB” e “SSD 1TB” <br />

1.4 Adicione 3 componentes _JCheckBox_ para a seleção de acessórios do computador (“MousePad”, “Hub USB” e “Mochila”) <br />

1.5 Adicione um componente _JList_ para a seleção de serviços adicionais (Garantia Extendida, Suporte no Local, Suporte 24 horas e Instalação do SO) <br />

### Tarefa 2 - Trabalhando com Tabelas

2.1 Adicione um botão "Adicionar" e um _JTable_ para adicionar a configuração escolhida como uma linha de uma tabela. Ao clicar em adicionar, resgate as informações da tela e insira em uma linha do _JTable_

```
//Resgate o modelo da tabela e atribua a uma variável local do tipo DefaultTableModel
DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

//Adicione uma nova linha ao modelo
model.addRow(new Object []{grupoTipoComputador.getSelection().getActionCommand(), grupoSO.getSelection().getActionCommand(), jComboBox1.getSelectedItem().toString(), etc.});

```


### Tarefa 3 - Trabalhando com Objetos

3.1 Na Classe Computador, defina as seguintes propriedades:<br />

* ***Variável de Classe:*** String static fabricante = “seu nome”; <br />

* ***Variáveis de instância (objeto):*** String tipoComputador, String sistemaOperacional, String HD, String[] acessorios, String[] serviços <br />

3.2 Crie ao menos 1 Construtor vazio e implemente todos os _getters_ e _setters_ das propriedades acima <br />

3.3 Ao clicar em Salvar, armazene as informações exibidas no _JTable_ em um objeto da classe “Computador” e; <br />

3.4 Para cada computador da tabela, exiba uma caixa de diálogo ao usuário “Obrigado por comprar um ” + “[TipoComputador]” + “com ” + “[Sistema Operacional]” , resgatando os valores do objeto instanciado da classe “Computador”.

3.5 Faça o _commit_ e suba as alterações para o GitHub.
