package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4054k0 extends Surface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f30659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f30660e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThreadC3928j0 f30662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f30663c;

    /* synthetic */ C4054k0(HandlerThreadC3928j0 handlerThreadC3928j0, SurfaceTexture surfaceTexture, boolean z9, byte[] bArr) {
        super(surfaceTexture);
        this.f30662b = handlerThreadC3928j0;
        this.f30661a = z9;
    }

    public static synchronized boolean a(Context context) {
        int i10;
        if (!f30660e) {
            try {
                if (AbstractC4485nQ.a(context)) {
                    i10 = AbstractC4485nQ.b() ? 1 : 2;
                } else {
                    i10 = 0;
                }
            } catch (MP e10) {
                YU.e("PlaceholderSurface", "Failed to determine secure mode due to GL error: ".concat(String.valueOf(e10.getMessage())));
            }
            f30659d = i10;
            f30660e = true;
        }
        return f30659d != 0;
    }

    public static C4054k0 b(Context context, boolean z9) {
        boolean z10 = true;
        if (z9 && !a(context)) {
            z10 = false;
        }
        AbstractC2418Ss0.i(z10);
        return new HandlerThreadC3928j0().a(z9 ? f30659d : 0);
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        HandlerThreadC3928j0 handlerThreadC3928j0 = this.f30662b;
        synchronized (handlerThreadC3928j0) {
            try {
                if (!this.f30663c) {
                    handlerThreadC3928j0.b();
                    this.f30663c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
