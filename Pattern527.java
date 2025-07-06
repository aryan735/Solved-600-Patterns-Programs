public class Pattern527{
public static void main(String[] args){
int x=4,y=5,x1=2,y1=3;
for(int i=1;i<=7;i++){
	for(int j=1;j<=7;j++){
	if(i<=4){
	if(j==x){
		System.out.print(". ");
		x--;
	}else if(j==y){
		System.out.print(". ");
		y--;
	}else{
			System.out.print("# ");
	}
	}else{
	if(j==x1){
		System.out.print(". ");
		
	}else if(j==y1){
		System.out.print(". ");
	
	}else{
			System.out.print("# ");
	}
	}
	}
	if(i>4){
	x1++;	y1++;}
	System.out.println();
}
}
}