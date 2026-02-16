public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] O = {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };

        String[] P = {
            "****** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        };

        String[] S = {
            " ***** ",
            "*      ",
            "*      ",
            " ****  ",
            "     * ",
            "     * ",
            " ***** "
        };

        // Combine letters side by side, row by row
        int rows = O.length;
        for (int i = 0; i < rows; i++) {
            System.out.println(O[i] + "  " + O[i] + "  " + P[i] + "  " + S[i]);
        }
    }
}
