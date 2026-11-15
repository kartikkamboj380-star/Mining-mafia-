package com.google.android.gms.internal.ads;

import com.google.protobuf.CodedOutputStream;
import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class CH0 implements FD0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ CH0 f17848a = new CH0();

    private /* synthetic */ CH0() {
    }

    @Override // com.google.android.gms.internal.ads.FD0
    public final /* synthetic */ Object zza() throws GeneralSecurityException {
        C3588gH0 c3588gH0 = NH0.f21156a;
        BigInteger bigInteger = C4344mI0.f31477g;
        C3966jI0 c3966jI0 = new C3966jI0(null);
        C4092kI0 c4092kI0 = C4092kI0.f30745d;
        c3966jI0.d(c4092kI0);
        c3966jI0.e(c4092kI0);
        c3966jI0.f(64);
        c3966jI0.a(CodedOutputStream.DEFAULT_BUFFER_SIZE);
        c3966jI0.b(C4344mI0.f31477g);
        c3966jI0.c(C4218lI0.f31238b);
        return c3966jI0.g();
    }
}
