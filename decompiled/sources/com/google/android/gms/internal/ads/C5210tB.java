package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5210tB {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4281lo f33361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f33362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C5840yB f33363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC2091Ml f33364e = new C4833qB(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC2091Ml f33365f = new C5084sB(this);

    public C5210tB(String str, C4281lo c4281lo, Executor executor) {
        this.f33360a = str;
        this.f33361b = c4281lo;
        this.f33362c = executor;
    }

    public final void a(C5840yB c5840yB) {
        C4281lo c4281lo = this.f33361b;
        c4281lo.b("/updateActiveView", this.f33364e);
        c4281lo.b("/untrackActiveViewUnit", this.f33365f);
        this.f33363d = c5840yB;
    }

    public final void b(InterfaceC1750Fw interfaceC1750Fw) {
        interfaceC1750Fw.c0("/updateActiveView", this.f33364e);
        interfaceC1750Fw.c0("/untrackActiveViewUnit", this.f33365f);
    }

    public final void c(InterfaceC1750Fw interfaceC1750Fw) {
        interfaceC1750Fw.h1("/updateActiveView", this.f33364e);
        interfaceC1750Fw.h1("/untrackActiveViewUnit", this.f33365f);
    }

    public final void d() {
        C4281lo c4281lo = this.f33361b;
        c4281lo.c("/updateActiveView", this.f33364e);
        c4281lo.c("/untrackActiveViewUnit", this.f33365f);
    }

    final /* synthetic */ boolean e(Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(this.f33360a);
    }

    final /* synthetic */ Executor f() {
        return this.f33362c;
    }

    final /* synthetic */ C5840yB g() {
        return this.f33363d;
    }
}
