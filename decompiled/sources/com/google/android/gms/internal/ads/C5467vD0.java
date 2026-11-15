package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vD0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5467vD0 implements AD0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4096kK0 f34018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC5231tL0 f34019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final EnumC2832aG0 f34020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final EnumC5725xG0 f34021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Integer f34022f;

    private C5467vD0(String str, C4096kK0 c4096kK0, AbstractC5231tL0 abstractC5231tL0, EnumC2832aG0 enumC2832aG0, EnumC5725xG0 enumC5725xG0, Integer num) {
        this.f34017a = str;
        this.f34018b = c4096kK0;
        this.f34019c = abstractC5231tL0;
        this.f34020d = enumC2832aG0;
        this.f34021e = enumC5725xG0;
        this.f34022f = num;
    }

    public static C5467vD0 a(String str, AbstractC5231tL0 abstractC5231tL0, EnumC2832aG0 enumC2832aG0, EnumC5725xG0 enumC5725xG0, Integer num) throws GeneralSecurityException {
        if (enumC5725xG0 == EnumC5725xG0.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new C5467vD0(str, HD0.b(str), abstractC5231tL0, enumC2832aG0, enumC5725xG0, num);
    }

    @Override // com.google.android.gms.internal.ads.AD0
    public final C4096kK0 b() {
        return this.f34018b;
    }

    public final AbstractC5231tL0 c() {
        return this.f34019c;
    }

    public final EnumC2832aG0 d() {
        return this.f34020d;
    }

    public final EnumC5725xG0 e() {
        return this.f34021e;
    }

    public final Integer f() {
        return this.f34022f;
    }

    public final String g() {
        return this.f34017a;
    }
}
