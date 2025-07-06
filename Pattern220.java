class Pattern220{
public static void main(String[] args){
int x=1;
for(int i=5;i>=1;i--){
int y=x;
for(int j=1;j<=5;j++){

if(j<i){	

		System.out.print("* ");

	}else{
		System.out.print(y+" ");
	     y--;
           
	}
} 

x++;
System.out.println();
}
}
}