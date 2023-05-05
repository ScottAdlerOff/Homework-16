public class ServiceStation implements ServiceStationInterface {
    @Override
    public void check(Car[] cars) {
        for (Car car: cars)
        car.checkEngine();
        printVehicle(cars);
    }

    @Override
    public void check(Truck[] trucks) {
        printVehicle(trucks);
        for (Truck truck: trucks)
        truck.checkEngine();
    }

    @Override
    public void check(Bicycle[] bicycles) {
        printVehicle(bicycles);
    }
    private void printVehicle(Vehicle[] vehicles){
        for (int i = 0; i < vehicles.length; i++) {
            Vehicle vehicle = vehicles[i];
            vehicle.updateTyre();
            System.out.println("Обслуживаем " + vehicle.getModelName());
        }
    }
}