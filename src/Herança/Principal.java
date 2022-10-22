package Herança;

public class Principal {

    public static void main(String[] args) {


        Gerente boss = new Gerente("Nath", 1234 , 0);
        Estagiaria aprendiz = new Estagiaria("Ana", 3456 , ListaFaculdade.FEI);
        Estagiaria estagiaria = new Estagiaria("Carolina", 12409, ListaFaculdade.Maua);


        System.out.println(boss);

        boss.contratar(aprendiz);
        boss.contratar(estagiaria);

        System.out.println(boss);



    }
}
