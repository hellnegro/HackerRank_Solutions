
import java.util.Scanner;

public class Plus_minus {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int positive_value = 0;
    int negative_value = 0;
    int zero_value = 0;
    
    int array_size = input.nextInt();
    int[] array = new int[array_size];
            
    for(int i = 0; i < array_size; i++){
        
    array[i] = input.nextInt();
    }

        for (int i = 0; i < array_size; i++) {
            if(array[i] > 0){
                positive_value++;
            }
            else if(array[i] < 0){
                negative_value++;
            }
            else{
                zero_value++;
            }
        }
        
        System.out.printf("%.5f\n", (float)positive_value / array_size);   
        System.out.printf("%.5f\n", (float)negative_value / array_size);
        System.out.printf("%.5f", (float)zero_value / array_size);
    
    }
    
    
}
