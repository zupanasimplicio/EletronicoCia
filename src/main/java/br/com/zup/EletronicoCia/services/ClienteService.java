package br.com.zup.EletronicoCia.services;

import br.com.zup.EletronicoCia.dtos.ClienteDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService{

    private List<ClienteDto> clientes = new ArrayList<>();

    public void  verificarDuplicidade(ClienteDto clienteDto){
        for (ClienteDto item : clientes){
            if (item.getCpf().equals(clienteDto.getCpf())){
                throw new RuntimeException("Cliente com CPF ja cadastrado");
            }
        }

    }

    public ClienteDto cadastrarCliente(ClienteDto clienteDto ){
        verificarDuplicidade(clienteDto);
        clientes.add(clienteDto);
        return clienteDto;
    }
    public ClienteDto exibirCliente(String cpf){
        for (ClienteDto clienteDto:clientes) {
            if (clienteDto.getCpf().equals(cpf)){
                return clienteDto;
            }

        }
        throw new RuntimeException("CPF não encontrado ");
    }
}



