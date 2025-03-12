package ro.ulbs.paradigme.lab2;

public class Circle extends Form{
    private float radius;
    private float pi=3.14f;

    public Circle(){
        super();
    }
    public Circle(float radius, String color){
        super(color);
        this.radius = radius;
    }

    @Override
    public float getArea() {
        float arie=pi*radius * radius;
        return arie;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
