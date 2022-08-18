import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class CourseWork2 {
    public CourseWork2(){
        createGui();
    }
    
    private ArrayList<Car> cars = new ArrayList();
    
    private JFrame newFrame;JPanel newPanel;JPanel newPanel1; JComboBox PurchaseDateDay;JComboBox PurchaseDateMonth;
    JComboBox PurchaseDateYear;JComboBox BookedDateDay;JComboBox BookedDateMonth;JComboBox BookedDateYear;
    public void createGui(){
                
        newFrame = new JFrame("CourseWork");
        
        newPanel = new JPanel(null);
        newPanel.setSize(500, 1000);
        
        
         newPanel1 = new JPanel(null);
        newPanel1.setBounds(500, 0, 500, 1000);
        
        String[] year = {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011"
        ,"2012","2013","2014","2015","2016","2017","2018","2019","2020"};
        
        String[] months = {"January",
        "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"};
        
        String[] day = {"1", "2", "3", "4",
        "5", "6","7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19",
        "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"};

         PurchaseDateDay = new JComboBox(year);
         PurchaseDateMonth = new JComboBox(months);
         PurchaseDateYear = new JComboBox(day);
        
         BookedDateDay = new JComboBox(year);
         BookedDateMonth = new JComboBox(months);
         BookedDateYear = new JComboBox(day);
        
        //TITLE CARD
        JLabel TitleFuel = new JLabel("Fuel Car");
        TitleFuel.setFont(new Font("Serif", Font.PLAIN, 31));
        
        JLabel TitleElectric= new JLabel("Electric Car");
        TitleElectric.setFont(new Font("Serif", Font.PLAIN, 31));

        
        //FUEL CAR LABELS DECLARIATION
        JLabel carId = new JLabel("Car Id:");
        JLabel carBrand = new JLabel("CarBrand:");
        JLabel carName = new JLabel("CarName:");
        JLabel fuelType = new JLabel("FuelType:");
        JLabel price = new JLabel("Price:");
        JLabel noOfSeats = new JLabel("NoOfSeats:");
        JLabel carId1 = new JLabel("Car Id:");
        JLabel carColor = new JLabel("Car Color:");
        JLabel TransmissionType = new JLabel("Transmission Type:");
        
        JLabel PurchaseDate = new JLabel("Purchase Date:");
        JLabel BookedDate = new JLabel("Booked Date:");
        
        //ELECTRIC CAR LABELS DECLARATION
        JLabel carIdElectric = new JLabel("Car Id:");
        JLabel carBrandElectric = new JLabel("CarBrand:");
        JLabel carNameElectric = new JLabel("CarName:");
        JLabel priceElectric = new JLabel("Price:");
        
        JLabel carId1Electric = new JLabel("Car Id:");
        JLabel customerNameElectric = new JLabel("Customer Name:");
        JLabel carColorElectric = new JLabel("Car Color:");
        JLabel warranty = new JLabel("Warranty:");
        JLabel range = new JLabel("Range:");
        JLabel rechargeTime = new JLabel("Recharge Time:");
        
        //ELECTRIC CAR TEXTFEILD DECLARIATION
        JTextField carIdElectricText = new JTextField();
        JTextField carBrandElectricText = new JTextField();
        JTextField carNameElectricText = new JTextField();
        JTextField carId1ElectricText = new JTextField();
        JTextField priceElectricText = new JTextField();
        JTextField customerNameElectricText = new JTextField();
        JTextField carColorElectricText = new JTextField();
        JTextField warrantyText = new JTextField();
        JTextField rangeText = new JTextField();
        JTextField rechargeTimeText = new JTextField();
        
        
        
        //FUEL CAR TEXTFIELD DECLARATION
        JTextField carIdText = new JTextField();
        JTextField carBrandText = new JTextField();
        JTextField carNameText = new JTextField();
        JTextField fuelTypeText = new JTextField();
        JTextField priceText = new JTextField();
        JTextField noOfSeatsText = new JTextField();
        
        //BOTTOM PORTION
        JTextField carId1Text = new JTextField();
        JTextField carColorText = new JTextField();
        JTextField TransmissionTypeText = new JTextField();
        
        //FUEL CAR BUTTONS
        JButton FuelAddButton = new JButton("ADD");
        FuelAddButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int FuelCarID = Integer.parseInt(carId.getText());
                String FuelCarBrand = carBrand.getText();
                String FuelCarName = carName.getText();
                String FuelType = fuelType.getText();
                int FuelPrice = Integer.parseInt(price.getText());
                int FuelNoOfSeats = Integer.parseInt(noOfSeats.getText());
                
              
                     JOptionPane.showMessageDialog(newFrame, "There's a bug on you!",
                    "Hey!", JOptionPane.ERROR_MESSAGE);

               
            }});
        JButton FuelRegisterButton = new JButton("Register");
        JButton FuelDisplayButton = new JButton("Display");
        
        //ELECTRIC CAR BUTTONS
        JButton ElectricAddButton = new JButton("ADD");
        JButton BuyButton = new JButton("Buy");
        JButton ElectricDisplayButton = new JButton("Display");
        JButton ElectricSellButton = new JButton("Sell");
        ElectricSellButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int eID = 0;
                String customerName = customerNameElectricText.getText();
                try{
                    eID = Integer.parseInt(carId1Electric.getText());
                }
                catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(newFrame,"The texField is blank","Invalid Entry",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        ElectricDisplayButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(Car car:cars){
                    if(car instanceof FuelCar){
                        ((FuelCar)car).display();
                        System.out.println("\n");
                    }
                    if(car instanceof ElectricCar){
                        ((ElectricCar)car).display();
                        System.out.println("\n");
                }
                }
            }
        });
        
        
        
 
        JButton SellButton = new JButton("Sell");
        
        //FUEL CAR LABEL SET BOUNDS
        TitleFuel.setBounds(174, 16, 151, 38);
        carId.setBounds(18, 88, 41, 19);
        carBrand.setBounds(18, 125, 64, 19);
        carName.setBounds(18, 159, 64, 19);
        fuelType.setBounds(18, 199, 62, 19);
        price.setBounds(18, 239, 36, 19);
        noOfSeats.setBounds(18, 279, 73, 19);
        //BOTTOM PART
        carId1.setBounds(20, 384, 41, 19);
        TransmissionType.setBounds(20, 437, 121, 19);
        carColor.setBounds(250, 384, 60, 19);
        
        PurchaseDate.setBounds(20, 490, 97, 19);
        BookedDate.setBounds(20, 539, 85, 19);
        
        //ELECTRIC CAR LABEL SET BOUNDS
        TitleElectric.setBounds(174, 16, 151, 38);
        carIdElectric.setBounds(14, 56, 151, 64);
        carBrandElectric.setBounds(14, 109, 64, 19);
        carNameElectric.setBounds(14, 146, 64, 19);
        priceElectric.setBounds(14, 183, 36, 19);
        carId1Electric.setBounds(14, 290, 41, 19);
        customerNameElectric.setBounds(14, 324, 106, 19);
        carColorElectric.setBounds(14, 358, 60, 19);
        warranty.setBounds(14, 392, 61, 19);
        range.setBounds(14, 465, 45, 19);
        rechargeTime.setBounds(14, 518, 103, 19);

        
        //FUEL CAR TEXTFIELD SET BOUNDS
        carIdText.setBounds(103, 88, 368, 21);
        carBrandText.setBounds(103, 125, 368, 21);
        carNameText.setBounds(103, 163, 368, 21);
        fuelTypeText.setBounds(103, 199, 368, 21);
        priceText.setBounds(103, 236, 368, 21);
        noOfSeatsText.setBounds(103, 274, 368, 21);
        //BOTTOM PART
        carId1Text.setBounds(89, 384, 148, 19);
        TransmissionTypeText.setBounds(156, 437, 218, 19);
        carColorText.setBounds(329, 384, 148, 19);
        
        //ELECTRIC CAR TEXTFIELD SET BOUNDS
        carIdElectricText.setBounds(107, 72, 368, 21);
        carBrandElectricText.setBounds(107, 109, 368, 21);
        carNameElectricText.setBounds(107, 147, 368, 21);
        priceElectricText.setBounds(107, 180, 368, 21);
        
        carId1ElectricText.setBounds(67, 290, 393, 21);
        customerNameElectricText.setBounds(134, 324, 324, 21);
        carColorElectricText.setBounds(87, 358, 373, 21);
        warrantyText.setBounds(87, 394, 373, 21);
        
        rangeText.setBounds(69, 465, 373, 21);
        rechargeTimeText.setBounds(124, 518, 346, 21);
        

        //FuelButton SET BOUNDS
        FuelAddButton.setBounds(348, 325, 123, 32);
        FuelRegisterButton.setBounds(243, 596, 98, 32);
        FuelDisplayButton.setBounds(374, 596, 98, 32);
        
        //ElectricButton SET BOUNDS
        ElectricAddButton.setBounds(337, 225, 123, 33);
        BuyButton.setBounds(116, 580, 98, 32);
        ElectricDisplayButton.setBounds(244, 580, 98, 32);
        SellButton.setBounds(372, 580, 98, 32);
        
        //ADD fuel car Label components
        newPanel.add(TitleFuel);
        newPanel.add(carId);
        newPanel.add(carBrand);
        newPanel.add(carName);
        newPanel.add(fuelType);
        newPanel.add(price);
        newPanel.add(noOfSeats);
        newPanel.add(carId1);
        newPanel.add(carColor);
        newPanel.add(TransmissionType);
        newPanel.add(PurchaseDate);
        newPanel.add(BookedDate);
        
        //ADD ELECTRIC CAR LABEL COMPONENTS
        newPanel1.add(TitleElectric);
        newPanel1.add(carIdElectric);
        newPanel1.add(carBrandElectric);
        newPanel1.add(carNameElectric);
        newPanel1.add(priceElectric);
        newPanel1.add(carId1Electric);
        newPanel1.add(customerNameElectric);
        newPanel1.add(carColorElectric);
        newPanel1.add(warranty);
        newPanel1.add(range);
        newPanel1.add(rechargeTime);
        
        //ADD ELECTRIC CAR TEXT COMPONENTS
        newPanel1.add(carIdElectricText);
        newPanel1.add(carBrandElectricText);
        newPanel1.add(carNameElectricText);
        newPanel1.add(carId1ElectricText);
        newPanel1.add(priceElectricText);
        newPanel1.add(customerNameElectricText);
        newPanel1.add(carColorElectricText);
        newPanel1.add(rangeText);
        newPanel1.add(warrantyText);
        newPanel1.add(rechargeTimeText);
        

        //FUEL DATE BOXES SETBOUND
        PurchaseDateDay.setBounds(123, 490, 83, 24);
        PurchaseDateMonth.setBounds(233, 490, 83, 24);
        PurchaseDateYear.setBounds(343, 490, 83, 24);
        
        BookedDateDay.setBounds(123, 534, 83, 24);
        BookedDateMonth.setBounds(233, 534, 83, 24);
        BookedDateYear.setBounds(343, 534, 83, 24);
       
        
        //ADD fuel car Text components
        newPanel.add(carIdText);
        newPanel.add(carBrandText);
        newPanel.add(carNameText);
        newPanel.add(fuelTypeText);
        newPanel.add(priceText);
        newPanel.add(noOfSeatsText);
        newPanel.add(carId1Text);
        newPanel.add(TransmissionTypeText);
        newPanel.add(carColorText);
        //ADD FUEL BUTTONS
        newPanel.add(FuelAddButton);
        newPanel.add(FuelRegisterButton);
        newPanel.add(FuelDisplayButton);
        
        //ADD ELECTRIC BUTTONS
        newPanel1.add(ElectricAddButton);
        newPanel1.add(BuyButton);
        newPanel1.add(ElectricDisplayButton);
        newPanel1.add(SellButton);

        //ADD FUEL DATES
        newPanel.add(PurchaseDateDay);
        newPanel.add(PurchaseDateMonth);
        newPanel.add(PurchaseDateYear);
        newPanel.add(BookedDateDay);
        newPanel.add(BookedDateMonth);
        newPanel.add(BookedDateYear);
        
        
        newFrame.add(newPanel);newFrame.add(newPanel1);
        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newFrame.setSize(1000, 700);
        newFrame.setLayout(null);
        newFrame.setVisible(true);
    }
    
}


