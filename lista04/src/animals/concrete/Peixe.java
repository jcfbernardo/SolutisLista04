package animals.concrete;

import animals.abstracts.AnimalMarinhoAB;

public class Peixe extends AnimalMarinhoAB {

    @Override
    public String nadar() {
        return "O peixe está nadando.";
    }

    @Override
    public void comer() {
        this.quantidadeComidaIngerida++;
    }

    @Override
    public void moverse() {
        this.distanciaPercorrida++;
    }

    @Override
    public void dormir() {
        this.horasDeSono++;
    }

}