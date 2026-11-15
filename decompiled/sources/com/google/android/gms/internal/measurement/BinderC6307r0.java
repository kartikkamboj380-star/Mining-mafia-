package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class BinderC6307r0 extends AbstractBinderC6352w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f36871a = new AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f36872b;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
    
        r2 = r2.get(com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object H1(android.os.Bundle r2, java.lang.Class r3) {
        /*
            r0 = 0
            if (r2 == 0) goto L2d
            java.lang.String r1 = "r"
            java.lang.Object r2 = r2.get(r1)
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r3.cast(r2)     // Catch: java.lang.ClassCastException -> L10
            return r2
        L10:
            r0 = move-exception
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getCanonicalName()
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r2}
            java.lang.String r3 = "Unexpected object type. Expected, Received: %s, %s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.lang.String r3 = "AM"
            android.util.Log.w(r3, r2, r0)
            throw r0
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.BinderC6307r0.H1(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    public final Long N0(long j10) {
        return (Long) H1(t1(j10), Long.class);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6361x0
    public final void f0(Bundle bundle) {
        AtomicReference atomicReference = this.f36871a;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.f36872b = true;
                    this.f36871a.notify();
                } catch (Throwable th) {
                    this.f36871a.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String h0(long j10) {
        return (String) H1(t1(j10), String.class);
    }

    public final Bundle t1(long j10) {
        Bundle bundle;
        AtomicReference atomicReference = this.f36871a;
        synchronized (atomicReference) {
            if (!this.f36872b) {
                try {
                    atomicReference.wait(j10);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f36871a.get();
        }
        return bundle;
    }
}
