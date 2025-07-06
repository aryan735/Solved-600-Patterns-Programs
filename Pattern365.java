class Pattern365{
public static void main(String[] args){
int x=1;
for(int i=5;i>=1;i--){

for(int j=5;j>=i;j--){
System.out.print(" "); 	
} 
for(int k=1;k<=i;k++){
if(k==1||k==i||i==5){

System.out.print("*"); 

}else{
System.out.print(" "); 	

}	

}

System.out.println();
}
}
}