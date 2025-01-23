public class Mainn {
    public static void main(String[] args) {

        drawingRectangle();

        triangleDrawing();

        for (int lenght = 0; lenght < 20 ; lenght++) {
            StringBuilder line = new StringBuilder("");
            for (int width = 1; width < lenght; width++) {
                line.append("( " + lenght + ", " + width + ");");

            }
            System.out.println(line);
        }
    }

    private static void triangleDrawing() {
        System.out.println("");
        for (int lenght = 1; lenght < 20 ; lenght = lenght * 2) {
            StringBuilder line = new StringBuilder("");
            for (int width = 1; width < lenght ; width = width * 1) {
                line.append("*");

            }
            System.out.println(line);
        }

        System.out.println("");
        for (int lenght = 1; lenght < 20 ; lenght++) {
            StringBuilder line = new StringBuilder("");
            for (int width = 1; width < lenght; width++) {
                line.append("*");
            }
            System.out.println(line);
        }

        System.out.println("");
        System.out.println("Rysowanie trójkata równoramiennego");

        for (int lenght = 1; lenght < 10 ; lenght++) {
            StringBuilder line = new StringBuilder("");
            for (int width = 1; width < lenght; width++) {
                line.append("*");