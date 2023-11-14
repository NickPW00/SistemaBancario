public class Produto {
    protected String nome;
    protected Cliente cliente;
    protected Banco banco;

    public Produto(String nome, Cliente cliente, Banco banco) {
        this.nome = nome;
        this.cliente = cliente;
        this.banco = banco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Banco getBanco() {
        return banco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
