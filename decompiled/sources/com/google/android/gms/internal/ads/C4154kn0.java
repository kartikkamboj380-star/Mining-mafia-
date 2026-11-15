package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4154kn0 extends AbstractC1681En0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f30882f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f30883g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final EnumC2894al0 f30884h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f30885i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f30886j;

    C4154kn0(C1966Ka c1966Ka, InterfaceC2718Ym0 interfaceC2718Ym0, Map map, Context context, EnumC2894al0 enumC2894al0, C1571Ck0 c1571Ck0, C5043rr0 c5043rr0) {
        super("Qx6fKcghp39v3hBS7aGRudr3CfsW9ttl9o6D5CM1a5VL5o9yAVkUDqNE55A7wfv7", "6qdYmVukMTFpVys4cpUndL5YDKVPIertd1vgaMgush0=", c1966Ka, interfaceC2718Ym0, c5043rr0.a(113));
        this.f30883g = context;
        this.f30882f = map;
        this.f30884h = enumC2894al0;
        this.f30885i = c1571Ck0.r0();
        this.f30886j = c1571Ck0.s0();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1681En0
    protected final void a(Method method, C1966Ka c1966Ka) {
        C4255lb c4255lb;
        Object[] objArr = (Object[]) method.invoke("", this.f30883g, Integer.valueOf(this.f30884h.ordinal()));
        objArr.getClass();
        String strZ0 = "E";
        int i10 = 1;
        try {
            com.google.common.util.concurrent.p pVar = (com.google.common.util.concurrent.p) this.f30882f.get("gs");
            if (pVar != null && ((Build.VERSION.SDK_INT < 31 || pVar.isDone()) && (c4255lb = (C4255lb) pVar.get(this.f30885i, TimeUnit.MILLISECONDS)) != null && c4255lb.Z0().length() > 1)) {
                strZ0 = c4255lb.Z0();
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (strZ0.equals("E")) {
            try {
                com.google.common.util.concurrent.p pVar2 = (com.google.common.util.concurrent.p) this.f30882f.get("ai");
                if (pVar2 != null) {
                    String str = (String) pVar2.get(this.f30886j, TimeUnit.MILLISECONDS);
                    if (!AbstractC4040jt0.c(str)) {
                        strZ0 = str;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        Boolean bool = (Boolean) objArr[5];
        synchronized (c1966Ka) {
            try {
                c1966Ka.J0(((Long) objArr[0]).longValue());
                c1966Ka.I0((String) objArr[1]);
                c1966Ka.D((String) objArr[2]);
                c1966Ka.E((String) objArr[3]);
                AbstractC2528Uv0 abstractC2528Uv0G = AbstractC2528Uv0.l().g();
                byte[] bArr = (byte[]) objArr[4];
                c1966Ka.E0(abstractC2528Uv0G.h(bArr, 0, bArr.length));
                c1966Ka.D0(strZ0);
                if (bool != null) {
                    if (true == bool.booleanValue()) {
                        i10 = 2;
                    }
                    c1966Ka.o0(i10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
