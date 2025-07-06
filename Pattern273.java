class Pattern273{
public static void main(String[] args){
	char x='*',y='#';
for(int i =5;i>=1;i--){
for(int j=1;j<=5;j++){
if(j>=i){
System.out.print(y);
 }else{
 System.out.print(" ");
}
}
char temp =x;
x=y;
y=temp;
System.out.println();
}
}
}