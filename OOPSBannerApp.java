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

       
        String[] banner = new String[O.length];

        for (int i = 0; i < O.length; i++) {
            banner[i] = String.join("  ",
                    O[i], O[i], P[i], S[i]);
        }

        
        for (String line : banner) {
            System.out.println(line);
        }
    }
}