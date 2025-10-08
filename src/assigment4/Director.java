package assigment4;

public class Director extends Manager {
    private double annualBudget;

    public Director(int id, String name, double baseSalary, int teamSize, double annualBudget) {
        super(id, name, baseSalary, teamSize);
        this.annualBudget = annualBudget;
    }

    public double getAnnualBudget() { return annualBudget; }

    @Override
    public void performDuties() {
        System.out.println("Director " + getName() + " sets strategy and manages budget $" + (long)annualBudget + ".");
    }

    @Override
    public double calculatePay() {
        // Directors get the manager pay + executive allowance (0.2% of annual budget, prorated monthly)
        double managerMonthly = super.calculatePay();
        double execAllowanceMonthly = (annualBudget * 0.002) / 12.0;
        return managerMonthly + execAllowanceMonthly;
    }

    @Override
    public double calculateAnnualBonus() {
        // Directors: 25% of annual base + 0.5% of managed budget
        return getBaseSalary() * 12 * 0.25 + (annualBudget * 0.005);
    }
}
