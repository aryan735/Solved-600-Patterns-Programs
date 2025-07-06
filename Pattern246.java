class Pattern246{
public static void main(String[] args){
char y='A';int x=1;
for(int i=1;i<=5;i++){

for(int j=1;j<=i;j++){

if(i%2==1){

	System.out.print(x+" ");
	x++;
	
	}else{
		
	System.out.print(y+" ");
	   	 y++;
           
	}

} 


System.out.println();
}
}
}