package animals.abstracts;

import animals.interfaces.AnimalIF;

public abstract class AnimalAB implements AnimalIF {
    protected String nome, tipoAnimal, habitat;
    protected double altura, peso;
    protected int quantidadeComidaIngerida, distanciaPercorrida, horasDeSono, idade;

    public abstract void comer();
    public abstract void moverse();
    public abstract void dormir();
    public abstract String informacao();
    public String getTipoAnimal() { return tipoAnimal; }
    public void setTipoAnimal(String tipoAnimal) { this.tipoAnimal = tipoAnimal; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getHabitat() { return habitat; }
    public void setHabitat(String habitat) { this.habitat = habitat; }
    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }
    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }
    public int getQuantidadeComidaIngerida() { return quantidadeComidaIngerida; }
    public void setQuantidadeComidaIngerida(int quantidadeComidaIngerida) { this.quantidadeComidaIngerida = quantidadeComidaIngerida; }
    public int getDistanciaPercorrida() { return distanciaPercorrida; }
    public void setDistanciaPercorrida(int distanciaPercorrida) { this.distanciaPercorrida = distanciaPercorrida; }
    public int getHorasDeSono() { return horasDeSono; }
    public void setHorasDeSono(int horasDeSono) { this.horasDeSono = horasDeSono; }
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }
    public String toString() {
        return String.format(
                "Nome: %s%nTipo: %s%nIdade: %d anos%nAltura: %.2f cm%nPeso: %.2f kg%nHabitat: %s%n%s%n",
                getNome(), getTipoAnimal(), getIdade(), getAltura(), getPeso(), getHabitat(), informacao());
    }

}
