class Pattern244{
public static void main(String[] args){

for(int i=1;i<=5;i++){
int x=1;
int y=2;
for(int j=1;j<=i;j++){

if(i%2==1){

	System.out.print(x+" ");
	x+=2;
	
	}else{
	System.out.print(y+" ");
	   	 y+=2;
           
	}

} 


System.out.println();
}
}
}