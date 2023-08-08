import animals.concrete.*;

public class Main {

    public static void main(String[] args) {
        // Exemplos de instância e uso das classes concretas
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Rex");
        cachorro.setPeso(15.0);
        cachorro.setIdade(5);
        cachorro.setHabitat("Doméstico");
        cachorro.setTipoAnimal("Terrestre");
        cachorro.setAltura(60);
        cachorro.setQuantidadePatas(4);
        cachorro.dormir();
        cachorro.moverse();
        cachorro.comer();

        Gato gato = new Gato();
        gato.setNome("Bichano");
        gato.setPeso(5.0);
        gato.setIdade(3);
        gato.setHabitat("Doméstico");
        gato.setTipoAnimal("Terrestre");
        gato.setAltura(25);
        gato.setQuantidadePatas(4);
        gato.dormir();
        gato.moverse();
        gato.comer();

        Leao leao = new Leao();
        leao.setNome("Simba");
        leao.setPeso(180.0);
        leao.setIdade(7);
        leao.setHabitat("Savana");
        leao.setTipoAnimal("Terrestre");
        leao.setAltura(120);
        leao.setQuantidadePatas(4);
        leao.dormir();
        leao.moverse();
        leao.comer();

        Elefante elefante = new Elefante();
        elefante.setNome("Dumbo");
        elefante.setPeso(6000.0);
        elefante.setIdade(15);
        elefante.setHabitat("Floresta");
        elefante.setTipoAnimal("Terrestre");
        elefante.setAltura(350);
        elefante.setQuantidadePatas(4);
        elefante.dormir();
        elefante.moverse();
        elefante.comer();

        Peixe peixe = new Peixe();
        peixe.setNome("Nemo");
        peixe.setPeso(0.1);
        peixe.setIdade(1);
        peixe.setAltura(5);
        peixe.setHabitat("Doméstico ou Selvagem");
        peixe.setTipoAnimal("Marinho");
        peixe.setQuantidadeNadadeiras(2);
        peixe.dormir();
        peixe.moverse();
        peixe.comer();

        Pombo pombo = new Pombo();
        pombo.setNome("Zé Carioca");
        pombo.setPeso(0.3);
        pombo.setIdade(2);
        pombo.setAltura(15);
        pombo.setHabitat("Perímetros urbanos");
        pombo.setTipoAnimal("Voador");
        pombo.setQuantidadeAsas(2);
        pombo.setEnvergaduraAsa(20);
        pombo.dormir();
        pombo.moverse();
        pombo.comer();

        // Impressão dos dados usando o método toString
        System.out.println(cachorro);
        System.out.println(gato);
        System.out.println(leao);
        System.out.println(elefante);
        System.out.println(peixe);
        System.out.println(pombo);
    }
}
