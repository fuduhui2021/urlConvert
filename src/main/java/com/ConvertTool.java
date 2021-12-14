

package com;
import java.util.Stack;

/**
 * 10进制与62进制转换
 */
public class ConvertTool {
    private static char[] charSet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
    
   /**
     * 将10进制转化为62进制  
     * @param number  
     * @param length 转化成的62进制长度，不足length长度的话高位补0，否则不改变什么 
     * @return 
     */  
    public static String _10_to_62(long number, int length){  
         Long rest=number;  
         Stack<Character> stack=new Stack<Character>();  
         StringBuilder result=new StringBuilder(0);  
         while(rest!=0){  
             stack.add(charSet[new Long((rest-(rest/62)*62)).intValue()]);  
             rest=rest/62;  
         }  
         for(;!stack.isEmpty();){  
             result.append(stack.pop());  
         }  
         int result_length = result.length();  
         StringBuilder temp0 = new StringBuilder();  
         for(int i = 0; i < length - result_length; i++){  
             temp0.append('0');  
         }  
           
         return temp0.toString() + result.toString();  
  
    }  
      
    /** 
     * 将62进制转换成10进制数
     *
     * @param ident62 
     * @return 
     */  
    public static String convertBase62ToDecimal_v2( String ident62 ) {  
        Long dst = 0L;
        for(int i=0; i<ident62.length(); i++)
        {
            char c = ident62.charAt(i);
            for(int j=0; j<charSet.length; j++)
            {
                if(c == charSet[j])
                {
                    dst = (dst * 62) + j;
                    break;
                }
            }
        }
        String str = String.format( "%08d", dst);
        return str;
    }
    
    

      
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
        System.out.println("62System=" +_10_to_62(Integer.parseInt("35174605"), 0));
        System.out.println("62System=" +_10_to_62(Integer.parseInt("35174620"), 0));

        System.out.println("10System=" +convertBase62ToDecimal_v2("00008sKrPTsBmv"));   //120160524121052485
    }  
    
}