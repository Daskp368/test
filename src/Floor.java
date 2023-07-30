public class Floor {
    private byte currentFloorFirstCub;
    private boolean currentStatusFirstCub;  // Статус лифт в движении
    private byte currentFloorSecondCub;
    private boolean currentStatusSecondCub; // Статус лифт в движении
    private boolean elevatorCallButtonStatus;

    public Floor(byte currentFloorFirstCub, byte currentFloorSecondCub) {
        this.currentFloorFirstCub = currentFloorFirstCub;
        this.currentFloorSecondCub = currentFloorSecondCub;
    }

    public byte getCurrentFloorFirstCub() {
        return currentFloorFirstCub;
    }

    public void setCurrentFloorFirstCub(byte currentFloorFirstCub) {
        this.currentFloorFirstCub = currentFloorFirstCub;
    }

    public boolean isCurrentStatusFirstCub() {
        return currentStatusFirstCub;
    }

    public void setCurrentStatusFirstCub(boolean currentStatusFirstCub) {
        this.currentStatusFirstCub = currentStatusFirstCub;
        System.out.println("Текущий статус первой кабины: " + currentStatusFirstCub);
    }

    public byte getCurrentFloorSecondCub() {
        return currentFloorSecondCub;
    }

    public void setCurrentFloorSecondCub(byte currentFloorSecondCub) {
        this.currentFloorSecondCub = currentFloorSecondCub;
    }

    public boolean isCurrentStatusSecondCub() {
        return currentStatusSecondCub;
    }

    public void setCurrentStatusSecondCub(boolean currentStatusSecondCub) {
        this.currentStatusSecondCub = currentStatusSecondCub;
        System.out.println("Текущий статус второй кабины: " + currentStatusSecondCub);
    }

    public boolean isElevatorCallButtonStatus() {
        return elevatorCallButtonStatus;
    }

    public void setElevatorCallButtonStatus(boolean elevatorCallButtonStatus) {
        this.elevatorCallButtonStatus = elevatorCallButtonStatus;
    }

}
