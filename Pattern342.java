class Pattern342{
public static void main(String[] args){
int x=7;
for(int i=1;i<=7;i++){

for(int j=1;j<=7;j++){

if(j==1||j==7||i==1||i==7){	


	System.out.print("* ");
	}else if(j==i||j==x){
		   		System.out.print("* "); 

	}else{
	
	   		System.out.print("  "); 
           
	}
} 

x--;
System.out.println();
}
}
}