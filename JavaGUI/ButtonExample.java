import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonExample {
	public static void main(String [] args) {
		//创建窗体
		JFrame f = new JFrame("Demo");
		//设置窗体大小		 setSize(int width, int height)
		f.setSize(300, 250);

		//设置窗体位置，null 为空，则是将窗口设置于屏幕中央
		f.setLocationRelativeTo(null);
		//设置屏幕的背景 
		f.setBackground(Color.BLUE);
		
		//创建文本框对象
		final JTextField tf = new JTextField();
		//设定文本框的位置以及大小		x:组件在容器X轴上的起点 y:组件在容器Y轴上的起点 width:组件的长度 height:组件的高度
		tf.setBounds(75, 52, 150, 30);
		
		//创建一个button  b，定义button名称
		JButton b= new JButton("点击");
		//定义button位置，大小
		b.setBounds(50, 150, 80, 30);
		//内部类为按钮 b绑定事件监控器
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//显示的文字
				tf.setText("Hello World");
				tf.setBackground(Color.cyan);
			}
		});
		
		//创建一个button  c，定义button名称
		JButton c = new JButton("关闭");
			//一定要和   b 的位置处理好，
		c.setBounds(170, 150,80, 30);
		c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//关闭弹窗
				System.exit(0);	
			}
		});
		
		//把按钮、显示框对象加载到窗体上
		f.add(b);
		f.add(tf);
		f.add(c);
		//清空布局，添加组件
	f.setLayout(null);
	f.setVisible(true);
	
	}
}
