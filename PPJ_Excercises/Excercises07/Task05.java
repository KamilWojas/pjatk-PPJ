
public class Task05 {
    public static void main(String[] args) {

    }

    char[][] chars = new char['z' - 'a']['z' - 'a'];

        for(
    int i = 0;
    i<chars.length;i++)

    {
        char c = 'a';
        for (int j = 0; j < chars.length; j++, c++) {
            chars[i][j] = c;
        }
    }

        for(
    int i = 0, step = 1;
    i<chars.length;i++)

    {
        System.out.println(chars[i][step]);
        step = (step << 1) % chars[i].length;
    }
}
