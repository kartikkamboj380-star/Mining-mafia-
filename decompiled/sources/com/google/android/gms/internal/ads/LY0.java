package com.google.android.gms.internal.ads;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class LY0 implements OY0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ LY0 f20540a = new LY0();

    private /* synthetic */ LY0() {
    }

    @Override // com.google.android.gms.internal.ads.OY0
    public final /* synthetic */ int zza(Object obj) {
        int i10 = SY0.f23243b;
        String str = ((C4880qY0) obj).f32656a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}
