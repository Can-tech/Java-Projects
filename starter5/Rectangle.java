
public class Rectangle {
    protected double length;//fileds if protected other classes in the same package can access this
    private  double width;
    public Rectangle(){
        length = 0;
        width = 0;
    }
    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }
    public double getLength(){
        return length;
    }
    public double setLength(double length){
       return this.length = length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double calculatePerimeter(){//methods
        return (2 * length) + (2 * width);
    }
    public double calculateArea(){
        return length * width;
    }
    //Note that there is no main method this class is a representation
    //to generel rectangle object 
    //We need to proide the length and width
    //we can use  a setter- getter functions or a constructor
}
