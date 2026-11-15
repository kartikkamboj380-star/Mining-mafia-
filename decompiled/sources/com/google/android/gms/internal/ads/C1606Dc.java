package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Dc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1606Dc implements InterfaceC1918Jc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f18259a;

    C1606Dc(C1970Kc c1970Kc, Activity activity) {
        this.f18259a = activity;
        Objects.requireNonNull(c1970Kc);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1918Jc
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f18259a);
    }
}
