import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criando habilidades
        Habilidade bolaDeFogo = new Habilidade("Bola de Fogo", 55, TipoPoder.FOGO);
        Habilidade jatoDeAgua = new Habilidade("Jato de Agua", 50, TipoPoder.AGUA);
        Habilidade socoTrovao = new Habilidade("Soco Trovão", 60, TipoPoder.ELETRICO);

        bolaDeFogo.usar();
        jatoDeAgua.usar();
        socoTrovao.usar();

        // Criando pokemons
        Pokemon charizard = new Pokemon("Charizard", TipoPokemon.FOGO, 50, 200);
        Pokemon blastoise = new Pokemon("Blastoise", TipoPokemon.AGUA, 52, 220);
        Pokemon pikachu = new Pokemon("Pikachu", TipoPokemon.ELETRICO, 52, 220);

        charizard.habilidades.add(bolaDeFogo);
        blastoise.habilidades.add(jatoDeAgua);
        pikachu.habilidades.add(socoTrovao);

        System.out.println(charizard.nome + " criado com sucesso!");
        System.out.println(blastoise.nome + " criado com sucesso!");
        System.out.println(pikachu.nome + " criado com sucesso!");

        // Criando treinadores
        Treinador ash = new Treinador("Ash", 15);
        Treinador gary = new Treinador("Gary", 16);

        ash.capturarPokemon(charizard);
        ash.capturarPokemon(pikachu);
        gary.capturarPokemon(blastoise);

        ash.listarPokemon();
        gary.listarPokemon();

        // Criando itens
        ItemCura pocao = new ItemCura("Poção de Vida", "Cura 60 de HP", 60);
        ItemEvolucao pedraDoFogo = new ItemEvolucao("Pedra do Fogo", "Evolui pokémons de fogo");

        pocao.aplicar(charizard);
        charizard.vida += pocao.quantidadeCura;
        System.out.println(charizard.nome + " agora está com a vida em: " + charizard.vida);

        pedraDoFogo.aplicar(charizard);
        charizard.evoluir();

        // Batalha
        Batalha batalha = new Batalha();
        batalha.treinador1 = ash;
        batalha.treinador2 = gary;

        batalha.iniciar();
        batalha.registrarTurno();
        charizard.atacar();
        blastoise.receberDano();
        System.out.println("Turno atual: " + Batalha.turno);
        batalha.registrarTurno();
        blastoise.atacar();
        charizard.receberDano();
        System.out.println("Turno atual: " + Batalha.turno);
        batalha.registrarTurno();
    }
}