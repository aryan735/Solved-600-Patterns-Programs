class Pattern381{
public static void main(String[] args){
int x=1,y=3;
for(int i =1;i<8;i++){
for(int j=1;j<=4;j++){
if(j==x){
System.out.print("*");

}else if(i>4&&j==y){
	System.out.print("*");
	y--;
}else{
System.out.print(" ");

}}
x++;


System.out.println();
}
}

}