package TestandoTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class ListaPessoasStream {
    public static void main(String[] args) {
        // Lista única com homens e mulheres
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("João Silva", 30, "Brasileiro", "Masculino"));
        pessoas.add(new Pessoa("Carlos Oliveira", 25, "Brasileiro", "Masculino"));
        pessoas.add(new Pessoa("Paulo Santos", 35, "Brasileiro", "Masculino"));
        pessoas.add(new Pessoa("Lucas Pereira", 28, "Brasileiro", "Masculino"));
        pessoas.add(new Pessoa("Mateus Almeida", 40, "Brasileiro", "Masculino"));
        pessoas.add(new Pessoa("Felipe Costa", 22, "Brasileiro", "Masculino"));
        pessoas.add(new Pessoa("Ricardo Lima", 33, "Brasileiro", "Masculino"));
        pessoas.add(new Pessoa("Maria Fernandes", 29, "Brasileira", "Feminino"));
        pessoas.add(new Pessoa("Ana Souza", 24, "Brasileira", "Feminino"));
        pessoas.add(new Pessoa("Patrícia Ramos", 34, "Brasileira", "Feminino"));
        pessoas.add(new Pessoa("Juliana Araújo", 27, "Brasileira", "Feminino"));
        pessoas.add(new Pessoa("Camila Rocha", 31, "Brasileira", "Feminino"));
        pessoas.add(new Pessoa("Larissa Monteiro", 23, "Brasileira", "Feminino"));
        pessoas.add(new Pessoa("Bianca Martins", 26, "Brasileira", "Feminino"));
        pessoas.add(new Pessoa("Fernanda Vieira", 37, "Brasileira", "Feminino"));

        // Separando homens e mulheres usando Stream
        List<Pessoa> homens = pessoas.stream()
                .filter(p -> p.getGenero().equalsIgnoreCase("Masculino"))
                .collect(Collectors.toList());

        List<Pessoa> mulheres = pessoas.stream()
                .filter(p -> p.getGenero().equalsIgnoreCase("Feminino"))
                .collect(Collectors.toList());

        // Exibindo as listas
        System.out.println("Lista de Homens:");
        homens.forEach(System.out::println);

        System.out.println("\nLista de Mulheres:");
        mulheres.forEach(System.out::println);
    }
    @Test
    public void testSomenteNomesFemininosNaListaDeMulheres() {
        // Lista única com homens e mulheres
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("João Silva", 30, "Brasileiro", "Masculino"));
        pessoas.add(new Pessoa("Carlos Oliveira", 25, "Brasileiro", "Masculino"));
        pessoas.add(new Pessoa("Maria Fernandes", 29, "Brasileira", "Feminino"));
        pessoas.add(new Pessoa("Ana Souza", 24, "Brasileira", "Feminino"));
        pessoas.add(new Pessoa("Patrícia Ramos", 34, "Brasileira", "Feminino"));

        // Filtrar apenas mulheres
        List<Pessoa> mulheres = pessoas.stream()
                .filter(p -> p.getGenero().equalsIgnoreCase("Feminino"))
                .toList();

        // Verificar se todos os nomes correspondem a nomes femininos
        assertTrue(
                mulheres.stream().allMatch(m -> 
                        m.getNome().matches("Maria.*|Ana.*|Patrícia.*|Juliana.*|Camila.*|Larissa.*|Bianca.*|Fernanda.*")),
                "A lista contém nomes que não são femininos!"
        );
    }
}



	