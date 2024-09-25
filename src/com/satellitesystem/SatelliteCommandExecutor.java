package com.satellitesystem;

import java.util.Scanner;

public class SatelliteCommandExecutor {
    public static void main(String[] args) {
        SatelliteController controller = SatelliteController.getInstance();
        SatelliteMonitor monitor = new SatelliteStateDisplay();
        controller.attachMonitor(monitor);

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Commands:");
            System.out.println("1. Rotate (command: rotate [north/south/east/west])");
            System.out.println("2. Activate Panels (command: activate)");
            System.out.println("3. Deactivate Panels (command: deactivate)");
            System.out.println("4. Collect Data (command: collect)");
            System.out.println("5. Quit (command: quit)");
            System.out.print("Enter command: ");

            String input = scanner.nextLine().toLowerCase();
            Action action = null;

            try {
                switch (input) {
                    case "rotate":
                        System.out.print("Direction (north/south/east/west): ");
                        String direction = scanner.nextLine().toUpperCase();
                        action = new OrientationChangeCommand(controller, SatelliteOrientation.valueOf(direction));
                        break;
                    case "activate":
                        action = new SolarPanelActivationCommand(controller);
                        break;
                    case "deactivate":
                        action = new SolarPanelDeactivationCommand(controller);
                        break;
                    case "collect":
                        action = new DataCaptureCommand(controller);
                        break;
                    case "quit":
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid command. Try again.");
                }

                if (action != null) {
                    action.execute();
                }
            } catch (IllegalArgumentException e) {
                System.err.println("Error: Invalid direction.");
            } catch (SatelliteActionException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }

        System.out.println("Final Satellite State:");
        System.out.println(controller.getCurrentState());
        scanner.close();
    }
}
