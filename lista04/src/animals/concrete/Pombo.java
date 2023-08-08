package animals.concrete;

import animals.abstracts.AnimalVoadorAB;

public class Pombo extends AnimalVoadorAB {

    @Override
    public String voar() {
        return "O pombo está voando.";
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
