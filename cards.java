/********************Card Sort****************************\
 |***************By: Richard Felix*************************|
 \*********************************************************/

import java.util.*;
import java.io.*;

public class Practice {

    static ArrayList<Integer> SortedArrayList = new ArrayList<Integer>();
    static ArrayList<Integer> deckArray = new ArrayList<Integer>();
    static String inputSizeString = null;//

    public static void main(String args[]) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter a Deck Size Here:");
            inputSizeString = br.readLine();

        } catch (IOException ioe) {

            System.exit(1);
        }

        int inputSizeint = Integer.parseInt(inputSizeString);

        swap(inputSizeint);
        System.out.println(SortedArrayList);
    }

    public static void swap( int sizeOfDeck ){

        for( int x=0; x < sizeOfDeck; x++)
            deckArray.add(x);

        for( int x=0; x <sizeOfDeck; x++)
            SortedArrayList.add(0);

        for( int x=1; x < sizeOfDeck + 1; x++){

            SortedArrayList.set(deckArray.get(0), x);
            deckArray.remove(0);

            if( !deckArray.isEmpty() ) {
                deckArray.add(deckArray.get(0));
                deckArray.remove(0);
            }
        }
    }
}

