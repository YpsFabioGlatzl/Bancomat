/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author fglat
 */
public class Card {
    private String pathToCards = "./src/data/";
    private Card currentCard;
    private String card;
    private String nameHolder;
    private String surnameHolder;
    private String nameConto;
    private String IBAN;
    private String bank;
    private String cardNumber;
    private String validTill;
    private String pin;
    private String balance;
    private char[] specialPin = new char[6];
    
    public Card(){
        
    }
    
    public Card(String nameHolder, String surnameHolder, String nameConto, String IBAN, String bank, String cardNumber, String validTill, String pin, String balance){
        this.nameHolder = nameHolder;
        this.surnameHolder = surnameHolder;
        this.nameConto = nameConto;
        this.IBAN = IBAN;
        this.bank = bank;
        this.cardNumber = cardNumber;
        this.validTill = validTill;
        this.pin = pin;
        this.balance = balance;
    }
    
    public Card checkCard(String cardName, char[] pin) throws FileNotFoundException{
        pathToCards = pathToCards + cardName + ".txt";
        File fileCard = new File(pathToCards);
        Scanner s = new Scanner(fileCard);
        ArrayList<String> data = new ArrayList<String>();
        while (s.hasNext()){
            data.add(s.next());
        }
        s.close();
        
        Card card = new Card(data.get(0), data.get(1), data.get(2), data.get(3), data.get(4), data.get(5), data.get(6), data.get(7), data.get(8));
        setCurrentCard(card);
       
        setSpecialPin(card.getPin());
        
        if (Arrays.equals(pin, specialPin)){
          return card;  
        } else {
            return null;
        }   
    }
    
    public Card getCurrentCard(){
        return this.currentCard;
    }

    public void setCurrentCard(Card currentCard) {
        this.currentCard = currentCard;
    }
    
    
    
    public void lockCard(String cardName){
        System.out.println("Card locked: " + cardName);
    }

    public String getPathToCards() {
        return pathToCards;
    }

    public void setPathToCards(String pathToCards) {
        this.pathToCards = pathToCards;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getNameHolder() {
        return nameHolder;
    }

    public void setNameHolder(String nameHolder) {
        this.nameHolder = nameHolder;
    }

    public String getSurnameHolder() {
        return surnameHolder;
    }

    public void setSurnameHolder(String surnameHolder) {
        this.surnameHolder = surnameHolder;
    }

    public String getNameConto() {
        return nameConto;
    }

    public void setNameConto(String nameConto) {
        this.nameConto = nameConto;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getValidTill() {
        return validTill;
    }

    public void setValidTill(String validTill) {
        this.validTill = validTill;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public char[] getSpecialPin() {
        return specialPin;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
    
    

    public void setSpecialPin(String Pin) {
        for (int i = 0;i < Pin.length(); i++){
                specialPin[i] = Pin.charAt(i);
            }
        }
    }
    
    
    

