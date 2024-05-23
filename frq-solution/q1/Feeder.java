public class Feeder {

    private int currentFood;

    public Feeder(int f) {
        currentFood = f;
    }
  
    public void simulateOneDay(int numBirds) {
        int rand = (int)(Math.random()*100);
        if(rand<95) {
            int eat = (int)(Math.random()*41)+10;
            currentFood-=eat*numBirds;
            if(currentFood<0) {
                currentFood = 0;
            }
        } else {
            currentFood = 0;
        }
    }

    public int simulateManyDays(int numBirds, int numDays) {
        int count = 0;
        for(int i = 0; i<numDays; i++) {
            if(currentFood==0) {
                return count;
            }
            simulateOneDay(numBirds);
            count++;
        }
        return count;
    }

    public int getCurrentFood() {
        return currentFood;
    }

}
