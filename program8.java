/*Write a program to print the reverse from 80 - 10.
Output: 80,79,78,77,..10*/
class Code8{
	public static void main(String[] args){
		for(int i=80;i>=10;i--){
			System.out.print(i);
			if(i>10){
				System.out.print(",");
			}
		}
	}
}

