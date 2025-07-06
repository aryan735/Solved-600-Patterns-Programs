class Pattern114{ 
public static void main(String[] args){
	
for(char i='A';i<='E';i++){
char x=i;
for( char j='E';j>=i;j--){
System.out.print(" ");
 }
for(char k='A';k<=i;k++){
if(k==1){
System.out.print(i);
}else{
System.out.print(x);
x--;

}


} 
	
System.out.println();
}
}
}

