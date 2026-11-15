package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class IL implements OG, J4.B, InterfaceC5220tG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f19528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1750Fw f19529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3502fb0 f19530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final L4.a f19531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C3369eY f19532e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    C3747hY f19533f;

    public IL(Context context, InterfaceC1750Fw interfaceC1750Fw, C3502fb0 c3502fb0, L4.a aVar, C3369eY c3369eY) {
        this.f19528a = context;
        this.f19529b = interfaceC1750Fw;
        this.f19530c = c3502fb0;
        this.f19531d = aVar;
        this.f19532e = c3369eY;
    }

    private final boolean a() {
        return ((Boolean) H4.B.c().d(AbstractC3892ii.f29898m6)).booleanValue() && this.f19532e.b();
    }

    @Override // J4.B
    public final void B2() {
    }

    @Override // J4.B
    public final void F4() {
    }

    @Override // J4.B
    public final void H1() {
    }

    @Override // J4.B
    public final void N0() {
    }

    @Override // J4.B
    public final void S3(int i10) {
        this.f19533f = null;
    }

    @Override // J4.B
    public final void Z1() {
    }

    @Override // J4.B
    public final void Z2() {
    }

    @Override // J4.B
    public final void Z4() {
    }

    @Override // J4.B
    public final void b4() {
    }

    @Override // J4.B
    public final void c() {
        InterfaceC1750Fw interfaceC1750Fw;
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29931p6)).booleanValue() || (interfaceC1750Fw = this.f19529b) == null) {
            return;
        }
        if (this.f19533f != null || a()) {
            if (this.f19533f != null) {
                interfaceC1750Fw.b("onSdkImpression", new p190t.a());
            } else {
                this.f19532e.d();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5220tG
    public final void m() {
        InterfaceC1750Fw interfaceC1750Fw;
        if (a()) {
            this.f19532e.d();
        } else {
            if (this.f19533f == null || (interfaceC1750Fw = this.f19529b) == null) {
                return;
            }
            if (((Boolean) H4.B.c().d(AbstractC3892ii.f29931p6)).booleanValue()) {
                interfaceC1750Fw.b("onSdkImpression", new p190t.a());
            }
        }
    }

    @Override // J4.B
    public final void t4() {
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final void zzg() {
        InterfaceC1750Fw interfaceC1750Fw;
        EnumC3244dY enumC3244dY;
        EnumC3118cY enumC3118cY;
        C3502fb0 c3502fb0 = this.f19530c;
        if (!c3502fb0.f28388T || (interfaceC1750Fw = this.f19529b) == null) {
            return;
        }
        if (G4.t.y().P(this.f19528a)) {
            if (a()) {
                this.f19532e.c();
                return;
            }
            L4.a aVar = this.f19531d;
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
                enumC3244dY = c3502fb0.f28393Y == 2 ? EnumC3244dY.UNSPECIFIED : EnumC3244dY.BEGIN_TO_RENDER;
                enumC3118cY = EnumC3118cY.HTML_DISPLAY;
            }
            C3747hY c3747hYE = G4.t.y().e(string, interfaceC1750Fw.A(), "", "javascript", strA, enumC3244dY, enumC3118cY, c3502fb0.f28418l0);
            this.f19533f = c3747hYE;
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
                interfaceC1750Fw.T0(this.f19533f);
                G4.t.y().b(abstractC3764hg0A);
                interfaceC1750Fw.b("onSdkLoaded", new p190t.a());
            }
        }
    }
}
