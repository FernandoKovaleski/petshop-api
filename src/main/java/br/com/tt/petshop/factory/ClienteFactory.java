package br.com.tt.petshop.factory;

import br.com.tt.petshop.dto.ClienteListagem;
import br.com.tt.petshop.model.Cliente;
import br.com.tt.petshop.service.ClienteDetalhes;

public class ClienteFactory {

    public static ClienteListagem criarClienteListagem(Cliente cliente){
        return new ClienteListagem(cliente.getId(), cliente.getNome(), cliente.getCpf());
    }

    public static ClienteDetalhes criarClienteDetalhes (Cliente cliente){
        return new ClienteDetalhes(cliente.getId(), cliente.getNome(), cliente.getCpf(), cliente.getTelefone(),
                cliente.getNascimento());
    }
}
