public class Calculator {
    public  int add(int firstNum, int secondNum){
        long result = (long) firstNum + secondNum;
        if(result > Integer.MAX_VALUE){
            throw new IllegalArgumentException("your valuse are too large");
        }
        return (int)result;
    }
}
