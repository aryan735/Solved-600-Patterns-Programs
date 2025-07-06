class Pattern115{ 
public static void main(String[] args){
	
for(char i='E';i>='A';i--){
char x=i;
for( char j='A';j<=i;j++){
System.out.print(" ");
 }
for(char k='E';k>=i;k--){
if(k==1){
System.out.print(i);
}else{
System.out.print(x);
x++;

}


} 
	
System.out.println();
}
}
}

