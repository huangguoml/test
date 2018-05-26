package com.bjsxt.base.sync001;

import static org.junit.Assert.*;

import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Test;

/**
 * 绾跨▼瀹夊叏姒傚康锛氬綋澶氫釜绾跨▼璁块棶鏌愪竴涓被锛堝璞℃垨鏂规硶锛夋椂锛岃繖涓璞″缁堥兘鑳借〃鐜板嚭姝ｇ‘鐨勮涓猴紝閭ｄ箞杩欎釜绫伙紙瀵硅薄鎴栨柟娉曪級灏辨槸绾跨▼瀹夊叏鐨勩��
 * synchronized锛氬彲浠ュ湪浠绘剰瀵硅薄鍙婃柟娉曚笂鍔犻攣锛岃�屽姞閿佺殑杩欐浠ｇ爜绉颁负"浜掓枼鍖�"鎴�"涓寸晫鍖�"
 * @author alienware
 *
 */
public class MyThread extends Thread{
	
	private int count = 5 ;
	
	//synchronized鍔犻攣
	public void run(){
		count--;
		System.out.println(this.currentThread().getName() + " count = "+ count);
	}
	
	public static void main(String[] args) {
		/**
		 * 鍒嗘瀽锛氬綋澶氫釜绾跨▼璁块棶myThread鐨剅un鏂规硶鏃讹紝浠ユ帓闃熺殑鏂瑰紡杩涜澶勭悊锛堣繖閲屾帓瀵规槸鎸夌収CPU鍒嗛厤鐨勫厛鍚庨『搴忚�屽畾鐨勶級锛�
		 * 		涓�涓嚎绋嬫兂瑕佹墽琛宻ynchronized淇グ鐨勬柟娉曢噷鐨勪唬鐮侊細
		 * 		1 灏濊瘯鑾峰緱閿�
		 * 		2 濡傛灉鎷垮埌閿侊紝鎵цsynchronized浠ｇ爜浣撳唴瀹癸紱鎷夸笉鍒伴攣锛岃繖涓嚎绋嬪氨浼氫笉鏂殑灏濊瘯鑾峰緱杩欐妸閿侊紝鐩村埌鎷垮埌涓烘锛�
		 * 		   鑰屼笖鏄涓嚎绋嬪悓鏃跺幓绔炰簤杩欐妸閿併�傦紙涔熷氨鏄細鏈夐攣绔炰簤鐨勯棶棰橈級
		 */
		MyThread myThread = new MyThread();
		Thread t1 = new Thread(myThread,"t1");
		Thread t2 = new Thread(myThread,"t2");
		Thread t3 = new Thread(myThread,"t3");
		Thread t4 = new Thread(myThread,"t4");
		Thread t5 = new Thread(myThread,"t5");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
	@Test
	public void testName() throws Exception {
		System.out.println("12121");
	}
}












