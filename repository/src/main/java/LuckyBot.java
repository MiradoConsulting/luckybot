import robocode.DeathEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;
import robocode.HitWallEvent;
import robocode.HitRobotEvent;
import static robocode.util.Utils.normalRelativeAngleDegrees;

import java.awt.*;


public class LuckyBot extends Robot {

	public void run() {
	
		turnRight(normalRelativeAngleDegrees(0 - getHeading()));

		while (true) {
			ahead(100);
			turnGunLeft(-180);
			turnGunRight(-180);
		}
	}

   public void onHitWall(HitWallEvent event) {
			turnLeft(90);
   }

   public void onHitRobot(HitRobotEvent event) {
			turnLeft(90);
   }

	public void onScannedRobot(ScannedRobotEvent e) {
		double gunTurnAmt = normalRelativeAngleDegrees(e.getBearing() + (getHeading() - getRadarHeading()));
		turnGunRight(gunTurnAmt);
		fire(1);
	}
}
