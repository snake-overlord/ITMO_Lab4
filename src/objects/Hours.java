package objects;

import exceptions.NegativeTimeException;

public class Hours {
    public static void setTime(int hours) throws NegativeTimeException {
        if(hours<0)
            throw new NegativeTimeException();
        else if(hours%10==1)
            System.out.print("Прошёл " + hours + " час. ");
        else if(hours%10<=4 && hours%10>=2)
            System.out.print("Прошло " + hours + " часа. ");
        else
            System.out.print("Прошло " + hours + " часов. ");
    }
}
