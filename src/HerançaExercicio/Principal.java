package HerançaExercicio;

public class Principal {

    public static void main(String[] args) {


        Mamífero leao = new Mamífero("Simba", "Dourado", "Selva", 45.7, 4);
        Ave pinguim = new Ave("HappyFeat", "Preto", "Alaska", 5.9, false);
        Animal guepardo = new Animal("Leo", "Pintado", "Floresta", 70.0);

        System.out.println(guepardo);
        guepardo.comer();

        System.out.println(leao);
        leao.comer();
        leao.amamentar();

        System.out.println(pinguim);
        pinguim.comer();
        pinguim.voar();

    }



}
