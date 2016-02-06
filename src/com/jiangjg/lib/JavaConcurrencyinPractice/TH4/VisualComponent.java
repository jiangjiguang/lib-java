package com.jiangjg.lib.JavaConcurrencyinPractice.TH4;

import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

//将线程安全性委托给多个状态变量
public class VisualComponent {
	private final List<KeyListener> keyListeners = new CopyOnWriteArrayList<KeyListener>();
	private final List<MouseListener> mouseListeners = new CopyOnWriteArrayList<MouseListener>();
	
	public void addKeyListeners(KeyListener listener){
		keyListeners.add(listener);
	}
	public void addMouseListeners(MouseListener listener){
		mouseListeners.add(listener);
	}
	
	public void removeKeyListener(KeyListener listener){
		keyListeners.remove(listener);
	}
	public void removeMouseListeners(MouseListener listener){
		mouseListeners.remove(listener);
	}
}
