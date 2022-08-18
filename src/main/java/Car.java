public class Car
{
    //declaring the class attributes
    
    private int carID;
    private String carName;
    private String carBrand;
    private String carColor;
    private String carPrice;
    
    //Initializing the constructor for fuel car class and passing the parameters
    public Car(int carID, String carName,String carBrand,String carPrice){
        this.carID = carID;
        this.carName= carName;
        this.carPrice=carPrice;
        this.carBrand= carBrand;
        this.carColor="";
    }   
  
    //setter method for car color
    public void setCarColor(String carColor){
        this.carColor=carColor;
    }
  
    //display methods for the attributes
    public void display(){
        System.out.println("Car ID = "+this.carID);
        System.out.println("Car Name = "+this.carName);
        System.out.println("Car Brand = "+this.carBrand);
        System.out.println("Car Price = "+this.carPrice);
         if (this.carColor != ""){
            System.out.println("Car Color= "+this.carColor);
        }
        else{
            System.out.println("Car Color is empty");
        }
    }
    //display methods for the attributes
  
    //accessor methods
     public int getCarID(){
          return this.carID;
    }
    
    public String getCarName(){
          return this.carName;
    }
  
    public String getCarBrand(){
          return this.carBrand;
    }
  
    public String getCarPrice(){
          return this.carPrice;
    }
  
    public String getCarColor(){
          return this.carColor;
    }
    //accessor methods
}

