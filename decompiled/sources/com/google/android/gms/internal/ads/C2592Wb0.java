package com.google.android.gms.internal.ads;

import H4.AbstractBinderC0646w0;
import H4.InterfaceC0649x0;
import K4.AbstractC0786o0;
import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.lifecycle.AbstractC1169o;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Wb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2592Wb0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static C2592Wb0 f24826d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0649x0 f24828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicReference f24829c = new AtomicReference();

    C2592Wb0(Context context, InterfaceC0649x0 interfaceC0649x0) {
        this.f24827a = context;
        this.f24828b = interfaceC0649x0;
    }

    public static C2592Wb0 a(Context context) {
        synchronized (C2592Wb0.class) {
            try {
                C2592Wb0 c2592Wb0 = f24826d;
                if (c2592Wb0 != null) {
                    return c2592Wb0;
                }
                Context applicationContext = context.getApplicationContext();
                long jLongValue = ((Long) AbstractC4271lj.f31344b.e()).longValue();
                InterfaceC0649x0 interfaceC0649x0F = null;
                if (jLongValue > 0 && jLongValue <= 254715000) {
                    interfaceC0649x0F = f(applicationContext);
                }
                C2592Wb0 c2592Wb1 = new C2592Wb0(applicationContext, interfaceC0649x0F);
                f24826d = c2592Wb1;
                return c2592Wb1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static InterfaceC0649x0 f(Context context) {
        try {
            return AbstractBinderC0646w0.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.d("Failed to retrieve lite SDK info.", e10);
            return null;
        }
    }

    private final H4.D1 g() {
        InterfaceC0649x0 interfaceC0649x0 = this.f24828b;
        if (interfaceC0649x0 != null) {
            try {
                return interfaceC0649x0.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final L4.a b(int i10, boolean z9, int i11) {
        H4.D1 d1G;
        G4.t.g();
        boolean zJ = K4.F0.j(this.f24827a);
        L4.a aVar = new L4.a(ModuleDescriptor.MODULE_VERSION, i11, true, zJ);
        return (((Boolean) AbstractC4271lj.f31345c.e()).booleanValue() && (d1G = g()) != null) ? new L4.a(ModuleDescriptor.MODULE_VERSION, d1G.a(), true, zJ) : aVar;
    }

    public final void c(InterfaceC5666wo interfaceC5666wo) {
        InterfaceC5666wo adapterCreator;
        if (!((Boolean) AbstractC4271lj.f31343a.e()).booleanValue()) {
            AbstractC1169o.a(this.f24829c, null, interfaceC5666wo);
            return;
        }
        InterfaceC0649x0 interfaceC0649x0 = this.f24828b;
        if (interfaceC0649x0 == null) {
            adapterCreator = null;
        } else {
            try {
                adapterCreator = interfaceC0649x0.getAdapterCreator();
            } catch (RemoteException unused) {
                adapterCreator = null;
            }
        }
        AtomicReference atomicReference = this.f24829c;
        if (adapterCreator != null) {
            interfaceC5666wo = adapterCreator;
        }
        AbstractC1169o.a(atomicReference, null, interfaceC5666wo);
    }

    public final InterfaceC5666wo d() {
        return (InterfaceC5666wo) this.f24829c.get();
    }

    public final String e() {
        H4.D1 d1G = g();
        if (d1G != null) {
            return d1G.zzb();
        }
        return null;
    }
}
