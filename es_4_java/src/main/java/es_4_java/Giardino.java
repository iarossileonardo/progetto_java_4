package es_4_java;

public class Giardino {
    private int contaA = 5;
    private int contaB = 10;
    char ing;

    public synchronized char entra(Visitatore v) throws InterruptedException{
        
        int tempo = 0;
        
        while (contaA == 0 && contaB == 0) {
            wait();
        }
            
        if(contaA > 0){
            contaA--;
            ing = 'a';
            tempo = 3;
        }else if(contaB > 0){
            contaB--;
            ing = 'b';
            tempo = 5;
        }
            
        System.out.println(v.getNome() + " è entrato nell'ingresso " + ing + " e si trattiene per " + tempo + "s");
            
        return ing;
    
    }

    public synchronized void esci(Visitatore v, char ing){

        if(ing == 'a'){
            contaA++;
        }else{
            contaB++;
        }

        notifyAll();

        System.out.println(v.getNome() + " è uscito dall'ingresso " + ing);
    }

    public int getContaA() {
        return contaA;
    }

    public int getContaB() {
        return contaB;
    }

    

}
