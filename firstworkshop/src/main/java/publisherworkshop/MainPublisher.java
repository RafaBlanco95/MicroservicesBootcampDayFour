package publisherworkshop;

import reactor.core.publisher.Flux;

public class MainPublisher {

	public static void main(String args[]) {
	
		Flux<String> messageSender = Flux.just("Mensaje 1", "Mensaje 2", "Mensaje 3");
		
        messageSender.subscribe(m -> System.out.println("Consumer 1. Received: " + m),
                                e -> System.out.println("Consumer 1. Error: " + e.getMessage()),
                                () -> System.out.println("Consumer 1. Completed"));
        
        messageSender.subscribe(m -> System.out.println("Consumer 2. Received: " + m),
                e -> System.out.println("Consumer 2. Error: " + e.getMessage()),
                () -> System.out.println("Consumer 2. Completed"));
		
}
}
