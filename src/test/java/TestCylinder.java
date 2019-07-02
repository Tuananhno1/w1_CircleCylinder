public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(6);
        System.out.println(cylinder);

        cylinder = new Cylinder(6,"red", 8);
        System.out.println(cylinder);
    }
}
