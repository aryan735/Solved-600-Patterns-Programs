class Pattern108{ 
public static void main(String[] args){
	int num=1,sum=5,y=0,x=0;
for(int i=1;i<=5;i++){
for( int j=5;j>=i;j--){
System.out.print(" ");
 }
for(int k=1;k<=i;k++){
if(k==1){
	System.out.print(num);
	 y=num;
	num+=sum;
	 x=sum;

	
	}else{
	y-=x;
		System.out.print(y);
		x++;

	}
	
} 
	sum--;
System.out.println();
}
}
}