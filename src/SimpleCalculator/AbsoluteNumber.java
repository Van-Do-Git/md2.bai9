package SimpleCalculator;

public class AbsoluteNumber {
    public int abs(int number){
        if (number<0){
            return -number;
        }
        if(number>0){
            return number;
        }
        return 0;
    }
}
