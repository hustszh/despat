package org.sum.obepat.obsever.pull;

public interface IObserver {
	
	void update(Subject sub, Object arg);
}
