public class Calculator {
    int arr[];
    public Calculator ()
    {
        UserInput in = new UserInput();
        this.arr = in.input();
    }
    //Calculator Operations
    int addition(int arr[])
    {
        int sum = arr[0] + arr[1];
        return(sum);
    }
    int subtraction(int arr[])
    {
        int diff = arr[0] - arr[1];
        return(diff);
    }
    int multiplication(int arr[])
    {
        int prod = arr[0] * arr[1];
        return(prod);
    }
    double division(int arr[])
    {
        double quotient = 0.0d;
        if(arr[1]==0)
        {
            System.out.println("Cannot divide by zero, returning 0 as a result.");
            quotient = 0;
        }
        else
        {
            quotient = (double)(arr[0]/arr[1]);
        }
        return (quotient);
    }

    //Fibonacci series
    void fibonacci(int n)
    {
        int first_term =0, second_term = 1, sum;
        for (int i = 0; i < n; i++)
        {
            System.out.print(first_term+" ");
            sum = first_term+second_term;
            first_term = second_term;
            second_term = sum;

        }
        System.out.println();
        
    }
    

}
