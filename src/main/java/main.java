
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Giaovien> dsgiaovien = new ArrayList<Giaovien>();
        int luachon = 0;
        while(luachon != 6){
            System.out.println("Lua chon cong viec");
            System.out.println("1.Nhap ds giao vien");
            System.out.println("2.Them 1 giao vien moi");
            System.out.println("3.Xoa 1 giao vien");
            System.out.println("4.Sap xep giao vien theo luong");
            System.out.println("5.Nhan vien co luong <9000000");
            System.out.println("6.Thoat");
            luachon = Integer.parseInt(sc.nextLine());
            
            switch(luachon){
                case 1:
                    System.out.println("Nhap vao so luong giao vien");
                    int n = Integer.parseInt(sc.nextLine());
                    for(int i=0; i<n; i++){
                        Giaovien ob = new Giaovien();
                        ob.Input();
                        dsgiaovien.add(ob);
                        System.out.println("Danh sach giao vien la");
                        for(Giaovien gv : dsgiaovien){
                            gv.Output();
                        }
           
                    }
                    break;
                case 2:
                    System.out.println("Nhap thong tin giao vien can them");
                    Giaovien ob = new Giaovien();
                        ob.Input();
                        dsgiaovien.add(ob);
                        System.out.println("Danh sach giao vien sau khi them la");
                        for(Giaovien gv : dsgiaovien){
                            gv.Output();
                        }
                    break;
                case 3:
                    System.out.println("Nhap vi tri can xoa ");
                    int i = Integer.parseInt(sc.nextLine());
                    dsgiaovien.remove(i);
                    System.out.println("Danh sach giao vien sau khi xoa la");
                    for(Giaovien gv : dsgiaovien){
                            gv.Output();
                        }
                    break;
                case 4:
                    Collections.sort(dsgiaovien);
                    System.out.println("Danh sach giao vien sau khi sap xep theo tong luong la");
                    for(Giaovien gv : dsgiaovien){
                            gv.Output();
                        }
                    break;
                case 5:
                    System.out.println("Danh sach giao vien co luong < 9000000 la");
                    for(Giaovien gv: dsgiaovien){
                        if(gv.Tinhluong()< 9000000){
                            gv.Output();
                        }
                    }
                    break;
                case 6:
                    break;
            
            }
            
        }
     
    }
    
}
