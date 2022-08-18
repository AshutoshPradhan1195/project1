public class FuelCar extends Car
{
    //declaring class attributes
    
    private String distributerName;
    private String fuelType;
    private String bookedDate;
    private String purchaseDate;
    private String transmissionType;
    private int numberOfSeats;
    private int mileage;
    private boolean isPurchased;

 
    //Constructor for objects of class FuelCar
    public FuelCar(int carID,String carName,String carBrand,String carPrice,String fuelType,int numberOfSeats,int mileage){
        super(carID,carName,carBrand,carPrice);
        this.isPurchased = false;
        this.transmissionType="";
        this.distributerName="";
        this.bookedDate="";
        this.purchaseDate="";
        this.fuelType= fuelType;
        this.numberOfSeats= numberOfSeats;
        this.mileage= mileage;
    }
    
    //METHOD TO SET THE VALUE OF ATTRIBUTE DISTRIBUTER NAME
    public void setDistributerName(String newDistributerName){
        this.distributerName= newDistributerName;
    }
    
    //METHOD TO SET THE VALUE OF ATTRIBUTE TRANSMISSION TYPE
    public void setTransmissionType(String newTransmissionType){
        this.transmissionType= newTransmissionType;
    }
    
    //method to display all details of car
    public void display(){
        
        //calling super class method
        super.display();
        
        if(this.isPurchased==true){
            System.out.println("Distributer Name = "+ getDistributerName());
            System.out.println("Fuel Type = "+ getFuelType());
            System.out.println("Purchase Date = "+ getPurchaseDate());
            System.out.println("Booked Date = "+ getBookedDate());
            System.out.println("Mileage = "+ getMileage());
            System.out.println("Number Of Seats = "+ getNumberOfSeats());
            System.out.println("Transmission Type = "+ getTransmissionType());
        }
    }
    
    //method to purchase a fuel car
    public void purchaseFuelCar(String purchaseDate, String bookingDate){
        if (this.isPurchased==true){
       
           //setting car color
        super.setCarColor(getCarColor());
           
           //calling parent class display method
           super.display();
           System.out.println("Distributer Name = "+getDistributerName());
        }
        else{
            setDistributerName(distributerName);
            setTransmissionType(transmissionType);
            this.purchaseDate= purchaseDate;
            this.bookedDate= bookingDate;
            this.isPurchased= true;
        }
    }
     
    //accessor methods for all the attributes
    public String getFuelType(){
        return this.fuelType;
    }
    public String getDistributerName(){
        return this.distributerName;
    }
    public String getBookedDate(){
        return this.bookedDate;
    }
    public String getTransmissionType(){
        return this.transmissionType;
    }
    public String getPurchaseDate(){
        return this.purchaseDate;
    }
    public int getMileage(){
        return this.mileage;
    }
    public boolean getIsPurchased(){
        return this.isPurchased;
    }
    public int getNumberOfSeats(){
        return this.numberOfSeats;
    }
}

