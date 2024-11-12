package amstrong.ejercicio;

public class Numero {
        public static boolean isSpecialNumber(int n) {
            String numberStr = String.valueOf(n);
            int numDigits = numberStr.length();
            int sum = 0;
    
            for (char digitChar : numberStr.toCharArray()) {
                int digit = Character.getNumericValue(digitChar);
                sum += Math.pow(digit, numDigits);
            }
    
            return sum == n;
        }
    }

