package io.invertase.notifee;

import app.notifee.core.InitProvider;
import app.notifee.core.Notifee;

/* JADX INFO: loaded from: classes3.dex */
public class NotifeeInitProvider extends InitProvider {
    @Override // app.notifee.core.InitProvider, android.content.ContentProvider
    public boolean onCreate() {
        boolean zOnCreate = super.onCreate();
        Notifee.initialize(new NotifeeEventSubscriber());
        return zOnCreate;
    }
}
