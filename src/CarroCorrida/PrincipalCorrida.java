package CarroCorrida;

public class PrincipalCorrida {

    public static void main(String[] args) {

        Piloto AnaOkubaro = new Piloto("Ana Okubaro",30,"Feminino","Azul");
        CarroCorrida Cobalt = new CarroCorrida(18, "AnaOkubaro", 230,0,false);

        acelerar(50,Cobalt);




    }



        public static void acelerar (float velocidade, CarroCorrida CarroCorrida){
        float velocidadeADD = CarroCorrida.getVelocidadeAtual() + velocidade;
            CarroCorrida.setVelocidadeAtual(velocidadeADD);
        }


        public static void frear (float velocidade, CarroCorrida CarroCorrida){
        float velocidadeADD = CarroCorrida.getVelocidadeAtual() - velocidade;
        CarroCorrida.setVelocidadeAtual(velocidadeADD);
    }

        public static void parar (CarroCorrida CarroCorrida){
        float velocidadeParar =  CarroCorrida.getVelocidadeAtual() - CarroCorrida.getVelocidadeAtual();
            CarroCorrida.setVelocidadeAtual(velocidadeParar);
        }



}
