
public class BlackJack {
	public static int condition(int num1, int num2){
		if(num1>21&num2>22){
			return 0;
		}
		else if(num1<22&num2<22&num1>num2){
			return num1;
		}
		else if(num1<22&num2<22&num2>num1){
			return num2;
		}
		else if(num1<22&num2>22){
			return num1;
		}
		else if(num1>22&num2<22){
			return num2;
		}
		else{
			return 0;
		}
				
		}

}
