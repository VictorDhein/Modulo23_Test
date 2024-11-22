package TestandoTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PessoaTest {

    @Test
    public void testAtributosPessoa() {
        Pessoa pessoa = new Pessoa("Ana Souza", 24, "Brasileira", "Feminino");
        assertEquals("Ana Souza", pessoa.getNome());
        assertEquals("Brasileira", pessoa.toString().contains("Brasileira") ? "Brasileira" : null);
        assertEquals("Feminino", pessoa.getGenero());
    }
}
