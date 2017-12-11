public class Parrot extends myFly {

    private String name;

    public void Parrot(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return this.name;
    }
    @Override
    public void tyrFlying(String name) {
        System.out.println(name + "flies in green trees");
    }

    @Override
    public void myEat() {
        System.out.println("All animals including "+ getName() + " eats");
    }

    @Override
    public void myBreath(String name) {
        System.out.println(name + " breaths in air");
    }
}
