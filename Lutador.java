public class Lutador {
    private String nome,nacionalidade;
    private Integer vitorias,derrotas,idade;


    public Lutador(String nome, String nacionalidade, Integer idade,
                   Integer vitorias, Integer derrotas){
        setIdade(idade);
        setDerrotas(derrotas);
        setNacionalidade(nacionalidade);
        setNome(nome);
        setVitorias(vitorias);
    }

    public Integer getIdade() {
        return idade;
    }

    public Integer getDerrotas() {
        return derrotas;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public Integer getVitorias() {
        return vitorias;
    }

    public void setDerrotas(Integer derrotas) {
        this.derrotas = derrotas;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }


    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }


    public void apresentar(){
        System.out.println(getNome());
        System.out.println(getNacionalidade());
        System.out.println(getIdade());
        System.out.println(getVitorias());
        System.out.println(getDerrotas());
    }

    public void ganhar(){
        setVitorias(getVitorias()+1);
    }

    public void perder(){
        setDerrotas(getDerrotas()+1);
    }


}
