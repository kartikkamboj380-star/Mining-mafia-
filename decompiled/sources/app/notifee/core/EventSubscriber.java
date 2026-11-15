package app.notifee.core;

import android.content.Context;
import app.notifee.core.event.BlockStateEvent;
import app.notifee.core.event.ForegroundServiceEvent;
import app.notifee.core.event.LogEvent;
import app.notifee.core.event.NotificationEvent;
import app.notifee.core.interfaces.EventListener;
import b9.f;
import b9.g;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.greenrobot.eventbus.ThreadMode;
import u9.m;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class EventSubscriber {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EventSubscriber f11433b = new EventSubscriber();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f11434a = new HashSet();

    private EventSubscriber() {
        g.c(this);
    }

    @KeepForSdk
    public static Context getContext() {
        return f.f11648a;
    }

    @KeepForSdk
    public static void register(EventListener eventListener) {
        f11433b.f11434a.add(eventListener);
    }

    @KeepForSdk
    public static void unregister(EventListener eventListener) {
        f11433b.f11434a.remove(eventListener);
    }

    @m(threadMode = ThreadMode.MAIN)
    public void onBlockStateEvent(BlockStateEvent blockStateEvent) {
        Iterator it = this.f11434a.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).onBlockStateEvent(blockStateEvent);
        }
    }

    @m(threadMode = ThreadMode.MAIN)
    public void onForegroundServiceEvent(ForegroundServiceEvent foregroundServiceEvent) {
        Iterator it = this.f11434a.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).onForegroundServiceEvent(foregroundServiceEvent);
        }
    }

    @m(threadMode = ThreadMode.MAIN)
    public void onLogEvent(LogEvent logEvent) {
        Iterator it = this.f11434a.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).onLogEvent(logEvent);
        }
    }

    @m(threadMode = ThreadMode.MAIN)
    public void onNotificationEvent(NotificationEvent notificationEvent) {
        Iterator it = this.f11434a.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).onNotificationEvent(notificationEvent);
        }
    }
}
