import java.util.HashMap;

/*
 * by wh
 * 
 * find the indicies of the two digits with the sum is the required number.
 */

public class HandOver {

	public static void main(String args[]) {
		System.out.println("Hello My HomeWork");
		Integer[] interger = {1,2,3,4,5,6,7,8,9,0};
		System.out.println(findIndicies(interger, 10));
	}
	
	// ˼����������������ݵ�ֵ��һ���Ļᷢ��ʲô���飿 MAP�������������Keyһ����Ԫ�ء�
	public static String findIndicies(Integer inputNumbers[], int nSum) {

		String strResult = "";

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < inputNumbers.length; i++) {
			map.put(inputNumbers[i], i);
		}

		for (int i = 0; i < inputNumbers.length; i++) {
			if (map.containsKey(nSum - inputNumbers[i])) {
				strResult += "�±��� : " + i + " �� " + map.get(nSum - inputNumbers[i]) + " ��Ԫ�صĺ���: " + nSum + "\r\n";
				map.remove(inputNumbers[i]);
				map.remove(nSum - inputNumbers[i]);
			}
		}
		return strResult;
	}

}
