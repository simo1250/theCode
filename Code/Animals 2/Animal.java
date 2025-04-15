public abstract class Animal {
    int count, foodRequired, offspring;
    
    public Animal(int count, int foodRequired, int offspring) {
        this.count = count;
        this.foodRequired = foodRequired;
        this.offspring = offspring;
    }
    
    public abstract void reproduce();
    
    public int eat(int foodSupply) {
        return Math.min(foodSupply, count * foodRequired);
    }
    
    public int getCount() {
        return count;
    }
}
