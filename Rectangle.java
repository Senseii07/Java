public class Rectangle {
    private int length;
    int width;

    public int calculateArea() {
        return length * width;
    }
    
    public void setLength(int length) {
        if(length<0) {
            System.out.println("Length cannot be negative.");
            return;
        }
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}