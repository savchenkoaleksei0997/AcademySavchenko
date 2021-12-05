package by.academy.classwork.lesson14;

public class Toy {

    String name;
    int prace;

    public Toy(){
        super();
    }

    public Toy(String name, int prace){
        super();
        this.name = name;
        this.prace = prace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrace() {
        return prace;
    }

    public void setPrace(int prace) {
        this.prace = prace;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Toy{");
        sb.append("name='").append(name).append('\'');
        sb.append(", prace=").append(prace);
        sb.append('}');
        return sb.toString();
    }
}
