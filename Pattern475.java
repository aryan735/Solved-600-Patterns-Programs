public class Pattern475{
public static void main(String[] args){
int x=5,y=5;
for(int i=5;i>=1;i--){
int y1=y;
for(int j=1;j<=9;j++){
if(j<=i){
System.out.print(j);
}else if(j>=x){
	if(y==5){
		y1--;
		System.out.print(y1);
	}else{
	System.out.print(y1);y1--;}
}else{
System.out.print(" ");

}
}
x++;
y--;
System.out.println();
}
}}