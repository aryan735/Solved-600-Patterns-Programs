class Pattern384{
public static void main(String[] args){
int x=1,y=3;
char a='A';
for(int i =1;i<8;i++){
for(int j=1;j<=4;j++){
if(j==x){
System.out.print(a);
a++;
}else if(i>4&&j==y){
	System.out.print(a);
	y--;
	a++;
}else{
System.out.print(" ");

}}

x++;


System.out.println();
}
}

}