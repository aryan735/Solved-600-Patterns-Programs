class Pattern219{
public static void main(String[] args){
for(int i=5;i>=1;i--){
int x=1;
for(int j=1;j<=5;j++){

if(j<i){	

		System.out.print("* ");

	}else{
		System.out.print(x+" ");
	
           
	}
} 

x++;
System.out.println();
}
}
}