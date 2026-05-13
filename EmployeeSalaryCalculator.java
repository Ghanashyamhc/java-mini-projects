class EmployeeSalaryCalculator {

    public static void main(String[] args) {

        double basic = 30000;
        double hra = basic * 0.2;
        double bonus = 5000;

        double total = basic + hra + bonus;

        System.out.println("Total Salary: " + total);
    }
}
