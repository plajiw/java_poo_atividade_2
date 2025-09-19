public class ItemCura extends Item {
    public int quantidadeCura;

    public ItemCura(String nome, String efeito, int quantidadeCura) {
        super(nome, efeito); // Esse método construtor, chama da super classe
        this.quantidadeCura = quantidadeCura;
    }

    @Override
    public void aplicar(Pokemon pokemon) {
        System.out.println("Cura aplicada: +" + quantidadeCura + " HP");
    }
}

