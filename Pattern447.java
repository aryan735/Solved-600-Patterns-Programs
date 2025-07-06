public class Pattern447{
public static void main(String[] args){
	
for(int i =1;i<=5;i++){

for(int j=3;j<=i*2+1;j++){
if(j%2==1){
System.out.print(i);
 
}else{
	
System.out.print("*");

}
}

System.out.println();
}
for(int i =4;i>=1;i--){

for(int j=3;j<=i*2+1;j++){
if(j%2==1){
System.out.print(i);
 
}else{
	
System.out.print("*");

}
}

System.out.println();
}
}
}