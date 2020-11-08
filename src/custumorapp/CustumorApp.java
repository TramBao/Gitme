/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package custumorapp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author laptopre.vn
 */
public class CustumorApp {

       private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Custumor> custmorList;
    public static void main(String[] args) {
     custmorList=  new ArrayList<>();
     
        int c;
        String choice="Y";
        while(choice.equalsIgnoreCase("y")){
            do{
            //print menu
            menu();
            System.out.println("chọn từ 1-4:");
             c= Integer.parseInt(sc.nextLine());
            switch(c){
                
                case 1:
                    input();
        
                    break;
                case 2:
                    
                  
                   display();
                 
       
                    break;
                case 3:
               
                   findCustmor();
                   
       
                    break;
                case 4:
                    Tongdoanhthu();
                    break;
               
               
            default: System.out.println("bạn phải hập từ 1-4"); 
            }
            System.out.println("contiune Y/N?");
            choice=sc.nextLine();
            }while(c!=5);
        
            }
        
    }
    public static void findCustmor(){
          System.out.println("nhập ten Khach hang:");
                    String nameSearch= sc.nextLine();
                    int count=0;
                    for (Custumor seri: custmorList) {
                        if(seri.getCustName().equalsIgnoreCase(nameSearch)){
                            System.out.println(seri.toString());
                            count++;
                        }
                    }
                    if(count==0){
                        System.out.println("không có Khach hang nay!"+ nameSearch);
                    }
                    
    }
    public static void Tongdoanhthu(){
        System.out.print("tong doanh thu khach hang la: ");
        double total=0;
        for(Custumor nn: custmorList){
          total+=nn.getRevente();
        }
        System.out.println(total);
    }
    public static void display(){
       for(Custumor nn: custmorList){
           System.out.println(nn);
           System.out.println("");
        }
    }
     public static void input(){
                String choice = "y";
        while (choice.equals("y")) {
            Custumor custumors = new Custumor();
            custumors.input();

           custmorList.add(custumors);

            System.out.print("Continue input custumor List? (y/n): ");
            choice = sc.nextLine();
            System.out.println("");
        }
        
    }
      public static void menu(){
               System.out.println("1.nhập danh sách khach hang"+"\n"
                       + "2.in ra danh sách khach hang"+"\n"+
                       "3.tìm khach hang can tim"+"\n"
                       + "4.tong doanh thu");
                       }
    
    
}
