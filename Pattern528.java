public class Pattern528{
public static void main(String[] args){
int x=3,y=5;
for(int i=1;i<5;i++){
	for(int j=1;j<=7;j++){
if(j>x&&j<y){
	System.out.print(". ");
}else{
		System.out.print("# ");
}
}
x--;y++;
System.out.println();
}
 x=1;y=7;
for(int i=4;i>=2;i--){
	for(int j=1;j<=7;j++){
if(j>x&&j<y){
	System.out.print(". ");
}else{
		System.out.print("# ");
}
}
x++;y--;
System.out.println();
}

}
}