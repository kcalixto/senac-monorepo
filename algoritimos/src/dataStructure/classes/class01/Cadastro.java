package dataStructure.classes.class01;

public class Cadastro {
    public static void main(String[] args) {
        MeuArray.inserir(new Pessoa("Gerson", 31));
        MeuArray.inserir(new Pessoa("Sandra", 31));
        MeuArray.inserir(new Pessoa("Mel", 3));
        MeuArray.inserir(new Pessoa("Gaia", 4));
        MeuArray.inserir(new Pessoa("Tonica", 8));
        MeuArray.mostrar();
        
        System.out.println("==== Pesquisando... ====");
        
        int id = 1000;
        if (MeuArray.remover(id)) {
            System.out.println("id=" + id + " removido com sucesso!");
        } else {
            System.out.println("Cadastro nao removido!");
        }

        MeuArray.mostrar();

    }
}
