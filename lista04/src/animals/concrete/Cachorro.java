package animals.concrete;

import animals.abstracts.AnimalTerrestreAB;

public class Cachorro extends AnimalTerrestreAB {

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
