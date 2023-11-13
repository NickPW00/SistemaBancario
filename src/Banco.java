import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Cliente> clientes = new ArrayList<>();
    private List<Produto> produtos = new ArrayList<>();
    private List<Agencia> agencias = new ArrayList<>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void addClientes(List<Cliente> clientes) {
        this.clientes = clientes.add();
    }

    public void removeClientes(List<Cliente> clientes) {
        this.clientes = clientes.remove();
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void addProdutos(List<Produto> produtos) {
        this.produtos = produtos.add();
    }

    public void removeProdutos(List<Produto> produtos) {
        this.produtos = produtos.remove();
    }

    public List<Agencia> getAgencias() {
        return agencias;
    }

    public void addAgencias(List<Agencia> agencias) {
        this.agencias = agencias.add();
    }

    public void removeAgencias(List<Agencia> agencias) {
        this.agencias = agencias.remove();
    }

}
