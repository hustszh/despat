package org.sum.obepat.obsever.pull;

import java.util.ArrayList;
import java.util.List;

public class Subject{

	private boolean changed = false;
	private List<IObserver> obs;
	
	public Subject() {
		obs = new ArrayList<IObserver>();
	}
	
	public void setChanged(){
		changed = true;
	}
	public void clearChanged(){
		changed = false;
	}
	public boolean hasChanged(){
		return changed;
	}
	
	public void addObserver(IObserver o){
		if (o == null)
			throw new NullPointerException();
		if (!obs.contains(o))
			obs.add(o);
	}
	public void deleteObserver(IObserver o){
		if (o == null)
			throw new NullPointerException();
		obs.remove(o);
	}
	public void clearObservers(){
		obs.clear();
	}
	public void notifyObservers(){
		notifyObservers(null);
	}
	public void notifyObservers(Object arg){
		if (!changed)
			return;
		for (int idx = 0; idx < obs.size(); idx++){
			IObserver o = obs.get(idx);
			o.update(this, arg);
		}
		clearChanged();// reset "changed" flag
	}
}
