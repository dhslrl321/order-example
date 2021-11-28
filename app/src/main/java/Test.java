import javazoom.jl.decoder.JavaLayerUtils;
import org.w3c.dom.css.CSSUnknownRule;

public class Test {
    public static void main(String[] args) {
        int a = 0;
        for (int index = 0; index < 500; index++) {
            long startTime = System.nanoTime();
            for (int subIndex = 0; subIndex < 1000; subIndex++) {
                a++;
            }
            System.out.println("loop count: " + index + ", execution time: " + (System.nanoTime() - startTime));
        }
    }
}
