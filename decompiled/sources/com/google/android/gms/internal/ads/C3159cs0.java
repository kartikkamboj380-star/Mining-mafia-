package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cs0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3159cs0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C5549vs0 f27233c = new C5549vs0("OverlayDisplayService");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Intent f27234d = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f27235e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final C5423us0 f27236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27237b;

    C3159cs0(Context context) {
        if (AbstractC5801xs0.a(context)) {
            this.f27236a = new C5423us0(context.getApplicationContext(), f27233c, "OverlayDisplayService", f27234d, C2104Mr0.f20938a);
        } else {
            this.f27236a = null;
        }
        this.f27237b = context.getPackageName();
    }

    private static boolean h(String str) {
        return AbstractC4040jt0.a(str).trim().isEmpty();
    }

    private static void i(String str, InterfaceC3034bs0 interfaceC3034bs0) {
        if (h(str)) {
            return;
        }
        str.getClass();
        interfaceC3034bs0.k(str.trim());
    }

    private static boolean j(InterfaceC3788hs0 interfaceC3788hs0, String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!h((String) it.next())) {
                return true;
            }
        }
        f27233c.c(str, new Object[0]);
        AbstractC3536fs0 abstractC3536fs0D = AbstractC3662gs0.d();
        abstractC3536fs0D.c(0);
        abstractC3536fs0D.a(8160);
        interfaceC3788hs0.a(abstractC3536fs0D.d());
        return false;
    }

    final void a(final AbstractC3410es0 abstractC3410es0, final InterfaceC3788hs0 interfaceC3788hs0) {
        C5423us0 c5423us0 = this.f27236a;
        if (c5423us0 == null) {
            f27233c.c("error: %s", "Play Store not found.");
        } else if (j(interfaceC3788hs0, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", Arrays.asList(null, abstractC3410es0.b()))) {
            c5423us0.a(new Runnable() { // from class: com.google.android.gms.internal.ads.Zr0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f26326a.e(abstractC3410es0, interfaceC3788hs0);
                }
            });
        }
    }

    final void b(final AbstractC1897Ir0 abstractC1897Ir0, final InterfaceC3788hs0 interfaceC3788hs0) {
        C5423us0 c5423us0 = this.f27236a;
        if (c5423us0 == null) {
            f27233c.c("error: %s", "Play Store not found.");
        } else if (j(interfaceC3788hs0, "Failed to apply OverlayDisplayDismissRequest: missing appId and sessionToken.", Arrays.asList(abstractC1897Ir0.a(), abstractC1897Ir0.b()))) {
            c5423us0.a(new Runnable() { // from class: com.google.android.gms.internal.ads.Or0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f21694a.f(abstractC1897Ir0, interfaceC3788hs0);
                }
            });
        }
    }

    final void c(final AbstractC4038js0 abstractC4038js0, final InterfaceC3788hs0 interfaceC3788hs0, final int i10) {
        C5423us0 c5423us0 = this.f27236a;
        if (c5423us0 == null) {
            f27233c.c("error: %s", "Play Store not found.");
        } else if (j(interfaceC3788hs0, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken.", Arrays.asList(abstractC4038js0.a(), abstractC4038js0.b()))) {
            c5423us0.a(new Runnable() { // from class: com.google.android.gms.internal.ads.Qr0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f22460a.g(abstractC4038js0, i10, interfaceC3788hs0);
                }
            });
        }
    }

    final void d() {
        C5423us0 c5423us0 = this.f27236a;
        if (c5423us0 == null) {
            return;
        }
        f27233c.a("unbind LMD display overlay service", new Object[0]);
        c5423us0.b();
    }

    final /* synthetic */ void e(AbstractC3410es0 abstractC3410es0, InterfaceC3788hs0 interfaceC3788hs0) {
        try {
            C5423us0 c5423us0 = this.f27236a;
            if (c5423us0 == null) {
                throw null;
            }
            InterfaceC5673wr0 interfaceC5673wr0 = (InterfaceC5673wr0) c5423us0.c();
            if (interfaceC5673wr0 == null) {
                return;
            }
            String str = this.f27237b;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            bundle.putBinder("windowToken", abstractC3410es0.a());
            i(abstractC3410es0.j(), new InterfaceC3034bs0() { // from class: com.google.android.gms.internal.ads.Rr0
                @Override // com.google.android.gms.internal.ads.InterfaceC3034bs0
                public final /* synthetic */ void k(String str2) {
                    int i10 = C3159cs0.f27235e;
                    bundle.putString("adFieldEnifd", str2);
                }
            });
            bundle.putInt("layoutGravity", abstractC3410es0.c());
            bundle.putFloat("layoutVerticalMargin", abstractC3410es0.d());
            bundle.putInt("displayMode", 0);
            bundle.putInt("triggerMode", 0);
            bundle.putInt("windowWidthPx", abstractC3410es0.h());
            i(null, new InterfaceC3034bs0() { // from class: com.google.android.gms.internal.ads.Sr0
                @Override // com.google.android.gms.internal.ads.InterfaceC3034bs0
                public final /* synthetic */ void k(String str2) {
                    int i10 = C3159cs0.f27235e;
                    bundle.putString("deeplinkUrl", str2);
                }
            });
            i(null, new InterfaceC3034bs0() { // from class: com.google.android.gms.internal.ads.Tr0
                @Override // com.google.android.gms.internal.ads.InterfaceC3034bs0
                public final /* synthetic */ void k(String str2) {
                    int i10 = C3159cs0.f27235e;
                    bundle.putString("sessionToken", str2);
                }
            });
            i(abstractC3410es0.b(), new InterfaceC3034bs0() { // from class: com.google.android.gms.internal.ads.Ur0
                @Override // com.google.android.gms.internal.ads.InterfaceC3034bs0
                public final /* synthetic */ void k(String str2) {
                    int i10 = C3159cs0.f27235e;
                    bundle.putString("appId", str2);
                }
            });
            i(null, new InterfaceC3034bs0() { // from class: com.google.android.gms.internal.ads.Vr0
                @Override // com.google.android.gms.internal.ads.InterfaceC3034bs0
                public final /* synthetic */ void k(String str2) {
                    int i10 = C3159cs0.f27235e;
                    bundle.putString("thirdPartyAuthCallerId", str2);
                }
            });
            bundle.putBoolean("stableSessionToken", true);
            interfaceC5673wr0.x2(str, bundle, new BinderC2908as0(this, interfaceC3788hs0));
        } catch (RemoteException e10) {
            f27233c.d(e10, "show overlay display from: %s", this.f27237b);
        }
    }

    final /* synthetic */ void f(AbstractC1897Ir0 abstractC1897Ir0, InterfaceC3788hs0 interfaceC3788hs0) {
        try {
            C5423us0 c5423us0 = this.f27236a;
            if (c5423us0 == null) {
                throw null;
            }
            InterfaceC5673wr0 interfaceC5673wr0 = (InterfaceC5673wr0) c5423us0.c();
            if (interfaceC5673wr0 == null) {
                return;
            }
            String str = this.f27237b;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            i(abstractC1897Ir0.a(), new InterfaceC3034bs0() { // from class: com.google.android.gms.internal.ads.Wr0
                @Override // com.google.android.gms.internal.ads.InterfaceC3034bs0
                public final /* synthetic */ void k(String str2) {
                    int i10 = C3159cs0.f27235e;
                    bundle.putString("sessionToken", str2);
                }
            });
            i(abstractC1897Ir0.b(), new InterfaceC3034bs0() { // from class: com.google.android.gms.internal.ads.Xr0
                @Override // com.google.android.gms.internal.ads.InterfaceC3034bs0
                public final /* synthetic */ void k(String str2) {
                    int i10 = C3159cs0.f27235e;
                    bundle.putString("appId", str2);
                }
            });
            interfaceC5673wr0.U0(bundle, new BinderC2908as0(this, interfaceC3788hs0));
        } catch (RemoteException e10) {
            f27233c.d(e10, "dismiss overlay display from: %s", this.f27237b);
        }
    }

    final /* synthetic */ void g(AbstractC4038js0 abstractC4038js0, int i10, InterfaceC3788hs0 interfaceC3788hs0) {
        try {
            C5423us0 c5423us0 = this.f27236a;
            if (c5423us0 == null) {
                throw null;
            }
            InterfaceC5673wr0 interfaceC5673wr0 = (InterfaceC5673wr0) c5423us0.c();
            if (interfaceC5673wr0 == null) {
                return;
            }
            String str = this.f27237b;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            bundle.putInt("displayMode", i10);
            i(abstractC4038js0.a(), new InterfaceC3034bs0() { // from class: com.google.android.gms.internal.ads.Yr0
                @Override // com.google.android.gms.internal.ads.InterfaceC3034bs0
                public final /* synthetic */ void k(String str2) {
                    int i11 = C3159cs0.f27235e;
                    bundle.putString("sessionToken", str2);
                }
            });
            i(abstractC4038js0.b(), new InterfaceC3034bs0() { // from class: com.google.android.gms.internal.ads.Pr0
                @Override // com.google.android.gms.internal.ads.InterfaceC3034bs0
                public final /* synthetic */ void k(String str2) {
                    int i11 = C3159cs0.f27235e;
                    bundle.putString("appId", str2);
                }
            });
            interfaceC5673wr0.p1(bundle, new BinderC2908as0(this, interfaceC3788hs0));
        } catch (RemoteException e10) {
            f27233c.d(e10, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i10), this.f27237b);
        }
    }
}
