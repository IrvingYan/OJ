package DynamicProgramming;

/**
 * Created by yandong on 2017/4/26.
 */
public class Bags01 {
    class Knapsack{
        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        private int weight;
        private int value;
    }

    public static void main(String[] args){

    }

    public int getBestValue(Knapsack[] bags, int totalWeight){
        int n = bags.length;
        int[][] bestValues = new int[n+1][totalWeight+1];
        int bestValue = 0;
        for(int j=0;j<=totalWeight;j++){//遍历称重
            for(int i=0;i<=n;i++){//遍历物品
                if(i == 0 || j == 0){//称重=0或不放入物品价值为0
                    bestValues[i][j] = 0;
                }
                else{
                    if(j<bags[i-1].getWeight()){//第I件物品重量大于之前的总重J时，不放入
                        bestValues[i][j] = bestValues[i-1][j];
                    }
                    else{
                        int weight = bags[i-1].getWeight();
                        int value = bags[i-1].getValue();
                        bestValues[i][j] = Math.max(bestValues[i-1][j],value + bestValues[i-1][j-weight]);
                    }
                }
            }
        }
        bestValue = bestValues[n][totalWeight];
        return bestValue;
    }





}
