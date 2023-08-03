public class Calculator{
  public int sum(int x, int y){
    return x+y;
  }

  public int subtract(int x, int y){
    return x-y;
  }
  public int multiply(int x, int y){
    return x*y;
  }
  public int divide(int x, int y){
    if(y == 0){
      throw new IllegalArgumentException("Ints cannot be divided by zero");
    }
    return x/y;
  }

  public boolean isEven(int i){
    return i % 2 == 0;
    // if it's an even number return true
    // if it's an odd number returns false
  }

  public int[] incrementArray(int[] values) {
    int[] newVals = new int[values.length];
    for(int i = 0; i < values.length; i++){
      newVals[i] = values[i] + 1;
    }
    return newVals;
  }
}