package com.rahul.singletons;

/*public class ThreadSafeSingletonSynchronized {
private static   ThreadSafeSingletonSynchronized _threadsafe;

ThreadSafeSingletonSynchronized(){}

public static  ThreadSafeSingletonSynchronized  get_threadsafe() {
	if(_threadsafe==null) {
		synchronized (ThreadSafeSingletonSynchronized.class) {
			
		if(_threadsafe==null) {
		_threadsafe = new ThreadSafeSingletonSynchronized();
	}
		}
	}
	return _threadsafe;
}

*/

public class ThreadSafeSingletonSynchronized {    /// Using Private static inner class  //Bill pugh singleton 

    private ThreadSafeSingletonSynchronized(){}
    
    private static class SingletonHelper{
        private static final ThreadSafeSingletonSynchronized INSTANCE = new ThreadSafeSingletonSynchronized();
    }
    
    public static ThreadSafeSingletonSynchronized get_threadsafe(){
        return SingletonHelper.INSTANCE;
    }
}