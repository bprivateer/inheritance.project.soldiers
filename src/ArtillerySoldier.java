class ArtillerySoldier extends Soldier implements AquaticExplosions{
    public String speak(){
        return "BAM!";
    }

    @Override
    public String aquaticCombat() {
        return null;
    }

    public String kick(){
        return "BOMB KICK!";
    }
    public String eat(){
        return "BOMB SOLDIER EATS";
    }

    public String sleep(){
        return "BOMB SOLDIER SLEEPS";
    }

    public String walk(){
        return "BOMB SOLDIER WALKS";
    }

    @Override
    public Bomb newBomb() {
        Bomb theBomb = new Bomb();
        return theBomb;
    }
}