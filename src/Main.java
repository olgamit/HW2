import java.sql.SQLOutput;

public class Main {

    public static void main (String args[])
    {
        City cityOne  = new City("Königsberg");
        cityOne.printCityData();
        City cityTwo = new City("Tomsk", 500000);
        cityTwo.printCityData();
        City cityThree  = new City("Saint Petersburg", 4991000, false);
        cityThree.printCityData();

        cityOne.renameCity("Kaliningrad");

        System.out.println("--------------------------------------------------");
    }
}
