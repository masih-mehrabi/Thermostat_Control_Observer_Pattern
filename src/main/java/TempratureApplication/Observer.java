package TempratureApplication;

public interface Observer<T> {
	void onUpdate(T newState);
}