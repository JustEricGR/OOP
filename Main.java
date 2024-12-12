public class Main{
    public static void main(String[] args) {
        int i=0,z=0;
        while(i<2){
            try {
                int k=0;
                while(k<3){
                    k++;
                    z+=2;
                    if(i==0) throw new IllegalArgumentException();

                }
                z+=2;
            } catch (Exception e) {
                e.getMessage();
            } finally {
                z++;
            }
            i++;
        }
        System.out.println(z);
        
    }
}