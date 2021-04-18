import java.util.ArrayList;
import java.util.Scanner;

public class BaseballGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean setGame = true;
		boolean correct = false;
		
		Scanner scanner = new Scanner(System.in);
		
		while(setGame) {
			char[] ansArr = selectRandNum();
			//System.out.println(ans[0] + " " + ans[1] + " " + ans[2]);
			while(!correct) {
				System.out.println("���ڸ� �Է����ּ���.: ");
				String input  = scanner.next();
				char[] inputArr = input.toCharArray();
			}
		}
	}
	
	public static char[] selectRandNum() { //3���� ���� �ѹ� ����
		char[] ans = new char[3];
		ArrayList<Character> list = initList();
		for(int i = 0; i < 3; i++) {
			ans[i] = chooseANumber(list);
		}
		return ans;
	}
	
	public static ArrayList<Character> initList() { //���� �ѹ� �̱⸦ ���� 1~9������ ����
		ArrayList<Character> arr = new ArrayList<Character>();
		for(int i = 0; i < 9; i++) {
			arr.add(Character.forDigit(i+1, 10));
		}
		
		return arr;
	}
	
	public static char chooseANumber(ArrayList<Character> arr) { //�������� �������� �ϳ��� �̰� ������ �ش� ���� ����
		int index = (int) (Math.random() * arr.size());
		char choice = arr.get(index);
		
		arr.remove(index);
		
		return choice;
	}

}
