class Pattern245{
public static void main(String[] args){
int y=2;
for(int i=1;i<=5;i++){
int x=1;
int c=i;
for(int j=1;j<=i;j++){

if(i%2==1){

	System.out.print(x+" ");
	x++;
	
	}else{
		
	System.out.print(c+" ");
	   	 c--;
           
	}

} 


System.out.println();
}
}
}