public class MultiplyAfter extends Animal {
    public MultiplyAfter(int count, int foodRequired, int offspring) {
        super(count, foodRequired, offspring);
    }
    
    @Override
    public void reproduce() {
        count += count * offspring;
    }
}
