package Model;

public class MercadoModel {

    private int id_caixa;
    private String produto;
    private int quantidade;
    private int preco_total;
    private int preco_unitario;

    public MercadoModel() {
    }

    public MercadoModel(int id_caixa, String produto, int quantidade, int preco_total, int preco_unitario) {
        this.id_caixa = id_caixa;
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco_total = preco_total;
        this.preco_unitario = preco_unitario;
    }

    public int getId_caixa() {
        return id_caixa;
    }

    public void setId_caixa(int id_caixa) {
        this.id_caixa = id_caixa;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getPreco_total() {
        return preco_total;
    }

    public void setPreco_total(int preco_total) {
        this.preco_total = preco_total;
    }

    public int getPreco_unitario() {
        return preco_unitario;
    }

    public void setPreco_unitario(int preco_unitario) {
        this.preco_unitario = preco_unitario;
    }

}
