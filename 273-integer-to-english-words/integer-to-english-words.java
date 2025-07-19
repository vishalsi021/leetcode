class Solution {

    private final String[] BELOW_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven",
                                       "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen",
                                       "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};


    private final String[] TENS = {"", "", "Twenty", "Thirty", "Forty", "Fifty",
                                   "Sixty", "Seventy", "Eighty", "Ninety"};


    private final String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};

    public String numberToWords(int num) {
        if (num == 0) return "Zero";

        int i = 0;
        String result = "";

        while (num > 0) {
            int currChunk = num % 1000;
            if (currChunk != 0) {
                result = helper(currChunk) + THOUSANDS[i] + " " + result;
            }
            num /= 1000;
            i++;
        }

        return result.trim();
    }

    // Converts a number < 1000 to words
    private String helper(int num) {
        if (num == 0) return "";
        else if (num < 20) return BELOW_20[num] + " ";
        else if (num < 100) return TENS[num / 10] + " " + helper(num % 10);
        else return BELOW_20[num / 100] + " Hundred " + helper(num % 100);
    }
}
