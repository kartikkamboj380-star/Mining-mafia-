package com.google.android.gms.internal.ads;

import N4.AbstractC0819a;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.so, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class BinderC5162so extends AbstractBinderC5540vo {
    @Override // com.google.android.gms.internal.ads.InterfaceC5666wo
    public final boolean H(String str) {
        try {
            return O4.a.class.isAssignableFrom(Class.forName(str, false, BinderC5162so.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 88);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", trying Adapter implementation class.");
            L4.p.f(sb.toString());
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5666wo
    public final boolean d0(String str) {
        try {
            return AbstractC0819a.class.isAssignableFrom(Class.forName(str, false, BinderC5162so.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 104);
            sb.append("Could not load custom event implementation class as Adapter: ");
            sb.append(str);
            sb.append(", assuming old custom event implementation.");
            L4.p.f(sb.toString());
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5666wo
    public final InterfaceC6044zo j(String str) throws RemoteException {
        try {
            try {
                Class<?> cls = Class.forName(str, false, BinderC5162so.class.getClassLoader());
                if (N4.g.class.isAssignableFrom(cls)) {
                    return new BinderC2721Yo((N4.g) cls.getDeclaredConstructor(null).newInstance(null));
                }
                if (AbstractC0819a.class.isAssignableFrom(cls)) {
                    return new BinderC2721Yo((AbstractC0819a) cls.getDeclaredConstructor(null).newInstance(null));
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
                sb.append("Could not instantiate mediation adapter: ");
                sb.append(str);
                sb.append(" (not a valid adapter).");
                L4.p.f(sb.toString());
                throw new RemoteException();
            } catch (Throwable unused) {
                L4.p.a("Reflection failed, retrying using direct instantiation");
                if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                    return new BinderC2721Yo(new AdMobAdapter());
                }
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    return new BinderC2721Yo(new CustomEventAdapter());
                }
                throw new RemoteException();
            }
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 43);
            sb2.append("Could not instantiate mediation adapter: ");
            sb2.append(str);
            sb2.append(". ");
            L4.p.g(sb2.toString(), th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5666wo
    public final InterfaceC5542vp k(String str) throws RemoteException {
        try {
            return new BinderC1944Jp((RtbAdapter) Class.forName(str, false, AbstractC6046zp.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
        } catch (Throwable unused) {
            throw new RemoteException();
        }
    }
}
