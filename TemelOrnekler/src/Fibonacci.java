public class Fibonacci {

    public void fibonacciSerisi(){

        int  fib [] = new int[10];

        fib[0]=1;
        fib[1]=1;

        for (int i =0; i<8; i++)
        {
            fib[i+2]=fib[i+1]+fib[i];
        }

        for (int i=0; i<10; i++){

            System.out.print(fib[i] +" ");
        }



    }

//
//    Fibonacci fibonacci=new Fibonacci();
//      fibonacci.fibonacciSerisi();

}
