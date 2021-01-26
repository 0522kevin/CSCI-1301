public class CircleTester{
    public static final double THRESHOLD = 0.000000001;

    public static void main(String[] args) {

        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        circle1.setName("Circle 1");
        circle1.setX(0.0);
        circle1.setY(0.0);
        circle1.setRadius(2);
        circle2.setName("Circle 2");
        circle2.setX(2.0);
        circle2.setY(1.0);
        circle2.setRadius(1);
        System.out.println("circle1="+circle1);
        System.out.println("circle2="+circle2);

        // If the method setRadius is implemented correctly,
        // a call to setRadius with a negative number
        // will not change the value of the circle's radius.
        //
        circle1.setRadius(-2.0);

        //This is a unit test.  It is best to have tests output pass or fail instead of just a bunch of values.
        //Notice how the double comparison is done
        if(Math.abs(2-circle1.getRadius()) < THRESHOLD)
            System.out.println("PASSED: Set Radius");
        else
            System.out.println("FAILED: Set Radius");

        //
        // Reset the center of circle1 (-3.0,4.0)
        //
        circle1.setX(-3.0);
        circle1.setY(4.0);


        // print circle1 characteristics (center and radius), use a statement similar
        // to the previous println statements. Note that is not necessary to call
        // the method toString, why?
        System.out.println("name: " + circle1.getName());
        System.out.println("center: (" + circle1.getX() + "," + circle1.getY() + ")");
        System.out.println("radius: " + circle1.getRadius());

        // set the circle2 radius to 5.3
        circle2.setRadius(5.3);

        // print circle2 characteristics (center and radius), use a statement similar to the first and
        // second println statements
        System.out.println("name: " + circle2.getName());
        System.out.println("center: (" + circle2.getX() + "," + circle2.getY() + ")");
        System.out.println("radius: " + circle2.getRadius());

        // print circle1 diameter, area and perimeter
        System.out.println("diameter: " + circle1.diameter());
        System.out.println("area: " + circle1.area());
        System.out.println("perimeter: " + circle1.perimeter());

        // print circle2 diameter, area and perimeter
        System.out.println("diameter: " + circle2.diameter());
        System.out.println("area: " + circle2.area());
        System.out.println("perimeter: " + circle2.perimeter());

        // display whether circle1 is a unit circle
        if(circle1.isUnitCircle()) {
            System.out.println(circle1.getName() + " is a unit circle");
        }
        else {
            System.out.println(circle1.getName() + " is not a unit circle");
        }

        // display whether circle2 is a unit circle
        if(circle2.isUnitCircle()) {
            System.out.println(circle2.getName() + " is a unit circle");
        }
        else {
            System.out.println(circle2.getName() + " is not a unit circle");
        }

        // your additional tests should be placed below here.  Make sure to include at least 2-3 test cases
        // for each method you write.  It is best to write proper unit tests which print pass, fail for each
        // test instead of just dumping values to the screen.

        //creates additional circle3 object
        Circle circle3 = new Circle();
        circle3.setRadius(1);
        circle3.setX(-3);
        circle3.setY(-5);
        circle3.setName("not circle 3");

        //tests the equals() method 3 times
        if(circle1.equals(circle2)) {
            System.out.println(circle1.getName() + " and " + circle2.getName() + " are the same circle");
        }
        else {
            System.out.println(circle1.getName() + " and " + circle2.getName() + " are not the same circle");
        }
        if(circle1.equals(circle3)) {
            System.out.println(circle1.getName() + " and " + circle3.getName() + " are the same circle");
        }
        else {
            System.out.println(circle1.getName() + " and " + circle3.getName() + " are not the same circle");
        }
        if(circle3.equals(circle2)) {
            System.out.println(circle3.getName() + " and " + circle2.getName() + " are the same circle");
        }
        else {
            System.out.println(circle3.getName() + " and " + circle2.getName() + " are not the same circle");
        }

        //tests the distance() method 3 times
        System.out.println("The distance between " + circle1.getName() + " and " + circle2.getName() + " is " + circle1.distance(circle2));
        System.out.println("The distance between " + circle1.getName() + " and " + circle3.getName() + " is " + circle1.distance(circle3));
        System.out.println("The distance between " + circle3.getName() + " and " + circle2.getName() + " is " + circle3.distance(circle2));

        //tests the isSmaller() method 3 times
        if(circle1.isSmaller(circle2)) {
            System.out.println(circle1.getName() + " is smaller than " + circle2.getName());
        }
        else {
            System.out.println(circle1.getName() + " is not smaller than " + circle2.getName());
        }
        if(circle1.isSmaller(circle3)) {
            System.out.println(circle1.getName() + " is smaller than " + circle3.getName());
        }
        else {
            System.out.println(circle1.getName() + " is not smaller than " + circle3.getName());
        }
        if(circle3.isSmaller(circle2)) {
            System.out.println(circle3.getName() + " is smaller than " + circle2.getName());
        }
        else {
            System.out.println(circle3.getName() + " is not smaller than " + circle2.getName());
        }

        //tests the compareTo() method
        if(circle1.compareTo(circle2) == 1) {
            System.out.println(circle1.getName() + "is larger than " + circle2.getName());
        }
        else if(circle1.compareTo(circle2) == -1) {
            System.out.println(circle1.getName() + " is smaller than" + circle2.getName());
        }
        else {
            System.out.println(circle1.getName() + " and " + circle2.getName() + " has the same size");
        }
        if(circle1.compareTo(circle3) == 1) {
            System.out.println(circle1.getName() + "is larger than " + circle3.getName());
        }
        else if(circle1.compareTo(circle3) == -1) {
            System.out.println(circle1.getName() + " is smaller than" + circle3.getName());
        }
        else {
            System.out.println(circle1.getName() + " and " + circle3.getName() + " has the same size");
        }
        if(circle3.compareTo(circle2) == 1) {
            System.out.println(circle3.getName() + "is larger than " + circle2.getName());
        }
        else if(circle3.compareTo(circle2) == -1) {
            System.out.println(circle3.getName() + " is smaller than" + circle2.getName());
        }
        else {
            System.out.println(circle3.getName() + " and " + circle2.getName() + " has the same size");
        }

        //tests the intersects() method
        if(circle1.intersects(circle2)) {
            System.out.println(circle1.getName() + " and " + circle2.getName() + " intersects") ;
        }
        else {
            System.out.println(circle1.getName() + " and " + circle2.getName() + " does not intersect");
        }
        if(circle1.intersects(circle3)) {
            System.out.println(circle1.getName() + " and " + circle3.getName() + " intersects") ;
        }
        else {
            System.out.println(circle1.getName() + " and " + circle3.getName() + " does not intersect");
        }
        if(circle3.intersects(circle2)) {
            System.out.println(circle3.getName() + " and " + circle2.getName() + " intersects") ;
        }
        else {
            System.out.println(circle3.getName() + " and " + circle2.getName() + " does not intersect");
        }
    }

}
