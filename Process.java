import java.util.Random;
//stuffsss
public class Process {

    private int id;
    private int timeToRun = 0;
    private int numCollisions; // this is n
    private boolean collisionFound = false;
    private int totalCount = 0;
    private boolean isDone = false;
    private Random r;

    public Process(int id) {
        calculateTimeToRun();
        this.id = id;
        r = new Random();
        numCollisions = 0;
    }

    public boolean canRun() {
        return timeToRun == 0;

    }

    public void runIt() {
        if (collisionFound) {
            numCollisions++;
            calculateTimeToRun();
            collisionFound = false;
        } else {
            decTime();
        }

    }

    public void decTime() {
        if (timeToRun == 0) {
            setDone(true);
        }

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

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }

}
