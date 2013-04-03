/*
Author: Caleb Bartholomew <rojuinex@gmail.com>
Date Created: April 3rd, 2013
Description: Moves the mouse to the lower left hand corner of the screen
Copyright © 2013 All Rights Reserved.
*/

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.Dimension;

public class HideMouse{
	public static void main(String[] args) throws Exception{
		Robot robot = new Robot();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		robot.mouseMove(0, (int)screenSize.getHeight());
	}
}