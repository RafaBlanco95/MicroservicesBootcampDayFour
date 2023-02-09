package observableworkshop;



import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;


public class MainObservable {
	public static void main(String[] args) {
	
		Observable<String> observer = Observable.just("Message1","Message2","Message3");
			
		observer.subscribe(new Observer <String>(){

			@Override
			public void onSubscribe(Disposable d) {
				System.out.println("Observer Subscribed");
				
			}

			@Override
			public void onNext(String t) {
				System.out.println("Observer Received: " + t);
				
			}

			@Override
			public void onError(Throwable e) {
				System.out.println("Observer Error: "+ e.getMessage());
				
			}

			@Override
			public void onComplete() {
				System.out.println("Observer Completed");
				
			}
			
		});
		
			
		

	}
}
