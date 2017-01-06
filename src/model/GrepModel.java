/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.regex.*;

/**
 *
 * @author HP
 */
public class GrepModel {
    
    private String[] stringArr;
//    private String inputString;

//    public String getInputString() {
//        return inputString;
//    }
//
//    public void setInputString(String inputString) {
//        this.inputString = inputString;
//    }

    public GrepModel() {
        this.stringArr = new String[]{"Larry has the flu. His nose is running. He coughs a lot. ",
         "He sneezes a lot. When he coughs, he covers his mouth. ",
         "When he sneezes, he covers his mouth. When his nose is ",
         "running, he wipes his nose with a tissue. Larry's mother",
         " is taking care of him. She makes hot soup for him. ",
         "She gives him fresh orange juice. She makes him comfortable ",
         "in his bed. She turns on the TV so he can watch TV in his ",
         "bed. She turns out the light so he can sleep in his bed. ",
         "She gives him medicine so he will get better. ",
         "Larry will get better soon. "};        
    }

    public String[] getStringArr() {
        return stringArr;
    }

    public void setStringArr(String[] stringArr) {
        this.stringArr = stringArr;
    }    
    
    public ArrayList<String> startGrepSimpleChar(String inputString){ 

        ArrayList<String> resultArr = new ArrayList<>();
        
        for(int k = 0; k < this.stringArr.length; k++){        
            for(int i = 0, j = 0; i < inputString.length() & j < this.stringArr[k].length(); ){
                if(inputString.charAt(i) == this.stringArr[k].charAt(j) || 
                        inputString.charAt(i) == Character.toUpperCase(this.stringArr[k].charAt(j)) ||
                        inputString.charAt(i) == Character.toLowerCase(this.stringArr[k].charAt(j))){
                    j++;
                    i++;             
                } else{
                    j++;
                    if(i != 0) i = 0;                               
                }
                if(i == inputString.length()){
                    resultArr.add(this.stringArr[k]);
                }
            }
        }                
        
    return resultArr;
    }
    
    public ArrayList<String> startGrepRegEx(String reqex){
        
        ArrayList<String> resultArr = new ArrayList<>();
        Pattern p = Pattern.compile(reqex);        
        for (String input : this.stringArr) {
            Matcher m = p.matcher(input);
            if(m.find()){
                resultArr.add(input);
            }
        }       
        return resultArr;
    }
    
    
}
