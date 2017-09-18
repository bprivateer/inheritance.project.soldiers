public interface AquaticCombat {
    public String aquaticCombat();
}

interface AquaticExplosions extends AquaticCombat{
    public Bomb newBomb();
}

class Bomb {
    String bomb;

    public Bomb() {
    }

    public Bomb(String bomb) {
        this.bomb = bomb;
    }

    @Override
    public String toString() {
        return "Bomb{" +
                "bomb='" + bomb + '\'' +
                '}';
    }
}