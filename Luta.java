import java.util.Random;

public class Luta{
    private Lutador desafiado;
    private Lutador desafiante;
    private Integer rounds;
    private Boolean aprovada;

    //construtor
    public Luta(){
        setAprovada(false);
        setDesafiado(null);
        setDesafiante(null);
        setRounds(0);
    }

    //get e set
    public Boolean getAprovada() {
        return aprovada;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public Integer getRounds() {
        return rounds;
    }

    public void setAprovada(Boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public void setRounds(Integer rounds) {
        this.rounds = rounds;
    }


    public void aprovar(Lutador l1, Lutador l2){
        if(l1.getIdade().equals(l2.getIdade())){
            setAprovada(true);
            System.out.println("Luta aprovada");
        }
        else System.out.println("Luta desaprovada");
    }
    public void Lutar(Lutador desafiado, Lutador desafiante){
        if(getAprovada()){
            System.out.println("Luta confirmada");
            System.out.println("Lutador 01 entrando...");
            desafiado.apresentar();
            System.out.println("Lutador 02 entrando...");
            desafiante.apresentar();

            Random random = new Random();
            int vencedor = random.nextInt(2);
            switch (vencedor){
                case 0:
                    System.out.println("Vencedor: "+desafiado.getNome());
                    desafiado.ganhar();
                    desafiante.perder();
                case 1:
                    System.out.println("Vencedor: "+desafiante.getNome());
                    desafiado.perder();
                    desafiante.ganhar();
            }

        }
        else{
            System.out.println("A luta não foi marcada");
        }
    }



}
