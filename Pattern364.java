class Pattern364{
public static void main(String[] args){
int x=1;
for(int i=5;i>=1;i--){

for(int j=1;j<=i;j++){
System.out.print(" "); 	
} 
for(int k=5;k>=i;k--){
if(k==5||k==i||i==1){

System.out.print(x); 
x++;
}else{
System.out.print(" "); 	

}	

}

System.out.println();
}
}
}