abstract class Item {
    public String nome;
    public String efeito;

    public Item(String nome, String efeito) {
        this.nome = nome;
        this.efeito = efeito;
    }

    public void aplicar(Pokemon pokemon) {
        System.out.println("iteam aplicado no " + pokemon.nome);
    }
}
