package lorenzo;
import java.io.*;

public class Lorenzo {
    private int num; //
    
    public Lorenzo(int numm){
        this.num=numm;
    }
   
    public void toBinary(int num){
        int[] resulty = new int[10];
        if(num == 1){
            resulty[0] = 1;
        }else if(num == 0){
            resulty[0] = 0;
        }else if(num>1){
               for(int i = 0; i<resulty.length;i++){
                   resulty[i] = num%2;
                   num = num/2;
               }
        }
        
        for (int j = resulty.length-1; j >= 0; j--){
            System.out.print(resulty[j]);
        }
    }
    
    
    public void toHex(int num){
        char[] result = new char[100];
        int rem;
        rem = 0;
        int i = 0;
         if(num == 1){
            result[0] = 1;
        }else if(num == 0){
            result[0] = 0;
        }else if(num>1){
            
             rem = num % 16;
            
             if(rem<10){
                 result[i] = (char) rem;
                 i++;
             }
             else{
                 result[i]= (char) rem;
                 i++;
             }
        }
         
          for (int j = result.length-1; j >= 0; j--){
            System.out.print(result[j]);
        }
         
    }

    
    
    
    
}
