package br.com.tt.petshop.factory;

import br.com.tt.petshop.dto.ClienteListagem;
import br.com.tt.petshop.model.Cliente;

public class ClienteFactory {

    public static ClienteListagem criarClienteListagem(Cliente cliente){
        return new ClienteListagem(cliente.getId(), cliente.getNome(), cliente.getCpf());
    }
}
