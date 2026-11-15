package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ej, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1672Ej {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f18549a;

    public C1672Ej(Context context) {
        this.f18549a = context;
    }

    public final void a(InterfaceC2517Uq interfaceC2517Uq) {
        try {
            ((C1724Fj) L4.t.a(this.f18549a, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", C1620Dj.f18277a)).H1(interfaceC2517Uq);
        } catch (L4.s e10) {
            L4.p.f("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e10.getMessage())));
        } catch (RemoteException e11) {
            L4.p.f("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e11.getMessage())));
        }
    }
}
