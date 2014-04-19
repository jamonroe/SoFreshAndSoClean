import java.util.Random;

public class Process {



    private int id;
    private int timeToRun = 0;
    private int numCollisions; // this is n
    private boolean collisionFound = false;
    private int totalCount = 0;
    private Random r; 

    public Process(int id) {
        calculateTimeToRun();
        this.id = id;
        r = new Random();
    }

    
    
    public boolean isComplete() {

        if (collisionFound) {
            numCollisions++;
            calculateTimeToRun();
            return false;
        }
        return timeToRun == 0;

    }

    public void decTime() {

        if (timeToRun > 0) {
            timeToRun--;
        }
    }

    public void setCollision(boolean col) {
        collisionFound = col;
    }

    public void calculateTimeToRun() {
        int k = (int) (Math.pow(2, numCollisions));

        timeToRun = r.nextInt(k);

    }

    
    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



    public int getTimeToRun() {
        return timeToRun;
    }



    public void setTimeToRun(int timeToRun) {
        this.timeToRun = timeToRun;
    }



    public int getNumCollisions() {
        return numCollisions;
    }



    public void setNumCollisions(int numCollisions) {
        this.numCollisions = numCollisions;
    }



    public boolean isCollisionFound() {
        return collisionFound;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
    
}
