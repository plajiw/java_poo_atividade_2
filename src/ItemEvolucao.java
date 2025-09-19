public class ItemEvolucao extends Item {

    public ItemEvolucao(String nome, String efeito) {
        super(nome, efeito);
    }

    public void aplicar(Pokemon pokemon) {
        System.out.println("Aplicado item de evolução no " + pokemon.nome);
    }
}
