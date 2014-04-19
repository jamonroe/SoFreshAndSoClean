public class Process {

    private int id;
    private int timeToRun;
    private int numCollisions; // this is n
    private boolean collisionFound = false;

    public Process(int id) {
        this.id = id;

    }

    public boolean readyToRun() {

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

        timeToRun = (int) (Math.random() * k);

    }

}
