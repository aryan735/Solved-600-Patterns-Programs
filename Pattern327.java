class Pattern327{

public static void main(String[] args){
char x='E';
for(char i ='A';i<='E';i++){
for(char j ='A';j<='E';j++){
if(j==i){
System.out.print(x);
}else if(j==x){
System.out.print(x);

}
else{
	System.out.print(" ");

}
}
x--;
System.out.println();}}

}