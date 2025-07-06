class Pattern80{ 
public static void main(String[] args){
int x=0,y=4,z=0;
for(int i=5;i>=1;i--){
  x=i;
  int t=y;
for(int j=1;j<=i;j++){
 if(j==1){
	System.out.print(x+" ");
	z=x;
	
	}else{
	z+=t;
		System.out.print(z+" ");
           t--;
	}
 } 

System.out.println();
}
}
}