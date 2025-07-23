import java.util.*;

class Solution {
    static class Item {
        int value, weight;
        double ratio;
        
        Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
            this.ratio = (double)value / weight;
        }
    }
    
    double fractionalKnapsack(int[] values, int[] weights, int W) {
        int n = values.length;
        Item[] items = new Item[n];
        
        for (int i = 0; i < n; i++) {
            items[i] = new Item(values[i], weights[i]);
        }
        
        // Sort by value-to-weight ratio in descending order
        Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));
        
        double totalValue = 0.0;
        
        for (Item item : items) {
            if (W >= item.weight) {
                totalValue += item.value;
                W -= item.weight;
            } else {
                totalValue += item.ratio * W;
                break;
            }
        }
        
        return totalValue;
    }
}
