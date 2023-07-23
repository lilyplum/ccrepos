package ui;
import com.codecool.finecalculator.data.RoadType;
import com.codecool.finecalculator.data.VehicleType;
import logic.SpeedLimitFineCalculator;

import java.util.Scanner;
public class FineCalculatorUI {
    public static void Fine() {
        System.out.println("hello");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your vehicle type: ");
        String vehicleType = scanner.nextLine();

        System.out.println("Enter the road type: ");
        String roadType = scanner.nextLine();

        System.out.println("Enter your speed: ");
        int speedValue = scanner.nextInt();

        int Fine = SpeedLimitFineCalculator.Speed(RoadType.valueOf(roadType), VehicleType.valueOf(vehicleType), speedValue);

        System.out.println("Your fine is: " + Fine);
    }
}
