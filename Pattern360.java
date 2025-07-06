class Pattern360{
public static void main(String[] args){
int x=12,y=1;
for(int i=5;i>=1;i--){

for(int j=1;j<=i;j++){

if(j==1){	
 
	System.out.print(y+" ");
	y++;

	
	}else if(i==5||j==i){
	System.out.print(x+" ");
	x--;
	}else{
	
	   		System.out.print("   "); 
           
	}
	
} 

System.out.println();
}
}
}