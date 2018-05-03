package extra;

import org.jointheleague.graphical.robot.Robot;

public class RobotGrafitti {
	public static void main(String[] args) throws Exception {
//make a new robot
	Robot look = new Robot();
	look.miniaturize();
	look.setSpeed(50);
look.penDown();
look.move(200);
look.turn(180);
look.move(100);
look.turn(225);
look.move(100);
look.turn();
look.turn(90);
look.move(100);
}
}