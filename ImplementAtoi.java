class ImplementAtoi {
    public int myAtoi(String s) {
        int start = 0;
        int len = s.length();
        int res = 0;
        boolean isNegative = false;
        while (start < len && s.charAt(start) == ' ') {
            start++;
        }
        if (start < len && (s.charAt(start) == '-' || s.charAt(start) == '+')) {
            isNegative = s.charAt(start) == '-';
            start++;
        }
        while (start < len && Character.isDigit(s.charAt(start))) {
            int digit = s.charAt(start) - '0';
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            res = res * 10 + digit;
            start++;
            }
        return isNegative ? -res : res;
    }
}
