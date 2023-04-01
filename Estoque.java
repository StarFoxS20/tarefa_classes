public class Estoque {

    private String produto = null;

    private int quantidadeEmEstoque = 0 ;

//Nome dos produtos no estoque

    public String getProduto() {
        return produto;
    }

    public void setProduto(String NomeDoProduto) {
        this.produto = produto;
    }

//Quantidades de produtos que estão no estoque

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
}
