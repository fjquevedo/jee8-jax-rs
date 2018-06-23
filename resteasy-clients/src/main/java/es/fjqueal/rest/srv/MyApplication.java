package es.fjqueal.rest.srv;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/rest")
public class MyApplication extends Application {
	// If your web.xml file does not have a <servlet-mapping> element, you
	// must use an Application class annotated with @ApplicationPath.

	public MyApplication() {
	}

	@Override
	public Set<Object> getSingletons() {
		HashSet<Object> set = new HashSet<Object>();
		return set;
	}
}