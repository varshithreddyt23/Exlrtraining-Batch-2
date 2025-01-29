class demo054 {
    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    double calculateArea(double length, double width) {
        return length * width;
    }
    public static void main(String[] args) {
        demo054 geometry = new demo054();
        double circleArea = geometry.calculateArea(4.0);
        System.out.println("Area of the circle: " + circleArea);
        double rectangleArea = geometry.calculateArea(6.0, 5.0); 
        System.out.println("Area of the rectangle: " + rectangleArea);
    }
}