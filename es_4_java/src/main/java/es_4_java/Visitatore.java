package es_4_java;

public class Visitatore extends Thread{
    private Giardino g;
    private String nome;

    public Visitatore(String nome) {
        this.g = new Giardino();
        this.nome = nome;
    }

    @Override
    public void run() {
        try {
            char ing = g.entra(this);
            if(ing == 'a')
                sleep(3000);
            else
                sleep(5000);
            g.esci(this, ing);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public Giardino getG() {
        return g;
    }

    public String getNome() {
        return nome;
    }

    
    
}
