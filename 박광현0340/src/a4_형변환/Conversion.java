package a4_����ȯ;

public class Conversion {

	public static void main(String[] args) {
		//��ĳ����
		//1. ���� -> ����
		char c = 'A';
		int i_c = c;
		System.out.println("���� - > ����: " + i_c);
		
		
		
		
		//�ٿ�ĳ����
        //1. ���� - > ����
		int i = 67;
	    char c_i = (char)i;
	    System.out.println("���� -> ����: " + c_i);
	    
	    int num = 100;
	    double d_num = num;
	    System.out.println("���� -> �Ǽ�: " + d_num);
	    
	    //����(num2) �Ǽ�(d_num2)
	    double d_num2 = 3.14;
	    int num2 = (int)d_num2;
	    System.out.println("�Ǽ� -> ����: " + num2);
	    //3. ���� + ����
	    Systme.out.println("���� + ����: " + (c + num));
	    
	   
	    
	    
	    
	}

}
