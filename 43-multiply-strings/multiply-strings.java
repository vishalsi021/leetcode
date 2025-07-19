class Solution {
    public String multiply(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        
        int[] result = new int[len1 + len2]; 
        for (int i = len1 - 1; i >= 0; i--) {
            int d1 = num1.charAt(i) - '0';
            for (int j = len2 - 1; j >= 0; j--) {
                int d2 = num2.charAt(j) - '0';

                int mult = d1 * d2;
                int sum = mult + result[i + j + 1];

                result[i + j] += sum / 10;         
                result[i + j + 1] = sum % 10;      
            }
        }

        
        StringBuilder sb = new StringBuilder();
        for (int r : result) {
            if (sb.length() == 0 && r == 0) continue; 
            sb.append(r);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
