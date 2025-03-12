package ro.ulbs.paradigme.lab2;

public class Form {
    public String color;

    public Form(){
        this.color = "white";
    }

    public Form(String color){
        this.color = color;
    }

    public float getArea(){
        return 0;
    }

    public String toString(){
        return "this form has the color: " + color;
    }


}
