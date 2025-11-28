class test {
    public static void main(String[] args) {
        int i,j,k;
        int num = 4;
        char ch = ' ';
        for(i=1; i<num; i++){
            for(j=num-i; j>=0; j--){
                System.out.print(" ");
            }
            for(k=1; k<=(2*i - 1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

