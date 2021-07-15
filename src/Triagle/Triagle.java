package Triagle;

public class Triagle {
    private int fistEdge, secondEdge, thirdEdge;
    public static final int EQUILATERALTRIANGLE = 1;
    public static final int ISOSCELESTRIANGLE = 2;
    public static final int NORMALTRIAGLE = 3;
    public static final int NOTTRIAGLE = 0;

    public int classifyTriagle() {
        if (isTriagle()) {
            if (fistEdge == secondEdge && thirdEdge == secondEdge)
                return EQUILATERALTRIANGLE;
            else if (fistEdge == secondEdge && fistEdge != thirdEdge
                    || fistEdge == thirdEdge && fistEdge != secondEdge
                    || secondEdge == thirdEdge && secondEdge != fistEdge)
                return ISOSCELESTRIANGLE;
            else
                return NORMALTRIAGLE;
        } else
            return NOTTRIAGLE;
    }

    public boolean isTriagle() {
        return fistEdge > 0 &&
                secondEdge > 0 &&
                thirdEdge > 0 &&
                fistEdge + secondEdge > thirdEdge &&
                thirdEdge + secondEdge > fistEdge &&
                thirdEdge + fistEdge > secondEdge;
    }

    public Triagle() {
    }

    public Triagle(int fistEdge, int secondEdge, int thirdEdge) {
        this.fistEdge = fistEdge;
        this.secondEdge = secondEdge;
        this.thirdEdge = thirdEdge;
    }

    public int getFistEdge() {
        return fistEdge;
    }

    public void setFistEdge(int fistEdge) {
        this.fistEdge = fistEdge;
    }

    public int getSecondEdge() {
        return secondEdge;
    }

    public void setSecondEdge(int secondEdge) {
        this.secondEdge = secondEdge;
    }

    public int getThirdEdge() {
        return thirdEdge;
    }

    public void setThirdEdge(int thirdEdge) {
        this.thirdEdge = thirdEdge;
    }
}
