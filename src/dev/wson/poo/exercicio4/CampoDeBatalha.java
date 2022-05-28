package dev.wson.poo.exercicio4;

public class CampoDeBatalha {
    private Personagem cobra, gigante, vampiro;

    CampoDeBatalha() {
        cobra = new Cobra("Anaconda", 200);
        gigante = new Gigante("Golias", 250);
        vampiro = new Vampiro("Conde Dracula", 230);
    }
    public void realizarAtaque(TipoDePersonagem atacante, TipoDePersonagem vitima, Dano tipoDano){
        System.out.println("--- ATAQUE ---");
        getPersonagem(atacante).atacar();
        getPersonagem(vitima).apanhar(getPersonagem(atacante).getDano(), tipoDano);
    }
    public void realizarInteracao(TipoDePersonagem emissor, TipoDePersonagem receptor) {
        System.out.println("--- INTERAÇÃO ---");
        getPersonagem(emissor).interagir();
        getPersonagem(receptor).interagir();
    }
    private Personagem getPersonagem(TipoDePersonagem tipo) {
        Personagem personagem = switch (tipo) {
            case VAMPIRO -> vampiro;
            case COBRA -> cobra;
            case GIGANTE -> gigante;
        };
        return personagem;
    }
}