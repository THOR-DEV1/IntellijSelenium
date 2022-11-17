package Config;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;

public class BrowserDriver {
	
	private  WebDriver mDriver=null;
	
	public  WebDriver getCurrentDriver(String browserType) {
	
		if(mDriver==null) {
			
			try {
				
				mDriver = BrowserFactory.startBrowser(browserType);				
				
			}catch(UnreachableBrowserException e) {
				e.printStackTrace();
			}
		}
		
		return mDriver;
		
	}
	
	
	public  WebDriver getCurrentDriver() {
		
		return getCurrentDriver("chrome");
		
	}


	public void close() {
		mDriver.close();

	}
	public void quit(){
		mDriver.quit();
	}
}
