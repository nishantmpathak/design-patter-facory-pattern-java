import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Demo {

    public static void main(String[] args) {
        FactoryShape factoryShape = new FactoryShape();
        Shape shape = factoryShape.getShape("Square");
        shape.draw();
    }

}
