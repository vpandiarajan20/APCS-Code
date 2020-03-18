package com.company;

public class DateClass {
    public int month;
    public int day;
    public int year;
    public DateClass(){
        month = 1;
        day = 1;
        year = 0;
    }

    public DateClass(int m, int d, int y){
        boolean check;
        if((d>=1 && d<=31) && (m==1 || m==3 || m ==5 || m==7 || m==8 || m==10 || m==12))
            check = true;
        else if((d>=1 && d<=30) && (m==4 || m==6 || m==9 || m==11))
            check = true;
        else if((d>=1 && d<=28) && (m==2))
            check = true;
        else if(d==29 && m==2 && (y%400==0 ||(y%4==0 && y%100!=0)))
            check = true;
        else
            check = false;


        if (check  = false) {
            System.out.println("Error: Invalid DateClass" + m + "/" + d + "/" + y);
            month = 0;
            day = 0;
            year = 0;
        }
        if (check = true) {
            month = m;
            day = d;
            year = y;
        }
    }

    public DateClass(int mmddyyyy) {

        int m =  mmddyyyy / 1000000;
        int d = (mmddyyyy / 10000) % 100;
        int y = mmddyyyy % 10000;

        boolean check;
        if((d>=1 && d<=31) && (m==1 || m==3 || m ==5 || m==7 || m==8 || m==10 || m==12))
            check = true;
        else if((d>=1 && d<=30) && (m==4 || m==6 || m==9 || m==11))
            check = true;
        else if((d>=1 && d<=28) && (m==2))
            check = true;
        else if(d==29 && m==2 && (y%400==0 ||(y%4==0 && y%100!=0)))
            check = true;
        else
            check = false;

        if (check  = false) {
            System.out.println("Error: Invalid DateClass" + m + "/" + d + "/" + y);
            month = 0;
            day = 0;
            year = 0;
        }
        if (check = true) {
            month = mmddyyyy / 1000000;
            day = (mmddyyyy / 10000) % 100;
            year = mmddyyyy % 10000;}

    }

    //Getters & Setters

    public int getMonth() {
        return month;

    }

    public void setMonth(int newMonth) {

        boolean check;
        if((day>=1 && day<=31) && (month==1 || month==3 || month ==5 || month==7 || month==8 || month==10 || month==12))
            check = true;
        else if((day>=1 && day<=30) && (month==4 || month==6 || month==9 || month==11))
            check = true;
        else if((day>=1 && day<=28) && (month==2))
            check = true;
        else if(day==29 && month==2 && (year%400==0 ||(year%4==0 && year%100!=0)))
            check = true;
        else
            check = false;

        if (check  = false) {
            System.out.println("Error: Invalid DateClass" + month + "/" + day+ "/" + year);
            month = 0;
            day = 0;
            year = 0;
        }
        if (check = true)
            month = newMonth;


    }

    public int getDay() {
        return day;
    }

    public void setDay(int newDay) {

        boolean check;
        if((day>=1 && day<=31) && (month==1 || month==3 || month ==5 || month==7 || month==8 || month==10 || month==12))
            check = true;
        else if((day>=1 && day<=30) && (month==4 || month==6 || month==9 || month==11))
            check = true;
        else if((day>=1 && day<=28) && (month==2))
            check = true;
        else if(day==29 && month==2 && (year%400==0 ||(year%4==0 && year%100!=0)))
            check = true;
        else
            check = false;

        if (check  = false) {
            System.out.println("Error: Invalid DateClass" + month + "/" + day+ "/" + year);
            month = 0;
            day = 0;
            year = 0;
        }
        if (check = true)
            day = newDay;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int newYear) {
        boolean check;
        if((day>=1 && day<=31) && (month==1 || month==3 || month ==5 || month==7 || month==8 || month==10 || month==12))
            check = true;
        else if((day>=1 && day<=30) && (month==4 || month==6 || month==9 || month==11))
            check = true;
        else if((day>=1 && day<=28) && (month==2))
            check = true;
        else if(day==29 && month==2 && (year%400==0 ||(year%4==0 && year%100!=0)))
            check = true;
        else
            check = false;

        if (check  = false) {
            System.out.println("Error: Invalid DateClass" + month + "/" + day+ "/" + year);
            month = 0;
            day = 0;
            year = 0;
        }
        if (check = true)
            year = newYear;
    }


    public String MonthName() {
        String [] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return months[month-1];
    }


    //Other Methods


    public String toStr() {
        return this.MonthName() + getDay() + "," + getYear();
    }

    public boolean isLastDayOfMonth() {
        if(getDay() == 31 && getMonth() == 1 || getMonth() == 3 || getMonth() == 5 || getMonth() == 7 || getMonth() == 8 || getMonth() == 10 || getMonth() == 12)
            return true;
        else if(getDay() == 30 && getMonth() == 4 || getMonth() == 6 || getMonth() == 9 || getMonth() == 11)
            return true;
        else if(getDay() == 29 && getMonth() == 2)
            return true;
        else return false;
    }

