package SOLID;

interface Shape{
    void draw();
}

class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class ShapeDrawer{
    public void drawShape(Shape shape){
      shape.draw();
    }
}



//Wrong Approach: Violates Open/Closed Principle
class ShapeDrawerWrong{
    public void drawShape(String shapeType){
        if(shapeType.equals("Circle")){
            System.out.println("Drawing a Circle");
        } else if(shapeType.equals("Rectangle")){
            System.out.println("Drawing a Rectangle");
        }
        // If we want to add more shapes, we have to modify this method
    }
}