class Rectangle
{
    //declare variables
    private double length;  //length of rectangle
    private double width;   //width of rectangle

    //constructor
    public Rectangle()
    {
        this(1.0, 1.0); //set default values
    }

    //constructor with args
    public Rectangle(double l, double w)
    {
        this.length = l;
        this.width = w;
    }

    //setter for length
    public void setLength(double l)
    {
        if(l < 0.0 || l > 20.0)     //check if the values are legal
            System.out.println("Length out of range.");     //prompt for illegal values
        else this.length = l;
    }

    //setter for width
    public void setWidth(double w)
    {
        if(w < 0.0 || w > 20.0)     //check if the values are legal
            System.out.println("Width out of range.");      //prompt for illegal values
        else this.width = w;
    }

    //getters
    //for length
    public double getLength()
    {
        return this.length;
    }
    //for width
    public double getWidth()
    {
        return this.width;
    }
    //for perimeter
    public double getPerimeter()
    {
        return 2 * (this.length + this.width);
    }
    //for area
    public double getArea()
    {
        return this.length * this.width;
    }
}