    public boolean isBefore(DateClass d) {
        if(d.year > year)
            return true;
        else if(d.year < year)
            return false;
        else if(d.month > month)
            return true;
        else if(d.month < month)
            return false;
        else if(d.day > day)
            return true;
        else if(d.day < day)
            return false;
        else return false;
    }

    public boolean ifAfter(DateClass d) {
        if(d.year > year)
            return false;
        else if(d.year < year)
            return true;
        else if(d.month > month)
            return false;
        else if(d.month < month)
            return true;
        else if(d.day > day)
            return false;
        else if(d.day < day)
            return true;
        else return false;
    }

    public boolean isSameDay(DateClass d) {
        if(d.year == year && d.month == month && d.day == day)
            return true;
        else return false;
    }

    public boolean isLeapYear() {
        if(year % 4 == 0) {
            return true;
        }
        else if(year % 400 == 0 && year % 100 == 0) {
            return true;
        }
        else return false;
    }

    public void nextDate(DateClass d) {
        day += 1;
        if(getDay() > 29 && getMonth() == 2) {
            setDay(1);
            setMonth(getMonth() + 1);
        }

        if(getDay() > 30 && getMonth() == 4 || getMonth() == 6 || getMonth() == 9 || getMonth() == 11) {
            setDay(1);
            setMonth(getMonth() + 1);
        }

        if(getDay() > 31 && getMonth() == 1 || getMonth() == 3 || getMonth() == 5 || getMonth() == 7 || getMonth() == 8 || getMonth() == 10 || getMonth() == 12) {
            setDay(1);
            setMonth(getMonth() + 1);
        }
        if(getMonth() > 12) {
            setYear(getYear() + 1);
            setMonth(0);
            setDay(0);
        }
    }


    public void prevDate() {
        day -= 1;
        if(getDay() < 1 && (getMonth()-1) == 2) {
            setDay(29);
            setMonth(getMonth() - 1);
        }

        if(getDay() < 1 && (getMonth()-1) == 4 || (getMonth()-1) == 6 || (getMonth()-1) == 9 || (getMonth()-1) == 11) {
            setDay(30);
            setMonth(getMonth() - 1);
        }

        if(getDay() < 1 && (getMonth()-1) == 1 || (getMonth()-1) == 3 || (getMonth()-1) == 5 || (getMonth()-1) == 7 || (getMonth()-1) == 8 || (getMonth()-1) == 10 || (getMonth()-1) == 12) {
            setDay(31);
            setMonth(getMonth() - 1);
        }
        if(getMonth() < 1) {
            setYear(getYear() - 1);
            setMonth(12);
            setDay(31);
        }


    }

    public int daysApart(DateClass d){
        DateClass bd, temp;
        int total = 0;
        if(isBefore(d)){
            temp = this;
            bd =  d;
        }
        else{
            temp = d;
            bd = this;
        }
        while(!isSameDay(d)){
            nextDate(d);
            total++;
        }
        return total;
    }

    public int dayOfYear(DateClass d) {
        day = 1;
        month = 1;
        year = d.getYear();
        int total = 0;
        while (!isSameDay(d)) {
            d.prevDate();
            total ++;
        }
        return total;
    }

    public int daysLeftInMonth(DateClass d) {
        day = 1;
        month = d.getMonth();
        year = d.getYear();
        int total = 0;

        while (!isSameDay(d)) {
            d.prevDate();
            total ++;
        }
        return total;

    }

    public int daysLeftInYear(DateClass d) {

        return Math.abs(dayOfYear(d) - 365);


    }

    public int daysLeftInDecade(DateClass d) {
        int total = 0;
        int dif = 0;

        while (d.getYear() % 100 != 00)
            year += 1;
        dif++;
        total = 365 * (dif - 1);
        return daysLeftInYear(d) + total;


    }

    public int daysLeftInCentury(DateClass d) {
        int total = 0;
        int dif = 0;

        while (d.getYear() % 1000 != 00)
            year += 1;
        dif++;
        total = 365 * (dif - 1);
        return daysLeftInYear(d) + total;
    }

    public DateClass earlierDate (DateClass d) {
        if (d.getYear() > year)
            return d;
        else if (d.getMonth() > month)
            return d;
        else if (d.getDay() > day)
            return d;

        if (d.getYear() < year)
            return this;
        else if (d.getMonth() < month)
            return this;
        else if (d.getDay() < day)
            return this;

        else
            return d;

    }

    public DateClass laterDate(DateClass d) {
        if (earlierDate(d) == d)
            return this;
        if (earlierDate(d) == d)
            return d;
        else return d;




    }

    //Assume Jan 1 is always Sunday
    public String DayOfTheWeek() {
        int dayWeek = 1;
        DateClass d = new DateClass(1,1,year);
        int daysApart = daysApart(d);
        String[] names = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        return names[daysApart%7];
    }


}

