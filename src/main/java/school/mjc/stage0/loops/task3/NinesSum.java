package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int res = 0;
        int t = 9;
        for (int i = 1; i <= lengthOfLastNumber; i++) {
            res += t;
            t = t * 10 + 9;
        }
        System.out.println(res);
    }
}
