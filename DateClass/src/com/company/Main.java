package com.company;

 public class Main {
        public static void main(String[] args) {
            //Task 23
		/*DateClass d = new DateClass(1,1,2000);
		for(int i = 0; i<10000;i++) {
			System.out.println(d.toStr());
			d.nextDate();
		}*/
            //Task 24
            DateClass d2 = new DateClass(11,3,2018);
            DateClass birth = new DateClass (1,27,2001);
            int daysapart = d2.daysApart(birth);
            System.out.println(daysapart);
            for(int i = daysapart; i> 0; i--) {
                System.out.println(d2.toStr());
                d2.prevDate();
            }
            //task 25
            d2 =  new DateClass(11,3,2018);
            for(int i = daysapart; i> 0; i--) {
                System.out.println(d2.DayOfTheWeek() + "  " + d2.toStr());
                d2.prevDate();
            }
            //Task 26
            DateClass d3 = new DateClass(1,1,0000);
            DateClass d4 = new DateClass(12,31,9999);
            System.out.println(d3.daysApart(d4));
            //Task 27
            DateClass[] calanderNov = new DateClass[30];
            String[] eventsNov = new String[30];
            for(int i =0;i<30;i++) {
                calanderNov[i] = new DateClass(11,i+1,2018);
                if(calanderNov[i].DayOfTheWeek() == "Sunday" || calanderNov[i].DayOfTheWeek() == "Saturday") {
                    eventsNov[i] = "R&R";
                }
                else {
                    eventsNov[i] = "Study for AP CS";
                }
                eventsNov[i] = "Study for AP CS";
            }



        }

 }