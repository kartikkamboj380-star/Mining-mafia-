package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
final class D1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1 f18048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f18049b = new AtomicBoolean(false);

    public D1(C1 c10) {
        this.f18048a = c10;
    }

    public final I1 a(Object... objArr) {
        Constructor constructorZza;
        AtomicBoolean atomicBoolean = this.f18049b;
        synchronized (atomicBoolean) {
            if (!atomicBoolean.get()) {
                try {
                    constructorZza = this.f18048a.zza();
                } catch (ClassNotFoundException unused) {
                    this.f18049b.set(true);
                    constructorZza = null;
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
            constructorZza = null;
        }
        if (constructorZza == null) {
            return null;
        }
        try {
            return (I1) constructorZza.newInstance(objArr);
        } catch (Exception e11) {
            throw new IllegalStateException("Unexpected error creating extractor", e11);
        }
    }
}
