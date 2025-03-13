package ro.ulbs.paradigme.lab2;

public class Form {
    public String color;
        public static int counter=0;

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

    public static int getCounter(){
        return counter;
    }

}
