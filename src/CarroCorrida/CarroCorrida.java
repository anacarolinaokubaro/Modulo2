package CarroCorrida;

public class CarroCorrida {

    private int numeroCarro;

    private Piloto piloto;

    private float velocidadeMaxima;

    private float velocidadeAtual;

    public boolean ligar;

    public CarroCorrida(
            int numeroCarro,
            Piloto piloto,
            float velocidadeMaxima,
            float velocidadeAtual,
            boolean ligar
    ){
        this.numeroCarro = numeroCarro;
        this.piloto = piloto;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = velocidadeAtual;
        this.ligar = ligar;
    }

    public int getNumeroCarro(){
        return numeroCarro;
    }

    public Piloto getPiloto(){
        return piloto;
    }
    public float getVelocidadeMaxima(){
        return velocidadeMaxima;
    }

    public float getVelocidadeAtual(){
        return velocidadeAtual;
    }


    public void setNumeroCarro(int numeroCarro){
        this.numeroCarro = numeroCarro;
    }

    public void setPiloto(Piloto piloto){
        this.piloto = piloto;
    }


    public void setVelocidadeMaxima(float velocidadeMaxima){
        if (ligar = true) {
            this.velocidadeMaxima = velocidadeMaxima;
        } else {
            System.out.println("\n\nCarro desligado");}
    }

    public void setVelocidadeAtual(float velocidadeAtual){
        if (ligar == false){
            System.out.println("\n\nCarro desligado.");
           } else if (velocidadeAtual>velocidadeMaxima){
           System.out.println("\n\nVelocidade máxima atingida, não é possível acelerar");
        } else if (velocidadeAtual == 0){
            ligar=false;
            this.velocidadeAtual= velocidadeAtual;
        } else {
            this.velocidadeAtual = velocidadeAtual;
        }

    }

    @Override
    public String toString() {
        return "\n\nCarroCorrida:\n" +
                "numeroCarro - " + numeroCarro +
                "\npiloto - '" + piloto + '\'' +
                "\nvelocidadeMaxima=" + velocidadeMaxima +
                "\nvelocidadeAtual=" + velocidadeAtual +
                "\nligar=" + ligar +
                '.';
    }
}
