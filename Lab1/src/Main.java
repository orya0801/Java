import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // Circle test
        Circle c = new Circle(0,0,1,1);
        System.out.print("Circle:\n");
        System.out.println(c.countPerimeter());
        System.out.println(c.countSquare());

        // Triangle test
        Triangle t = new Triangle(1,2,3,2,0,0);
        System.out.print("Triangle:\n");
        System.out.println(t.countPerimeter());
        System.out.println(t.countSquare());

        Comparator comp = new Comparator();

        System.out.println(comp.isLarger(c, t));

        appendUsingFileWriter("output.txt", String.format("Triangle:\nPerimeter = %f\nSquare = %f", t.countPerimeter(), t.countSquare()));
    }

    private static void appendUsingFileWriter(String filePath, String text) {
        File file = new File(filePath);
        FileWriter fr = null;
        try {
            fr = new FileWriter(file,true);
            fr.write(text);

        }catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
