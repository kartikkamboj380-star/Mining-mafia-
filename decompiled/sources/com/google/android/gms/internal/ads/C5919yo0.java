package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5919yo0 implements InterfaceC1515Bi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f35444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1947Jq0 f35445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f35446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f35447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f35448e;

    C5919yo0(Context context, C1571Ck0 c1571Ck0, C1947Jq0 c1947Jq0) {
        this.f35444a = context;
        this.f35446c = c1571Ck0.k0();
        this.f35447d = c1571Ck0.r0();
        this.f35448e = c1571Ck0.s0();
        this.f35445b = c1947Jq0;
    }

    final void a(Map map) {
        String strZ0;
        C4255lb c4255lb;
        map.put("v", this.f35446c);
        map.put("t", new Throwable());
        try {
            com.google.common.util.concurrent.p pVar = (com.google.common.util.concurrent.p) map.get("gs");
            strZ0 = (pVar == null || (Build.VERSION.SDK_INT >= 31 && !pVar.isDone()) || (c4255lb = (C4255lb) pVar.get(this.f35447d, TimeUnit.MILLISECONDS)) == null || c4255lb.Z0().length() <= 1) ? "E" : c4255lb.Z0();
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (strZ0.equals("E")) {
            try {
                com.google.common.util.concurrent.p pVar2 = (com.google.common.util.concurrent.p) map.get("ai");
                if (pVar2 != null) {
                    String str = (String) pVar2.get(this.f35448e, TimeUnit.MILLISECONDS);
                    if (!AbstractC4040jt0.c(str)) {
                        strZ0 = str;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        map.put("int", strZ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1515Bi0
    public final Map zzb() {
        Map mapB = this.f35445b.b();
        a(mapB);
        return mapB;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1515Bi0
    public final Map zzc() {
        Map mapC = this.f35445b.c(this.f35444a, null);
        a(mapC);
        return mapC;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1515Bi0
    public final Map zzd() {
        Map mapD = this.f35445b.d();
        a(mapD);
        return mapD;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1515Bi0
    public final Map zze() {
        HashMap map = new HashMap();
        map.put("t", new Throwable());
        return map;
    }
}
