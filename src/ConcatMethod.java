import java.util.LinkedList;
import java.util.List;

public class ConcatMethod {

    public LinkedList<String> concateMethodTest(List<String> l1, List<String> l2){

        LinkedList<String> finalOutcome = new LinkedList<>();

        finalOutcome.addAll(l1);
        finalOutcome.addAll(l2);

        System.out.println(finalOutcome);

        return finalOutcome;
    }


}
