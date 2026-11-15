package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class O7 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U7 f21480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ T7 f21481b;

    /* synthetic */ O7(T7 t10, U7 u10, byte[] bArr) {
        Objects.requireNonNull(t10);
        this.f21481b = t10;
        this.f21480a = u10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        W7.a("InstallReferrerClient", "Install Referrer service connected.");
        T7 t10 = this.f21481b;
        t10.f(AbstractBinderC4387me.y6(iBinder));
        t10.e(2);
        this.f21480a.a(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        W7.b("InstallReferrerClient", "Install Referrer service disconnected.");
        T7 t10 = this.f21481b;
        t10.f(null);
        t10.e(0);
    }
}
