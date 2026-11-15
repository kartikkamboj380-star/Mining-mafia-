package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Cc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1554Cc implements InterfaceC1918Jc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f17913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f17914b;

    C1554Cc(C1970Kc c1970Kc, Activity activity, Bundle bundle) {
        this.f17913a = activity;
        this.f17914b = bundle;
        Objects.requireNonNull(c1970Kc);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1918Jc
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f17913a, this.f17914b);
    }
}
