class Pattern213{
public static void main(String[] args){
for(char i='A';i<='E';i++){
char x=i;
for(int j='A';j<='E';j++){
if(x>'E'){	
	x='A';
	System.out.print(x+" ");
	x++;
	}else{
		System.out.print(x+" ");
	x++;
	}
} 


System.out.println();
}
}
}