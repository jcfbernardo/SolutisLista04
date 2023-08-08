package animals.abstracts;

public abstract class AnimalMarinhoAB extends AnimalAB{
    int quantidadeNadadeiras;

    public abstract String nadar();

    public int getQuantidadeNadadeiras() { return quantidadeNadadeiras; }

    public void setQuantidadeNadadeiras(int quantidadeNadadeiras) { this.quantidadeNadadeiras = quantidadeNadadeiras; }

    @Override
    public String informacao() {
        return String.format("Quantidade de Nadadeiras: %d", quantidadeNadadeiras);
    }

}
