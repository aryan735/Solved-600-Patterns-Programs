class Pattern63{ 
public static void main(String[] args){
int x=1,y=0,c=0,t=0;
for(int i=1;i<6;i++){
	
for(int j=1;j<=i;j++){
	if(j==1){
  
	System.out.print(y+" ");
	
    y=y+x;
	x=y-x;
	y=y-x;
	c=y;
	t=x;
	}else{
		
			System.out.print(c+" ");
		     c=c+t;
	t=c-t;
	c=c-t;  
	}
	
	
 } 
  	
	
System.out.println();
}
}
}