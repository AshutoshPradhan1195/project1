/**
 * Write a description of class ElectricCar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ElectricCar extends Car
{

    //Declaring Attributes

    private String customerName;
    private int batteryCapacity;
    private int batteryWarranty;
    private String purchaseDate;
    private String range;
    private int rechargeTime;
    private boolean isBought;
    private boolean isSold;
    
   
    //Constructor for objects of class ElectricCar

    public ElectricCar(int carID,String carName,String carBrand,String carPrice,int batteryCapacity){
    
        //Calling the Parent class Car constructor using super keyword
    
        super(carID,carName,carBrand,carPrice);
        

        //Initializing the values
        //this.attribute = parameter of a method
 
        this.batteryCapacity= batteryCapacity;
        this.customerName="";
        this.purchaseDate="";
        this.range="";
        this.rechargeTime=0;
        this.batteryWarranty=0;
        this.isBought=false;
        this.isSold=false;
    }
    
    //method to display car details
    public void display(){
        super.display();
        if(isBought==true){
            System.out.println("Customer Name = "+getCustomerName());
            System.out.println("Battery Capacity = "+getBatteryCapacity());
            System.out.println("Battery Warranty = "+getBatteryWarranty());
            System.out.println("Purchased Date = " +getPurchaseDate());
            System.out.println("Range = " +getRange());
            System.out.println("Recharge Time = "+getRechargeTime());
        }
    }
    
    //to sell an electric car
    public void sellElectricCar(String newCustomerName){
        if(this.isSold==false){
            this.purchaseDate="";
            this.range="";
            this.rechargeTime=0;
            this.batteryWarranty=0;
            this.batteryCapacity=0;
            this.isSold=true;
            this.isBought=false;
            setCustomerName(newCustomerName);
        }
        else{
            System.out.println("The car has already been sold and is no longer available");
        }
    }
    
    //method to buy electric car
    public void buyElectricCar(String customerName,int batteryWarranty,String purchaseDate,String range,int rechargeTime){
        if(this.isBought==false){
            setCustomerName(customerName);
            this.isBought=true;
            this.purchaseDate= purchaseDate;
            this.range= range;
            this.rechargeTime= rechargeTime;
            this.batteryWarranty= batteryWarranty;
        }
        else{
            System.out.println("Electric car has already been bought");
        }
    }
    
    //setter method for customer name
    public void setCustomerName(String customerName){
        if(this.isBought==false){
            this.customerName= customerName;
        }
        else{
            System.out.println("The electric car has already been bought, hence the name cannot be changed.");
        }
    }
    
    //accessor methods for all the attributes 
    public String getCustomerName(){
        return this.customerName;
    }
     public int getBatteryCapacity(){
        return this.batteryCapacity;
    }
    public int getBatteryWarranty(){
        return this.batteryWarranty;
    }
    public String getPurchaseDate(){
        return this.purchaseDate;
    }
    public String getRange(){
        return this.range;
    }
    public int getRechargeTime(){
        return this.rechargeTime;
    }
    public boolean getIsBought(){
        return this.isBought;
    }
     public boolean getIsSold(){
        return this.isSold;
    }
}
