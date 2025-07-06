class Pattern143{ 
public static void main(String[] args){
int x=1,y=0;
for(int i=1;i<=5;i++){

for( int j=5;j>=i;j--){
System.out.print(" ");
 }	
for(int k=3;k<=2*i+1;k++){
if(k==3){
System.out.print(x);
y=x;
}else{
	y--;
System.out.print(y);

}
} 
x+=2;
System.out.println();
}
}
}

