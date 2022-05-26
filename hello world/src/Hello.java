public class Hello {
	public static void main(String[] args) {
		String s = "     ";
		for(int i = 1;i<=5;i++) {
			if(s.length()>=1){s = s.substring(1);}
			System.out.print(s+i);
			for(int j=1;j<i;j++) {
				System.out.print(i);
				System.out.print(i);
			}
			System.out.println("");
		}
	}
}