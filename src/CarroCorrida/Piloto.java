package CarroCorrida;

public class Piloto {

   private String nome;

   private int idade;

    private Sexo sexo;

    private String equipe;

    public Piloto (
            String nome,
            int idade,
            String sexo,
            String equipe
    ){
        this.nome = nome;
        this.idade = idade;
        this.sexo = Sexo.valueOf(sexo);
        this.equipe = equipe;
    }

    public String getNome(){

        return nome;
    }

    public int getIdade(){
         return idade;
    }


    public String getEquipe(){
        return equipe;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setEquipe(String equipe){
        this.equipe = equipe;
    }


    @Override
    public String toString() {
        return "Piloto: " +
                "\nnome - '" + nome + '\'' +
                "\nidade - '" + idade +
                "\nsexo - '" + sexo + '\'' +
                "\nequipe - '" + equipe + '\'' +
                '.';
    }
}
