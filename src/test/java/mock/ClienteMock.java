package mock;

import br.com.tt.petshop.model.Cliente;

import java.time.LocalDate;

public class ClienteMock {

    public static Cliente theo(){
        return new Cliente(1L, "Theo", LocalDate.parse("2020-01-03"), "51 99999999", "751.904.090-90");
    }

}
