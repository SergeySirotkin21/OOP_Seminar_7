// adapter
public class LogCalculableFactory implements IcalculableFactory{
    private  Loggable logger;
    
    public LogCalculableFactory(Loggable logger) {
        this.logger = logger;
    }
    
    @Override
    public Calculator create(ComplexNumber firstArg) {
            return new LogCalculator(new ComplexCalculator(firstArg), this.logger);
    }
}

