class Pattern214{
public static void main(String[] args){
int x=5;
for(char i='A';i<='E';i++){
for(int j='A';j<='E';j++){
if(j>i){	

	System.out.print(i+" ");

	}else{
		System.out.print(x+" ");

	}
} 
x--;

System.out.println();
}
}
}