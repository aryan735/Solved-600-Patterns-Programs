class Pattern354{
public static void main(String[] args){
int x=12;
for(int i=1;i<=5;i++){
int a=i;
int y=i;
for(int j=1;j<=i;j++){

if(i<5&&j==1||i<5&&j==i){	
 
	System.out.print(a+" ");
	 a=x+i;
	
	
	}else if(i==5){
		System.out.print(y+" ");
y++;
	}else{
	
	   		System.out.print("   "); 
           
	}
} 
x-=2;
System.out.println();
}
}
}