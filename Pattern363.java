class Pattern363{
public static void main(String[] args){

for(int i=5;i>=1;i--){
int x=i;
for(int j=1;j<=i;j++){
System.out.print(" "); 	
} 
for(int k=5;k>=i;k--){
if(k==5||k==i||i==1){
System.out.print(x); 

}else{
System.out.print(" "); 	

}	
x++;
}

System.out.println();
}
}
}