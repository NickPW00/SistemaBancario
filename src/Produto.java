public class Produto {
    protected String nome;
    protected Cliente cliente;
    protected Banco banco;
    public Produto(String nome, Cliente cliente, Banco banco) {
        this.nome = nome;
        this.cliente = cliente;
        this.banco = banco;
    }
}
