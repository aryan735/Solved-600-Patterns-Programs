class Pattern282{
public static void main(String[] args){
	int x=5;
for(int i =1;i<=5;i++){
char y='*';
for(int j=1;j<=5;j++){
if(j>=i){
if(i%2==1){
System.out.print(x);
}else{
System.out.print(y);

}}else{
System.out.print(" ");

}
}
x--;
System.out.println();
}
}
}