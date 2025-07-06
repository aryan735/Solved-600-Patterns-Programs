class Pattern325{

public static void main(String[] args){
char x='E';
for(char i ='A';i<='E';i++){
for(char j ='A';j<='E';j++){
if(j==i||j==x){
System.out.print(i);
}


else{
	System.out.print(" ");

}
}
x--;
System.out.println();}}

}