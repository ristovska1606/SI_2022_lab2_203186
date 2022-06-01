import java.util.ArrayList;
import java.util.List;

public class SILab2 {
    public static List<String> function(List<String> list) {
        if (list.size() <= 0) { //A
            throw new IllegalArgumentException("List length should be greater than 0"); //B
        }
        int n = list.size();  //C
        int rootOfN = (int) Math.sqrt(n); //D
        if (rootOfN * rootOfN  != n) { //E
            throw new IllegalArgumentException("List length should be a perfect square"); //F
        }
        List<String> numMines = new ArrayList<>(); //G
        for (int i = 0; i < n; i++) { //H I J
            if (!list.get(i).equals("#")) { //k
                int num = 0; //L
                if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) || (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) ) { //M
                    if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) && (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) ){ //N
                        num += 2; //O
                    }
                    else {
                        num  += 1; //P
                    }
                }
                if (i - rootOfN >= 0 && list.get(i - rootOfN).equals("#")){ //Q
                    num++; //R
                }
                if (i + rootOfN < n && list.get(i + rootOfN).equals("#")){ //S
                    num++; //T
                }
                numMines.add(String.valueOf(num)); //U
            }
            else {
                numMines.add(list.get(i)); //V
            }
        }
        return numMines; //W
    }



}
