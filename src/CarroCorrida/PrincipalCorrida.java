package CarroCorrida;

public class PrincipalCorrida {

    public static void main(String[] args) {

        Piloto AnaOkubaro = new Piloto("Ana Okubaro",30,Sexo.FEMININO,"Azul");
        CarroCorrida Cobalt = new CarroCorrida(18, AnaOkubaro, 230,0,false);

        System.out.println(Cobalt);

        acelerar(50,Cobalt);

        frear(50,Cobalt);

        ligarCarro(Cobalt);

        acelerar(270,Cobalt);

        CarroCorrida Ferrari = new CarroCorrida(22, AnaOkubaro, 270,0,true);

        acelerar(269,Ferrari);

        System.out.println(Ferrari);

        frear(200,Ferrari);

        System.out.println(Ferrari);

        parar(Ferrari);

        System.out.println(Ferrari);


    }



        public static void acelerar (float velocidade, CarroCorrida carroCorrida){
        float velocidadeADD = carroCorrida.getVelocidadeAtual() + velocidade;
        carroCorrida.setVelocidadeAtual(velocidadeADD);
        }


        public static void frear (float velocidade, CarroCorrida carroCorrida){
        float velocidadeADD = carroCorrida.getVelocidadeAtual() - velocidade;
        carroCorrida.setVelocidadeAtual(velocidadeADD);
    }

        public static void parar (CarroCorrida carroCorrida){
        float velocidadeParar =  carroCorrida.getVelocidadeAtual() - carroCorrida.getVelocidadeAtual();
        carroCorrida.setVelocidadeAtual(velocidadeParar);
        }

        public static void ligarCarro (CarroCorrida carroCorrida){
        boolean ligar = carroCorrida.isLigar();
        ligar = true;
            carroCorrida.setLigar(ligar);

        }


}
