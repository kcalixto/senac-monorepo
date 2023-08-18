public class App {
    public static void main(String[] args) throws Exception {
        PessoaFisica faustao = new PessoaFisica("faustinho", 12345678900L);
        PessoaJuridica neymar = new PessoaJuridica("menino ney", 123456789000001L);

        Funcionario<PessoaFisica> faustao_carteira_assinada = new Funcionario<>(faustao);
        Funcionario<PessoaJuridica> neymar_carteira_assinada = new Funcionario<>(neymar);
        
        System.out.println(neymar_carteira_assinada.toString());
        System.out.println(faustao_carteira_assinada.toString());
    }
}
