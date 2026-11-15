package com.google.android.gms.internal.ads;

import H4.C0612k1;
import H4.C0654z;
import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Iq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1894Iq {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static InterfaceC4291lt f19672e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f19673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B4.b f19674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0612k1 f19675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f19676d;

    public C1894Iq(Context context, B4.b bVar, C0612k1 c0612k1, String str) {
        this.f19673a = context;
        this.f19674b = bVar;
        this.f19675c = c0612k1;
        this.f19676d = str;
    }

    public static InterfaceC4291lt a(Context context) {
        InterfaceC4291lt interfaceC4291lt;
        synchronized (C1894Iq.class) {
            try {
                if (f19672e == null) {
                    f19672e = C0654z.b().i(context, new BinderC5162so());
                }
                interfaceC4291lt = f19672e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4291lt;
    }

    public final void b(T4.b bVar) {
        H4.h2 h2VarA;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Context context = this.f19673a;
        InterfaceC4291lt interfaceC4291ltA = a(context);
        if (interfaceC4291ltA == null) {
            bVar.a("Internal Error, query info generator is null.");
            return;
        }
        com.google.android.gms.dynamic.a aVarN0 = com.google.android.gms.dynamic.b.N0(context);
        C0612k1 c0612k1 = this.f19675c;
        if (c0612k1 == null) {
            H4.i2 i2Var = new H4.i2();
            i2Var.i(jCurrentTimeMillis);
            h2VarA = i2Var.a();
        } else {
            c0612k1.o(jCurrentTimeMillis);
            h2VarA = H4.l2.f1364a.a(context, c0612k1);
        }
        try {
            interfaceC4291ltA.N2(aVarN0, new C4795pt(this.f19676d, this.f19674b.name(), null, h2VarA, 0, null), new BinderC1842Hq(this, bVar));
        } catch (RemoteException unused) {
            bVar.a("Internal Error.");
        }
    }
}
