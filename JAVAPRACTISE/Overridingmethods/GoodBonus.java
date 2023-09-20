package Overridingmethods;

public class GoodBonus {
    public static double getBonusPercent(Employee e)
    {
        if(e instanceof Manager)
        {return 0.03;}
        else
        {
            if(e instanceof Director)
            {return 0.05;}
            else
            {return 0.01;}
        }
    }
}
