package br.com.zup.EletronicoCia.dtos;

import br.com.zup.EletronicoCia.enuns.Categoria;

import java.math.BigDecimal;

public class ProdutoDto {

    public class Produto {
        public String nomeDoProduto;
        private int idProduto;
        private String descricaoDoProduto;
        private BigDecimal valorDoProduto;
        private int quantidade;


        public Produto(String nomeDoProduto, int idProduto, String descricaoDoProduto, BigDecimal valorDoProduto, int quantidade) {
            this.nomeDoProduto = nomeDoProduto;
            this.idProduto = idProduto;
            this.descricaoDoProduto = descricaoDoProduto;
            this.valorDoProduto = valorDoProduto;
            this.quantidade = quantidade;
        }

        public String getNomeDoProduto() {
            return nomeDoProduto;
        }

        public void setNomeDoProduto(String nomeDoProduto) {
            this.nomeDoProduto = nomeDoProduto;
        }

        public int getIdProduto() {
            return idProduto;
        }

        public void setIdProduto(int idProduto) {
            this.idProduto = idProduto;
        }

        public String getDescricaoDoProduto() {
            return descricaoDoProduto;
        }

        public void setDescricaoDoProduto(String descricaoDoProduto) {
            this.descricaoDoProduto = descricaoDoProduto;
        }

        public BigDecimal getValorDoProduto() {
            return valorDoProduto;
        }

        public void setValorDoProduto(BigDecimal valorDoProduto) {
            this.valorDoProduto = valorDoProduto;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }

    }

}



