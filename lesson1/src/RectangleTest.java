public class RectangleTest
{
    //main function
    public static void main(String[] args)
    {
        Rectangle R1 = new Rectangle();     ///create new object with default args
        System.out.println("Default rectangle without changes:");   //prompt
        displayRectangle(R1);   //display function
        System.out.println();   //Houston, we need more space

        System.out.println("Trying to set illegal width");  //prompt
        R1.setWidth(-2.4);  //trying to set an illegal width
        displayRectangle(R1);       //display function
        System.out.println();   //Houston, we need more space

        Rectangle R2 = new Rectangle(2.0, 3.0);     //create new object and set args
        System.out.println("New rectangle with specified args:");       //prompt
        displayRectangle(R2);   //display function
        System.out.println();   //Houston, we need more space

        R2.setWidth(5.0);   //set a new width for R2 rectangle
        System.out.println("Rectangle after setting new width:");   //prompt
        displayRectangle(R2);       //display function
    }

    //function for data display
    private static void displayRectangle(Rectangle R)
    {
        System.out.println("Length: " + R.getLength());     //display length
        System.out.println("Width: " + R.getWidth());       //display width
        System.out.println("Perimeter: " + R.getPerimeter());       //display perimeter
        System.out.println("Area: " + R.getArea());         //display area
    }
}