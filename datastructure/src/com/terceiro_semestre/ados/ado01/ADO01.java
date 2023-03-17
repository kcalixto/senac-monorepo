package com.terceiro_semestre.ados.ado01;

import java.util.Scanner;

/**
 * @author Kauã Chaves Calixto -
 * @author Vinícius Nunes dos Santos -
 * 
 *         Essa classe instancia a Base de dados de Livros e cria a interface de
 *         texto (CLI) para utilizarmos a aplicação
 */
class ADO01 {
    private LivroArray livros = new LivroArray();

    /**
     * Esse método mostra as opções disponíveis na aplicação
     */
    public void showOptions() {
        log("------------------------------\n1. Adicionar Livro\n2. Remover Livro por ID\n3. Buscar Livro por Título\n4. Sair");
    }

    /**
     * Esse método recebe qual opção a pessoa escolheu.
     * Em caso de caracteres inválidos ou erros de execução ele pergunta novamente.
     */
    public int ask(Scanner input) {
        try {
            log("Qual opção você quer executar?\n");
            int selected = Integer.parseInt(input.nextLine());
            return selected;
        } catch (Exception e) {
            log("Desculpa, mas parece que esta opção não está disponível.");
            return ask(input);
        }
    }

    /**
     * Esse método recebe qual opção a pessoa escolheu.
     * Em caso de caracteres inválidos ou erros de execução ele pergunta novamente.
     */
    public String askStr(Scanner input, String log) {
        try {
            log(log);
            String str = input.nextLine();
            if (str == "")
                throw new Error();
            return str;
        } catch (Exception e) {
            log("Desculpa, mas parece que esta opção não está disponível.");
            return askStr(input, log);
        }
    }

    /**
     * Esse método recebe qual opção a pessoa escolheu.
     * Em caso de caracteres inválidos ou erros de execução ele pergunta novamente.
     */
    public Double askPrice(Scanner input) {
        Double price = 0.0;
        try {
            price = Double.parseDouble(askStr(input, "Digite o preço livro:").replace(",", "."));
            return price;
        } catch (Exception e) {
            return askPrice(input);
        }
    }

    /**
     * Esse método pergunta os campos necessários pra criar um novo objeto do tipo
     * Livro e retorna
     */
    public Livro askLivro(Scanner input) {
        Livro l = new Livro();

        l.setAutor(askStr(input, "Digite o nome do autor do livro:"));
        l.setTitulo(askStr(input, "Digite o título do livro:"));
        l.setPreco(askPrice(input));

        return l;
    }

    /**
     * Método de execução principal
     */
    public ADO01() {
        try (Scanner input = new Scanner(System.in)) {
            int EXIT = 4;

            int opt = -1;
            while (opt != EXIT) {
                showOptions();
                opt = ask(input);

                log("------------------------------");
                switch (opt) {
                    case 1:
                        log("Ok! Por favor, preencha os dados do livro.");
                        livros.add(askLivro(input));
                        break;
                    case 2:
                        if (livros.length() == 0) {
                            log("Não achamos nenhum livro na base, por favor escolha outra opção.");
                            break;
                        }

                        log("Ok! Aqui nós deletamos um livro por ID, aqui estão todos os livros que você criou:");
                        log(livros.toString());

                        log("Agora, digite o ID do livro que deseja deletar.");

                        String strID = input.nextLine();
                        int id = Integer.parseInt(strID);

                        Livro removed = livros.remove(id);
                        if (removed == null) {
                            log("Hmm, não consegui achar nenhum livro com o ID informado...");
                        } else {
                            log("Pronto! Deletamos " + removed.getTitulo() + " da base.");
                        }

                        break;
                    case 3:
                        if (livros.length() == 0) {
                            log("Não achamos nenhum livro na base, por favor escolha outra opção.");
                            break;
                        }

                        log("Ok! Por favor, informe o título do livro.");
                        Livro founded = livros.search(input.nextLine());

                        log(founded.toString());

                        break;
                }
            }

            log("Até!");
            System.exit(0);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    /**
     * Método de log padrão
     */
    public void log(String input) {
        System.out.println(input + "\n");
    }

    public static void main(String[] args) {
        new ADO01();
    }
}