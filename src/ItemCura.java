public class ItemCura extends Item {
    public int quantidadeCura;

    public ItemCura(String nome, String efeito, int quantidadeCura) {
        super(nome, efeito);
        this.quantidadeCura = quantidadeCura;
    }

    @Override
    public void aplicar(Pokemon pokemon) {
        super.aplicar(pokemon);
        System.out.println("Cura aplicada: +" + quantidadeCura + " HP");
    }
}

