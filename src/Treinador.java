import java.util.ArrayList;

public class Treinador {
    public String nome;
    public int idade;
    public ArrayList<Pokemon> listaPokemon;

    public Treinador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.listaPokemon = new ArrayList<>();
    }

    public void capturarPokemon(Pokemon pokemon) {
        System.out.println(pokemon.nome + " foi capturado!");
        listaPokemon.add(pokemon);
    }

    public void listarPokemon() {
        System.out.println("Pokémons de " + nome + ":");
        listaPokemon.forEach(pokemon -> {
            System.out.println(pokemon.nome);
        });
    }


}
