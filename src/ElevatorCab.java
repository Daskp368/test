public class ElevatorCab {
    private int floor;
    private Condition condition;

    public ElevatorCab(int floor, Condition condition) {
        this.floor = floor;
        this.condition = condition;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;

    }

    public void pressFloorButton(int floor) {
        System.out.println("Пассажир нажал кнопку " + floor + " этажа");
    }

    public void pressDoorClosingButton() {
        System.out.println("Пассажир нажал кнопку закрытие дверей");
    }

    public void pressDoorOpeningButton() {
        System.out.println("Пассажир нажал кнопку открытие дверей");
    }

    public void pressDispatcherCallButton() {
        System.out.println("Пассажир нажал кнопку вызова диспечера");
    }

    public void sensorDetectsMovementBetweenDoors() {
        System.out.println("Датчик кабины фиксирует движение между дверьми");
    }

    public void sensorDetectsAbsenceMovementBetweenDoors() {
        System.out.println("Датчик кабины фиксирует отсутствие движение между дверьми");
    }
    public void standOpenDoors() {
        System.out.println("Лифт стоит с открытыми дверьми");
    }

    public void standCloseDoors() {
        System.out.println("Лифт стоит с закрытими дверьми");
    }

    public void goUp() {
        System.out.println("Лифт едет вверх");
    }

    public void goDown() {
        System.out.println("Лифт едет вниз");
    }
}
