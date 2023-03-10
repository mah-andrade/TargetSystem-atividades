public class atividade_5 {
    public static void main(String[] args) {

        String nomeCanditado= "Matheus Andrade APROVADO!";

        String auxInverter = "";

        char [] nomeChar = nomeCanditado.toCharArray();

        for(Integer aux = nomeCanditado.length(); aux > 0; aux--){
            auxInverter = auxInverter + nomeChar[aux-1];
        }
        System.out.println("NOME NORMAL EH: "+ nomeCanditado);
        System.out.println("NOME INVERTIDO EH: "+ auxInverter);
    }
}
