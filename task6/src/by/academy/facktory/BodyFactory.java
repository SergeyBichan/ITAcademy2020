package by.academy.facktory;

import by.academy.parts.body.Body;
import by.academy.parts.body.LargeBody;
import by.academy.parts.body.LittleBody;
import by.academy.parts.body.MediumBody;

public enum BodyFactory implements Factory {
    LARGEBODY(new LargeBody("Large body")),
    LITTLEBODY(new LittleBody("Little body")),
    MEDIUMBODY(new MediumBody("Medium body"));

    @Override
    public String toString() {
        return "BodyFactory{" +
                "body=" + body +
                '}';
    }

    Body body;

    BodyFactory(Body body) {
        this.body = body;
    }

    @Override
    public Body getType() {
        return body;
    }
}
