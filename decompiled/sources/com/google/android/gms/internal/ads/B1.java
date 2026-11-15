package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class B1 implements C1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ B1 f17450a = new B1();

    private /* synthetic */ B1() {
    }

    @Override // com.google.android.gms.internal.ads.C1
    public final /* synthetic */ Constructor zza() throws IllegalAccessException, InvocationTargetException {
        int i10 = E1.f18335f;
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(I1.class).getConstructor(Integer.TYPE);
        }
        return null;
    }
}
