/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fglat
 */
public class CashBox {
    
    private String pathToBox = "./src/data/cashBox.txt";
    
    
    private int bankNotes20;
    private int bankNotes50;
    private int bankNotes100;
    private int bankNotes200;
    
    private CashBox box;
    
    public CashBox(){
        
    }
    
    public CashBox(int notes20, int notes50, int notes100, int notes200){
        this.bankNotes20 = notes20;
        this.bankNotes50 = notes50;
        this.bankNotes100 = notes100;
        this.bankNotes200 = notes200;
    }
    
    public void setAvailableNotes() throws FileNotFoundException{
        File fileBox = new File(pathToBox);
        Scanner s = new Scanner(fileBox);
        ArrayList<String> data = new ArrayList<String>();
        while (s.hasNext()){
            data.add(s.next());
        }
        s.close();
        
        box = new CashBox(Integer.parseInt(data.get(0)), Integer.parseInt(data.get(1)), Integer.parseInt(data.get(2)), Integer.parseInt(data.get(3)));
        
    }

    public CashBox getBox() {
        return box;
    }

    public int getBankNotes20() {
        return bankNotes20;
    }

    public int getBankNotes50() {
        return bankNotes50;
    }

    public int getBankNotes100() {
        return bankNotes100;
    }

    public int getBankNotes200() {
        return bankNotes200;
    }
    
    
    
    
}
