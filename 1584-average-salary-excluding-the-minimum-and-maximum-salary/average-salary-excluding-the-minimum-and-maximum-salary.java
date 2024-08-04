class Solution {
    public double average(int[] salary) {
         Arrays.sort(salary);
        double sumOfSalaries = 0;
        for (int i = 1; i < salary.length - 1; i++) {
            sumOfSalaries += salary[i];
        }
        return sumOfSalaries / (salary.length - 2);
    }
}