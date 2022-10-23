package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String tString = t + "";
        int res = 0;

        for (int i = 0; i < tString.length(); i++){
            if (tString.charAt(i) != '-') {
                res += Integer.parseInt(String.valueOf(tString.charAt(i)));
            }
        }

        System.out.println(res);
    }
}
