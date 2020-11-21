package student.alexandr_kozhekin.lesson_8.level_4_junior.Task_15_19.servis;

public class Circle extends Shape {

    private double radius;

    public Circle (String title, double radius){

        super(title);
        this.radius = radius;

    }

    @Override
    public double calculateArea() {

        return Math.PI * radius * radius;

    }

    @Override
    public double calculatePerimeter() {

        return  2 * Math.PI * radius;

    }
}