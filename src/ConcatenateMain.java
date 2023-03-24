import java.util.List;
import java.util.LinkedList;


public class ConcatenateMain {
    public static void main(String[] args) {


        String[] color1 = {"Blue", "Cyan", "Red"};
        String[] color2 = {"Green", "Yellow", "Magenta"};

        List<String> firstList = new LinkedList<>();
        List<String> secondList = new LinkedList<>();

        for(String color : color1)
            firstList.add(color);

        for(String color : color2)
            secondList.add(color);

        ConcatMethod cm = new ConcatMethod();

        cm.concateMethodTest(firstList,secondList);

    }
}