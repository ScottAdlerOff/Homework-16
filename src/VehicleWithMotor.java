public abstract class VehicleWithMotor extends Vehicle{
    public VehicleWithMotor(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    @Override
    public void service(){
        super.service();
        checkEngine();
    }
}