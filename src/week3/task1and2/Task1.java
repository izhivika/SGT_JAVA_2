package week3.task1and2;

import week3.task1and2.ChildClass;
import week3.task1and2.ParentClass;

public class Task1 {

    public static void main(String[] args) {

        ParentClass parent = new ParentClass();
        parent.parentMessage();
        ChildClass child =  new ChildClass();
        child.childMessage();
        child.parentMessage();

    }

}
