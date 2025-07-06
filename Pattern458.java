public class Pattern458{
public static void main(String[] args){
int x=7;char y='G'; char b1=0,c=0;
for(int i=1;i<=4;i++){
char a='A'; 
b1=y;
for(int j=1;j<=7;j++){
if(j<=i){
System.out.print(a);a++;
}else if(j>=x){
	if(y=='D'){
		b1++;
		System.out.print(b1);

	}else{
System.out.print(b1);
	b1++;}
}else{
System.out.print(" ");

}
}
y--;
x--;
System.out.println();
}
x=5;
 y='E';
 for(int i=3;i>=1;i--){
char a='A'; 
b1=y;
for(int j=1;j<=7;j++){
if(j<=i){
System.out.print(a);a++;
}else if(j>=x){
System.out.print(b1);
	b1++;
}else{
System.out.print(" ");

}
}
y++;
x++;
System.out.println();
}
}}