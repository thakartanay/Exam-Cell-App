/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamCell;

/**
 *
 * @author Tanay Thakar
 */
public class ExamCell {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Splash sp = new Splash();
        sp.setVisible(true);
        MainMenu mu = new MainMenu();
        try{
            for(int i=0;i<=100;i++){
                Thread.sleep(40);
                sp.jProgressBar1.setValue(i);
                if(i==100){
                    sp.setVisible(false);
                    mu.setVisible(true);
                }
            }
        }
        catch(Exception e){
            
        }
    }
    
}
