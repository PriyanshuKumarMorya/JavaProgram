package StockTradingPlatformTask2;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.*;

public class StockTradingPlatform extends JFrame {

    // STOCK CLASS
    static class Stock {
        private String symbol;
        private String name;
        private double price;

        public Stock(String symbol, String name, double price) {
            this.symbol = symbol;
            this.name = name;
            this.price = price;
        }

        public String getSymbol() { return symbol; }
        public String getName() { return name; }
        public double getPrice() { return price; }
    }

    // PORTFOLIO CLASS
    static class Portfolio {
        private HashMap<String, Integer> holdings = new HashMap<>();
        private double balance = 100000;

        public double getBalance() {
            return balance;
        }

        public void buyStock(Stock stock, int qty) {
            double cost = stock.getPrice() * qty;

            if (cost > balance) {
                JOptionPane.showMessageDialog(null, "Insufficient Balance!");
                return;
            }

            balance -= cost;
            holdings.put(stock.getSymbol(),
                    holdings.getOrDefault(stock.getSymbol(), 0) + qty);

            JOptionPane.showMessageDialog(null,
                    "Bought " + qty + " shares of " + stock.getSymbol());
        }

        public void sellStock(Stock stock, int qty) {
            int owned = holdings.getOrDefault(stock.getSymbol(), 0);

            if (owned < qty) {
                JOptionPane.showMessageDialog(null, "Not enough shares!");
                return;
            }

            holdings.put(stock.getSymbol(), owned - qty);

            if (holdings.get(stock.getSymbol()) == 0) {
                holdings.remove(stock.getSymbol());
            }

            balance += stock.getPrice() * qty;

            JOptionPane.showMessageDialog(null,
                    "Sold " + qty + " shares of " + stock.getSymbol());
        }

        public String getPortfolio(ArrayList<Stock> market) {
            StringBuilder sb = new StringBuilder();

            sb.append("Balance: ₹").append(balance).append("\n\n");

            double total = balance;

            for (String symbol : holdings.keySet()) {
                int qty = holdings.get(symbol);

                for (Stock s : market) {
                    if (s.getSymbol().equals(symbol)) {
                        double value = qty * s.getPrice();
                        total += value;

                        sb.append(symbol)
                                .append(" | Qty: ").append(qty)
                                .append(" | Value: ₹").append(value)
                                .append("\n");
                    }
                }
            }

            sb.append("\nTotal Portfolio Value: ₹").append(total);

            return sb.toString();
        }
    }

    //  DATA
    private ArrayList<Stock> market = new ArrayList<>();
    private Portfolio portfolio = new Portfolio();

    private JTable table;
    private DefaultTableModel model;

    private JComboBox<String> stockBox;
    private JTextField qtyField;
    private JTextArea output;

    public StockTradingPlatform() {

        // FRAME
        setTitle("Stock Trading Platform");
        setSize(800, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // MARKET DATA
        market.add(new Stock("TCS", "Tata Consultancy Services", 3800));
        market.add(new Stock("INFY", "Infosys", 1650));
        market.add(new Stock("RELIANCE", "Reliance Industries", 2900));
        market.add(new Stock("HDFC", "HDFC Bank", 1750));

        //  TABLE
        model = new DefaultTableModel(new String[]{"Symbol", "Name", "Price"}, 0);
        table = new JTable(model);
        loadMarket();

        add(new JScrollPane(table), BorderLayout.NORTH);

        //  INPUT PANEL
        JPanel panel = new JPanel();

        stockBox = new JComboBox<>();
        for (Stock s : market) {
            stockBox.addItem(s.getSymbol());
        }

        qtyField = new JTextField(5);

        JButton buyBtn = new JButton("BUY");
        JButton sellBtn = new JButton("SELL");
        JButton portfolioBtn = new JButton("PORTFOLIO");

        panel.add(new JLabel("Stock:"));
        panel.add(stockBox);

        panel.add(new JLabel("Qty:"));
        panel.add(qtyField);

        panel.add(buyBtn);
        panel.add(sellBtn);
        panel.add(portfolioBtn);

        add(panel, BorderLayout.CENTER);

        // OUTPUT
        output = new JTextArea(15, 50);
        add(new JScrollPane(output), BorderLayout.SOUTH);

        // ACTIONS
        buyBtn.addActionListener(e -> buyStock());
        sellBtn.addActionListener(e -> sellStock());
        portfolioBtn.addActionListener(e -> showPortfolio());
    }

    // LOAD MARKET
    private void loadMarket() {
        model.setRowCount(0);

        for (Stock s : market) {
            model.addRow(new Object[]{
                    s.getSymbol(),
                    s.getName(),
                    "₹" + s.getPrice()
            });
        }
    }

    //BUY
    private void buyStock() {
        try {
            String symbol = (String) stockBox.getSelectedItem();
            int qty = Integer.parseInt(qtyField.getText());

            for (Stock s : market) {
                if (s.getSymbol().equals(symbol)) {
                    portfolio.buyStock(s, qty);
                    break;
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Enter valid quantity!");
        }
    }

    // SELL
    private void sellStock() {
        try {
            String symbol = (String) stockBox.getSelectedItem();
            int qty = Integer.parseInt(qtyField.getText());

            for (Stock s : market) {
                if (s.getSymbol().equals(symbol)) {
                    portfolio.sellStock(s, qty);
                    break;
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Enter valid quantity!");
        }
    }

    // PORTFOLIO
    private void showPortfolio() {
        output.setText(portfolio.getPortfolio(market));
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new StockTradingPlatform().setVisible(true);
        });
    }
}
