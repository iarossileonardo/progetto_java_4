package es_4_java;

public class Main {
    public static void main(String[] args) {
        int numeroPersone = 30;
        Visitatore visitatori[] = new Visitatore[numeroPersone];
        Giardino g = new Giardino();

        for(int i = 0; i < numeroPersone; i++){
            visitatori[i] = new Visitatore("Visitatore " + i, g);
        }

        for(int i = 0; i < numeroPersone; i++){
            visitatori[i].start();
        }
    }
}