public class PessoaFisica extends Pessoa {
    private long cpf;

    public PessoaFisica(String nome, long cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public PessoaFisica() {
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "PessoaFisica [nome="+super.getNome()+"cpf=" + cpf + "]";
    }
    
}
