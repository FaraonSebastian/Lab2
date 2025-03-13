package ro.ulbs.paradigme.lab2;

public class Triangle extends Form{
    private float height;
    private float base;

    public Triangle() {
        super();
    }

    public Triangle(float height, float base ,String color){
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    public float getArea() {
        return (height * base)/2;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
