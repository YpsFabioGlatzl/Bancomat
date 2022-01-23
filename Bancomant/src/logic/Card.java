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
public class Card {
    private String pathToCards = "../data/";
    private String nameHolder;
    private String surnameHolder;
    private String nameConto;
    private String IBAN;
    private String bank;
    private String cardNumber;
    private String validTill;
    private int pin;
    
    
    private boolean checkCard(String cardName) throws FileNotFoundException{
        pathToCards += cardName;
        Scanner s = new Scanner(new File(pathToCards));
        ArrayList<String> data = new ArrayList<String>();
        while (s.hasNext()){
            data.add(s.next());
        }
        s.close();
        
        
        
        
        return false;
    }
    
}
