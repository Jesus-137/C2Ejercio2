package C2Ejercio2.models;

public class Operaciones {
    public void suma(int a, int b, int y){
        numeroSuerte(a+b+y);
    }
    public void numeroSuerte(int numero1){
        String aux=Integer.toString(numero1);
        ImprimeSuerte suerte=new ImprimeSuerte();
        Integer [] dijitos=new Integer[aux.length()];
        Integer[] resustados=new Integer[aux.length()];
        resustados[0]=numero1/10;
        dijitos[0]=numero1%10;
        for (int i=1;i<aux.length(); i++){
            resustados[i]=resustados[i-1]/10;
            dijitos[i]=resustados[i-1]%10;
        }
        numero1=0;
        for (int i=0; i<aux.length(); i++){
            numero1+=dijitos[i];
        }
        suerte.numero(numero1);
    }
}
