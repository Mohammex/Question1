public class main {

	public static void main(String[] args) {
		
		
		
	}
	
	public static double[] loan_calculator(double price, double down, double rate, int term){
		
		double[] result = {0.0, 0.0};
		
		price -= down;

        result[0] = (price * rate/12) / (1 - Math.pow(1+(rate/12), -term));
        result[1] = result[0] * term - price;

		
		return result;
	}

}
