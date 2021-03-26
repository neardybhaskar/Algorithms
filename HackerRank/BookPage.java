package HackerRank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Bhaskar on 21-01-2021
 */
public class BookPage {

    /*public static int incrementBy1(int navPage, int currentPage) {
        int count = 0;
        while(currentPage != navPage || count == 2) {
            if(currentPage != navPage) {
                ++currentPage;
            }
            count++;
        }
        return currentPage;
    }

    public static int checkCondition(int totalPage, int goToPage) {
        int currentPage = 0;
        int count = 0;
        boolean navigatedToPage = false;
        for(int i=1;i<=totalPage;i++) {
            if(i==1){
                ++currentPage;
            } else {
                currentPage = incrementBy1(goToPage, currentPage);
                i++;
            }
            if(currentPage == goToPage) {
                return count;
            }
            count++;

        }
        return count;
    }*/

    public static int check(int nTotalpages, int pGoToPage) {
        int forwardCount = 1;
        int reverseCount = 0;
        for(int i=2;i<=nTotalpages;i+=2) {
            if(pGoToPage > i+1) {
                forwardCount++;
            }
        }

        for(int i = nTotalpages; i>=2; i-=2) {

            if(pGoToPage < i-1) {
                reverseCount++;
            }
        }
        System.out.println("forwardcount: "+forwardCount+" reverseCount: "+reverseCount);
        if(forwardCount > reverseCount) {
            return reverseCount;
        } else {
            return forwardCount;
        }
    }

    public static void main(String[] args) {
        int totalPage = 5;
        int goToPage = 3;
        check(totalPage, goToPage);
    }

}
