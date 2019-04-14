package edu.softwarica.android.assignment.numbertowords;

public class NumberToWords {
    public static final String[] units = {
            "", "one", "two", "three", "four", "five", "six", "seven",
            "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    public static final String[] tens = {
            "",        // 0
            "",        // 1
            "twenty",  // 2
            "thirty",  // 3
            "forty",   // 4
            "fifty",   // 5
            "sixty",   // 6
            "seventy", // 7
            "eighty",  // 8
            "ninety"   // 9
    };

    public NumberToWords() {

    }

    public  String converter(final int number){
        if (number < 0){
            return "minus " + converter(-number);
        }
        else if (number < 20){
            return units[number];
        }
        else if (number < 100){
            return tens[number/10] + ((number % 10 != 0) ? " " : "") + units[number % 10];
        }
        else if(number < 1000){
            return units[number / 100] + " hundred" + ((number % 100 != 0) ? " " : "") +
                    converter(number % 100);
        }
        else if (number < 1000000){
            return converter(number / 1000) + " thousand" + ((number % 1000 != 0) ? " ": "")
            + converter(number % 1000);
        }
        return "Cannot convert numbers more than 100 thousands";
    }
}
