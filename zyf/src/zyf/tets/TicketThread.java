package zyf.tets;

import java.util.HashMap;
import java.util.Map;

public class TicketThread extends Thread {
	private int ticket = 10;
	public void run() {
		while(true) {
			if(ticket<=0) {
				break;
			}
			System.out.println("�߳�:"+Thread.currentThread().getName()
					+"��ʣƱ��:"+ticket--);
		}
		
	}
	public static void main(String[] args) {
		TicketThread t1 = new TicketThread();
//		TicketThread t2 = new TicketThread();
//		TicketThread t3 = new TicketThread();
		Thread w1 = new Thread(t1,"����һ");
		Thread w2 = new Thread(t1,"���ڶ�");
		Thread w3 = new Thread(t1,"������");
		w1.start();
		w2.start();
		w3.start();
	}
}
