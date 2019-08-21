package 同步;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class Lock1 {
	 public static String now() {
	        return new SimpleDateFormat("HH:mm:ss").format(new Date());
	    }
	 public static void log(String msg)
	 {
		 System.out.printf("%s %s %s %n"+now(),Thread.currentThread().getName(),msg);
		 
	 }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
	Lock lock=new  ReentrantLock();
	Condition condition=lock.newCondition() ;
		
 Thread t1=new Thread()
				{
			public void run()
			{ boolean locked = false;//为trylock解开lock进行判断做出定义
				try{
					log("线程启动");
                    log("试图占有对象：lock");
                    //使用trylock
                    /*
 
                    lock.lock();
 
                    log("占有对象：lock");
                    log("进行5秒的业务操作");
                    Thread.sleep(5000);
                      log("临时释放对象 lock， 并等待");
                    condition.await();*/
                    locked = lock.tryLock(1,TimeUnit.SECONDS);
                    if(locked){
                        log("占有对象：lock");
                        log("进行5秒的业务操作");
                        Thread.sleep(5000);
                    }
                    else{
                        log("经过1秒钟的努力，还没有占有对象，放弃占有");
                    }
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				finally{
					log("log结束：释放对象");
					lock.unlock();
				}
				log("线程结束");
			}
			
			
				};
				t1.setName("t1");
				t1.start();
				
				 try {
			            //先让t1飞2秒
			            Thread.sleep(2000);
			        } catch (InterruptedException e1) {
			            // TODO Auto-generated catch block
			            e1.printStackTrace();
			        }
			        Thread t2 = new Thread() {
			 
			            public void run() {
			                try {
			                    log("线程启动");
			                    log("试图占有对象：lock");
			 
			                    lock.lock();
			 
			                    log("占有对象：lock");
			                    log("进行5秒的业务操作");
			                    Thread.sleep(5000);
			                    log("唤醒等待中的线程");
			                    condition.signal();
			  
			 
			                } catch (InterruptedException e) {
			                    e.printStackTrace();
			                } finally {
			                    log("释放对象：lock");
			                    lock.unlock();
			                }
			                log("线程结束");
			            }
			        };
			        t2.setName("t2");
			        t2.start();
//使用synchronized方式进行线程交互，用到的是同步对象的wait,notify和notifyAll方法

//Lock也提供了类似的解决办法，首先通过lock对象得到一个Condition对象，然后分别调用这个Condition对象的：await, signal,signalAll 方法
	}

}
