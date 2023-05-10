import java.util.*;

public class LongestIncrSubseq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size:");
		int n = sc.nextInt();
		
		System.out.println("Enter the sequence: ");
		
		List<Integer> NumList = new ArrayList<Integer>();
		
		while(n!=0) {
			NumList.add(sc.nextInt());
			n--;
		}
		
		int count = 0;
		int storecount =0;
		int index = 0;
		
		for(int i=0; i<NumList.size()-1; i++) {
			if(NumList.get(i)<NumList.get(i+1)) {
				count++;
			}
			else {
				if(storecount < count) {
					storecount = count;
					index = i;
				}
				count=0;
			}
		}
		for(int i =index-storecount; i<=index; i++ ) {
			System.out.print(NumList.get(i) + " ");
		}
	}

}
