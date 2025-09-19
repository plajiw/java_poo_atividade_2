abstract class Item {
    protected String nome;
    protected String efeito;

    public Item(String nome, String efeito) {
        this.nome = nome;
        this.efeito = efeito;
    }

    public abstract void aplicar(Pokemon pokemon) {
        System.out.println("iteam aplicado no " + pokemon.nome);
    }
}
