class Pattern355{
public static void main(String[] args){

for(int i=1;i<=5;i++){
int x=5;
for(int j=1;j<=i;j++){

if(j==1||j==i||i==5){	
 
	System.out.print(x+"  ");
	

	
	}else{
	
	   		System.out.print("   "); 
           
	}
		x--;
} 
x-=2;
System.out.println();
}
}
}