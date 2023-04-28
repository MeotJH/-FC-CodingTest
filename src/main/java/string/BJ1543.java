package string;

import java.util.Scanner;

public class BJ1543 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String doc = sc.nextLine();
        String word = sc.nextLine();

        int count = 0;
        for (int i = 0; i < doc.length(); i++) {
            boolean match = true;
            for (int j = 0; j < word.length(); j++) {

                if( (i+j) >= doc.length() ||
                    doc.charAt(i + j) != word.charAt(j)){

                    match = false;
                    break;

                }
            }

            if(match){
                count++;
                i += word.length() - 1;
            }
        }
        System.out.println(count);
    }



    /*내가 만든 코드 */
    public void mainKjh() {
        Scanner sc = new Scanner(System.in);

        String objectiveOne = sc.nextLine();
        String subjectiveOne = sc.nextLine();
        int subjectLength = subjectiveOne.length();
        int subjectEl = 0;
        int rslt = 0;
        for (int i = 0; i < objectiveOne.length(); i++) {
            char charOne = objectiveOne.charAt(i);

            if( subjectEl < subjectLength
            && subjectiveOne.charAt(subjectEl) == charOne ){
                subjectEl++;

                if( subjectEl == subjectLength ){
                    subjectEl = 0;
                    rslt++;
                }

            } else if ( subjectiveOne.charAt(subjectEl) != charOne ) {
                subjectEl = 0;

                if(subjectiveOne.charAt(subjectEl) == charOne){
                    subjectEl++;
                }
            }

        }

        System.out.println(rslt);
    }
}
