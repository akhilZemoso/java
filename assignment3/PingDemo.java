/*
Write a java function that will ping any host ( given as input ) and computes the median of the time taken to ping.

Use the system ping utility, do not use any deprecated methods.
 */
package com.basics.java.assignment3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PingDemo {
    public static void runSystemCommand(String command) {
        ArrayList<Float> times = new ArrayList<>();
        try {
            Process p = Runtime.getRuntime().exec(command);
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));

            String s = "";
            // reading output stream of the command
            while ((s = inputStream.readLine()) != null) {
                if(s.indexOf("time=")!=-1) {
                    times.add(Float.parseFloat(s.substring(s.indexOf("time=")+5,s.length()-3)));
                }
                else if(s.indexOf("time<1ms")!=-1){
                    times.add(0f);
                }
            }
            findMedian(times);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void findMedian(ArrayList<Float> times){
        Collections.sort(times);
        if(times.size()%2==0){
            System.out.println("The median of the time taken to ping is: "+(times.get(times.size()/2-1)+times.get(times.size()/2))/2);
        }else {
            System.out.println("The median of the time taken to ping is: "+(times.get(times.size()/2)));
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter url or IP address to Ping : ");
        String ip = in.nextLine();
        runSystemCommand("ping " + ip);
    }
}