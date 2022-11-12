
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Giaovien extends Nguoilaodong implements Comparable<Giaovien >{
    private double Heso;
    public Giaovien(){}
public void Input(){
    Scanner sc = new Scanner(System.in);
    super.Input();
    System.out.println("He so luong: ");
    this.Heso = Double.parseDouble(sc.nextLine());
}
public double Tinhluong(){
    return this.Heso*super.getLuongCB();  
}
public void getInfo(){
    super.getInfor();
    System.out.println("Tong luong: "+Tinhluong());
 
}
public void Output(){
    super.Output();
    System.out.printf("\n Tong luong: %.2f",Tinhluong());   

}

    @Override
    public int compareTo(Giaovien gv) {
        if(Tinhluong()== gv.Tinhluong())
            return 0;
        else if(Tinhluong()>gv.Tinhluong())
            return 1;
        else 
            return -1;
    } 
}
