class Pattern333{

public static void main(String[] args){
int x=2,y=2;
for(int i =1;i<=5;i++){
for(int  j =1;j<=5;j++){
if(j==3){
if(i>3){
x+=2;
System.out.print(x);
}else{
System.out.print(x);
}
}else if(i==3){
if(j>3){
y++;
System.out.print(y);
}else{
System.out.print(y);
y--;
}

}
else{
	System.out.print(" ");

}
}
x--;

System.out.println();}}

}