
public class fortest {
    public static void main(String[] args) {
        int[] randomNumbers = new int[10];

        for (int index = 0; index < randomNumbers.length; index++) {
            randomNumbers[index] = (int) (Math.random() * 100);
            System.out.println(randomNumbers[index]);
        }

            int min = randomNumbers[0];
            int max = randomNumbers[0];


  for(int i =0;i<randomNumbers.length;i++){
            if (randomNumbers[i] < min) {
                min = randomNumbers[i];
            }

            if (randomNumbers[i] > max) {
                max = randomNumbers[i];
            }


            System.out.print("smallest is " + min + "largest is " + max);


        }

}}
