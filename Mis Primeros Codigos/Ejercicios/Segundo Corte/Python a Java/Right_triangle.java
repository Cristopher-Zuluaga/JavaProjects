/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package right_triangle;

import static java.lang.Math.sqrt;

/**
 *
 * @author Danflew
 */
public class Right_triangle {
    private final double a;
    private final double b;
    private final double hypotenuse;
    public Right_triangle(double high, double base)
    {
        System.out.println("creating the Right triangle with high:" + high);
        System.out.println("And with base" + base);
        this.a = high;
        this.b = base;
        this.hypotenuse = sqrt((high*high)+(base*base));
    }
    public double Perimeter()
    {
        return this.b+this.a+this.hypotenuse;
    }
    public double area()
    {
        return (this.a*this.b)/2;
    }
    public static void main(String[] args) {
        Right_triangle Right_triangle_1 = new Right_triangle(10,5);
        Right_triangle Right_triangle_2 = new Right_triangle( 20,7);
        Right_triangle Right_triangle_3 = new Right_triangle(70,60);
        System.out.println("the Right_triangle_1 perimeter is:" + Right_triangle_1.Perimeter());
        System.out.println("the Right_triangle_2 perimeter is:" + Right_triangle_2.Perimeter());
        System.out.println("the Right_triangle_3 perimeter is:" + Right_triangle_3.Perimeter());
        System.out.println("the Right_triangle_1 area is:" + Right_triangle_1.area());
        System.out.println("the Right_triangle_2 area is:" + Right_triangle_2.area());
        System.out.println("the Right_triangle_3 area is:" + Right_triangle_3.area());
    }
    
}
