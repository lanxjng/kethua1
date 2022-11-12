
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Nguoilaodong {
    private String Hoten;
    private String Namsinh;
    private double LuongCB;

    public Nguoilaodong(String Hoten, String Namsinh, double LuongCB) {
        this.Hoten = Hoten;
        this.Namsinh = Namsinh;
        this.LuongCB = LuongCB;
    }

    public Nguoilaodong() {
    }
    
    
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ho ten:");
        this.Hoten = sc.nextLine();
        System.out.println("Nam sinh: ");
        this.Namsinh = sc.nextLine();
        System.out.println("Luong CB:");
        this.LuongCB = Double.parseDouble(sc.nextLine());
             
    }
    public void getInfor(){
        System.out.println("Ho ten: "+ this.Hoten);
        System.out.println("Nam sinh: "+ this.Namsinh);
        System.out.println("Luong CB: "+ this.LuongCB);
    
    }
    public void Output(){
        System.out.println("Ho ten: "+ this.Hoten);
        System.out.println("Nam sinh: "+ this.Namsinh);
        System.out.printf("Luong CB: %.2f", this.LuongCB);
    }
    
    public double getLuongCB(){
        return this.LuongCB;
    }   
}
