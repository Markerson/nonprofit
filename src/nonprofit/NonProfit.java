/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nonprofit;

/**
 *
 * @author Mark's PC
 */
public class NonProfit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        collectURLS urls = new collectURLS();
        retreiveNonprofit nonprofit = new retreiveNonprofit();
        
        nonprofit.getSingle();
        
        
        //urls.Run();
        
        
        
        
    }
    
}
