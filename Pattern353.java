class Pattern353{
public static void main(String[] args){
int x=1;
for(int i=1;i<=5;i++){

for(int j=1;j<=i;j++){

if(j==1||j==i||i==5){	


	System.out.print(x+" ");
	x++;
	
	}else{
	
	   		System.out.print("   "); 
           
	}
} 

System.out.println();
}
}
}