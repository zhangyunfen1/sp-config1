package zyf.tets;

public class TicketRunnable implements Runnable {
	private int ticket = 10;
	public void run() {
		while(true) {
			if(ticket<=0) {
				break;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("�߳�:"+Thread.currentThread().getName()
					+"��ʣƱ��:"+ticket--);
		}
		
	}
	public static void main(String[] args) {
		TicketRunnable target = new TicketRunnable();
		Thread w1 = new Thread(target,"����һ");
		Thread w2 = new Thread(target,"���ڶ�");
		Thread w3 = new Thread(target,"������");
		w1.start();
		w2.start();
		w3.start();
	}
}
