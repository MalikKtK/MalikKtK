package Room;

public class teachersResort extends Room {
    private String gameConsole;
    private String coffeeMachine;

    teachersResort(double roomNumber, int numberOfPerson, String gameConsole, String coffeeMachine) {
        setRoomNumber(roomNumber);
        setNumberOfPerson(numberOfPerson);
        setGameConsole(gameConsole);
        setCoffeeMachine(coffeeMachine);
    }

    public void setGameConsole(String gameConsole) {
        this.gameConsole = gameConsole;
    }

    public void setCoffeeMachine(String coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public String toString() {
        return "teachersResort{" +
                super.toString() +
                "\n * gameConsole: " + gameConsole +
                "\n * coffeeMachine: " + coffeeMachine +
                '}';
    }
}
