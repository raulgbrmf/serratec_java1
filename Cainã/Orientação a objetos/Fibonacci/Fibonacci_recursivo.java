
public class Fibonacci_recursivo 
{	
	public int calculaFibonacci(int i)
	{
		if(i == 1)
		{
			return 0;
		}
		else if(i == 2)
		{
			return 1;
		}
		
		return calculaFibonacci(i - 1) + calculaFibonacci(i - 2);
		
	}
}
