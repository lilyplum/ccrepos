package com.codecool.elevator;

import java.util.*;

class Elevator implements Observer {
    private int currentFloor = 0;
    private List<Request> requests = new ArrayList<>();
    private Direction currentDirection = Direction.UP;

    public void start() {
        while (!requests.isEmpty()) {
            // Sort the initial requests by floor
            sortRequests();
            // Start processing requests
            processRequests();
        }
    }

    private void sortRequests() {
        // Sort the requests in the current direction by floor
        List<Request> currentDirectionRequests = new ArrayList<>();
        for (Request request : requests) {
            if (request.getDirection() == currentDirection) {
                currentDirectionRequests.add(request);
            }
        }
        Collections.sort(currentDirectionRequests, new Comparator<Request>() {
            @Override
            public int compare(Request o1, Request o2) {
                return o1.getFloor() - o2.getFloor();
            }
        });
        // Sort the requests in the opposite direction by reverse floor order
        List<Request> oppositeDirectionRequests = new ArrayList<>();
        for (Request request : requests) {
            if (request.getDirection() != currentDirection) {
                oppositeDirectionRequests.add(request);
            }
        }
        Collections.sort(oppositeDirectionRequests, new Comparator<Request>() {
            @Override
            public int compare(Request o1, Request o2) {
                return o2.getFloor() - o1.getFloor();
            }
        });
        // Combine the two lists of requests
        requests.clear();
        requests.addAll(currentDirectionRequests);
        requests.addAll(oppositeDirectionRequests);
    }

    private void processRequests() {

        // Move the elevator to the next floor
        moveElevator();
        // Check if there are requests to serve on the current floor
        List<Request> currentFloorRequests = new ArrayList<>();
        for (Request request : requests) {
            if (request.getFloor() == currentFloor) {
                currentFloorRequests.add(request);
            }
        }
        if (!currentFloorRequests.isEmpty()) {
            // Serve the requests on the current floor
            for (Request request : currentFloorRequests) {
                serveRequest(request);
                requests.remove(request);
            }
            // Sort the remaining requests
            sortRequests();
        }
    }

    private void moveElevator() {
        // Move the elevator to the next floor in the current direction
        int nextFloor = currentFloor + currentDirection.getValue();
        System.out.println("Moving " + currentDirection + " to floor " + nextFloor);
        currentFloor = nextFloor;
    }

    private void serveRequest(Request request) {
        // Serve the request by printing a message
        if (request instanceof InsideRequest) {
            System.out.println("Serving inside request to floor " + request.getFloor());
        } else {
            System.out.println("Serving outside request " + request.getDirection() + " to floor " + request.getFloor());
        }
    }


    @Override
    public void update(ControlPanel controlPanel) {
        // Add the new requests to the elevator
        requests.addAll(controlPanel.getRequests());
        // Sort the requests according to the SCAN algorithm
        sortRequests();
    }
}


