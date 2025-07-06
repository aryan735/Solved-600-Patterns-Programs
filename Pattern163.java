class Pattern163{ 
public static void main(String[] args){
char x='A',y='A',a='0',z='0';
for(int i=5;i>=1;i--){
for( int j=5;j>=i;j--){
System.out.print(" ");
 }	
for(int k=2*i+1;k>=3;k--){	
System.out.print("*");
}
System.out.println();
}


}
}



