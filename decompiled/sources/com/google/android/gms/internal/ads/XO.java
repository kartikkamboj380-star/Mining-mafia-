package com.google.android.gms.internal.ads;

import H4.InterfaceC0591d1;
import K4.AbstractC0786o0;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class XO extends AbstractBinderC2457Tm implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, InterfaceC1932Jj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f25212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC0591d1 f25213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JM f25214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f25215d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f25216e = false;

    public XO(JM jm, OM om) {
        this.f25212a = om.j();
        this.f25213b = om.l0();
        this.f25214c = jm;
        if (om.t() != null) {
            om.t().u0(this);
        }
    }

    private final void c() {
        View view;
        JM jm = this.f25214c;
        if (jm == null || (view = this.f25212a) == null) {
            return;
        }
        Map map = Collections.EMPTY_MAP;
        jm.e0(view, map, map, JM.t(view));
    }

    private static final void y6(InterfaceC2665Xm interfaceC2665Xm, int i10) {
        try {
            interfaceC2665Xm.n(i10);
        } catch (RemoteException e10) {
            int i11 = AbstractC0786o0.f2696b;
            L4.p.i("#007 Could not call remote method.", e10);
        }
    }

    private final void zzg() {
        View view = this.f25212a;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f25212a);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2509Um
    public final void I(com.google.android.gms.dynamic.a aVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        v4(aVar, new VO(this));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2509Um
    public final InterfaceC2607Wj b() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.f25215d) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.c("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        JM jm = this.f25214c;
        if (jm == null || jm.A() == null) {
            return null;
        }
        return jm.A().a();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        c();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2509Um
    public final void v4(com.google.android.gms.dynamic.a aVar, InterfaceC2665Xm interfaceC2665Xm) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.f25215d) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.c("Instream ad can not be shown after destroy().");
            y6(interfaceC2665Xm, 2);
            return;
        }
        View view = this.f25212a;
        if (view == null || this.f25213b == null) {
            String str = view == null ? "can not get video view." : "can not get video controller.";
            int i11 = AbstractC0786o0.f2696b;
            L4.p.c("Instream internal error: ".concat(str));
            y6(interfaceC2665Xm, 0);
            return;
        }
        if (this.f25216e) {
            int i12 = AbstractC0786o0.f2696b;
            L4.p.c("Instream ad should not be used again.");
            y6(interfaceC2665Xm, 1);
            return;
        }
        this.f25216e = true;
        zzg();
        ((ViewGroup) com.google.android.gms.dynamic.b.h0(aVar)).addView(this.f25212a, new ViewGroup.LayoutParams(-1, -1));
        G4.t.c();
        C3287du.a(this.f25212a, this);
        G4.t.c();
        C3287du.b(this.f25212a, this);
        c();
        try {
            interfaceC2665Xm.zze();
        } catch (RemoteException e10) {
            int i13 = AbstractC0786o0.f2696b;
            L4.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1932Jj
    public final void zza() {
        K4.F0.f2598l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.WO
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                try {
                    this.f24755a.zzc();
                } catch (RemoteException e10) {
                    int i10 = AbstractC0786o0.f2696b;
                    L4.p.i("#007 Could not call remote method.", e10);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2509Um
    public final InterfaceC0591d1 zzb() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (!this.f25215d) {
            return this.f25213b;
        }
        int i10 = AbstractC0786o0.f2696b;
        L4.p.c("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2509Um
    public final void zzc() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzg();
        JM jm = this.f25214c;
        if (jm != null) {
            jm.a();
        }
        this.f25214c = null;
        this.f25212a = null;
        this.f25213b = null;
        this.f25215d = true;
    }
}
