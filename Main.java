public class Main{

     public static void main(String []args){
        int[] array = Tortoise.race(80, 100, 40);
        if (array==null){
          System.out.print("Tortoise A is faster than tortoise B");
        }else{
          System.out.print(array[0] + ":" + array[1] + ":" + array[2] );
        }
        
     }

}
