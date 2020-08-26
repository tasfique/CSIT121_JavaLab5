//Student's Full Name- Tasfique Enam
//Student's ID- J16020825/5886429
//Modification Date 28/05/2019
package labtask5;

public class House {
    private String houseModel;
    private int noOfBed;
    private int sizeOfGarage;
    private int noOfBath;
    private double totalPrice;
    
    
    public House () {
        houseModel = "";
        noOfBed = 0;
        sizeOfGarage = 0;
        noOfBath = 0;
    }
    
    public House(String houseModel, int noOfBed, int sizeOfGarage, int noOfBath) {
        this.houseModel = houseModel;
        this.noOfBed = noOfBed;
        this.sizeOfGarage = sizeOfGarage;
        this.noOfBath = noOfBath;
    }

    public String getHouseModel() {
        return houseModel;
    }

    public void setHouseModel(String houseModel) {
        this.houseModel = houseModel;
    }

    public int getNoOfBed() {
        return noOfBed;
    }

    public void setNoOfBed(int noOfBed) {
        this.noOfBed = noOfBed;
    }

    public int getSizeOfGarage() {
        return sizeOfGarage;
    }

    public void setSizeOfGarage(int sizeOfGarage) {
        this.sizeOfGarage = sizeOfGarage;
    }


    public int getNoOfBath() {
        return noOfBath;
    }

 
    public void setNoOfBath(int noOfBath) {
        this.noOfBath = noOfBath;
    }
    
    public double totalPrice () {
        if(houseModel.equalsIgnoreCase("The Aspen")) {
            totalPrice = 100000+(noOfBed*10500)+(sizeOfGarage*5000)+(noOfBath*3500);
        }
        else if(houseModel.equalsIgnoreCase("The Brittany")) {
            totalPrice = 120000+(noOfBed*10500)+(sizeOfGarage*5000)+(noOfBath*3500);
        }
        else if(houseModel.equalsIgnoreCase("The Colonial")) {
            totalPrice = 180000+(noOfBed*10500)+(sizeOfGarage*5000)+(noOfBath*3500);
        }
        else if(houseModel.equalsIgnoreCase("The Dartmoor")) {
            totalPrice = 250000+(noOfBed*10500)+(sizeOfGarage*5000)+(noOfBath*3500);
        }
        
        return totalPrice;
    
    }
    
    public String toString() {
        String str;
        str = "Model of the House "+ getHouseModel()+"\n" +
                "No of Beds "+ getNoOfBed() + "\n" +
                "Size of Garage "+ getSizeOfGarage() + "\n" +
                "No of Bath "+ getNoOfBath() + "\n";
        return str;
                
    }
    
}
