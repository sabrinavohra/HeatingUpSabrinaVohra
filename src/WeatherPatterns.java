import java.util.ArrayList;

/**
 * The class WeatherPatterns finds the longest span of days in which
 * each day’s temperature is higher than on the previous day in that sequence.
 *
 * @author Zach Blick
 * @author Sabrina Vohra
 */

public class WeatherPatterns {
    /**
     * Longest Warming Trend
     *
     * @param temperatures
     * @return the longest run of days with increasing temperatures
     */

    public static int longestWarmingTrend(int[] temperatures) {
        // TODO: Write your code here!
        ArrayList[] list = new ArrayList[temperatures.length];

        // Create adjacency list to hold values for each node that lead to it
        for (int i = 0; i < temperatures.length; i++) {
            for (int j = 0; j < i; j++) {
                if (temperatures[j] < temperatures[i]) {
                    // Saves index of lower value
                    list[i].add(j);
                }
            }
        }
        return LongestPathTo(temperatures.length);
    }

    public static int LongestPathTo(int index) {
        int len = 0;
        for (int i = 0; i < index; i++) {
            len = Math.max(len, LongestPathTo(i));
        }
        return len + 1;
    }


    //        // Goal: find the longest streak of increasing numbers, not necessarily consecutive
//        // Find outliers? Find the highest values towards the beginning of the list and dis-include them? Sort by a high value found between lower values
//
//        // Pseudocode idea:
//            // Sort list by lowest to highest values
//                // Use the lowest value to start the list of values
//                // Find the closest nearby value that is greater than
//
//        int currentHighest = 1;
//        int currentLongest = 0;
//        int totalLongest = 0;
//        for(int i = 0; i < temperatures.length; i++) {
//            recurse(temperatures, 0, currentLongest, currentHighest, totalLongest);
//        }
//        // Starts at the next index every time so the list can start at later points
////        for(int i = 0; i < temperatures.length; i++) {
////            for(int j = 0; j < temperatures.length; j++) {
////                if(temperatures[j] > currentHighest) {
////                    currentHighest = temperatures[j];
////                    currentLongest++;
////                }
////            }
////            if(currentLongest > totalLongest) {
////                totalLongest = currentLongest;
////            }
////        }
//        return totalLongest;
//    }
    // Recursive approach
    // Idea: move through each possible next temperature and add it to the current list and see if it works
    // Have multiple different lists to add to and check so that numbers can be added or not added
    public static void recurse(int[] temperatures, int index, int currentLongest, int currentHighest, int totalLongest) {
//        if(index > temperatures.length) {
//            return;
//        }
//        if(temperatures[index] > currentHighest) {
//            currentLongest++;
//            currentHighest = temperatures[index];
//        }
//        if(currentLongest > totalLongest) {
//            totalLongest = currentLongest;
//        }
//
//        recurse(temperatures, index + 1, currentLongest, currentHighest, totalLongest);
//        index = index + 1;
//    }
    }
}