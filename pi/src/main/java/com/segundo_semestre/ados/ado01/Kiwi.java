package pi.ado01;

public class Kiwi {
    private String name;
    private int age;
    private int beak_length;
    private boolean sleeping = false;

    public Kiwi() {

    }

    public Kiwi(String name, int age, int beak_length) {
        this.name = name;
        this.age = age;
        this.beak_length = beak_length;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setBeakSize(int beak_length) {
        this.beak_length = beak_length;
    }

    public int getBeak() {
        return beak_length;
    }

    public void sleep(){
        this.sleeping = true;
    }

    public void wakeup() {
        this.sleeping = false;
    }

    public boolean isSleeping(){
        return sleeping;
    }

}
