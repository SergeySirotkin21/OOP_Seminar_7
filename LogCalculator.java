// это декоратор для ComplexCalculator
public class LogCalculator implements Calculator{
    private  Calculator oldCalc;
    private  Loggable logger;

    public LogCalculator(Calculator oldCalc, Loggable logger) {
        this.oldCalc = oldCalc;
        this.logger = logger;
    }

    @Override
    public Calculator sum(ComplexNumber arg) {
        ComplexNumber firstArg = oldCalc.getResult();
        logger.log(String.format("Значение калькулятора %s. Начало вызова метода sum с параметром %s", firstArg, arg));
        Calculator result = oldCalc.sum(arg);
        logger.log("Вызов метода sum произошел.");
        return result;
    }

    @Override
    public Calculator multi(ComplexNumber arg) {
        ComplexNumber firstArg = oldCalc.getResult();
        logger.log(String.format("Значение калькулятора %s. Начало вызова метода multi с параметром %s", firstArg, arg));
        Calculator result = oldCalc.multi(arg);
        logger.log("Вызов метода multi произошел.");
        return result;
    }

    @Override
    public Calculator div(ComplexNumber arg) {
        ComplexNumber firstArg = oldCalc.getResult();
        logger.log(String.format("Значение калькулятора %s. Начало вызова метода div с параметром %s", firstArg, arg));
        Calculator result = oldCalc.div(arg);
        logger.log("Вызов метода div произошел.");
        return result;
    }

    @Override
    public Calculator minus(ComplexNumber arg) {
        ComplexNumber firstArg = oldCalc.getResult();
        logger.log(String.format("Значение калькулятора %s. Начало вызова метода minus с параметром %s", firstArg, arg));
        Calculator result = oldCalc.minus(arg);
        logger.log("Вызов метода minus произошел.");
        return result;
    }

    @Override
    public ComplexNumber getResult() {
        ComplexNumber result = oldCalc.getResult();
        logger.log(String.format("Получение результата %s", result));
        return result;
    }
}


