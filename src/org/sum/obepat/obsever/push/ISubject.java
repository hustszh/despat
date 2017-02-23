package org.sum.obepat.obsever.push;

public interface ISubject {

	void registerObserver(IObserver oberserver);
	void removeObserver(IObserver oberserver);
	void notifyObservers();
}
