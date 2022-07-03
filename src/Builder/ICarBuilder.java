package Builder;

public interface ICarBuilder {
    void setEngine(Engine engien);
    void setDoorsNumber(int doorsNumber);
    void setTransmission(Transmission transmission);
    void setCarType(CarType type);
}
