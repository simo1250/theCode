// Class to manage food supply for the animals
class FoodSupply {
    private int food; // Holds the amount of food available

    // Constructor to initialize the food supply
    public FoodSupply(int initialFood) {
        this.food = initialFood;
    }

    // Method to feed the animals and return whether there is enough food
    public boolean feedAnimals(int population) {
        int foodNeeded = population; // Each animal eats 1 unit of food
        if (this.food >= foodNeeded) {
            this.food -= foodNeeded; // Subtract the food required for the animals
            return true;  // Successfully fed animals
        } else {
            return false; // Not enough food
        }
    }

    // Method to add more food to the supply
    public void addFood(int additionalFood) {
        this.food += additionalFood;
    }

    // Getter for the amount of food available
    public int getFood() {
        return this.food;
    }
}

// Class to manage the population of animals
class AnimalPopulation {
    private int population; // Holds the number of animals

    // Constructor to initialize the population of animals
    public AnimalPopulation(int initialPopulation) {
        this.population = initialPopulation;
    }

    // Method to double the animal population
    public void doublePopulation() {
        this.population *= 2;
    }

    // Getter for the current population
    public int getPopulation() {
        return this.population;
    }
}

// Main class to simulate the animal population and food supply
public class AnimalSimulation {
    public static void main(String[] args) {
        // Initial states: 10 animals and 1000 units of food
        AnimalPopulation animals = new AnimalPopulation(10);
        FoodSupply food = new FoodSupply(1000);
        
        int hour = 0;  // Track the number of hours

        // Loop that runs until there isn't enough food for the animals
        while (true) {
            // Output the population and food at the beginning of the hour
            System.out.println("Hour " + hour + ":");
            System.out.println("  - Population at start: " + animals.getPopulation());
            System.out.println("  - Food at start: " + food.getFood());
            
            // Feed the animals, if not enough food is available, end the simulation
            if (!food.feedAnimals(animals.getPopulation())) {
                System.out.println("  - Not enough food to feed the animals! Simulation ends.");
                break;
            }
            
            // Double the population of animals
            animals.doublePopulation();
            
            // Add food for 4000 more animals
            food.addFood(4000);
            
            // Output the population and food at the end of the hour
            System.out.println("  - Population at end: " + animals.getPopulation());
            System.out.println("  - Food at end: " + food.getFood());
            
            // Move to the next hour
            hour++;
        }
    }
}