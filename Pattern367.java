class Pattern367{
public static void main(String[] args){
int x=1;
for(int i=5;i>=1;i--){
int y=x;
for(int j=5;j>=i;j--){
System.out.print(" "); 	
} 
for(int k=1;k<=i;k++){
if(k==1||k==i||i==5){

System.out.print(y); 
y++;
}else{
System.out.print(" "); 	

}	

}
x++;
System.out.println();
}
}
}