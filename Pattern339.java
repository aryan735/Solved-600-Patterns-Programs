class Pattern339{
public static void main(String[] args){
char x='x';
char o='o';
for(int i=1;i<=5;i++){

for(int j=1;j<=5;j++){

if(j%2==0){	


	System.out.print(x+" ");
	}else{
	
	   		System.out.print(o+" "); 
           
	}
} 
char temp=o;
o=x;
x=temp;

System.out.println();
}
}
}