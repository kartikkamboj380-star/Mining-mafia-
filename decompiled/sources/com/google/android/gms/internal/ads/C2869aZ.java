package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.aZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2869aZ implements InterfaceC4375mY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f26555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC5860yL f26556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f26557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3376eb0 f26558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final QR f26559e;

    public C2869aZ(Context context, Executor executor, AbstractC5860yL abstractC5860yL, C3376eb0 c3376eb0, QR qr) {
        this.f26555a = context;
        this.f26556b = abstractC5860yL;
        this.f26557c = executor;
        this.f26558d = c3376eb0;
        this.f26559e = qr;
    }

    private static String e(C3502fb0 c3502fb0) {
        try {
            return c3502fb0.f28437v.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4375mY
    public final boolean a(C5011rb0 c5011rb0, C3502fb0 c3502fb0) {
        Context context = this.f26555a;
        return (context instanceof Activity) && C1982Ki.a(context) && !TextUtils.isEmpty(e(c3502fb0));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4375mY
    public final com.google.common.util.concurrent.p b(final C5011rb0 c5011rb0, final C3502fb0 c3502fb0) {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.Ce)).booleanValue()) {
            PR prA = this.f26559e.a();
            prA.c(HandleInvocationsFromAdViewer.KEY_ACTION, "cstm_tbs_rndr");
            prA.d();
        }
        String strE = e(c3502fb0);
        final Uri uri = strE != null ? Uri.parse(strE) : null;
        final C3880ib0 c3880ib0 = c5011rb0.f32991b.f32672b;
        return AbstractC5685wx0.j(AbstractC5685wx0.a(null), new InterfaceC3294dx0() { // from class: com.google.android.gms.internal.ads.ZY
            @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
            public final /* synthetic */ com.google.common.util.concurrent.p zza(Object obj) {
                return this.f26225a.c(uri, c5011rb0, c3502fb0, c3880ib0, obj);
            }
        }, this.f26557c);
    }

    final /* synthetic */ com.google.common.util.concurrent.p c(Uri uri, C5011rb0 c5011rb0, C3502fb0 c3502fb0, C3880ib0 c3880ib0, Object obj) {
        try {
            p180s.d dVarB = new s.d.e().b();
            dVarB.f48557a.setData(uri);
            J4.m mVar = new J4.m(dVarB.f48557a, null);
            C2575Vt c2575Vt = new C2575Vt();
            RK rkD = this.f26556b.d(new FD(c5011rb0, c3502fb0, null), new UK(new YY(this, c2575Vt, c3502fb0), null));
            c2575Vt.b(new AdOverlayInfoParcel(mVar, null, rkD.i(), null, new L4.a(0, 0, false), null, null, c3880ib0.f29455b));
            this.f26558d.d();
            return AbstractC5685wx0.a(rkD.h());
        } catch (Throwable th) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.d("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }

    final /* synthetic */ QR d() {
        return this.f26559e;
    }
}
