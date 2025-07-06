class Pattern385{
public static void main(String[] args){
int x=1,y=3;
char a='A',b='C';
for(int i =1;i<8;i++){
for(int j=1;j<=4;j++){
if(j==x){
System.out.print(a);

}else if(i>4&&j==y){
	System.out.print(b);
	y--;
	b--;
}else{
System.out.print(" ");

}}
a++;
x++;


System.out.println();
}
}

}