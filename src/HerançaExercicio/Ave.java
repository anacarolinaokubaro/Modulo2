package HerançaExercicio;

public class Ave extends Animal{

    private boolean voar;

    public Ave(String nome, String cor, String ambiente, Double velocidadeMédia, boolean voar) {
        super(nome, cor, ambiente, velocidadeMédia);
        this.voar = voar;
    }

    public boolean isVoar() {
        return voar;
    }

    public void setVoar(boolean voar) {
        this.voar = voar;
    }

    @Override
    public void comer() {
        if (getVelocidadeMédia() > 30) {
            System.out.println("Carnívoro e Ave");
        } else {
            System.out.println("Animal herbívoro e Ave");
        }
    }

    public void voar() {
        if (voar == true) {
            System.out.println("Ave voa.");
        } else {
            System.out.println("Ave não voa");
        }
    }


    @Override
    public String toString() {
        return "Ave{ " + getNome() +
                "Mora no " + getAmbiente() +
                "voar=" + voar +
                '}';
    }
}
