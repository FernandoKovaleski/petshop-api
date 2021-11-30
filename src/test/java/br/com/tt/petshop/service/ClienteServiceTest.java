package br.com.tt.petshop.service;

import br.com.tt.petshop.dto.ClienteListagem;
import br.com.tt.petshop.model.Cliente;
import br.com.tt.petshop.repository.ClienteRepository;
import mock.ClienteMock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;

@ExtendWith(MockitoExtension.class)//Liga o "plugin" do Mockito no teste do JUnit.
public class ClienteServiceTest {

    //@Autowired //NÃO EXISTE AUTOWIRED, Pois é SPRING, e não temos SPRING em teste de service
    @InjectMocks // dá NEW nessa classe e injeta os mocks (dependências)
    private ClienteService clienteService;

    @Mock //Cria uma "simulação" da dependência
    ClienteRepository clienteRepository;

    @Test
    void deveListarClientes(){
        Mockito.when(clienteRepository.findAll()).thenReturn(List.of(ClienteMock.theo()));

        //Ação! Act
        List<ClienteListagem> dtos = clienteService.listarClientes();

        Assertions.assertEquals(1, dtos.size());
        ClienteListagem cliente = dtos.get(0);
        Assertions.assertEquals(1L, cliente.getId());
        Assertions.assertEquals("Theo", cliente.getNome());
        Assertions.assertEquals("751.904.090-90", cliente.getCpf());
    }

}
