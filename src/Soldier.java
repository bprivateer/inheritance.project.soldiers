public abstract class Soldier {
    String name;
    int rank;
    int serialNumber;
    String speak;

    public Soldier() {
    }

    public Soldier(String name, int rank, int serialNumber, String speak) {
        this.name = name;
        this.rank = rank;
        this.serialNumber = serialNumber;
        this.speak = speak;
    }

    public String eat(){
        return "chew";
    }

    public String sleep(){
        return "snore";
    }

    public String walk(){
        return "trudge";
    }

    abstract public String speak();
}
