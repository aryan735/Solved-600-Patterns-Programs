class Pattern148{ 
public static void main(String[] args){
int x=0,y=0,z=0;
for(int i=1;i<=5;i++){
 int temp=1;
for( int j=5;j>=i;j--){
System.out.print(" ");
 }	
for(int k=3;k<=2*i+1;k++){
if(k==3){
	System.out.print(x);
	y=x;
x++;

}else{
		
	if(y<=0){
	z=y;
		z+=temp;
	System.out.print(z);
	temp+=2;
	 y--;
	}else{
		y--;
			System.out.print(y);

	}

}
}
System.out.println();
}
}
}

