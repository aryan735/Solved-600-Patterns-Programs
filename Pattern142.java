class Pattern142{ 
public static void main(String[] args){
for(int i=1;i<=5;i++){
int x=1;
for( int j=5;j>=i;j--){
System.out.print(" ");
 }	
for(int k=3;k<=2*i+1;k++){

System.out.print(x);
x++;
} 

System.out.println();
}
}
}

