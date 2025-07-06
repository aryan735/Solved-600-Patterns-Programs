class Pattern152{ 
public static void main(String[] args){
int y=0,z=0,s=5,x=1;
for(int i=5;i>=1;i--){
 
for( int j=1;j<=i;j++){
System.out.print(" ");
 }	
for(int k=3;k<=2*x+1;k++){
if(k==3){
	System.out.print(i);
	y=i;


}else{
	
	if(y==s){
			
			
		z--;
	System.out.print(z);
	 
	
	
	}else{
			y++;
		System.out.print(y);
			z=y;
	}

}
}

x++;
System.out.println();
}
}
}

