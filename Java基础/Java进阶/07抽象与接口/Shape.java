package 抽象与接口;

import java.awt.Graphics;

public abstract class Shape {
	public abstract void draw(Graphics g);
	public abstract void move(Graphics g);
	// 抽象类不能实例化
}
