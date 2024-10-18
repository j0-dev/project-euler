/* 
    If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23. 
    Find the sum of all the multiples of 3 or 5 below 1000 
*/

public class ProblemOne
{
    public static void main(String[] args)
    {
        int num = 0;
        int total = 0;

        while(num < 1000)
        {
            if(num % 3 == 0 || num % 5 == 0)
            {
                total = total + num;
            }

            num += 1;
        }

        System.out.println(total);
    }
}
