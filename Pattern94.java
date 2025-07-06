class Pattern94{ 
public static void main(String[] args){
char x='A', a='0';
int y=1 ;
for(char j='A';j<='E';j++){
for(char i='A';i<=j;i++){
if(i=='A'){
System.out.print(x+" ");
 a=x;
x+=y;

}else{
	a++;
System.out.print(a+" ");

}
 } 
y++;
System.out.println();
}
}
}