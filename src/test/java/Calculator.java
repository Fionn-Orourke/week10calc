public class Calculator {
    public  int add(int firstNum, int secondNum){
        long result = (long) firstNum + secondNum;
        if(result > Integer.MAX_VALUE){
            throw new IllegalArgumentException("your values are too large");
        }
        return (int)result;
    }
    public  int subtract(int firstNum, int secondNum){
        long result = (long) firstNum - secondNum;
        if(result > Integer.MAX_VALUE){
            throw new IllegalArgumentException("your values are too large");
        }
        return (int)result;
    }
}

