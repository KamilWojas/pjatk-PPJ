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