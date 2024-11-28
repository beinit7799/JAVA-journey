package Assignments;

public class Constructor_AreaTriangle {
    
    int a, b, c;
    double area = 0; 
    int perimeter = 0;
    
    Constructor_AreaTriangle(int i, int j, int k) {
        a = 2;
        b = 6;
        c = 4;

        
        double s = (a + b + c) / 2.0;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c)); 
        perimeter = a + b + c; 
    }
    
    void print() {
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
    
    public static void main(String[] args) {
        Constructor_AreaTriangle triangle = new Constructor_AreaTriangle(2, 3, 4); 
        triangle.print();
    }
}