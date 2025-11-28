class test {
    public static void main(String[] args) {
        int i_n = 2;
        int j_n = 8;
        int i,j;
        
        for(i=0;i<j_n;i++){
            System.out.print("*");
        }
        System.out.println();
        for(i=0; i<i_n; i++){
            for(j=0;j<j_n;j++){
                if(j>0 && j<7){
                   System.out.print(" "); 
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for(i=0;i<j_n;i++){
            System.out.print("*");
        }
    }
}
