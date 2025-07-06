public class Pattern456{
public static void main(String[] args){
int x=7;int y=1; int b=1,b1=0,c=0;
for(int i=1;i<=4;i++){
int a=1; b1=b;
for(int j=1;j<=7;j++){
if(j<=i){
System.out.print(a);a++;
}else if(j>=x){
	if(b==4){
		b1--;
		System.out.print(b1);

	}else{
System.out.print(b1);
	b1--;}
}else{
System.out.print(" ");

}
}
y++;b++;
x--;
System.out.println();
}
x=5;b=3; 
for(int i=3;i>=1;i--){
int a1=1;  c=b;
for(int j=1;j<=7;j++){
if(j<=i){
System.out.print(a1);a1++;
}else if(j>=x){
System.out.print(c);c--;
}else{
System.out.print(" ");

}
}
x++;y++;b--;
System.out.println();
}
}}