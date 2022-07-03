package Builder;

public class FamilyCarBuilder implements ICarBuilder{
    private Engine engine;
    private int doorsNumber;
    private Transmission transmission;
    private CarType type;

    @Override
    public void setEngine(Engine engien) {
            this.engine=engien;
    }

    @Override
    public void setDoorsNumber(int doorsNumber) {
            this.doorsNumber=doorsNumber;
    }

    @Override
    public void setTransmission(Transmission transmission) {
            this.transmission=transmission;
    }

    @Override
    public void setCarType(CarType type) {
            this.type=type;
    }
    public FamilyCar build()
    {
        return new FamilyCar(this.engine,this.doorsNumber,this.transmission,this.type);
    }

}
