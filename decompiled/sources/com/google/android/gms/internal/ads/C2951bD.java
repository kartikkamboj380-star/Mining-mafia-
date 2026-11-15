package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2951bD implements OG, InterfaceC5220tG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f26756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1750Fw f26757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3502fb0 f26758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final L4.a f26759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C3747hY f26760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f26761f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C3369eY f26762g;

    public C2951bD(Context context, InterfaceC1750Fw interfaceC1750Fw, C3502fb0 c3502fb0, L4.a aVar, C3369eY c3369eY) {
        this.f26756a = context;
        this.f26757b = interfaceC1750Fw;
        this.f26758c = c3502fb0;
        this.f26759d = aVar;
        this.f26762g = c3369eY;
    }

    private final synchronized void a() {
        InterfaceC1750Fw interfaceC1750Fw;
        EnumC3244dY enumC3244dY;
        EnumC3118cY enumC3118cY;
        try {
            C3502fb0 c3502fb0 = this.f26758c;
            if (c3502fb0.f28388T && (interfaceC1750Fw = this.f26757b) != null) {
                if (G4.t.y().P(this.f26756a)) {
                    L4.a aVar = this.f26759d;
                    int i10 = aVar.f3098b;
                    int i11 = aVar.f3099c;
                    StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 1 + String.valueOf(i11).length());
                    sb.append(i10);
                    sb.append(".");
                    sb.append(i11);
                    String string = sb.toString();
                    C1553Cb0 c1553Cb0 = c3502fb0.f28390V;
                    String strA = c1553Cb0.a();
                    if (c1553Cb0.c() == 1) {
                        enumC3118cY = EnumC3118cY.VIDEO;
                        enumC3244dY = EnumC3244dY.DEFINED_BY_JAVASCRIPT;
                    } else {
                        int i12 = c3502fb0.f28403e;
                        EnumC3118cY enumC3118cY2 = EnumC3118cY.HTML_DISPLAY;
                        enumC3244dY = i12 == 1 ? EnumC3244dY.ONE_PIXEL : EnumC3244dY.BEGIN_TO_RENDER;
                        enumC3118cY = enumC3118cY2;
                    }
                    C3747hY c3747hYE = G4.t.y().e(string, interfaceC1750Fw.A(), "", "javascript", strA, enumC3244dY, enumC3118cY, c3502fb0.f28418l0);
                    this.f26760e = c3747hYE;
                    if (c3747hYE != null) {
                        AbstractC3764hg0 abstractC3764hg0A = c3747hYE.a();
                        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29887l6)).booleanValue()) {
                            G4.t.y().c(abstractC3764hg0A, interfaceC1750Fw.A());
                            Iterator it = interfaceC1750Fw.t().iterator();
                            while (it.hasNext()) {
                                G4.t.y().f(abstractC3764hg0A, (View) it.next());
                            }
                        } else {
                            G4.t.y().c(abstractC3764hg0A, interfaceC1750Fw.B());
                        }
                        interfaceC1750Fw.T0(this.f26760e);
                        G4.t.y().b(abstractC3764hg0A);
                        this.f26761f = true;
                        interfaceC1750Fw.b("onSdkLoaded", new p190t.a());
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final boolean b() {
        return ((Boolean) H4.B.c().d(AbstractC3892ii.f29898m6)).booleanValue() && this.f26762g.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5220tG
    public final synchronized void m() {
        InterfaceC1750Fw interfaceC1750Fw;
        if (b()) {
            this.f26762g.d();
            return;
        }
        if (!this.f26761f) {
            a();
        }
        if (!this.f26758c.f28388T || this.f26760e == null || (interfaceC1750Fw = this.f26757b) == null) {
            return;
        }
        interfaceC1750Fw.b("onSdkImpression", new p190t.a());
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final synchronized void zzg() {
        if (b()) {
            this.f26762g.c();
        } else {
            if (this.f26761f) {
                return;
            }
            a();
        }
    }
}
