package zyf.tets;

public class TestThread1 extends Thread {
	private Integer ticket = 10;		
	
	//ִ��ҵ����д����run����
	@Override
	public void run() {
		
		//ҵ������Ʊ��Ʊ�C
			while(true) {		//�̷߳ǳ��࣬���뾡��������Դ
				
				synchronized (this) {	//������
				//�ж�һ����������ȥ����
					if(ticket<=0) {	//���߳̿���ticket=-1
						break;		//�˳���ѭ��
					}
				
				//�����֣��߳�run����ִ��̫�죬���ᷢ���̳߳�ͻ
				try {	//�����׳��쳣���׳��Ͳ�����дrun����
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("����:" + Thread.currentThread().getName() 
						+"ʣ��Ʊ��:" + ticket-- );
			}
		}
	}
	
	//3�����ڶ�����һ��Ʊ
	public static void main(String[] args) {
		//Ŀ��
		TestThread1 target = new TestThread1();
		
		for(int i=0; i<3; i++) {
			new Thread(target).start();		//3���̹߳�ͬ����һ��target
		}
		//System.out.println(2);
	}

}
