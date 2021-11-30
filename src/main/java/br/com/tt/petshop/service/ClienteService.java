package br.com.tt.petshop.service;

import br.com.tt.petshop.dto.ClienteListagem;
import br.com.tt.petshop.factory.ClienteFactory;
import br.com.tt.petshop.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<ClienteListagem> listarClientes(){
        return clienteRepository.findAll().stream()
            .map(ClienteFactory::criarClienteListagem)
            .collect(Collectors.toList());
    }

}
