package testapplication;

import org.eclipse.e4.core.di.annotations.Execute;

public class MyHandler {
	
	@Execute
	public void execute() {
		
		System.out.println("Hello");
	}

}
