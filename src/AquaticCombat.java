public interface AquaticCombat {
    public String aquaticCombat();
}

interface AquaticExplosions extends AquaticCombat{
    public Bomb newBomb();
}

class Bomb {

    public Bomb() {
    }

    @Override
    public String toString() {
        return "I'm da bomb, yo!";
    }
}