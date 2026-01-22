package BàiTap.AbtractClassAndInterface.interfaceColorable;

public class TestColorable {
    public static void main(String[] args) {

        inherit.HeCacDoiTuongHinhHoc.Shape[] shapes = new inherit.HeCacDoiTuongHinhHoc.Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Square(7);   // có Colorable

        for (inherit.HeCacDoiTuongHinhHoc.Shape s : shapes) {
            System.out.println("Area = " + s.getArea());

            if (s instanceof Colorable) {
                ((Colorable) s).howToColor();
            }

            System.out.println("--------------------");
        }
    }
}
