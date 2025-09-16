import java.util.ArrayList;

public class Pokemon {
    public String nome;
    public TipoPokemon tipo;
    public int nivel;
    public int vida;
    public ArrayList<Habilidade> habilidades; // Declarado aqui

    public Pokemon(String nome, TipoPokemon tipo, int nivel, int vida) {
        this.nome = nome;
        this.tipo = tipo;
        this.nivel = nivel;
        this.vida = vida;
        this.habilidades = new ArrayList<>();
    }

    public void atacar() {
        System.out.println(nome + " realizou um ataque!");
    }

    public void receberDano() {
        System.out.println(nome + " recebeu um ataque!");
    }

    public void evoluir() {
        System.out.println(nome + " evoluiu!");
    }
}
