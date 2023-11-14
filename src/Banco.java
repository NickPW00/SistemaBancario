import java.util.ArrayList;
import java.util.List;

public class Banco {
    private final String nome;
    private final List<Cliente> clientes = new ArrayList<>();
    private final List<Produto> produtos = new ArrayList<>();
    private final List<Agencia> agencias = new ArrayList<>();

    public Banco(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public List<Agencia> getAgencias() {
        return agencias;
    }

    public void addClientes(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void removeClientes(Cliente cliente) {
        this.clientes.remove(cliente);
    }

    public void addProdutos(Produto produto) {
        this.produtos.add(produto);
    }

    public void removeProdutos(Produto produto) {
        this.produtos.remove(produto);
    }

    public void addAgencias(Agencia agencia) {
        this.agencias.add(agencia);
    }

    public void removeAgencias(Agencia agencia) {
        this.agencias.remove(agencia);
    }
}
