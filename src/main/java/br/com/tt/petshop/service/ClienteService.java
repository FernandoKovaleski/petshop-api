package br.com.tt.petshop.service;

import br.com.tt.petshop.dto.ClienteListagem;
import br.com.tt.petshop.factory.ClienteFactory;
import br.com.tt.petshop.model.Cliente;
import br.com.tt.petshop.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<ClienteListagem> listarClientes() {
        return clienteRepository.findAll().stream()
                .map(ClienteFactory::criarClienteListagem)
                .collect(Collectors.toList());
    }

    //buscar por id com + detalhes
    public ClienteDetalhes buscarPorId(Long id) {

       return clienteRepository.findById(id)
               .map(ClienteFactory::criarClienteDetalhes)
               .orElseThrow(()-> new RuntimeException ("O cliente informado não existe"));
    }
}

