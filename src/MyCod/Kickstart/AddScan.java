package MyCod.Kickstart;

public class AddScan {
    private int forAttempt;
    private int aa;
    private int bb;
    private boolean intervalHit;

    public AddScan(int forAttempt) {
        this.forAttempt = forAttempt;
    }

    public AddScan(int forAttempt, int aa, int bb, boolean intervalHit) {
        this.forAttempt = forAttempt;
        this.aa = aa;
        this.bb = bb;
        this.intervalHit = intervalHit;
    }

    public boolean isIntervalHit() {
        if (forAttempt > bb || forAttempt < aa) {
            intervalHit = true;
            return intervalHit;
        } else {
            intervalHit = false;
            return intervalHit;
        }
    }

    public void setIntervalHit(boolean intervalHit) {
        this.intervalHit = intervalHit;
    }

    public int getForAttempt() {
        return forAttempt;
    }

    public void setForAttempt(int forAttempt) {
        this.forAttempt = forAttempt;
    }
}
