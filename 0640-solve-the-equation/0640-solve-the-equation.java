class Solution {
    public String solveEquation(String equation) {
        String[] delimited = equation.split("=");
        int[] left = generateNumbers(delimited[0]);
        int[] right = generateNumbers(delimited[1]);
        left[0] -= right[0];
        right[0] = 0;
        if(left[0] == right[0] & left[0] == 0)
            return left[1] == right[1] ? "Infinite solutions" : "No solution";
        right[1] -= left[1];
        return "x=" + right[1] / left[0];
    }

    private int[] generateNumbers(String str) {
        StringBuilder number = new StringBuilder(Character.toString(str.charAt(0)));
        int[] equation = new int[2];
        for (int i = 1; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == '+' || c == '-') {
                addNumber(equation, number.toString());
                number = new StringBuilder();
            }
            number.append(c);
        }
        if(!number.isEmpty()) addNumber(equation, number.toString());
        return equation;
    }

    private void addNumber(int[] equation, String number) {
        int sign = number.contains("-") ? -1 : 1;
        int index = number.contains("x") ? 0 : 1;
        number = number.replace("-","")
                .replace("+","")
                .replace("x","");
        if(number.isEmpty()) number = "1";
        equation[index] += sign * Integer.parseInt(number);
    }
}