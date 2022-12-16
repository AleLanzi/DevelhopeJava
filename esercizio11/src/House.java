public class House {

private int floorNumbers;
private String address;
private String[] residentsNames;


House(int floorNumbers, String address, String[] residentsNames){
    this.floorNumbers = floorNumbers;
    this.address = address;
    this.residentsNames = residentsNames;
}

    public int getFloorNumbers() {
        return floorNumbers;
    }

    public void setFloorNumbers(int floorNumbers) {
        this.floorNumbers = floorNumbers;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String[] getResidentsNames() {
        return residentsNames;
    }

    public void setResidentsNames(String[] residentsNames) {
        this.residentsNames = residentsNames;
    }
}
