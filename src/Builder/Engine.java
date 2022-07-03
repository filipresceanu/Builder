package Builder;

public class Engine {
    private int displacement;
    private Fuel fuel;
    private int cylinder;

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public int getCylinder() {
        return cylinder;
    }

    public void setCylinder(int cylinder) {
        this.cylinder = cylinder;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public Engine(int displacement, Fuel fuel, int cylinder) {
        this.displacement = displacement;
        this.fuel = fuel;
        this.cylinder = cylinder;
    }
}
