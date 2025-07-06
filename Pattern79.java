class Pattern79{ 
public static void main(String[] args){
int x=17,y=3,z=0;
for(int i=4;i>=1;i--){
  
for(int j=1;j<=i;j++){
 if(j==1){
	System.out.print(x+" ");
	z=x;
	x-=y;
	}else{
		z++;
		System.out.print(z+" ");
           
	}
 } 
  	y--;	
System.out.println();
}
}
}