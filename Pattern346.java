class Pattern346{
public static void main(String[] args){
int x=5;
for(int i=1;i<=5;i++){

for(int j=1;j<=5;j++){

if(j==1||j==5||i==1||i==5||j==i||j==x){	


	System.out.print("1 ");
	}else{
	
	   		System.out.print("0 "); 
           
	}
} 
x--;
System.out.println();
}
}
}