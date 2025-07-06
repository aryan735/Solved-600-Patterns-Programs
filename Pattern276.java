class Pattern276{
public static void main(String[] args){
int x=1;char y='*';	
for(int i =5;i>=1;i--){
int a=x;
for(int j=1;j<=5;j++){
if(j>=i){
if(i%2==1){
System.out.print(a);
a--;
}else{
System.out.print(y);
}
}else{
System.out.print(" ");
}
}
x++;
System.out.println();
}
}
}