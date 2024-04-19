package es_4_java;

public class Giardino {
    private int contaA = 5;
    private int contaB = 10;

    public synchronized void entra(Visitatore v){
        char ing;
        if(contaA > 0){
            contaA--;
            ing = 'a';
        }else{
            contaB--;
            ing = 'b';
        }
        System.out.println(v + " è entrato nell'ingresso " + ing);
    }

    public synchronized void esci(Visitatore v){
        char ing;
        if(contaA < 5){
            contaA++;
            ing = 'b';
        }else{
            contaB++;
            ing = 'b';
        }
        System.out.println(v + " è uscito dall'uscita " + ing);
    }

    public int getContaA() {
        return contaA;
    }

    public int getContaB() {
        return contaB;
    }

    

}
