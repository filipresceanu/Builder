package Builder;

public class SportsCarBuilder implements ICarBuilder{
    private Engine engine;
    private int doorsnumber;
    private Transmission transmission;
    private CarType type;
    @Override
    public void setEngine(Engine engien) {
            this.engine=engien;
    }

    @Override
    public void setDoorsNumber(int doorsNumber) {
            this.doorsnumber=doorsNumber;
    }

    @Override
    public void setTransmission(Transmission transmission) {
            this.transmission=transmission;
    }

    @Override
    public void setCarType(CarType type) {
            this.type=type;
    }
    public SportsCar build()
    {
        return new SportsCar(this.engine,this.doorsnumber,this.transmission,this.type);
    }

}
