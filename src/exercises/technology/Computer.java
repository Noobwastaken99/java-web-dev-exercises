package exercises.technology;

public class Computer extends AbstractEntity{
    private String name;
    private String access;
    private Boolean on;

    public Computer(String name, String access, Boolean on) {
        this.name = name;
        this.access = access;
        this.on = on;
    }

    public Computer() { this.on = true; }

    /**** Methods ****/
    public void whatName() {
        System.out.println("My name is " + this.name);
    }
    public void shutDown() {
        on = false;
    }

    @Override
    public int setId() {
        return 1;
    }
}
