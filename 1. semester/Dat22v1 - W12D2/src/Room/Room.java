package Room;

public class Room {
    private double roomNumber;
    private int numberOfPerson;

    public void setRoomNumber(double roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setNumberOfPerson(int numberOfPerson) {
        this.numberOfPerson = numberOfPerson;
    }

    @Override
    public String toString() {
        return "\n * RoomNumber: " + roomNumber +
                "\n * NumberOfPerson: " + numberOfPerson;
    }
}
