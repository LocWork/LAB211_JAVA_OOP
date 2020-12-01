/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hi
 */
public class Validator {

    //method
    public int userChoice(int minChoice, int maxChoice, String msg, String warning, String note) {
        Scanner s = new Scanner(System.in);
        int result;
        do {
            try {
                System.out.print(msg);
                s = new Scanner(System.in);
                result = Integer.parseInt(s.nextLine());
                if (result < minChoice || result > maxChoice) {
                    System.out.println(warning);
                } else {
                    return result;
                }
            } catch (NumberFormatException e) {
                System.out.println(note);
            }
        } while (true);
    }

    public String getString(String msg, String warning, String note) {
        Scanner s = new Scanner(System.in);
        String ex = "[A-Za-z]{1,20}";
        String result;
        do {
            try {
                System.out.print(msg);
                s = new Scanner(System.in);
                result = s.nextLine();
                if (!result.matches(ex)) {
                    throw new Exception();
                }
                if (result.trim() == null) {
                    System.out.println(warning);
                } else {
                    return result;
                }
            } catch (Exception e) {
                System.out.println(note);
            }
        } while (true);
    }

    public String getStringWithCondition(String msg, String warning, String emptyWarning, String invaliedWarning, String note) {
        Scanner s = new Scanner(System.in);
        String ex = "[A-Za-z- ]{1,30}[ ]{1}([A-Z-a-z- ]{1,30}[ ]{1})?[A-Z-a-z- ]{1,30}";
        String[] arr;
        String result;
        do {
            try {
                System.out.print(msg);
                s = new Scanner(System.in);
                result = s.nextLine();
                arr = result.split(" ");
                if (!result.matches(ex)) {
                    throw new Exception(invaliedWarning);
                }
                if (result.trim() == null) {
                    System.out.println(emptyWarning);
                } else if (arr[arr.length - 1] == null) {
                    System.out.println(warning);
                } else {
                    return result;
                }
            } catch (Exception e) {
                System.out.println(note);
            }
        } while (true);
    }

    public String getNamePos(String contactName, boolean wantPos, String warning) {
        String result = null;
        String[] arr = contactName.split(" ");
        if (contactName.trim() == null) {
            System.out.println(warning);
        } else {
            if (wantPos == true) {
                result = arr[0];

            } else if (wantPos == false) {
                result = arr[arr.length - 1];
            }

        }
        return result;
    }

    public String getDigit(String msg, String emptyWarning, String note) {
        Scanner s = new Scanner(System.in);
        String result;
//        String ex2 = "[0-9]{3}[-.]?[0-9]{3}[-.]?[0-9]{4}";
        String ex = "[0-9]{10}";
        String exa = "[0-9]{3}\\-[0-9]{3}\\-[0-9]{4}";   
        String exb = "[0-9]{3}\\.[0-9]{3}\\.[0-9]{4}";
        String ex1 = "[0-9]{3}[ ][0-9]{3}[ ][0-9]{4}";
        String ex2 = "[0-9]{3}\\-[0-9]{3}\\-[0-9]{4}[ ]([x][0-9]{4})?";
        String ex3 = "[0-9]{3}\\-[0-9]{3}\\-[0-9]{4}[ ](ext[0-9]{4})?";
        
//        String ex2a = "[0-9]{3}([-. ]{0})[0-9]{3}([-. ]{1})[0-9]{4}";
//        String ex2b = "[0-9]{3}([-. ]{1})[0-9]{3}([-. ]{0})[0-9]{4}";
//        String ex3 = "[0-9]{3}  ([. ]{1})  [0-9]{3}  ([. ]{1}) [0-9]{4}[ ]([x][0-9]{4})?";
//        String ex4 = "[0-9]{3}  ([. ]{1})  [0-9]{3}  ([. ]{1}) [0-9]{4}[ ](ext[0-9]{4})?";
//        String ex3a = "[0-9]{3} [-] [0-9]{3}  ([-]{0}) [0-9]{4}[ ]([x][0-9]{4})?";
//        String ex4a = "[0-9]{3} [-] [0-9]{3}  ([-]{0}) [0-9]{4}[ ](ext[0-9]{4})?";
//        String ex3b = "[0-9]{3} ([-]{0}) [0-9]{3} [-]  [0-9]{4}[ ]([x][0-9]{4})?";
//        String ex4b = "[0-9]{3} ([-]{0}) [0-9]{3} [-]  [0-9]{4}[ ](ext[0-9]{4})?";
        do {
            try {
                System.out.print(msg);
                s = new Scanner(System.in);
                result = s.nextLine();
                if (!result.matches(ex) && !result.matches(ex1) && !result.matches(ex2) && !result.matches(ex3) && !result.matches(exa) && !result.matches(exb)){
                    throw new Exception();
                }

                if (result.trim() == null) {
                    System.out.println(emptyWarning);
                } else {
                    return result;
                }
            } catch (Exception e) {
                System.out.println(note);
                System.out.println("1234567890");
                System.out.println("123-456-7890");
                System.out.println("123-456-7890 x1234");
                System.out.println("123-456-7890 ext1234");
                System.out.println("123.456.7890");
                System.out.println("123 456 7890");
            }
        } while (true);
    }

    public int getInt(String msg, String warning, String note) {
        Scanner s = new Scanner(System.in);
        int result;
        do {
            try {
                System.out.print(msg);
                s = new Scanner(System.in);
                result = Integer.parseInt(s.nextLine());
                if (result < 0) {
                    System.out.println(warning);
                } else {
                    return result;
                }
            } catch (NumberFormatException e) {
                System.out.println(note);
                System.out.println("");
            }
        } while (true);

    }

}
