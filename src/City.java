public class City {

    // ----- fields -------
    private String name;
    private int population;
    private boolean isCapital;


    // ----- getters and setters -------
    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    private void setPopulation(int population) {
        this.population = population;
    }

    public boolean isCapital() {
        return isCapital;
    }

    private void setCapital(boolean capital) {
        isCapital = capital;
    }

    // ------- constructors -------------------

    public City (String name)
    {
        this.name = name;
    }

    public City (String name, int population)
    {
        this.name = name;
        this.population = population;
    }

    public City (String name, int population, boolean isCapital)
    {
        this.name = name;
        this.population = population;
        this.isCapital = isCapital;
    }


    // ----- methods --------
    public void printCityData(){
        System.out.println("=== City data provided below ===");
        System.out.println("Name: " + name + "\nPopulation: " + population + "\nCapitalStatus: " + isCapital );
    }

    public void renameCity(String newName)
    {

        System.out.println("\n ====== The city was renamed ==========");
        System.out.println("\nOld city name is: " + getName());
        setName(newName);
        System.out.println("\nNew city name is: " + name);
    }


}
