package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3782hp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5080s9 f29121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f29122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f29123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f29124d;

    private C3782hp0(InterfaceC5080s9 interfaceC5080s9, long j10, long j11, String str) {
        this.f29121a = interfaceC5080s9;
        this.f29122b = j10;
        this.f29123c = j11;
        this.f29124d = str;
    }

    static /* synthetic */ C3782hp0 a(InterfaceC5080s9 interfaceC5080s9, byte[] bArr) {
        interfaceC5080s9.zza();
        interfaceC5080s9.a(bArr);
        List list = (List) interfaceC5080s9.c(Optional.empty());
        long jLongValue = ((Long) list.get(0)).longValue();
        long jLongValue2 = ((Long) list.get(1)).longValue();
        long jLongValue3 = ((Long) list.get(2)).longValue();
        interfaceC5080s9.b(jLongValue, Optional.empty());
        return new C3782hp0(interfaceC5080s9, jLongValue2, jLongValue3, "3.825731049.".concat(AbstractC2714Yk0.a(AbstractC5458v9.a(), false)));
    }

    final /* synthetic */ String b(Map map) {
        return AbstractC2714Yk0.a((byte[]) this.f29121a.b(this.f29122b, Optional.of(map)), true);
    }

    final /* synthetic */ void c(Map map) {
        this.f29121a.b(this.f29123c, Optional.of(map));
    }

    final /* synthetic */ String d() {
        return this.f29124d;
    }
}
