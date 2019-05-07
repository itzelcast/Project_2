/**
 * This Event class represents the arrival "actions" of a checkout line 
 * when a customer arrives to join a line.
 * The attributes to represent the Event are:
 *  @param type delcares the action of arriving and joining the line
 *  @param time delcares what time the person joined the line.(arrival time)
 *  @param param delcares intial time it will take to process a person in
 *  a line.
 */

import java.util.Scanner;

public class Event{

	static String type;
	static int time; 
    static int param;



//probably won't need this constructor
public Event(){
    this.type = "arrival";
    this.time = 0;
    //this.param = timeRange(); //need method from person class
}





 /**The peopleLeft is a method that keeps track of people left to dequeued
  * from the line 
  */

}
