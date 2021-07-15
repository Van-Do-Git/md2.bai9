package NextDay;


public class NextDay {
    public String getNextDay(int thisDay, int thisMonth, int thisYear) {
        if(thisDay>getDaysOfMonth(thisMonth,thisYear)){
            throw new RuntimeException("Non is day of this month");
        }else if (thisDay==getDaysOfMonth(thisMonth,thisYear)&&thisMonth==12){
            thisDay =1;
            thisMonth=1;
            thisYear++;
        }else if (thisDay == getDaysOfMonth(thisMonth,thisYear)) {
            thisDay = 1;
            thisMonth++;
        } else thisDay++;
        return thisDay + "/" + thisMonth + "/" + thisYear;
    }

    public boolean isLeapYear(int thisYear) {
        if (thisYear % 400 == 0) {
            return true;
        } else if (thisYear % 4 == 0 && thisYear % 100 != 0)
            return true;
        else
            return false;
    }

    public int getDaysOfMonth(int thisMonth, int thisYear) {
        int getDay = 30;
        switch (thisMonth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                getDay = 31;
                break;
            case 2:
                if (isLeapYear(thisYear))
                    getDay = 29;
                else
                    getDay = 28;
                break;
        }
        return getDay;
    }
}
