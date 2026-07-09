package Queue;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class StockMarketGainLoss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Queues to maintain FIFO order for shares and their respective prices
        Queue<Integer> shareQueue = new LinkedList<>();
        Queue<Integer> priceQueue = new LinkedList<>();
        int totalGainLoss = 0;

        while (true) {
            System.out.print("Enter your query (In format 'Buy / Sell x shares at $y each') or 'exit': ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit") || input.isEmpty()) {
                break;
            }

            try {
                // Parsing input string: e.g., "Buy 100 shares at $10 each"
                String[] parts = input.split(" ");
                String action = parts[0];
                int xShares = Integer.parseInt(parts[1]);
                int yPrice = Integer.parseInt(parts[4].replace("$", ""));

                if (action.equalsIgnoreCase("Buy")) {
                    System.out.println("Buying now...");
                    shareQueue.add(xShares);
                    priceQueue.add(yPrice);
                } 
                else if (action.equalsIgnoreCase("Sell")) {
                    System.out.println("Selling the shares now...");
                    int sharesToSell = xShares;
                    int currentGainLoss = 0;

                    while (sharesToSell > 0 && !shareQueue.isEmpty()) {
                        int oldestShares = shareQueue.peek();
                        int purchasePrice = priceQueue.peek();

                        if (oldestShares <= sharesToSell) {
                            // Sell all shares from this oldest batch
                            currentGainLoss += oldestShares * (yPrice - purchasePrice);
                            sharesToSell -= oldestShares;
                            shareQueue.poll();
                            priceQueue.poll();
                        } else {
                            // Sell only a portion of the oldest batch
                            currentGainLoss += sharesToSell * (yPrice - purchasePrice);
                            // Update remaining shares in the queue
                            int remainingInBatch = oldestShares - sharesToSell;
                            ((LinkedList<Integer>) shareQueue).set(0, remainingInBatch);
                            sharesToSell = 0;
                        }
                    }

                    if (sharesToSell > 0) {
                        System.out.println("No more shares left to sell!");
                    }
                    
                    totalGainLoss += currentGainLoss;
                    System.out.println("Total Capital Gain/Loss: " + totalGainLoss);
                }

                System.out.println("Queue for Share: " + shareQueue);
                System.out.println("Queue for Price: " + priceQueue);

            } catch (Exception e) {
                System.out.println("Invalid input format. Please use: Buy/Sell x shares at $y each");
            }
        }

        System.out.println("Final Capital Gain/Loss: " + totalGainLoss);
        scanner.close();
    }
}