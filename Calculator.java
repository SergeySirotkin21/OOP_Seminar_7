public interface Calculator {

    Calculator sum(ComplexNumber arg);
    Calculator multi(ComplexNumber arg);
    Calculator div(ComplexNumber arg);
    Calculator minus(ComplexNumber arg);
    ComplexNumber getResult();

    
}
