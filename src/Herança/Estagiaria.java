package Herança;

public class Estagiaria extends Empregado{

    private ListaFaculdade faculdade;

    public Estagiaria(String nome, int matricula, ListaFaculdade faculdade) {
        super(nome, matricula);
        this.faculdade = faculdade;
    }

    public void pegarCafé(){
        System.out.println("Um café solicitado");
    }
}
