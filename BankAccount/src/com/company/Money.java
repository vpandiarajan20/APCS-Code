
package com.company;
public class Money {
    //Parts
    int dollars;
    int cents;
    String currency;
    Money(){}
    Money(int d, int c){
        while(c >99){
            d++;
            c = c -100;
        }
        while(c < 0){
            d--;
            c += 100;
        }
        dollars = d;
        cents = c;
    }
    Money(double total){
        cents = (int)total*100%100;
        dollars = (int)total%100;
    }
    public int getDollars() {
        return dollars;
    }

    public void setDollars(int dollars) {
        this.dollars = dollars;
    }

    public int getCents() {
        return cents;
    }

    public void setCents(int x) {
        cents = x;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String x) {
        currency = x;
    }

    public void add(Money m) {
        dollars += m.getDollars();
        cents = cents + m.getCents();
    }
    public void sub(Money m){
        dollars -= m.getDollars();
        cents -= m.getCents();
    } // Subtracts m from total.
    public void mult(int multiplier){
        dollars *= multiplier;
        cents *= multiplier;
    } // Multiplies total by scalar factor multiplier.
    public Boolean isGreaterThan(Money m){
        if(dollars>m.dollars)
            return true;
        if(m.dollars == dollars && cents> m.cents)
            return true;
        return false;
    } // Returns True if this object has a higher value than m. False otherwise.
    public Boolean isLessThan(Money m){
        if(dollars<m.dollars)
            return true;
        if(m.dollars == dollars && cents<m.cents)
            return true;
        return false;
    }
    public Boolean isBigMoney(){
        if(dollars>100)
            return true;
        return false;
    } // Returns true if this money has a value greater than $100. Ex, $100 is small money, $111.11 is big money.

