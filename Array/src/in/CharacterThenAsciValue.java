package in;

public class CharacterThenAsciValue {
public static void main(String[] args) {
	char a[]= {'a','b','c','d','f'};
	int sum=0;
	for (int i = 0; i < a.length; i++) {
		sum+=a[i];
		System.out.println(a[i]+"-"+(int)a[i]);
		
	}
}
}
