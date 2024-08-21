import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int remainder = 0;
         int oneCount = 0;
        int max = 0;
      //  Stack<Integer> stack = new Stack<Integer>();
        while(n > 0){
            remainder = n%2;
            n = n/2;
            if(remainder == 1){
                oneCount++;
                if(oneCount > max){
                    max = oneCount;
                }
            }else{
                oneCount = 0;
            }
          //  stack.push(remainder);
        }
       
      /**   while(!stack.isEmpty()){
            int temp = stack.pop();
            
            if(temp == 1){
                oneCount++;
                if(oneCount > max){
                    max = oneCount;
                }
            }else{
                oneCount = 0;
            }
        }**/
        
        System.out.println(max);
    }
}