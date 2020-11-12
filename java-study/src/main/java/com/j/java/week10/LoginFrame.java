package com.j.java.week10;

import com.sun.codemodel.internal.JOp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

/**
 * @ClassName LoginFrame
 * @Description
 * @Author orange
 * @Date 2020-11-12 09:05
 **/

public class LoginFrame extends JFrame {
    private JPanel mainPanel;
    private JPanel centerPanel;
    private JPanel topPanel;
    private JPanel rightPanel;
    private JPanel leftPanel;
    private JPanel bottomPanel;
    private JPanel logoPanel;
    private JPanel loginPanel;
    private JLabel logoLabel;
    private JTextField accountField;
    private JPasswordField passwordField;
    private JButton loginBtn;

    public LoginFrame() {
        //调用初始化方法
        init();

        loginBtn.addActionListener(e -> {
                String account = accountField.getText();
                char[] password = passwordField.getPassword();
                String passString = new String(password);
                if ("admin".equals(account) && "123".equals(passString)) {
                    JOptionPane.showMessageDialog(null, "success");
                    this.dispose();
//                    new MainFrame();
                } else {
                    JOptionPane.showMessageDialog(null, "failure");
                }
        });
        accountField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                accountField.setText("");
            }
        });
    }

    /**
     * 窗体初始化
     */
    private void init() {
        setTitle("LoginFrame");
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1240, 770);
        setVisible(true);
        setResizable(false);
    }

    public static void main(String[] args) {
        new LoginFrame();
//        JFrame frame = new JFrame("LoginFrame");
//        frame.setContentPane(new LoginFrame().mainPanel);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        //主界面全屏：1.通过获取屏幕尺寸设置窗体大小
//        Toolkit toolkit = Toolkit.getDefaultToolkit();
//        Dimension dimension = toolkit.getScreenSize();
//        System.out.println(dimension);
//        frame.setSize(dimension);
//
//        //2.一行代码全屏窗体
//        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        frame.setSize(1240,770);
//        frame.setVisible(true);
//        frame.setResizable(false);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