    // Returns True if this object has a lower value than m. False otherwise.
    public Money changeFrom20()
    {
        Money m = new Money();
        m.dollars = 20 - dollars;
        m.cents = 0 - cents;
        if(m.cents < 100) {
            dollars--;
            cents = cents + 100;
        }
        return m;
    }// Returns a Money (YOU ARE NOT CHANGING THIS MONEY) representing the amount of change you would receive if you subtract your Money amount from $20.
    public String toStr(){
        if(cents>10 && cents != 0)
            return "$" + dollars + "." + cents;
        return "$"+ dollars + ".0" + cents;
    } // Returns a nice looking string. Ex, "$6.25", "$0.21", "$4.01", "$2.00". MAKE SURE TO CONSIDER ALL EXAMPLES!
    //2. Create ACCESSOR FUNCTIONS
    //int dollars(int[] money); // Returns the number of dollars in the amount. Ex, dollars($12.34) => 12.
    //int cents(int[] money); // Returns the number of cents in the amount. Ex, cents($12.34) => 34. NOT .34!!!
    //String prettyPrint(int[] money); // Returns a nice looking string. Ex, "$6.25", "$0.21", "$4.01", "$2.00". MAKE SURE TO CONSIDER
    //ALL EXAMPLES!
    //*String moneyToText(int[] money);​ // Returns the Money as words. Ex,{123,51} => "One hundred and twenty three dollars and
    //fifty one cents." YOU MAY ASSUME money <$1000.
    public  String moneyToText() {
        String i = "";
        //100s
        if (dollars >= 900)
            i += "Nine";
        else if (dollars >= 800)
            i += "Eight";
        else if (dollars >= 700)
            i += "Seven";
        else if (dollars >= 600)
            i += "Six";
        else if (dollars >= 500)
            i += "Five";
        else if (dollars >= 400)
            i += "Four";
        else if (dollars >= 300)
            i += "Three";
        else if (dollars >= 200)
            i += "Two";
        else if (dollars >= 100)
            i += "One";
        if(dollars>=100)
            i += "Hundred";
        if ((dollars % 100 ==0) && (cents == 0)) {
            i += " dollars";
            return i;
        }
        if (((dollars % 100 > 0) || (cents > 0)) && (dollars/100 > 0) )
            i += " and ";
        //10s
        int tensOnesPlace = dollars % 100;
        if (tensOnesPlace >= 90)
            i += "Ninety";
        else if (tensOnesPlace >= 80)
            i += "Eighty";
        else if (tensOnesPlace >= 70)
            i += "Seventy";
        else if (tensOnesPlace >= 60)
            i += "Sixty";
        else if (tensOnesPlace >= 50)
            i += "Fifty";
        else if (tensOnesPlace >= 40)
            i += "Forty";
        else if (tensOnesPlace >= 30)
            i += "Thirty";
        else if (tensOnesPlace >= 20)
            i += "Twenty";
        else if (tensOnesPlace == 10)
            i += "Ten";
        if ((dollars % 10 == 0) && (cents == 0)) {
            i += " Dollars";
            return i;
        }
        //Ones
        if ((dollars % 10 == 0) && (cents != 0) )
            i += " Dollars and";
        else {
            int onesPlace = dollars % 10;
            if (onesPlace == 9)
                i += " Nine Dollars";
            else if (tensOnesPlace ==19)
                i += "Nineteen Dollars";
            else if (tensOnesPlace ==18)
                i += "Eighteen Dollars";
            else if (tensOnesPlace ==17)
                i += "Seventeen Dollars";
            else if (tensOnesPlace ==16)
                i += "Sixteen Dollars";
            else if (tensOnesPlace ==15)
                i += "Fifteen Dollars";
            else if (tensOnesPlace ==14)
                i += "Fourteen Dollars";
            else if (tensOnesPlace ==13)
                i += "Thirteen Dollars";
            else if (tensOnesPlace ==12)
                i += "Twelve Dollars";
            else if (tensOnesPlace ==11)
                i += "Eleven Dollars";
            else if (onesPlace == 8 )
                i += " Eight Dollars";
            else if (onesPlace == 7 )
                i += " Seven Dollars";
            else if (onesPlace == 6 )
                i += " Six Dollars";
            else if (onesPlace == 5 )
                i += " Five Dollars";
            else if (onesPlace == 4 )
                i += " Four Dollars";
            else if (onesPlace == 3 )
                i += " Three Dollars";
            else if (onesPlace == 2 )
                i += " Two Dollars";
            else if (onesPlace == 1 )
                i += " One Dollar";
            if (cents != 0)
                i += " and";
        }

        if ((cents != 0)) {
            int centtensPlace = cents /10;
            int centonesPlace = cents % 10;
            if(centtensPlace != 0 )
                if (((cents % 10 ==0)|| (centtensPlace !=0)) && (cents >= 20))
                    i += " ";
            if (cents >= 90)
                i += "Ninety";
            else if (cents >= 80)
                i += "Eighty";
            else if (cents >= 70)
                i += "Seventy";
            else if (cents >= 60)
                i += "Sixty";
            else if (cents >= 50)
                i += "Fifty";
            else if (cents >= 40)
                i += "Forty";
            else if (cents >= 30)
                i += "Thirty";
            else if (cents >= 20)
                i += "Twenty";
            else if (cents == 10)
                i += " Ten Cents";
            if ((cents % 10 == 0)&& (cents != 10)) {
                i += " cents";
                return i;
            }

            if (centonesPlace ==9 )
                i += " Nine Cents";
            else if (cents == 19)
                i += " Nineteen Cents";
            else if (cents == 18)
                i += " Eighteen Cents";
            else if (cents == 17)
                i += " Seventeen Cents";
            else if (cents == 16)
                i += " Sixteen Cents";
            else if (cents == 15)
                i += " Fifteen Cents";
            else if (cents == 14)
                i += " Fourteen Cents";
            else if (cents == 13)
                i += " Thirteen Cents";
            else if (cents == 12)
                i += " Twelve Cents";
            else if (cents == 11)
                i += " Eleven Cents";
            else if (centonesPlace == 8 )
                i += " Eight Cents";
            else if (centonesPlace == 7 )
                i += " Seven Cents";
            else if (centonesPlace == 6 )
                i += " Six Cents";
            else if (centonesPlace == 5 )
                i += " Five Cents";
            else if (centonesPlace == 4 )
                i += " Four Cents";
            else if (centonesPlace == 3 )
                i += " Three Cents";
            else if (centonesPlace == 2 )
                i += " Two Cents";
            else if (centonesPlace == 1 )
                i += " One Cents";
        }

        return i;
    }

}