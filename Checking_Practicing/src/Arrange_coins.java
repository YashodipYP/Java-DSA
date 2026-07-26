public class Arrange_coins {
    class Solution {
        public int arrangeCoins(int n) {

            int  coinsLeft = n;
            int nextRow = 1;
            int completedRows = 0;

            while(nextRow<=coinsLeft){

                coinsLeft -= nextRow;
                nextRow++;
                completedRows++;

            }

            return completedRows;

        }
    }
}
