package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC5360uN implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5616wP f33791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Clock f33792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC2245Pk f33793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC2091Ml f33794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f33795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Long f33796f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    WeakReference f33797g;

    public ViewOnClickListenerC5360uN(C5616wP c5616wP, Clock clock) {
        this.f33791a = c5616wP;
        this.f33792b = clock;
    }

    private final void g() {
        View view;
        this.f33795e = null;
        this.f33796f = null;
        WeakReference weakReference = this.f33797g;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.f33797g = null;
    }

    public final void b(final InterfaceC2245Pk interfaceC2245Pk) {
        this.f33793c = interfaceC2245Pk;
        InterfaceC2091Ml interfaceC2091Ml = this.f33794d;
        if (interfaceC2091Ml != null) {
            this.f33791a.e("/unconfirmedClick", interfaceC2091Ml);
        }
        InterfaceC2091Ml interfaceC2091Ml2 = new InterfaceC2091Ml() { // from class: com.google.android.gms.internal.ads.tN
            @Override // com.google.android.gms.internal.ads.InterfaceC2091Ml
            public final /* synthetic */ void a(Object obj, Map map) {
                ViewOnClickListenerC5360uN viewOnClickListenerC5360uN = this.f33390a;
                try {
                    viewOnClickListenerC5360uN.f33796f = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    int i10 = AbstractC0786o0.f2696b;
                    L4.p.c("Failed to call parse unconfirmedClickTimestamp.");
                }
                InterfaceC2245Pk interfaceC2245Pk2 = interfaceC2245Pk;
                viewOnClickListenerC5360uN.f33795e = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (interfaceC2245Pk2 == null) {
                    int i11 = AbstractC0786o0.f2696b;
                    L4.p.a("Received unconfirmed click but UnconfirmedClickListener is null.");
                } else {
                    try {
                        interfaceC2245Pk2.k(str);
                    } catch (RemoteException e10) {
                        L4.p.i("#007 Could not call remote method.", e10);
                    }
                }
            }
        };
        this.f33794d = interfaceC2091Ml2;
        this.f33791a.d("/unconfirmedClick", interfaceC2091Ml2);
    }

    public final InterfaceC2245Pk e() {
        return this.f33793c;
    }

    public final void f() {
        if (this.f33793c == null || this.f33796f == null) {
            return;
        }
        g();
        try {
            this.f33793c.b();
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference weakReference = this.f33797g;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.f33795e != null && this.f33796f != null) {
            HashMap map = new HashMap();
            map.put("id", this.f33795e);
            map.put("time_interval", String.valueOf(this.f33792b.currentTimeMillis() - this.f33796f.longValue()));
            map.put("messageType", "onePointFiveClick");
            this.f33791a.f("sendMessageToNativeJs", map);
        }
        g();
    }
}
