package midterms.oop;

class Rectangle {
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Getter for rectangle width
    public double getWidth() {
        return width;
    }

    // Setter for rectangle width
    public void setWidth(double width) {
        this.width = width;
    }

    // Getter for rectangle height
    public double getHeight() {
        return height;
    }

    // Setter for rectangle height
    public void setHeight(double height) {
        this.height = height;
    }

    // Calculate area
    public double getArea() {
        return width * height;
    }

    // Calculate perimeter
    public double getPerimeter() {
        return 2 * (width + height);
    }

    //MAIN
    public static void main(String[] args) {
    	
        // Rectangle 1
        Rectangle rec = new Rectangle(5.0, 10.0);

        // Display initial rectangle
        System.out.println("Width: " + rec.getWidth());
        System.out.println("Height: " + rec.getHeight());
        System.out.println("Area: " + rec.getArea());
        System.out.println("Perimeter: " + rec.getPerimeter());

        // Modify attributes 
        rec.setWidth(7.5);
        rec.setHeight(12.5);

        // Display updated version
        System.out.println("\nUpdated Rectangle Details:");
        System.out.println("Width: " + rec.getWidth());
        System.out.println("Height: " + rec.getHeight());
        System.out.println("Area: " + rec.getArea());
        System.out.println("Perimeter: " + rec.getPerimeter());
    }
}
