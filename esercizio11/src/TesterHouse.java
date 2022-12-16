import java.util.Arrays;

public class TesterHouse {


    public static void main(String args[]){

        String [] residents = new String[]{"vittorio" + ", Luca"+ ", Giulio"+ ", Maria"};
        House house = new House(4,"via Gramsci 2", residents);


String output= String.format("The house is in  "+ house.getAddress()+ " and has " + house.getFloorNumbers()+ " floors. Here live: " + Arrays.toString(house.getResidentsNames()));
System.out.println(output);


    }
}
