public class Toy {
    protected int id;
    protected String name;
    protected int weight;

    public Toy(int id, String name, int weight){
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String getInfo() {
        return String.format("id: %2d Name: %7s weight: %2d ",
        this.id, this.name, this.weight);
        
    }

    public int getId() {
        return id;
    }
}