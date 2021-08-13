package br.com.zup.EletronicoCia.dtos;

import java.util.ArrayList;
import java.util.List;

public class CompraDto {

    private ClienteDto cliente;
    private List<ProdutoDto> listaDeProdutos = new ArrayList<>();

    public CompraDto() {

    }

    public ClienteDto getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDto cliente) {
        this.cliente = cliente;
    }

    public List<ProdutoDto> getListaDeProdutos() {
        return listaDeProdutos;
    }

    public void setListaDeProdutos(List<ProdutoDto> listaDeProdutos) {
        this.listaDeProdutos = listaDeProdutos;
    }


}



