package array;

import java.util.Arrays;

//Array�� Ư¡ 
//������ ������ Ÿ���� ������ ���� �����ϴ� �ڷᱸ�� 

public class MyArray {
	int[] intArr; //int array ó���� Ÿ����� ���� 
	int count; // element�� ����
	public int ARRAY_SIZE;
	public static final int ERROR_NUM = -99999999;
	
	public MyArray() {
		count = 0;
		ARRAY_SIZE = 10; //�迭ũ��
		intArr = new int[ARRAY_SIZE]; //�迭������ �ִ��ε��� 9
	} 
	 
	public MyArray(int size) {
		count = 0;
		ARRAY_SIZE = size;
		intArr = new int[size];
	}
	
	public void addElement(int num) { // ��Ұ� ���� 
		
		if(count >= ARRAY_SIZE) {//�ε����� �迭������� ���ų� ũ�� ���� 
			System.out.println("not enough memory");
			return;
		}
		intArr[count++] = num; //count�� ó������ �ε��� 0�� ����Ŵ
		// ��Ҹ� �ϳ��� �߰� ó������ 0�� ����, �׸��� 1�� ����
	}
	
	public void insertElement(int position, int num) { // ��ġ �ε��� , ���� ���� 
		//��� ��������
		int i; //�ε��� ��Ÿ�������� 
		
		if(position < 0 || position > count) { 
			//�ε����� 0���� �۰ų� count(�ִ� �ε���)���� Ŭ�� 
			return;
		}
		if(count >= ARRAY_SIZE) { 
			//addElement���� count++ �Ǿ�����
			//�ִ� �ε����� ARRAY_SIZE�� ���� �� 
			return;
		}
		
		//��ĭ�� �ڷ� �б� 
		for(i = count-1; i>=position; i--) { 
			intArr[i+1] = intArr[i]; // ��ĭ�� �ڷΰ��Ե� 
		}
		intArr[position] = num;
		count++; // ��� ������ �ϳ� �þ�� ������ �߰� 
	}
	
	public int removeElement(int position) {//�ڿ��ִ°� ������ �;ߵ� 
		
		int ret = ERROR_NUM;
		
		if(isEmpty()) {
			System.out.println("Array is empty");
			return ret;
		}
		if(position<0 || position > count-1) {//�ε������� ũ�ų� �ε��� 0���� ������ ����
			
			return ret;
			
		}
		
		ret = intArr[position];//�ε��� ��ġ ��
		for(int i = position; i<count-1; i++) {
			intArr[i] = intArr[i+1]; //�ڿ��� ������
		}
		count--;
		
		return ret;
		
	}
	
	public int getSize()
	{
		return count; // ��Ұ��� ��ȯ
	}

	
	public boolean isEmpty() //��� �ִ��� ������ Ȯ��
	{
		if(count == 0){
			return true;
		}
		else return false;
	}
	
	public int getElement(int position) // �ε��� ��ġ ��Ұ� ��ȯ
	{
		if(position < 0 || position > count-1){
			System.out.println("�˻� ��ġ ����. ���� ����Ʈ�� ������ " + count +"�� �Դϴ�.");
			return ERROR_NUM;
		}
		return intArr[position];
	}
	
	public void printAll() // ��� ���� ���
	{
		if(count == 0){
			System.out.println("����� ������ �����ϴ�.");
			return;
		}
			
		for(int i=0; i<count; i++){
			System.out.println(intArr[i]);
		}
		
	}
	
	public void removeAll() //��� ���� ����, 0���� ����
	{
		for(int i=0; i<count; i++){
			intArr[i] = 0;
		}
		count = 0;
	}
}
