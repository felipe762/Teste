package br.com.utils.common;

public class Delayer {
	
	private long startTime;
	private long poolingInterval;
	
	public Delayer(long poolingInterval) {
		startTime = System.currentTimeMillis();
		this.poolingInterval = poolingInterval == 0L ? 0 : poolingInterval;
		
	}
	
	public long getDiffWithCurrentTime() {
		
		try {
			Thread.sleep(poolingInterval);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return System.currentTimeMillis() - startTime;
	}
}
