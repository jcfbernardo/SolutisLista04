package animals.abstracts;

public abstract class AnimalTerrestreAB extends AnimalAB{
    protected int quantidadePatas;

    public abstract void comer();

    public abstract void moverse();

    public abstract void dormir();

    @Override
    public String informacao() {
        return String.format("Quantidade de Patas: %d", quantidadePatas);
    }

    public int getQuantidadePatas() { return quantidadePatas; }

    public void setQuantidadePatas(int quantidadePatas) { this.quantidadePatas = quantidadePatas; }
}