package es_4_java;

public class Main {
    public static void main(String[] args) {
        Visitatore visitatori[] = new Visitatore[50];
        for(int i = 0; i < 50; i++){
            visitatori[i] = new Visitatore("Visitatore " + i);
        }

        for(int i = 0; i < 50; i++){
            visitatori[i].start();
        }
    }
}