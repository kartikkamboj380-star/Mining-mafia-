package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.content.Context;
import android.os.Binder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4747pV implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final C2575Vt f32400a = new C2575Vt();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Object f32401b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f32402c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f32403d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected C5420ur f32404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected C2569Vq f32405f;

    static void b(Context context, com.google.common.util.concurrent.p pVar, Executor executor) {
        if (((Boolean) AbstractC3015bj.f26905j.e()).booleanValue() || ((Boolean) AbstractC3015bj.f26903h.e()).booleanValue()) {
            AbstractC5685wx0.r(pVar, new C4369mV(context), executor);
        }
    }

    protected final void a() {
        synchronized (this.f32401b) {
            try {
                this.f32403d = true;
                if (this.f32405f.isConnected() || this.f32405f.isConnecting()) {
                    this.f32405f.disconnect();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
        int i10 = AbstractC0786o0.f2696b;
        L4.p.a("Disconnected from remote ad request service.");
        this.f32400a.c(new FV(1));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public void onConnectionSuspended(int i10) {
        int i11 = AbstractC0786o0.f2696b;
        L4.p.a("Cannot connect to remote service, fallback to local instance.");
    }
}
