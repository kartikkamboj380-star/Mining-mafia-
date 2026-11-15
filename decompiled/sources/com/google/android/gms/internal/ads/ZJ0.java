package com.google.android.gms.internal.ads;

import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class ZJ0 implements InterfaceC6065zy0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f26149e = {0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LE0 f26150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f26151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f26152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f26153d;

    private ZJ0(JD0 jd0) {
        this.f26150a = WJ0.b(JE0.c(KE0.b(jd0.f().c()), jd0.e()));
        this.f26151b = jd0.f().d();
        this.f26152c = jd0.c().c();
        if (jd0.f().f().equals(PD0.f22067d)) {
            this.f26153d = Arrays.copyOf(f26149e, 1);
        } else {
            this.f26153d = new byte[0];
        }
    }

    public static InterfaceC6065zy0 a(JD0 jd0) {
        return new ZJ0(jd0);
    }

    public static InterfaceC6065zy0 b(WD0 wd0) {
        return new ZJ0(wd0);
    }

    public final byte[] c(byte[] bArr) {
        byte[] bArr2 = this.f26153d;
        return bArr2.length > 0 ? AbstractC5479vJ0.a(this.f26152c, this.f26150a.a(AbstractC5479vJ0.a(bArr, bArr2), this.f26151b)) : AbstractC5479vJ0.a(this.f26152c, this.f26150a.a(bArr, this.f26151b));
    }

    private ZJ0(WD0 wd0) {
        String strValueOf = String.valueOf(wd0.f().g());
        this.f26150a = new YJ0("HMAC".concat(strValueOf), new SecretKeySpec(wd0.e().c(AbstractC3800hy0.a()), "HMAC"));
        this.f26151b = wd0.f().d();
        this.f26152c = wd0.c().c();
        if (wd0.f().f().equals(C3330eE0.f27724d)) {
            this.f26153d = Arrays.copyOf(f26149e, 1);
        } else {
            this.f26153d = new byte[0];
        }
    }

    public ZJ0(LE0 le0, int i10) {
        this.f26150a = le0;
        this.f26151b = i10;
        this.f26152c = new byte[0];
        this.f26153d = new byte[0];
        le0.a(new byte[0], i10);
    }
}
