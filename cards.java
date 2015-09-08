/********************Card Sort****************************\
 |***************By: Richard Felix*************************|
 \*********************************************************/

import java.util.*;
import java.io.*;

public class Main {

    static ArrayList<Integer> SortedArrayList = new ArrayList<Integer>();
    static ArrayList<Integer> deckArray = new ArrayList<Integer>();
    static String inputSize = null;//

    public static void main(String args[]) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter a Deck Size Here:");
            inputSize = br.readLine(); 

        } catch (IOException ioe) {

            System.exit(1);
        }

        swap(Integer.parseInt(inputSize));
        System.out.println(SortedArrayList);
    }

    public static void swap( int sizeOfDeck ){

        for( int x=0; x < (Integer.parseInt(inputSize)  ); x++)
            deckArray.add(x);

        for( int x=0; x < (Integer.parseInt(inputSize) ); x++)
            SortedArrayList.add(0);

        for( int x=1; x < (Integer.parseInt(inputSize) + 1 ); x++){

            SortedArrayList.set(deckArray.get(0), x);
            deckArray.remove(0);

            if( !deckArray.isEmpty() ) {
                deckArray.add(deckArray.get(0));
                deckArray.remove(0);
            }
        }
    }
}

