package com.google.android.gms.internal.ads;

import com.google.protobuf.CodedOutputStream;
import java.math.BigInteger;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zH0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class C5979zH0 implements FD0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ C5979zH0 f35686a = new C5979zH0();

    private /* synthetic */ C5979zH0() {
    }

    @Override // com.google.android.gms.internal.ads.FD0
    public final /* synthetic */ Object zza() {
        C3588gH0 c3588gH0 = NH0.f21156a;
        BigInteger bigInteger = ZH0.f26142e;
        WH0 wh0 = new WH0(null);
        wh0.d(XH0.f25178d);
        wh0.a(CodedOutputStream.DEFAULT_BUFFER_SIZE);
        wh0.b(ZH0.f26142e);
        wh0.c(YH0.f25578b);
        return wh0.e();
    }
}
