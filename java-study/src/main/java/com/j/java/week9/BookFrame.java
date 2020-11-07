package com.j.java.week9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ClassName BookFrame
 * @Description
 * @Author orange
 * @Date 2020-11-07 22:30
 **/

public class BookFrame {
    private JPanel mainPanel;
    private JPanel topPanel;
    private JPanel leftPanel;
    private JTextField nameField;
    private JButton 检查Button;
    private JTextField PriceField;
    private JTextField ISBNField;
    private JPanel centerPanel;
    private JLabel resultLable;
    private JLabel titleLable;

    public BookFrame() {
        检查Button.addActionListener(e -> {
            //点击按钮需要做的逻辑
            System.out.println("click");

            String ISBN = ISBNField.getText();
            String name = nameField.getText();
            String price = PriceField.getText();
            Book book = Book.builder().ISBN(ISBN).name(name).price(Double.valueOf(price)).build();
            BookService bs = new BookServiceImpl();
            boolean b = false;
            try {
                b = bs.uploadBook(book);
            } catch (ISBNException | NameException | PriceException ee) {
                JOptionPane.showMessageDialog(null, "上传未通过");
                resultLable.setText(book.getName()+"图书上传未通过");
            }finally {
                ISBNField.setText("");
                nameField.setText("");
                PriceField.setText("");
            }
            if (b) {
                JOptionPane.showMessageDialog(null, "上传已完成");
                resultLable.setText(book.getName()+"图书上传已完成");
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("BookFrame");
        frame.setContentPane(new BookFrame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 700);
        frame.setLocationRelativeTo(null);
//        frame.pack();
        frame.setVisible(true);
    }
}
