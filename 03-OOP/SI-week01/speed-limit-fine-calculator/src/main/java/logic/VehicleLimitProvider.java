package logic;

import com.codecool.finecalculator.data.RoadType;
import com.codecool.finecalculator.data.VehicleType;

public class VehicleLimitProvider {
    public int Vehicle(RoadType road, VehicleType vehicle) {
        if (vehicle == VehicleType.CAR) {
            if (road == RoadType.URBAN) {
                return 50;
            }

            if (road == RoadType.MAINROAD) {
                return 90;
            }

            if (road == RoadType.HIGHWAY) {
                return 130;
            }
        }

        if (vehicle == VehicleType.BUS) {
            if (road == RoadType.URBAN) {
                return 50;
            }

            if (road == RoadType.MAINROAD) {
                return 70;
            }

            if (road == RoadType.HIGHWAY) {
                return 100;
            }
        }

        if (vehicle == VehicleType.TRUCK) {
            if (road == RoadType.URBAN) {
                return 50;
            }

            if (road == RoadType.MAINROAD) {
                return 70;
            }

            if (road == RoadType.HIGHWAY) {
                return 80;
            }
        }
        return 0;
    }
//    Cars are limited to 50 in urban areas, 90 on main roads, and 130 on highways.
//    Buses are limited to 50 in urban areas, 70 on main roads, and 100 on highways.
//    Trucks are limited to 50 in urban areas, 70 on main roads, and 80 on highways.
}
