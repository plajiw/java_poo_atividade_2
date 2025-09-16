public class Batalha {
    public static int turno = 0;

    public Treinador treinador1;
    public Treinador treinador2;

    public void iniciar() {
        System.out.println("Batalha iniciada entre: " + treinador1.nome + " e " + treinador2.nome);
    }

    public void registrarTurno() {
        System.out.println("O turno foi registrado!");
        turno++;
    }
}
