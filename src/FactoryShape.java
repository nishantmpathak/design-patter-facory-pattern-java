public class FactoryShape {

    public Shape getShape(String shape){
        if(shape == "Circle"){
            return new Circle();
        }else if(shape == "Square"){
            return new Square();
        }
        return null;
    }
}
