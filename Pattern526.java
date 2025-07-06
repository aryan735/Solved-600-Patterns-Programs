public class Pattern526{
public static void main(String[] args){
int x=4,y=4;
for(int i=1;i<=4;i++){
	for(int j=1;j<=8;j++){
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
x=2;
y=8;
for(int i=4;i>=1;i--){
	for(int j=1;j<=8;j++){
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