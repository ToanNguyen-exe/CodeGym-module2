package BàiTap.AbtractClassAndInterface.interfaceColorable;

public class Circle extends inherit.HeCacDoiTuongHinhHoc.Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void howtoColor() {

    }
}
