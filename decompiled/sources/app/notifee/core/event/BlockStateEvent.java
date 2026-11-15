package app.notifee.core.event;

import android.os.Bundle;
import app.notifee.core.KeepForSdk;
import app.notifee.core.interfaces.MethodCallResult;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class BlockStateEvent {

    @KeepForSdk
    public static final int TYPE_APP_BLOCKED = 4;

    @KeepForSdk
    public static final int TYPE_CHANNEL_BLOCKED = 5;

    @KeepForSdk
    public static final int TYPE_CHANNEL_GROUP_BLOCKED = 6;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f11465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MethodCallResult f11466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11467e = false;

    public BlockStateEvent(int i10, Bundle bundle, boolean z9, MethodCallResult methodCallResult) {
        this.f11463a = i10;
        this.f11466d = methodCallResult;
        this.f11464b = z9;
        this.f11465c = bundle;
    }

    @KeepForSdk
    public Bundle getChannelOrGroupBundle() {
        return this.f11465c;
    }

    @KeepForSdk
    public int getType() {
        return this.f11463a;
    }

    @KeepForSdk
    public boolean isBlocked() {
        return this.f11464b;
    }

    @KeepForSdk
    public void setCompletionResult() {
        if (this.f11467e) {
            return;
        }
        this.f11467e = true;
        this.f11466d.onComplete(null, null);
    }
}
