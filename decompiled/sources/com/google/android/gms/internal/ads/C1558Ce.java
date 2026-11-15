package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ce, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1558Ce implements InterfaceC1870Ie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f17918a;

    C1558Ce(C1922Je c1922Je, Activity activity) {
        this.f17918a = activity;
        Objects.requireNonNull(c1922Je);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1870Ie
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f17918a);
    }
}
