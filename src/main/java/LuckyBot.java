import robocode.*;
//import java.awt.*;

public class LuckyBot extends Robot {
    public void run() {
        while (true) {
            ahead(2000);
            turnGunRight(360);
            back(2000);
            turnGunRight(360);
        }
    }
 
    public void onScannedRobot(ScannedRobotEvent e) {
        fire(1);
    }
}
