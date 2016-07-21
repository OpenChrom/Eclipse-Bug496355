package testextension;

import org.eclipse.e4.core.di.annotations.Execute;

public class MyHandler2 {
	
	@Execute
	public void execute() {
		
		System.out.println("Extension");
	}

}
