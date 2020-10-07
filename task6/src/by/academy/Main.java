package by.academy;

import by.academy.facktory.BodyFactory;
import by.academy.facktory.HeadFactory;
import by.academy.robot.Robot;

public class Main {
    public static void main(String[] args) {
        Robot robot1 = new Robot("авы", BodyFactory.LARGEBODY.getType(), HeadFactory.LARGEHEAD.getType());
        Robot robot2 = new Robot("РОщвд", BodyFactory.MEDIUMBODY.getType(), HeadFactory.MEDIUMHEAD.getType());
        Robot robot3 = new Robot("ВОЛОДЯ", BodyFactory.MEDIUMBODY.getType(), HeadFactory.MEDIUMHEAD.getType());
        Robot robot4 = new Robot("НБАЕР", BodyFactory.LITTLEBODY.getType(), HeadFactory.LITTLEHEAD.getType());


        System.out.println(robot1);
        System.out.println(robot2);
        System.out.println(robot3);
        System.out.println(robot4);


    }
}
