import interfaces.IFuncionario;

public class Funcionario<T> implements IFuncionario {
    private T t;
    
    private int matricula;
    
    public Funcionario(int matricula) {
        this.matricula = matricula;
    }

    public Funcionario(T t) {
        this.t = t;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    private long getDocument(){
        long doc = 0;
        try {
            PessoaFisica pf = (PessoaFisica) t;
            doc = pf.getCpf();
        } catch (Exception e) {
            PessoaJuridica pf = (PessoaJuridica) t;
            doc = pf.getCnpj();
        }
        return doc;
    }

    private String getNome(){
        String name = "";
        try {
            PessoaFisica pf = (PessoaFisica) t;
            name = pf.getNome();
        } catch (Exception e) {
            PessoaJuridica pf = (PessoaJuridica) t;
            name = pf.getNome();
        }
        return name;
    }


    @Override
    public String toString() {
        return "Funcionario [nome="+this.getNome()+", documento=" + this.getDocument() + ", matricula=" + matricula + "]";
    }
}
