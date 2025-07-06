class Pattern146{ 
public static void main(String[] args){
int x=5,y=0;
for(int i=1;i<=5;i++){
y=x;
for( int j=5;j>=i;j--){
System.out.print(" ");
 }	
for(int k=3;k<=2*i+1;k++){


System.out.print(y);
y--;

} 
x++;
System.out.println();
}
}
}

