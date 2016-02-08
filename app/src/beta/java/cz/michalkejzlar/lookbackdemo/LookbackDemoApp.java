package cz.michalkejzlar.lookbackdemo;

import io.lookback.sdk.Lookback;

public class LookbackDemoApp extends DemoApp {

    @Override
    public void onCreate() {
        super.onCreate();
        Lookback.init(this, "PUT YOUR API KEY HERE");
    }
}
