package a4_형변환;

public class Conversion {

	public static void main(String[] args) {
		//업캐스팅
		//1. 문자 -> 정수
		char c = 'A';
		int i_c = c;
		System.out.println("문자 - > 정수: " + i_c);
		
		
		
		
		//다운캐스팅
        //1. 정수 - > 문자
		int i = 67;
	    char c_i = (char)i;
	    System.out.println("정수 -> 문자: " + c_i);
	    
	    int num = 100;
	    double d_num = num;
	    System.out.println("정수 -> 실수: " + d_num);
	    
	    //정수(num2) 실수(d_num2)
	    double d_num2 = 3.14;
	    int num2 = (int)d_num2;
	    System.out.println("실수 -> 정수: " + num2);
	    //3. 문자 + 정수
	    Systme.out.println("문자 + 정수: " + (c + num));
	    
	   
	    
	    
	    
	}

}
