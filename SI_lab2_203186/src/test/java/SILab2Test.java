import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    private SILab2 lab = new SILab2();

    @Test
    void testEveryStatement() {
        String[] array1 = new String[]{};
        List<String> list = Arrays.asList(array1);
        assertThrows(Exception.class, () -> lab.function(list));

        String[] array2 = new String[]{"0", "#", "0", "#", "0", "#", "#", "0"};
        List<String> list2 = Arrays.asList(array2);
        assertThrows(Exception.class, () -> lab.function(list2));

        String[] array3 = new String[]{"0", "#", "0", "#", "0", "#", "#", "0", "#"};
        List<String> list3 = Arrays.asList(array3);
        String[] resultArray3 = new String[]{"2", "#", "2", "#", "3", "#", "#", "2", "#"};
        List<String> result = Arrays.asList(resultArray3);
        assertEquals(result, lab.function(list3));

    }

    @Test
    void testEveryBranch() {
        String[] array1 = new String[]{};
        List<String> list = Arrays.asList(array1);
        assertThrows(Exception.class, () -> lab.function(list));

        String[] array2 = new String[]{"0", "#", "0", "#", "0", "#", "#", "0"};
        List<String> list2 = Arrays.asList(array2);
        assertThrows(Exception.class, () -> lab.function(list2));

        String[] array3 = new String[]{"0", "#", "0", "#", "0", "#", "#", "0", "#"};
        List<String> list3 = Arrays.asList(array3);
        String[] resultArray3 = new String[]{"2", "#", "2", "#", "3", "#", "#", "2", "#"};
        List<String> result3 = Arrays.asList(resultArray3);
        assertEquals(result3, lab.function(list3));

        String[] array4 = new String[]{"0", "0", "0", "0", "0", "0", "0", "0", "0"};
        List<String> list4 = Arrays.asList(array4);
        String[] resultArray4 = new String[]{"0", "0", "0", "0", "0", "0", "0", "0", "0"};
        List<String> result4 = Arrays.asList(resultArray4);
        assertEquals(result4, lab.function(list4));

    }
}