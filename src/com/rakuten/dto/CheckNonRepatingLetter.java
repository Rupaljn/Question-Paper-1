package com.rakuten.dto;

public class CheckNonRepatingLetter {
public static void main(String[] args) {
	String s = "Java";
	int count = 0;
for(int i = 0; i<=s.length()-1; i++){
	count = 0;
for(int j = i+1; j<=s.length()-1; j++){
	if(s.charAt(i)==s.charAt(j)){
		count++;
	}
	
}
if(count==0){
	System.out.println(s.charAt(i));
	break;
}
}	


}
}
