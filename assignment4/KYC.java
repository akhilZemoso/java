/*
Gruber Healthcare has different types of forms for their customer, one of which is a know your customer form ( KYC ) which has to be filled annually. Each form has a date which signifies the date the form was filled called the form date.

Due to government regulations the KYC form can only be filled within + or - 30 days of the signup anniversary of a customer. When filling it up, you have to provide the form date. If you are past the +-30 day anniversary then you can back-date it so that it falls in the +-30-day window. When filling it up you cannot use a future date for the form date.

For Example, assuming today is 4 Apr 2017 and I had signed up on 1st Mar 2014, my window for KYC submission this year would be 30 Jan 2017 to 31 Mar 2017. Since it is already 4th Apr - I would have to back-date the KYC to a date in this range.

Note: The KYC form can be filled only for the closest anniversary in the past or within 30 days range in future.
Anniversary refers to same day and month every year. If your birthday is 01-02-1992 -then your first anniversary will be 01-02-1993, the 2nd will be 01-02-1994 and so on. 01-02-1992 is not an anniversary.

Given the signup date and the current date, provide the allowable date range for the form date.

Input - First line is an integer n as the number of inputs to be passed. Next, n lines are n input for the program in the format dd-mm-yyyy dd-mm-yyyy Each line has two dates separated by space where the first date in signup date and the second date is the current date.

Output - Range of dates for KYC form in format dd-mm-yyyy dd-mm-yyyy

Test Input:
5
16-07-1998 27-06-2017
04-02-2016 04-04-2017
04-05-2017 04-04-2017
04-04-2015 04-04-2016
04-04-2015 15-03-2016

Test output:
16-06-2017 27-06-2017
05-01-2017 06-03-2017
No range
05-03-2016 04-04-2016
05-03-2016 15-03-2016
 */
package com.basics.java.assignment4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class KYC {
    public static int[] getDate(String str)
    {
        String [] s = new String[3];
        s=str.split("-");
        int arr[]=new int[3];
        arr[0]=Integer.parseInt(s[0]);
        arr[1]=Integer.parseInt(s[1]);
        arr[2]=Integer.parseInt(s[2]);

        return arr;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY");
        int t = in.nextInt();
        in.nextLine();
        LocalDate c1;
        LocalDate c2;
        while(t>0)
        {
            t--;
            String input[] = in.nextLine().split(" ");

            int SignupDate[] = getDate(input[0]);
            int CurrentDate[] = getDate(input[1]);
            try {
                c1 = LocalDate.of(SignupDate[2], SignupDate[1], SignupDate[0]);

                c2 = LocalDate.of(CurrentDate[2], CurrentDate[1], CurrentDate[0]);
            }
            catch (Exception e){
                System.out.println("Invalid Input");
                continue;
            }
            if(c1.isAfter(c2))
            {
                System.out.println("No ranges");
                continue;
            }

            c1 = LocalDate.of( CurrentDate[2], SignupDate[1],SignupDate[0]);
            LocalDate currDate = c2;

            c1=c1.minusDays(30);
            System.out.print(formatter.format(c1));

            c1=c1.plusDays(60);
            if(c1.isAfter(currDate))
                System.out.println(" "+formatter.format(currDate));
            else
                System.out.println(" "+formatter.format(c1));
        }
        in.close();
    }
}


