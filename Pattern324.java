class Pattern324{

public static void main(String[] args){
int x=5;
for(int i =1;i<=5;i++){
for(int j =1;j<=5;j++){
if(j==i){
System.out.print(x);
}else if(j==x){
System.out.print(i);

}else{
	System.out.print(" ");

}
}
x--;
System.out.println();}}

}