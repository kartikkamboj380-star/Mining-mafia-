package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Be, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1506Be implements InterfaceC1870Ie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f17666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f17667b;

    C1506Be(C1922Je c1922Je, Activity activity, Bundle bundle) {
        this.f17666a = activity;
        this.f17667b = bundle;
        Objects.requireNonNull(c1922Je);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1870Ie
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f17666a, this.f17667b);
    }
}
