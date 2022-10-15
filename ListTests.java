import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;


class StringChecker2 implements StringChecker {
    public boolean checkString(String s) {
        if(s.contains("ed")){
      return true;
    }
    else {
      return false;
    }
    }
}


public class ListTests {
    @Test
    public void testFilerMethod1(){
        //StringChecker sChecker1 = new StringChecker2();
        List<String> input1 = new ArrayList<>();
        input1.add("plated");
        input1.add("edward");
        input1.add("hands");
        input1.add("fasted");
        input1.add("places");
        List<String> output2 = new ArrayList<>();
        output2.add("plated");
        output2.add("edward");
        output2.add("fasted");
        StringChecker sChecker1 = new StringChecker2();
        List<String> filteredList = ListExamples.filter(input1, sChecker1);
    assertEquals(output2,filteredList);
    }
}