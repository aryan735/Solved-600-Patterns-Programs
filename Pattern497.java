public class Pattern497{
public static void main(String[] args){

for(int i=4;i<=7;i++){
	for(int j=7;j>=i;j--){
		System.out.print(" ");

	}
for(int k=1;k<=i;k++){
if(k==1||i==7){
System.out.print("*");
}else{
System.out.print(" ");
}
}
System.out.println();
}for(int i=6;i>=4;i--){
	for(int l=7;l>=i;l--){
		System.out.print(" ");

	}
	for(int j=4;j>=i;j--){
		System.out.print(" ");

	}
for(int k=1;k<=i;k++){
if(k==1){
System.out.print("*");
}else{
System.out.print(" ");
}
}
System.out.println();
}
}}