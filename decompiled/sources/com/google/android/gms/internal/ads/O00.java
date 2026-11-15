package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.os.RemoteException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class O00 implements InterfaceC4627oY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5191t10 f21436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DQ f21437b;

    O00(C5191t10 c5191t10, DQ dq) {
        this.f21436a = c5191t10;
        this.f21437b = dq;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4627oY
    public final C4753pY a(String str, JSONObject jSONObject) {
        InterfaceC5542vp interfaceC5542vpB;
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29872k2)).booleanValue()) {
            try {
                interfaceC5542vpB = this.f21437b.b(str);
            } catch (RemoteException e10) {
                int i10 = AbstractC0786o0.f2696b;
                L4.p.d("Coundn't create RTB adapter: ", e10);
                interfaceC5542vpB = null;
            }
        } else {
            interfaceC5542vpB = this.f21436a.b(str);
        }
        if (interfaceC5542vpB == null) {
            return null;
        }
        return new C4753pY(interfaceC5542vpB, new BinderC3120cZ(), str);
    }
}
