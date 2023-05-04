public class ServiceStation implements ServiceStationInterface {
    @Override
    public void check(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            Car car = cars[i];
            car.updateTyre();
            car.checkEngine();
            System.out.println("Обслуживаем " + car.getModelName());
        }
    }
    @Override
    public void check(Truck[] trucks) {
        for (int i = 0; i < trucks.length; i++) {
            Truck truck = trucks[i];
            truck.updateTyre();
            truck.checkEngine();
            System.out.println("Обслуживаем " + truck.getModelName());
        }
    }
    @Override
    public void check(Bicycle[] bicycles) {
        for (int i = 0; i < bicycles.length; i++) {
            Bicycle bicycle = bicycles[i];
            bicycle.updateTyre();
            System.out.println("Обслуживаем " + bicycle.getModelName());
        }
    }
}