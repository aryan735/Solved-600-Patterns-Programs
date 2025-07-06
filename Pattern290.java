class Pattern290{
public static void main(String[] args){
for(int i=5;i>=1;i--){
for(int j=5;j>=1;j--){
	if(j>i){
		System.out.print(" ");
	}else{
if(i%2==1){
System.out.print(i+" ");
}else{
System.out.print("* ");

	}}
}
System.out.println();
}
}


}