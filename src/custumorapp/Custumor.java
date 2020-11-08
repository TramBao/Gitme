/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package custumorapp;



import java.time.LocalDate;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laptopre.vn
 */
public class Custumor {
    private String CustlID;
    private String CustName;
    private String CustAddress;
    private LocalDate DateofJoin;
    private float Revente;
    private float Tongrevenue;

    public Custumor() {
        Tongrevenue=0;
    }

    public Custumor(String CustlID, String CustName, String CustAddress, LocalDate DateofJoin, float Revente) {
        this.CustlID = CustlID;
        this.CustName = CustName;
        this.CustAddress = CustAddress;
        this.DateofJoin = DateofJoin;
        this.Revente = Revente;
    }

    public String getCustlID() {
        return CustlID;
    }

    public void setCustlID(String CustlID) {
        this.CustlID = CustlID;
    }

    public String getCustName() {
        return CustName;
    }

    public void setCustName(String CustName) {
        this.CustName = CustName;
    }

    public String getCustAddress() {
        return CustAddress;
    }

    public void setCustAddress(String CustAddress) {
        this.CustAddress = CustAddress;
    }

    public LocalDate getDateofJoin() {
        return DateofJoin;
    }

    public void setDateofJoin(LocalDate DateofJoin) {
        this.DateofJoin = DateofJoin;
    }

    public float getRevente() {
        return Revente;
    }

    public void setRevente(float Revente) {
        this.Revente = Revente;
    }

    public float getTongrevenue() {
        return Tongrevenue;
    }

    public void setTongrevenue(float Tongrevenue) {
        this.Tongrevenue = Tongrevenue;
    }
    
       @Override
     public String toString(){
        return "custumorID: " +CustlID + "\n" +
               "custumorName: " + CustName + "\n" +
               "cusAddress: " +  CustAddress+ "\n"+
                "Dateofjoin: "+ DateofJoin+"\n"+
                "reventue: "+Revente;
         
       
               
    }
    public void input() {
        System.out.println("INPUT A CUSTUMOR");
        Scanner sc= new Scanner(System.in);

        System.out.print("enter custID: "); 
        CustlID=sc.nextLine();
        System.out.print("enter custName: ");
        CustName= sc.nextLine();
        System.out.print("enter custAddress: "); 
        CustAddress= sc.nextLine();
         System.out.print("enter Dateofjoin: "); 
         DateofJoin = LocalDate.parse(sc.nextLine());
         System.out.print("enter revenue: "); 
        Revente= Float.parseFloat(sc.nextLine());
    
   }
  
   
    
    
}
