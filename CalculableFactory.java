//Создает первое комплексное число
    
public class CalculableFactory implements IcalculableFactory{
    @Override
    public Calculator create(ComplexNumber firstArg) {
        return new ComplexCalculator(firstArg);
    }
}
