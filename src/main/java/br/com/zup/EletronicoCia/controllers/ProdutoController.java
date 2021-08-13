package br.com.zup.EletronicoCia.controllers;

import br.com.zup.EletronicoCia.dtos.ProdutoDto;
import br.com.zup.EletronicoCia.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/produtos")
    public class ProdutoController{
    @Autowired
    ProdutoService produtoService;

    @PostMapping
    public ResponseEntity cadastrar (@Valid @RequestBody ProdutoDto produtoDto) {
        produtoService.cadastrar(produtoDto);
        return ResponseEntity.ok().build();
    }
    @GetMapping
    public ResponseEntity<List<ProdutoDto>>lista() {
        return ResponseEntity.ok(produtoService.listar());
    }


    }


