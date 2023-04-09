package exercises.technology;

public class Laptop extends Computer {
    private double weight;

    public Laptop(String name, String access, Boolean on, double weight) {
        super(name, access, on);
        this.weight = weight;
    }

    public boolean isClunky() {
        if (weight > 5.0) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public int setId() {
        return super.setId()+1;
    }
}
