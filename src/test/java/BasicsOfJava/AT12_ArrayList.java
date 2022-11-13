package BasicsOfJava;

import org.junit.Test;

import java.util.ArrayList;

public class AT12_ArrayList {

    @Test
    public void ArrayList(){
        ArrayList<String> ListOfCars = new ArrayList<String>();
        ListOfCars.add("BMW");
        ListOfCars.add("Toyota");
        ListOfCars.add("Benz");
        ListOfCars.add("RangeRover");
        System.out.println("Totall cars in the list are : "+ ListOfCars);
        int CarsCount = ListOfCars.size();
        System.out.println("CarsCount : "+CarsCount);

        //for loop
        for(int i=0;i<CarsCount;i++){
            System.out.println("Array index : "+i+" and its value is : "+ ListOfCars.get(i));

        }
    }
}
