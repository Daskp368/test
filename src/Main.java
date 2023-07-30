public class Main {
    public static void main(String[] args) {
        ElevatorCab elevatorCabFirst = new ElevatorCab(1, Condition.STANDCLOSEDOORS);
        ElevatorCab elevatorCabSecond = new ElevatorCab(1, Condition.STANDCLOSEDOORS);
        Floor floor = new Floor((byte) 1, (byte) 1);

        // Пассажир 1 вызывает лифт на 1м этаже и поднимается на 14 этаж
        elevatorCabFirst.standCloseDoors();
        System.out.println("Пассажир 1 вызывает лифт на 1м этаже");
        elevatorCabFirst.pressDoorOpeningButton();
        floor.setElevatorCallButtonStatus(true);
        elevatorCabFirst.setCondition(Condition.OPENDOORS);
        elevatorCabFirst.setCondition(Condition.STANDOPENDOORS);
        elevatorCabFirst.standOpenDoors();
        floor.setElevatorCallButtonStatus(false);
        elevatorCabFirst.sensorDetectsMovementBetweenDoors();
        elevatorCabFirst.sensorDetectsAbsenceMovementBetweenDoors();
        elevatorCabFirst.pressFloorButton(14);
        elevatorCabFirst.pressDoorClosingButton();
        elevatorCabFirst.setCondition(Condition.CLOSEDOORS);
        elevatorCabFirst.standCloseDoors();
        floor.setCurrentStatusFirstCub(true);
        elevatorCabFirst.setCondition(Condition.GOUP);
        elevatorCabFirst.goUp();
        for (int i = 1; i < 15; i++) {
            elevatorCabFirst.setFloor(i);
            System.out.println("Текущий этаж " + elevatorCabFirst.getFloor());
        }
        floor.setCurrentStatusFirstCub(false);
        elevatorCabFirst.setCondition(Condition.STANDCLOSEDOORS);
        elevatorCabFirst.standCloseDoors();
        elevatorCabFirst.pressDoorOpeningButton();
        elevatorCabFirst.setCondition(Condition.OPENDOORS);
        elevatorCabFirst.setCondition(Condition.STANDOPENDOORS);
        elevatorCabFirst.sensorDetectsMovementBetweenDoors();
        elevatorCabFirst.sensorDetectsAbsenceMovementBetweenDoors();
        elevatorCabFirst.setCondition(Condition.STANDCLOSEDOORS);
        elevatorCabFirst.standCloseDoors();

        // Пассажир 2 вызывает лифт на 15 этаже и опускается на 1 этаж
        System.out.println("Пассажир 2 вызывает лифт на 15м этаже");
        elevatorCabSecond.standCloseDoors();
        elevatorCabSecond.pressDoorOpeningButton();
        floor.setElevatorCallButtonStatus(true);
        elevatorCabSecond.setCondition(Condition.CLOSEDOORS);
        floor.setCurrentStatusSecondCub(true);
        elevatorCabSecond.setCondition(Condition.GOUP);
        for (int i = 1; i < 16; i++) {
            elevatorCabSecond.setFloor(i);
            System.out.println("Текущий этаж " + elevatorCabSecond.getFloor());
        }
        floor.setCurrentStatusSecondCub(false);
        elevatorCabSecond.setCondition(Condition.OPENDOORS);
        elevatorCabSecond.setCondition(Condition.STANDOPENDOORS);
        elevatorCabSecond.standOpenDoors();
        floor.setElevatorCallButtonStatus(false);
        elevatorCabSecond.sensorDetectsMovementBetweenDoors();
        elevatorCabFirst.sensorDetectsAbsenceMovementBetweenDoors();
        elevatorCabSecond.pressFloorButton(1);
        elevatorCabSecond.pressDoorClosingButton();
        elevatorCabSecond.setCondition(Condition.CLOSEDOORS);
        elevatorCabSecond.standCloseDoors();
        floor.setCurrentStatusSecondCub(true);
        elevatorCabSecond.setCondition(Condition.GODOWN);
        elevatorCabSecond.goDown();
        for (int i = 15; i > 0; i--) {
            elevatorCabSecond.setFloor(i);
            System.out.println("Текущий этаж " + elevatorCabSecond.getFloor());
        }
        floor.setCurrentStatusSecondCub(false);
        elevatorCabSecond.setCondition(Condition.STANDCLOSEDOORS);
        elevatorCabSecond.standCloseDoors();
        elevatorCabSecond.pressDoorOpeningButton();
        elevatorCabSecond.setCondition(Condition.OPENDOORS);
        elevatorCabSecond.setCondition(Condition.STANDOPENDOORS);
        elevatorCabSecond.sensorDetectsMovementBetweenDoors();
        elevatorCabSecond.sensorDetectsAbsenceMovementBetweenDoors();
        elevatorCabSecond.setCondition(Condition.STANDCLOSEDOORS);
        elevatorCabSecond.standCloseDoors();
    }
}