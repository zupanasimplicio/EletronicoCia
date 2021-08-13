package br.com.zup.EletronicoCia.services;

import br.com.zup.EletronicoCia.dtos.ProdutoDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService{
     private List<ProdutoDto>listaProduto = new ArrayList<>();
    public void cadastrar(ProdutoDto produtoDto){
        verificasSeExisteProdutoIgual(produtoDto);
        listaProduto.add(produtoDto);
    }
    public List<ProdutoDto>listar(){
        return listaProduto;
    }

    public void verificasSeExisteProdutoIgual(ProdutoDto produtoDto){
        for (ProdutoDto produto:listaProduto) {
            if (produto.getNomeDoProduto().equals(produtoDto.getNomeDoProduto())){
                throw new RuntimeException("PRODUTO JA EXISTENTE");
            }
        }
    }
    public ProdutoDto localizarPorNome(String nome) {
        for (ProdutoDto produto:listaProduto) {
            if (produto.getNomeDoProduto().equals(nome)){
                return produto;
            }

        }
        throw new RuntimeException("PRODUTO NÃO ENCONTRADO");
    }

}



