class Pattern374{
public static void main(String[] args){
int x=5,y=5;
char a='E';
char b=a;
for(int i =1;i<10;i++){
for(int j=1;j<10;j++){
if(j==x||j==y){
if(j<=5){
System.out.print(b);
b--;
}else{
	a++;
System.out.print(a);

}

}else{
System.out.print(" ");

}}
x--;
y++;

System.out.println();
}
}

}