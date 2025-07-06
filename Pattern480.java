public class Pattern480{
public static void main(String[] args){
int x=5,y=5;
for(int i=5;i>=0;i--){
int y1=y;
for(int j=1;j<=9;j++){
	if(i==5){
		
	}
else if(j<=i){
System.out.print(j);
}else if(j>=x){
	if(y==5){
		y1--;
		System.out.print(y1);
	}else if(i==1&&j==4){
		
				System.out.print("*");
				y--;

	}else{
	System.out.print(y1);y1--;}
}else{
System.out.print("*");

}
}
x++;
y--;
System.out.println();
}
}}