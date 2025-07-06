class Pattern95{ 
public static void main(String[] args){
char x='A', a='0';
int y=1 ;
for(char j='E';j>='A';j--){
for(char i='A';i<=j;i++){
System.out.print(" ");
 }
for(char k='E';k>=j;k--){
System.out.print("*");

} 

System.out.println();
}
}
}