package lab3;

public class Basketball {
    private double diameter;
    private boolean isDribbleable;
    public Basketball(double givenDiameter)
    {
        diameter = givenDiameter;
    }

    public boolean isDribbleable()
    {
        return isDribbleable;
    }

    public double getDiameter()
    {
        return diameter;
    }

    public double getCircumference()
    {
        return diameter * Math.PI;
    }

    public void inflate()
    {
        isDribbleable = true;
    }
}
