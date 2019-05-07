/**
 * The Person class represents a customer in the store in a checkout line.
 * The attributes to represent a customer are:
 * @param arrivalTime the time they arrive to a line.
 * @param departureTime the time they leave a line.
 * @param processingTime how long they took to be processed in a line.
 */
public class Person{ 
	int arrivalTime;
	int departureTime;
    int processingTime;
    //might need to move this to a different class
    int totalDelay;
/**
*The proccessTime method calculates what that actual processing time is
*to process a customer in a line. 
*/
        public int processTime(int arrival, int departure){
                processingTime = departure - arrival;
                return processingTime;
        }
        public int totalDelay(int arrival, int departure, int processing){
            return this.totalDelay = (departure - arrival)-processingTime;
        }
/** 
 * The processingTimeRange method takes two integers as inputs
 * @param minTime being the minimum time a job can last 
 * @param maxTime  being the maximum time a job can last
 * @return time 
 * then generates a random number.
*/
        public static int timeRange(int minTime, int maxTime){
            int time = (int)(Math.random() * ((maxTime - minTime) + 1) + minTime);	
            return time;
        }
            
        
}