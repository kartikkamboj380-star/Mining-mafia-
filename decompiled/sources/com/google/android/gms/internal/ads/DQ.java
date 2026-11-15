package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class DQ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2592Wb0 f18166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AQ f18167b;

    DQ(C2592Wb0 c2592Wb0, AQ aq) {
        this.f18166a = c2592Wb0;
        this.f18167b = aq;
    }

    public final C2696Yb0 a(String str, JSONObject jSONObject) {
        InterfaceC6044zo interfaceC6044zoJ;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                interfaceC6044zoJ = new BinderC2721Yo(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                interfaceC6044zoJ = new BinderC2721Yo(new zzbwl());
            } else {
                InterfaceC5666wo interfaceC5666woD = d();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        if (interfaceC5666woD.H(string)) {
                            interfaceC6044zoJ = interfaceC5666woD.j("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                        } else {
                            interfaceC6044zoJ = interfaceC5666woD.d0(string) ? interfaceC5666woD.j(string) : interfaceC5666woD.j("com.google.ads.mediation.customevent.CustomEventAdapter");
                        }
                    } catch (JSONException e10) {
                        int i10 = AbstractC0786o0.f2696b;
                        L4.p.d("Invalid custom event.", e10);
                        interfaceC6044zoJ = interfaceC5666woD.j(str);
                    }
                } else {
                    interfaceC6044zoJ = interfaceC5666woD.j(str);
                }
            }
            C2696Yb0 c2696Yb0 = new C2696Yb0(interfaceC6044zoJ);
            this.f18167b.a(str, c2696Yb0);
            return c2696Yb0;
        } catch (Throwable th) {
            if (((Boolean) H4.B.c().d(AbstractC3892ii.Oa)).booleanValue()) {
                this.f18167b.a(str, null);
            }
            throw new C1761Gb0(th);
        }
    }

    public final InterfaceC5542vp b(String str) {
        InterfaceC5542vp interfaceC5542vpK = d().k(str);
        this.f18167b.b(str, interfaceC5542vpK);
        return interfaceC5542vpK;
    }

    public final boolean c() {
        return this.f18166a.d() != null;
    }

    final InterfaceC5666wo d() throws RemoteException {
        InterfaceC5666wo interfaceC5666woD = this.f18166a.d();
        if (interfaceC5666woD != null) {
            return interfaceC5666woD;
        }
        int i10 = AbstractC0786o0.f2696b;
        L4.p.f("Unexpected call to adapter creator.");
        throw new RemoteException();
    }
}
