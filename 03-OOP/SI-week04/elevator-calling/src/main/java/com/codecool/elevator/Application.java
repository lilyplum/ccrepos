package com.codecool.elevator;

public class Application {

    public static void main(String[] args) {
        // Incoming requests:
        //
        // Outside UP request from floor 0
        // Inside UP request going to floor 3.
        // Inside UP request going to floor 2.
        // Outside DOWN request from floor 4.
        // Outside DOWN request from floor 1.
        // Inside DOWN request going to floor 1.
        // Inside DOWN request going to floor 2.
        // Inside DOWN request going to floor 0.


        // Create a new elevator object
        Elevator elevator = new Elevator();

        // Add the elevator as an observer to the control panel
        ControlPanel controlPanel = new ControlPanel();
        controlPanel.addObserver(elevator);

        // Add the requests to the control panel
        controlPanel.addRequest(new OutsideRequest(Direction.UP, 0));
        controlPanel.addRequest(new InsideRequest(Direction.UP, 3));
        controlPanel.addRequest(new InsideRequest(Direction.UP, 2));
        controlPanel.addRequest(new OutsideRequest(Direction.DOWN, 4));
        controlPanel.addRequest(new OutsideRequest(Direction.DOWN, 1));
        controlPanel.addRequest(new InsideRequest(Direction.DOWN, 1));
        controlPanel.addRequest(new InsideRequest(Direction.DOWN, 2));
        controlPanel.addRequest(new InsideRequest(Direction.DOWN, 0));

        // Start the elevator
        elevator.start();
    }
}
