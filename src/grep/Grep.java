/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grep;
import java.util.ArrayList;
import model.GrepModel;
import fileLogic.File;

/**
 *
 * @author HP
 */
public class Grep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GrepModel grep = new GrepModel();
        
        ArrayList<String> result = grep.startGrepSimpleChar(args[0]);
//        ArrayList<String> result = grep.startGrepRegEx(".im");
        
        result.forEach((string) -> {
            System.out.println(string);
        });
        
        
    }
    
}
