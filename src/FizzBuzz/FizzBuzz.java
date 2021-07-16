package FizzBuzz;

public class FizzBuzz {

    public static final String BUZZ = "Buzz";
    public static final String FIZZ = "Fizz";

    public String getFizzBuzz(int number) {
        boolean isDivision5 = number % 5 == 0;
        boolean isDivision3 = number % 3 == 0;
        boolean isDivison15 = number % 15 == 0;
        if (isDivison15 || has3(number) && has5(number)) {
            return FIZZ + BUZZ;
        } else if (isDivision3 || has3(number)) {
            return FIZZ;
        } else if (isDivision5 || has5(number)) {
            return BUZZ;
        } else
            return readNumbers(number);
    }

    public boolean has3(int number) {
        String tostring = number + "";
        boolean result = false;
        for (int i = 0; i < tostring.length(); i++) {
            if (tostring.charAt(i) == '3')
                result = true;
        }
        return result;
    }

    public boolean has5(int number) {
        String tostring = number + "";
        boolean result = false;
        for (int i = 0; i < tostring.length(); i++) {
            if (tostring.charAt(i) == '5')
                result = true;
        }
        return result;
    }
    public String readNumbers(int number){
        String tostring = number + "";
        String result = "";
        for (int i = 0; i < tostring.length(); i++) {
            result+=" "+readNumber(tostring.charAt(i));
        }
        return result;
    }

    public String readNumber(char number) {
        switch (number) {
            case '1':
                return "One";
            case '2':
                return "Tow";
            case '3':
                return "Three";
            case '4':
                return "Four";
            case '5':
                return "Five";
            case '6':
                return "Six";
            case '7':
                return "Seven";
            case '8':
                return "Eight";
            case '9':
                return "Nine";
            default:
                return "";
        }
    }
}
