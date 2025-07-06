class Pattern150{ 
public static void main(String[] args){
//Tough one
int x=1,y=0,z=0,d=1,temp=2,s=1;
for(int i=1;i<=5;i++){
 
for( int j=5;j>=i;j--){
System.out.print(" ");
 }	
for(int k=3;k<=2*i+1;k++){
if(k==3){
	System.out.print(x);
	y=x;


}else{
	
	if(y==s){
			
			
		z/=temp;
	System.out.print(z);
	 
	
	
	}else{
			y*=2;
		System.out.print(y);
			z=y;
	}

}
}
s*=2;

System.out.println();
}
}
}

