package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class J90 {
    public static void a(AtomicReference atomicReference, I90 i90) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            i90.zza(obj);
        } catch (RemoteException e10) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.i("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            int i11 = AbstractC0786o0.f2696b;
            L4.p.g("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }
}
