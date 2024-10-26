//print 10 to 0 number using recursion

public class recursion {
  public static void main(String[] args) {
    // numbers obj=new numbers();
    
    // obj.callfunc();

    // recus obj2= new recus();
    
    // obj2.func1(5);
      // sumnum obj3=new sumnum();
      // int res=obj3.sums(5);

      // System.out.println(res);

      fibo obj4= new fibo();
      System.out.println(obj4.fibonacci(6));
  }
}

class fibo{
  int fibonacci(int n){
    if(n==0 || n==1){
      return n;
    }
    int fibos=fibonacci(n-1)+fibonacci(n-2);
    return fibos;
  }
}

class sumnum{
  int sums(int n){
    if(n==1)
      return 1;  
    int fn= sums(n-1);
    return n+fn;
  }
}

class numbers{
  public int x=10;
  void callfunc(){
    if(x==0){
      return;
    }
    System.out.println(x);
    x--;
    callfunc();
  }
}

class recus{
  void func1(int n){
    if(n==0){
      return;
    }
    func1(n-1);
    System.out.println(n);
  } 
}

class factorials{
  int fact(int n){
    if(n==0){
      return 1;
    }

    int fm=fact(n-1);
    int fac=n*fm;
    return fac;
  }
}

