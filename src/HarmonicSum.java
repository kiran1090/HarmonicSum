public class HarmonicSum {
    
    public static void main(String[] args) {
        
        int n = 50000;
        HarmonicSum aHarmonicSum = new HarmonicSum();
        double sumL2R = aHarmonicSum.printLeftToRightSum(n);
        double sumR2L = aHarmonicSum.printRightToLeftSum(n);
        System.out.println("Difference: "+ (sumL2R - sumR2L));

    }

    private double printLeftToRightSum(int n)
    {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += (double) 1/i;
        }
        System.out.println("Left-to-right harmonic sum is "+ sum);

        
        return sum;
    }
    
    private double printRightToLeftSum(int n)
    {
        double sum = 0.0;
        for (int i = n; i >= 1; i--) {
            sum += (double) 1/i;
        }
        System.out.println("Right-to-left harmonic sum is "+ sum);

        
        return sum;
    }
}
