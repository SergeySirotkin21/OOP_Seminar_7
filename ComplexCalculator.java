// реализует Calculator
public class ComplexCalculator implements Calculator{
    private ComplexNumber resultCalculation;

    public ComplexCalculator(ComplexNumber firstArg) {
        this.resultCalculation = firstArg;
    }


    @Override
    public Calculator div(ComplexNumber arg) {
        this.resultCalculation = this.resultCalculation.division(arg);
        return this;
    }


    @Override
    public Calculator minus(ComplexNumber arg) {
        this.resultCalculation = this.resultCalculation.subtract(arg);
        return this;
    }

    @Override
    public Calculator multi(ComplexNumber arg) {
        this.resultCalculation = this.resultCalculation.multiply(arg);
        return this;
    }

    @Override
    public Calculator sum(ComplexNumber arg) {
        this.resultCalculation = this.resultCalculation.add(arg);
        return this;
    }
    
    @Override
    public ComplexNumber getResult() {
        return resultCalculation;
    }
}
