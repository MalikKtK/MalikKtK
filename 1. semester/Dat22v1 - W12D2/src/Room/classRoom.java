package Room;

public class classRoom extends Room {
    private double sizeOfBlackBoard;
    private String colorOfClassRoom;

    classRoom(double roomNumber, int numberOfPerson, double sizeOfBlackBoard, String colorOfClassRoom) {
        setRoomNumber(roomNumber);
        setNumberOfPerson(numberOfPerson);
        setSizeOfBlackBoard(sizeOfBlackBoard);
        setColorOfClassRoom(colorOfClassRoom);
    }

    public void setSizeOfBlackBoard(double sizeOfBlackBoard) {
        this.sizeOfBlackBoard = sizeOfBlackBoard;
    }


    public void setColorOfClassRoom(String colorOfClassRoom) {
        this.colorOfClassRoom = colorOfClassRoom;
    }

    @Override
    public String toString() {
        return "classRoom{" +
                super.toString() +
                "\n * sizeOfBlackBoard: " + sizeOfBlackBoard +
                "\n * colorOfClassRoom: '" + colorOfClassRoom +
                '}';
    }
}
