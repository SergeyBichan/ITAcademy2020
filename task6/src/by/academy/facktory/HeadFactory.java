package by.academy.facktory;

import by.academy.parts.head.Head;
import by.academy.parts.head.LargeHead;
import by.academy.parts.head.LittleHead;
import by.academy.parts.head.MediumHead;

public enum HeadFactory implements Factory {
    LARGEHEAD(new LargeHead("LargeHead")),
    MEDIUMHEAD(new MediumHead("MediumHead")),
    LITTLEHEAD(new LittleHead("LittleHead"));


    Head head;

    @Override
    public String toString() {
        return "HeadFactory{" +
                "head=" + head +
                '}';
    }

    HeadFactory(Head head) {
        this.head = head;
    }

    @Override
    public Head getType() {
        return head;
    }
}
