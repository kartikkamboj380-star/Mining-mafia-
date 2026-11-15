package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class A1 implements C1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ A1 f17225a = new A1();

    private /* synthetic */ A1() {
    }

    @Override // com.google.android.gms.internal.ads.C1
    public final /* synthetic */ Constructor zza() {
        int i10 = E1.f18335f;
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(I1.class).getConstructor(null);
    }
}
