class Pattern241{
public static void main(String[] args){
int x=1;
char y='A';
for(int i=5;i>=1;i--){

for(int j=1;j<=5;j++){

if(x%2==1){	

	System.out.print("* ");
	
	}else{
	System.out.print(y+" ");
	   	 y++;
           
	}
	x++;
} 


System.out.println();
}
}
}