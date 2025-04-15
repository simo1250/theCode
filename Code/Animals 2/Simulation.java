public class Simulation {
    public static void main(String[] args) {
        Chicken chickens = new Chicken(6);
        Duck ducks = new Duck(4);
        Pig pigs = new Pig(2);
        Cow cows = new Cow(1);
        int foodSupply = 2000, foodReplenishment = 5000, hour = 0;

        while (foodSupply > 0) {
            hour++;
            System.out.println("Hour " + hour);
            System.out.println("Start - Chickens: " + chickens.getCount() + ", Ducks: " + ducks.getCount() + ", Pigs: " + pigs.getCount() + ", Cows: " + cows.getCount() + ", Food: " + foodSupply);

            chickens.reproduce();
            ducks.reproduce();

            foodSupply -= chickens.eat(foodSupply);
            foodSupply -= ducks.eat(foodSupply);
            foodSupply -= pigs.eat(foodSupply);
            foodSupply -= cows.eat(foodSupply);

            pigs.reproduce();
            cows.reproduce();

            System.out.println("End - Chickens: " + chickens.getCount() + ", Ducks: " + ducks.getCount() + ", Pigs: " + pigs.getCount() + ", Cows: " + cows.getCount() + ", Food: " + foodSupply);
            
            foodSupply += foodReplenishment;
            System.out.println("--------------------------------");
        }
    }
}
