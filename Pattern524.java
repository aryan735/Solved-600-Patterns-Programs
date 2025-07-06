public class Pattern524{
public static void main(String[] args){
int x=3;
for(int i=1;i<=5;i++){
	for(int k=5;k>=i;k--){
		System.out.print("  ");
	}
for(int j=3;j<=i*2+1;j++){
	if(j==3||j==i*2+1||j==x||i==5){
				System.out.print("* ");

	}else{
				System.out.print("  ");
	}
}
x++;
	System.out.println();
}
x=6;
for(int i=4;i>=1;i--){
	for(int k=5;k>=i;k--){
		System.out.print("  ");
	}
for(int j=3;j<=i*2+1;j++){
	if(j==3||j==i*2+1||j==x){
				System.out.print("* ");

	}else{
				System.out.print("  ");
	}
}
x--;
	System.out.println();
}
}
}