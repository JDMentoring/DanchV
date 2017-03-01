package ua.smartprog.lesson_26.delegation;

public class Ship {
    private String name;
    private ShipControls controls = new ShipControls();

    public Ship(String name) {
        this.name = name;
    }

    void up(int args) {
        controls.up(args);
    }

    void down(int args) {
    }

    void left(int args) {
    }

    void right(int args) {
    }

    void forward(int args) {
    }

    void back(int args) {
    }

}
