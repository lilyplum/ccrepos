package logic;

import com.codecool.finecalculator.data.RoadType;
import com.codecool.finecalculator.data.VehicleType;

public class SpeedLimitFineCalculator {
    public static int Speed(RoadType road, VehicleType vehicle, int Speed) {

        if (vehicle == VehicleType.CAR) {
            if (road == RoadType.URBAN) {
                if (Speed > 50) {
                    return 30;
                }
            }

            if (road == RoadType.MAINROAD) {
                if (Speed > 90) {
                    return 30;
                }
            }

            if (road == RoadType.HIGHWAY) {
                if (Speed > 130) {
                    return 30;
                }
            }
        }

        if (vehicle == VehicleType.BUS) {
            if (road == RoadType.URBAN) {
                if (Speed > 50) {
                    return 30;
                }
            }

            if (road == RoadType.MAINROAD) {
                if (Speed > 70) {
                    return 30;
                }
            }

            if (road == RoadType.HIGHWAY) {
                if (Speed > 100) {
                    return 30;
                }
            }
        }

        if (vehicle == VehicleType.TRUCK) {
            if (road == RoadType.URBAN) {
                if (Speed > 50) {
                    return 30;
                }
            }

            if (road == RoadType.MAINROAD) {
                if (Speed > 70) {
                    return 30;
                }
            }

            if (road == RoadType.HIGHWAY) {
                if (Speed > 80) {
                    return 30;
                }
            }
        }
        return 30;
    }
}
