package by.academy.robot;

import by.academy.parts.body.Body;
import by.academy.parts.head.Head;

public class Robot {
    String name = "";
    Body body;
    Head head;

    @Override
    public String toString() {
        return "Robot " +
                "name= " + name + '\'' +
                ", body=" + body +
                ", head=" + head;
    }

    public Robot(String name, Body body, Head head) {

            this.name = name;
            this.body = body;
            this.head = head;
        }


    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }






}
