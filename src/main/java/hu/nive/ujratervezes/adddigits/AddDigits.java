package hu.nive.ujratervezes.adddigits;

import org.junit.platform.commons.util.StringUtils;

public class AddDigits {

    public Integer addDigits(String input) {
        Integer sum = 0;
        if(input == null || input.isEmpty()) return -1;
        for(int i = 0; i < input.length() ; i++){
            if( Character.isDigit(input.charAt(i)) ){
                sum = sum + Character.getNumericValue(input.charAt(i));
            }
        }
        return sum;
    }
}

