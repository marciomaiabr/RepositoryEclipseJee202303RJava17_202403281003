package aWsREST_202404020829.pkgs.ws.rest.config;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/rest")
public class RSCoreApplication extends Application {

	public RSCoreApplication() {
		System.out.println("RSCoreApplication.RSCoreApplication()");
	}

}