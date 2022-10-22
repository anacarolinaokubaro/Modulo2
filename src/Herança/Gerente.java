package Herança;

import java.util.Arrays;

public class Gerente extends Empregado{

    private int qtdSubordinado;

    private Empregado[] subordinado;


    public Gerente(String nome, int matricula, int qtdSubordinado) {
        super(nome, matricula);
        this.qtdSubordinado = qtdSubordinado;
        this.subordinado = new Empregado[5];
    }

    public int getQtdSubordinado() {
        return qtdSubordinado;
    }

    public void setQtdSubordinado(int qtdSubordinado) {
        this.qtdSubordinado = qtdSubordinado;
    }

    public Empregado[] getSubordinado() {
        return subordinado;
    }

    public void setSubordinado(Empregado[] subordinado) {
        this.subordinado = subordinado;
    }

    public void contratar(Empregado novoEmpregado) {
        this.subordinado[qtdSubordinado] = novoEmpregado;

        System.out.println("Contratado " + qtdSubordinado + " da lista" +novoEmpregado);
        this.qtdSubordinado++;
    }



    @Override
    public String toString() {
        return "A gerente " + getNome() +
                " da matricula =" + getMatricula() +
                " pode contratar qtdSubordinado=" + qtdSubordinado +
                ", subordinado=" + Arrays.toString(subordinado) +
                '}';
    }
}
