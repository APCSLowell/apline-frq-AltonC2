public class APLine
{
  private int a, r, c;
  public APLine ( int a1, int a2, int a3){
a = a1;
    r = a2;
    c = a3;
  }
  public double getSlope(){
return -(double)a/r;
  }
  public boolean isOnLine(int x, int y){
return a*x + r*y + c == 0;
  }
  /* your code here */
  
}
