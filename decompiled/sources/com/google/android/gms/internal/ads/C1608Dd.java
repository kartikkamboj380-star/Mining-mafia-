package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Dd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1608Dd extends AbstractCallableC2127Nd {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f18262h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Context f18263i;

    public C1608Dd(C2645Xc c2645Xc, String str, String str2, C1966Ka c1966Ka, int i10, int i11, Context context) {
        super(c2645Xc, "t0O1yTkaf8U85RYVI/Iw764S7xVo2UnzoC6xqdKHezEduB25T+k9NlupfapwCNk2", "NAFu5DHVi3o3yaFx1OCpv/KBsMCIhscKWxn1MzThPRk=", c1966Ka, i10, 31);
        this.f18262h = null;
        this.f18263i = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2127Nd
    protected final void a() {
        C1966Ka c1966Ka = this.f21301d;
        c1966Ka.F0(-1L);
        c1966Ka.G0(-1L);
        Context contextB = this.f18263i;
        if (contextB == null) {
            contextB = this.f21298a.b();
        }
        if (this.f18262h == null) {
            this.f18262h = (List) this.f21302e.invoke(null, contextB);
        }
        List list = this.f18262h;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (c1966Ka) {
            c1966Ka.F0(((Long) this.f18262h.get(0)).longValue());
            c1966Ka.G0(((Long) this.f18262h.get(1)).longValue());
        }
    }
}
