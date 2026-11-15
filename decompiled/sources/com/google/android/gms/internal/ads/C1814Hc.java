package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Hc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1814Hc implements InterfaceC1918Jc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f19324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f19325b;

    C1814Hc(C1970Kc c1970Kc, Activity activity, Bundle bundle) {
        this.f19324a = activity;
        this.f19325b = bundle;
        Objects.requireNonNull(c1970Kc);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1918Jc
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f19324a, this.f19325b);
    }
}
