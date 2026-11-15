package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ic, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1866Ic implements InterfaceC1918Jc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f19586a;

    C1866Ic(C1970Kc c1970Kc, Activity activity) {
        this.f19586a = activity;
        Objects.requireNonNull(c1970Kc);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1918Jc
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f19586a);
    }
}
