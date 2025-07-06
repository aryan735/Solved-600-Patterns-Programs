public class Pattern525{
public static void main(String[] args){
int x=5,y=5;
for(int i=1;i<=5;i++){
	for(int j=1;j<=9;j++){
	if(j<=x||j>=y){
	System.out.print("* ");
	}else{
		System.out.print("  ");

	}
    
}
x--;
y++;
	System.out.println();
}
x+=2;
y-=2;
for(int i=4;i>=1;i--){
	for(int j=1;j<=9;j++){
	if(j<=x||j>=y){
	System.out.print("* ");
	}else{
		System.out.print("  ");

	}
    
}
x++;
y--;
	System.out.println();
}
}
}