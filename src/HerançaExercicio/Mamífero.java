package HerançaExercicio;

public class Mamífero extends Animal {

    private int qtdPatas;

    public Mamífero(String nome, String cor, String ambiente, Double velocidadeMédia, int qtdPatas) {
        super(nome, cor, ambiente, velocidadeMédia);
        this.qtdPatas = qtdPatas;
    }

    public int getQtdPatas() {
        return qtdPatas;
    }

    public void setQtdPatas(int qtdPatas) {
        this.qtdPatas = qtdPatas;
    }

    public void amamentar() {
        if (qtdPatas != 0) {
            System.out.println("Todo mamífero amamenta.");
        }
    }

    @Override
    public void comer() {
        if (getVelocidadeMédia() > 30) {
            System.out.println("Carnívoro e mamífero");
        } else {
            System.out.println("Animal herbívoro e mamífero");
        }
    }

    @Override
    public String toString() {
        return "Mamífer " + getNome() +
                "Mora no " + getAmbiente() +
                "qtdPatas=" + qtdPatas +
                '}';
    }

}



