package md50f5d3bdf3038e8e3899a247d8a612766;


public class BtDiscovery
	extends android.content.BroadcastReceiver
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onReceive:(Landroid/content/Context;Landroid/content/Intent;)V:GetOnReceive_Landroid_content_Context_Landroid_content_Intent_Handler\n" +
			"";
		mono.android.Runtime.register ("RasPiBtControl.Droid.Services.BtDiscovery, RasPiBtControl.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", BtDiscovery.class, __md_methods);
	}


	public BtDiscovery ()
	{
		super ();
		if (getClass () == BtDiscovery.class)
			mono.android.TypeManager.Activate ("RasPiBtControl.Droid.Services.BtDiscovery, RasPiBtControl.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public BtDiscovery (md5501b2dfc4a89153bb52ab34b350b63b7.MainActivity p0)
	{
		super ();
		if (getClass () == BtDiscovery.class)
			mono.android.TypeManager.Activate ("RasPiBtControl.Droid.Services.BtDiscovery, RasPiBtControl.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "RasPiBtControl.Droid.MainActivity, RasPiBtControl.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", this, new java.lang.Object[] { p0 });
	}


	public void onReceive (android.content.Context p0, android.content.Intent p1)
	{
		n_onReceive (p0, p1);
	}

	private native void n_onReceive (android.content.Context p0, android.content.Intent p1);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
