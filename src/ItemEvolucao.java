public class ItemEvolucao extends Item {

    public ItemEvolucao(String nome, String efeito) {
        super(nome, efeito);
    }

    @Override
    public void aplicar(Pokemon pokemon) {
        super.aplicar(pokemon);
        System.out.println("Aplicado item de evolução no " + pokemon.nome);
    }
}
