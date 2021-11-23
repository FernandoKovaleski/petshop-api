package br.com.tt.petshop.repository;

import br.com.tt.petshop.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository - Não precisa colocar quando estender
//  uma interface do Spring Data!
public interface ClienteRepository
        extends JpaRepository<Cliente, Long> {
}
