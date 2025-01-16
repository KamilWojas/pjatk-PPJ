public class Main {
    public static void main(String[] args) {

        drawingRectangle();


        triangleDrawing();

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
        for (int lengt = 1; lengt < 20 ; lengt++) {
            StringBuilder line = new StringBuilder("");
            for (int width = 1; width < lengt; width++) {
                line.append("*");
            }
            System.out.println(line);
        }


        System.out.println("Rysowanie trójkata równoramiennego");
        for (int lenght = 1; lenght < 10 ; lenght++) {
            StringBuilder line = new StringBuilder("");
            for (int width = 1; width < lenght; width++) {
                line.append("*");
            }
            System.out.println(line);
        }
    }

    private static void drawingRectangle() {
        //kwadrat 10x10
        for (int i = 0; i < 10; i++) {
            StringBuilder line = new Stringbuilder("");
            for (int j = 0; j < 10; j++) {
                line.append("*")

            }
            System.out.println(line);

        }
    }
}