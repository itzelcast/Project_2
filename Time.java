/**
 * The Time class keeps track of how long it takes the for amount of people
 * chosen to be proccessed in the line/s.
 */

public class Time{

    int totalTime; 

    int totalTime(int time){
        return this.totalTime = time;
    }
/**
 * The TimeCounter method creates a counter that will start incrementing by one once 
 * a person is added to a queue and will end once the last person added to the queue has
 * been dequeued 
 */
 //make sure the depart parameter pertains to the LAST CUSTOMER LEAVING
 public static int timeCounter(boolean firstArrival, boolean lastDepart){
    int totalTime = 0;
    firstArrival = false;
    lastDepart = false;
    while(firstArrival == true && lastDepart == true){
        totalTime+=1; 
    }
    return totalTime;
}	
}