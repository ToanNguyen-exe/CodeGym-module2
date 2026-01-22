package inherit.HeCacDoiTuongHinhHoc;

public class Shapetest {
    public static void main(String[]args){
        inherit.HeCacDoiTuongHinhHoc.Shape shape = new inherit.HeCacDoiTuongHinhHoc.Shape() {
            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public void howtoColor() {

            }
        };
        System.out.println(shape);
        shape = new inherit.HeCacDoiTuongHinhHoc.Shape("red", false) {
            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public void howtoColor() {

            }
        };
        System.out.println(shape);
    }
}
