/*
*
*  Savannah Lyles
*  UNI: shl2183
*  This class validates a credit card number 
*  based on specific rules and provides methods 
*  to check its validity status and retrieve 
*  an associated error code.
*
*/

public class CreditCard{

    // declaring instance variables
    private String cardNumber;
    private boolean valid;
    private int errorCode;

    // initializing instance variables
    public CreditCard(String n) {
        cardNumber = n;
        valid = true;
        errorCode = 0;
    }

    // creating helper methods for check method
    private void check1() {
        // first digit must be 4
        int first = Integer.parseInt(cardNumber.substring(0,1));
        if (first != 4) {
            valid = false;
            errorCode = 1;
        }
    }

    private void check2() {
        // fourth digit must be one greater than fifth digit
        if (errorCode == 0) {
            int fourth = Integer.parseInt(cardNumber.substring(3,4));
            int fifth = Integer.parseInt(cardNumber.substring(5,6));
            if (fourth != (fifth + 1)) {
                valid = false;
                errorCode = 2;
            }
        }
    }

    private void check3() {
        // product of first, fifth, and ninth digits must be 24
        if (errorCode == 0) {
            int first = Integer.parseInt(cardNumber.substring(0,1));
            int fifth = Integer.parseInt(cardNumber.substring(5,6));
            int ninth = Integer.parseInt(cardNumber.substring(10,11));
            int product = first * fifth * ninth;
            if (product != 24) {
                valid = false;
                errorCode = 3;
            }
        }
    }

    private void check4() {
        // sum of all digits must be evenly divisible by 4
        if (errorCode == 0) {
            int sum = 0;
            for (int i = 0; i < cardNumber.length(); i++) {
                if (cardNumber.charAt(i) != '-') {
                    sum += 
                    Integer.parseInt(cardNumber.substring(i, i+1));
                }
            }

            if (sum % 4 != 0) {
                valid = false;
                errorCode = 4;
            }
        }
    }

    private void check5() {
        // sum of first four digits must be
        // one less than sum of last four
        if (errorCode == 0) {
            int sumFirstFour = 0;
            int sumLastFour = 0;
            for (int i = 0; i < 4; i++) {
                sumFirstFour += 
                Integer.parseInt(cardNumber.substring(i, i + 1));
            }

            for (int i = cardNumber.length() - 4; 
            i < cardNumber.length(); i++) {
                sumLastFour += 
                Integer.parseInt(cardNumber.substring(i, i + 1));
            }

            if ((sumFirstFour) != (sumLastFour - 1)) {
                valid = false;
                errorCode = 5;
            }
        }
    }

    private void check6() {
        // if you treat the first two digits as a two-digit number,
        // and the seventh and eight digits as a two digit number,
        // their sum must be 100
        if (errorCode == 0) {
            int firstNum = Integer.parseInt(cardNumber.substring(0,2));
            int secondNum = Integer.parseInt(cardNumber.substring(7,9));
            int sum = firstNum + secondNum;
            if (sum != 100) {
                valid = false;
                errorCode = 6;
            }
        }
    }

    // mutator method for checking validity
    public void check() {
        check1();
        check2();
        check3();
        check4();
        check5();
        check6();
    }

    // accessor method for validity status
    public boolean isValid() {
        return valid;
    }

    public int getErrorCode() {
        return errorCode;
    }
}