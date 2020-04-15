/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;


public class logic extends middle {
  boolean a,b,c,d; 
  int i,k,l,h,x;
    void lo(){
        
        for(i=0;i<arr.length;i++)
        {
            //fils stars inthe middle
            if(i==midr)
            {  
                for(x=0;x<arr.length;x++)
                {
              arr[i][x]='*'; 
                }
            }
            
            if(i==midc)
            {
              for(x=0;x<arr[0].length;x++)
                {
              arr[x][i]='*'; 
                } 
           
            
            }
                
            
        }
        
    }
    
}
