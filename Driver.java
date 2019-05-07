/**
 * <h1>Program: Line Simulation</h1>
 * <p>The program calculates the number of delays in time inside a store when
 * there is a specific number of checkout lines.</p>
 * <b>Note:</b> The name of the store is Quickie Mart
 * 
 * @author Jose Martinez, Itzel Castaneda Hernandez
 * @version 1.0
 * @since 2019-04-20  
*/


/** 
 * This method is the main method/driver of the program.
 * @param nQueue is the parameter the user will input to 
 * tell the program how many lines to simulate.
 * 
 * @param nCustomers is the parameter the user will input to 
 * tell the program how many customers there are.
 * 
 * @param minJTime is the parameter the user will input to 
 * tell the program the minimum time allowed before a new person can
 * be added to the checkout line.
 * 
 *  @param maxJTime is the parameter the user will input to 
 * tell the program the maximum time allowed before a new person can
 * be added to the checkout line.
 * 
 * maxJTime and minJTime will give the program a range of time that will need
 * to pass before a customer is allowed to be added to a checkout line.
 * 
 * @param minPTime is the parameter the user will input to 
 * tell the program what the minimum time a customer can take 
 * be processed.
 * 
 * @param maxPTime is the parameter the user will input to 
 * tell the program what the maximum time a customer can take 
 * be processed.
 * 
 * maxPTime and minPTime will give the program a range of time it can 
 * take to process a customer in a checkout line. 
*/

import java.util.*;

public class Driver{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
            System.out.println("Welcome to Job Simulator");
            
            System.out.println("How many lines do you wish to simulate?");
            final int nQueues = input.nextInt();
            System.out.println(nQueues);

            System.out.println("How many customers do you want to simulate?");
            final int nCustomers = input.nextInt();
            System.out.println(nCustomers);

            System.out.println("What is the maximum time between job arrivals?");
            final int maxTime = input.nextInt();
            System.out.println(maxTime);

            System.out.println("What is the minimun time between job arrivals");
            final int minTime = input.nextInt();
            System.out.println(minTime);

            System.out.println("What is the maximum processing time for a job?");
            final int maxPTime = input.nextInt();
            System.out.println(maxPTime);

            System.out.println("What is the minimum processing time for a job?");
            final int minPTime = input.nextInt();
            System.out.println(minPTime);

            //Person testing = new Person();
            //System.out.println("the job arrival time is " + testing.jobArrival(minJTime, maxJTime));
            //System.out.println("the intial procesing time is " + testing.intialProcess(minPTime, maxPTime));


        
	}
}