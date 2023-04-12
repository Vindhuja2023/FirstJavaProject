package array;

public class EvenNumbers {

	int[] number = new int[10];


	void evenNumber() {
		
		for(int i=0;i<10;) {
			for(int k=1;k<=20;k++) {
				if(k%2==0) {
		
					number[i]=k;
					i++;
				}
				}
				
			}
		}
	}


