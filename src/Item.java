abstract class Item {
    protected String nome;
    protected String efeito;

    // Método construtor
    public Item(String nome, String efeito) {
        this.nome = nome;
        this.efeito = efeito;
    }

    // Método abstrato, determina o comportamento, mas não a ação
    public abstract void aplicar(Pokemon pokemon);
}
