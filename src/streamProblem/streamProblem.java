package streamProblem;

import java.util.ArrayList;
import java.util.List;

//��Ʈ���� Ȱ���Ͽ� ��Ű�� ���� ��� ����ϱ�
/*����翡 ��Ű�� ���� ��ǰ�� �ֽ��ϴ�. 
 * ���� ����� 15�� �̻��� 100����, �� �̸��� 50���� �Դϴ�. 
 * �� �� ���� ��Ű�� ������ �����ٰ� ���� �� ��� ���� �� ��� �˻�� ���� ������ 
 * ��Ʈ���� Ȱ���Ͽ� ������ ���ϴ�.
 * ���� ���� Ŭ������ ����� ArrayList�� ���� ���� �մϴ�. 
 * 
 * �ؾ� �� ��
 * ���� ����� ����մϴ�.
 * ������ �� ����� ����մϴ�.
 * �� �� 20�� �̻��� ����� �̸��� �����Ͽ� ����մϴ�.
 * 
 */

public class streamProblem {
	
	public static void main(String[] args) {
		TravelCustomer customerLee = new TravelCustomer("�̽±�", 35, 100);
		TravelCustomer customerKim = new TravelCustomer("�赿��", 10, 50);
		TravelCustomer customerHong = new TravelCustomer("ȫ�浿", 13, 50);
		TravelCustomer customerKang = new TravelCustomer("��ȣ��", 11, 50);
		TravelCustomer customerWhang = new TravelCustomer("Ȳ�浿", 50, 100);
		
		List<TravelCustomer> customerList = new ArrayList<>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		customerList.add(customerKang);
		customerList.add(customerWhang);
		
		System.out.println("=== �� ��� �߰��� ������� ��� ===");
		//���� ��� ���
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		System.out.println("");
		//������ �� ��� ���
		int total =customerList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("�� ���� ����� : " + total + "�Դϴ�");
		
		System.out.println("");
		//20�� �̻��� ����� �̸� ����
		System.out.println("=== 20�� �̻� �� ��� �����Ͽ� ��� ===");
		customerList.stream().filter(c->c.getAge() >= 20).map(s-> s.getName()).sorted().forEach(n->System.out.println(n));
	}

}
