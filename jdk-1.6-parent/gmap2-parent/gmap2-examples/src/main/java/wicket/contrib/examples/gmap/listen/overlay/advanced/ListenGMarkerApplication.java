package wicket.contrib.examples.gmap.listen.overlay.advanced;

import org.apache.wicket.Page;

import wicket.contrib.examples.GMapExampleApplication;

public class ListenGMarkerApplication extends GMapExampleApplication
{

	/**
	 * @see wicket.protocol.http.WebApplication#init()
	 */
	@Override
	protected void init()
	{
		super.init();
	}

	@Override
	public Class<? extends Page> getHomePage()
	{
		return HomePage.class;
	}
}
