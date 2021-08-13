package br.com.zup.EletronicoCia.controllers;

import br.com.zup.EletronicoCia.dtos.ClienteDto;
import br.com.zup.EletronicoCia.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/clientes")
    public class ClienteController{
        @Autowired
        private ClienteService clienteService;

        @PostMapping
        public ClienteDto cliente(@RequestBody ClienteDto cliente){return clienteService.cadastrarCliente(cliente);}

        @GetMapping("/{cpf}")
        public ClienteDto clientes(@PathVariable String cpf) {
          ClienteDto clienteDto = clienteService.exibirCliente(cpf);
            return clienteDto;
        }

    }





