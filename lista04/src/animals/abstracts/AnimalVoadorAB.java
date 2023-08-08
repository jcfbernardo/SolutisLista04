package animals.abstracts;

public abstract class AnimalVoadorAB extends AnimalAB{
    int quantidadeAsas, envergaduraAsa;

    public abstract String voar();

    public int getQuantidadeAsas() { return quantidadeAsas; }

    public void setQuantidadeAsas(int quantidadeAsas) { this.quantidadeAsas = quantidadeAsas; }

    public int getEnvergaduraAsa() { return envergaduraAsa; }

    public void setEnvergaduraAsa(int envergaduraAsa) { this.envergaduraAsa = envergaduraAsa; }

    @Override
    public String informacao() {
        return String.format("Quantidade de Asas: %d%nEnvergadura da Asa: %d cm", quantidadeAsas, envergaduraAsa);
    }

}