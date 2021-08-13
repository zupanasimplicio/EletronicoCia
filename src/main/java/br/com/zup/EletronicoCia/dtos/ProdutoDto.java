package br.com.zup.EletronicoCia.dtos;


import br.com.zup.EletronicoCia.enuns.Categoria;

public class ProdutoDto {
        private String nomeDoProduto;
        private String descricaoDoProduto;
        private double valorDoProduto;
        private int quantidade;
        private Categoria categoria;
        public ProdutoDto() {

        }

    public ProdutoDto(String nomeDoProduto, String descricaoDoProduto, double valorDoProduto, int quantidade, Categoria categoria) {
        this.nomeDoProduto = nomeDoProduto;
        this.descricaoDoProduto = descricaoDoProduto;
        this.valorDoProduto = valorDoProduto;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public String getDescricaoDoProduto() {
        return descricaoDoProduto;
    }

    public void setDescricaoDoProduto(String descricaoDoProduto) {
        this.descricaoDoProduto = descricaoDoProduto;
    }

    public double getValorDoProduto() {
        return valorDoProduto;
    }

    public void setValorDoProduto(double valorDoProduto) {
        this.valorDoProduto = valorDoProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}



