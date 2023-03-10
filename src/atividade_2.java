public class atividade_2 {
    static int t1= 0,t2= 1,nSequencia = 999999999;
    public static void main(String[] args) {

        //Para testar é mexendo nessa variavel
        Integer NUMERODESEJADO = 233 ;


        Integer auxTrue =0;
        //  0 1 1 2 3 5 8 13
        for(int i = 0; i <nSequencia; i++){
            System.out.println(t2);
            int aux;
            if(t2 ==NUMERODESEJADO){
                auxTrue =1;
            }
            aux = t2;
            t2 = t2+t1;
            t1 = aux;
            if(t1 > NUMERODESEJADO){
                i = nSequencia;
            }
        }
        if(auxTrue == 1){
            System.out.println("o Numero "+NUMERODESEJADO+" faz parte da sequencia");
        }else
            System.out.println("o Numero "+NUMERODESEJADO+" nao faz parte da sequencia");
    }
}