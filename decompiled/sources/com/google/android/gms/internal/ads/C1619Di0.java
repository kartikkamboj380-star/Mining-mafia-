package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Di0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1619Di0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final InterfaceC1775Gi0 f18275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final boolean f18276b;

    private C1619Di0(InterfaceC1775Gi0 interfaceC1775Gi0) {
        this.f18275a = interfaceC1775Gi0;
        this.f18276b = interfaceC1775Gi0 != null;
    }

    public static C1619Di0 b(Context context, String str, String str2) {
        InterfaceC1775Gi0 c1671Ei0;
        try {
            try {
                try {
                    IBinder iBinderD = DynamiteModule.e(context, DynamiteModule.f17195b, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderD == null) {
                        c1671Ei0 = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderD.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        c1671Ei0 = iInterfaceQueryLocalInterface instanceof InterfaceC1775Gi0 ? (InterfaceC1775Gi0) iInterfaceQueryLocalInterface : new C1671Ei0(iBinderD);
                    }
                    c1671Ei0.n5(com.google.android.gms.dynamic.b.N0(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new C1619Di0(c1671Ei0);
                } catch (RemoteException | C3516fi0 | NullPointerException | SecurityException unused) {
                    Log.d("GASS", "Cannot dynamite load clearcut");
                    return new C1619Di0(new BinderC1827Hi0());
                }
            } catch (Exception e10) {
                throw new C3516fi0(e10);
            }
        } catch (Exception e11) {
            throw new C3516fi0(e11);
        }
    }

    public static C1619Di0 c() {
        BinderC1827Hi0 binderC1827Hi0 = new BinderC1827Hi0();
        Log.d("GASS", "Clearcut logging disabled");
        return new C1619Di0(binderC1827Hi0);
    }

    public final C1567Ci0 a(byte[] bArr) {
        return new C1567Ci0(this, bArr, null);
    }
}
