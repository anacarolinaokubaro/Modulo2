package HerançaExercicio;

public class Animal {

    private String nome;

    private String cor;

    private String ambiente;

    private Double velocidadeMédia;

    public Animal(String nome,
                  String cor,
                  String ambiente,
                  Double velocidadeMédia) {
        this.nome = nome;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMédia = velocidadeMédia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public Double getVelocidadeMédia() {
        return velocidadeMédia;
    }

    public void setVelocidadeMédia(Double velocidadeMédia) {
        this.velocidadeMédia = velocidadeMédia;
    }

    public void comer(){
        if (velocidadeMédia>30){
            System.out.println("Carnívoro");
        } else {
            System.out.println("Animal herbívoro");
        }

    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", ambiente='" + ambiente + '\'' +
                ", velocidadeMédia=" + velocidadeMédia +
                '}';
    }
}

