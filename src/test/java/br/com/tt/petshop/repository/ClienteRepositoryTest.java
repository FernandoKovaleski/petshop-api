package br.com.tt.petshop.repository;

import br.com.tt.petshop.model.Cliente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDate;
import java.util.List;

@DataJpaTest
public class ClienteRepositoryTest {

    @Autowired //No lugar do construtor, somente em TESTES!
    private ClienteRepository clienteRepository;

    @Test
    void deveRetornarListaVazia(){
        List<Cliente> clientes = clienteRepository.findAll();
        Assertions.assertEquals(0, clientes.size());
    }

    @Test
    void deveRetornarClienteFulano(){
        clienteRepository.save(new Cliente(null, "Fulano", LocalDate.now(), "51 99999999"));

        List<Cliente> clientes = clienteRepository.findAll();
        Assertions.assertEquals(1, clientes.size());
        Assertions.assertEquals("Fulano", clientes.get(0).getNome());
    }

}
