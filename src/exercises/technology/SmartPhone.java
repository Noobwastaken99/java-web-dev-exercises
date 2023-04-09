package exercises.technology;

public class SmartPhone extends Computer{
    private int pictures;

    public SmartPhone(String name, String access, Boolean on, int pictures) {
        super(name, access, on);
        this.pictures = pictures;
    }

    public void takeSelfie() {
        this.pictures += 1;
    }

    public int numOfPics() {
        return this.pictures;
    }

    @Override
    public int setId() {
        return super.setId()+2;
    }
}
