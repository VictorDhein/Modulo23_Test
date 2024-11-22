package TestandoTest;

class Pessoa {
    private String nome;
    private int idade;
    private String nacionalidade;
    private String genero;

    public Pessoa(String nome, int idade, String nacionalidade, String genero) {
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
        this.genero = genero;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s, Idade: %d, Nacionalidade: %s", nome, idade, nacionalidade);
    }
}
