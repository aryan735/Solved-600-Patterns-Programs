public class Pattern446{
public static void main(String[] args){
	char x='A',y='A',y1=0;
for(int i =1;i<=5;i++){
char x1=x;
for(int j=3;j<=i*2+1;j++){
if(x1<=y){
System.out.print(x1);
 y1=y;
x1++;
}else{
	y1--;
System.out.print(y1);

}
}
y++;
System.out.println();
}
x='A';y='D';y1=0;
for(int i =4;i>=1;i--){
char x1=x;
for(int j=3;j<=i*2+1;j++){
if(x1<=y){
System.out.print(x1);
 y1=y;
x1++;
}else{
	y1--;
System.out.print(y1);

}
}
y--;
System.out.println();
}
}
}