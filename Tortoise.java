public class Tortoise{
     
     public static int[] race(int v1, int v2, int g) {
     	if (v1>=v2) {
        return null;    
            }
      	else{
        	int seconds = (3600*g)/(v2-v1);

 		int timeArray[] = new int[3];
		timeArray[2] = seconds % 60; //seconds 
        	int p2 = seconds / 60;
        	timeArray[1] = p2 % 60; //minutes
        	timeArray[0] = p2 / 60; //hours
        	return timeArray;
        }
    }

}