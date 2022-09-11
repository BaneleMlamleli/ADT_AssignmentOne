package BackEnd;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package MasterKey;

/**
 *
 * @author Shaun
 */
public class EncryptDecrypt {

    public static String getEncryption(String enteredPassword) {
        String characters = "!#$%&'()*+,-./0123456789:;<=>?@";
        String alphabets = "BaNeLeHeNdRicKsHaUnMlAmLeLi";
        char firstKey = enteredPassword.charAt(0);
        char lastKey = enteredPassword.charAt(enteredPassword.length() - 1);

        char key = characters.charAt((int) (Math.random() * characters.length()));
        char key1 = characters.charAt((int) (Math.random() * characters.length()));
        char key2 = characters.charAt((int) (Math.random() * characters.length()));
        char key3 = characters.charAt((int) (Math.random() * characters.length()));
        char midKey = alphabets.charAt((int) (Math.random() * alphabets.length()));
        char midKey1 = alphabets.charAt((int) (Math.random() * alphabets.length()));
        char midKey2 = alphabets.charAt((int) (Math.random() * alphabets.length()));

        String encryptedPassword = "" + key + key1 + lastKey + enteredPassword.substring(1, (enteredPassword.length() - 1)) + firstKey + key2 + key3;
        String combine = "" + encryptedPassword.substring(0, 5) + midKey + midKey1 + midKey2;
        String fullPassword = "" + combine + encryptedPassword.substring(combine.length() - 3, encryptedPassword.length());
        String reverseLastFiveChars = fullPassword.substring(fullPassword.length() - 7, fullPassword.length());
        fullPassword = "" + reverseLastFiveChars + fullPassword.substring(0, fullPassword.length() - 7);
        encryptedPassword = fullPassword;
        return encryptedPassword;
    }

    public static String getDecryption(String strPassword) {
        String decryptedPassword;
        String reverseFirstFiveChars = strPassword.substring(0, 7);
        String password = strPassword.substring(7, strPassword.length());
        String combine = password + reverseFirstFiveChars;
        String xtractPassword = combine.substring(2, strPassword.length() - 2);
        char xtrctFirstKey = xtractPassword.charAt(0);
        char xtrctLastKey = xtractPassword.charAt(xtractPassword.length() - 1);

        decryptedPassword = "" + xtrctLastKey + xtractPassword.substring(1, (xtractPassword.length() - 1)) + xtrctFirstKey;
        String fullPassword = decryptedPassword.substring(0, 3) + decryptedPassword.substring(6, decryptedPassword.length());
        decryptedPassword = fullPassword;
        return decryptedPassword;
    }
    
    private static final DecimalFormat df = new DecimalFormat("0.00");
    
    public static void main(String[]args){
        
        //EncryptDecrypt cipher = new EncryptDecrypt();
        //System.out.println("Encrypted: " + cipher.getEncryption("Test"));
        //System.out.println("Decryption: " + cipher.getDecryption(cipher.getEncryption("Test")));
        //Double.parseDouble(String.format( "%.2f",  1.0 + (Math.random() * (2000.00 - 1.0))));
        
        String strBill = String.format( "%.2f",  1.0 + (Math.random() * (2000.00 - 1.0)));
        double bill = Double.parseDouble(strBill.replace(",","."));
        
        System.out.println(bill +"\n"+(bill+ 1));
        
//        System.out.println(1.0 + (Math.random() * (2000.00 - 1.0)));
//        
//        df.setRoundingMode(RoundingMode.DOWN);
//        double bill = Double.parseDouble(df.format(1.0 + (Math.random() * (2000.00 - 1.0))));
//        System.out.println(bill);
    }
}
