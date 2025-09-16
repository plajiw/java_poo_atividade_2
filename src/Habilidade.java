public class Habilidade {
    public String nome;
    public int poder;
    public TipoPoder tipo;

    public Habilidade(String nome, int poder, TipoPoder tipo) {
        this.nome = nome;
        this.poder = poder;
        this.tipo = tipo;
    }

    public void usar() {
        System.out.println("a habilidade " + nome + " foi utilizada!");
    }
}
