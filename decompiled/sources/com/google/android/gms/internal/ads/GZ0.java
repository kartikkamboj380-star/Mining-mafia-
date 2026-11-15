package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class GZ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5637wZ0 f19075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList f19076c;

    private GZ0(CopyOnWriteArrayList copyOnWriteArrayList, int i10, C5637wZ0 c5637wZ0) {
        this.f19076c = copyOnWriteArrayList;
        this.f19074a = 0;
        this.f19075b = c5637wZ0;
    }

    public final GZ0 a(int i10, C5637wZ0 c5637wZ0) {
        return new GZ0(this.f19076c, 0, c5637wZ0);
    }

    public final void b(Handler handler, HZ0 hz0) {
        this.f19076c.add(new C6015zZ0(handler, hz0));
    }

    public final void c(HZ0 hz0) {
        CopyOnWriteArrayList<C6015zZ0> copyOnWriteArrayList = this.f19076c;
        for (C6015zZ0 c6015zZ0 : copyOnWriteArrayList) {
            if (c6015zZ0.f35790b == hz0) {
                copyOnWriteArrayList.remove(c6015zZ0);
            }
        }
    }

    public final void d(final C4504nZ0 c4504nZ0, final C5133sZ0 c5133sZ0, final int i10) {
        i(new InterfaceC3977jO() { // from class: com.google.android.gms.internal.ads.FZ0
            @Override // com.google.android.gms.internal.ads.InterfaceC3977jO
            public final /* synthetic */ void zza(Object obj) {
                ((HZ0) obj).x(0, this.f18791a.f19075b, c4504nZ0, c5133sZ0, i10);
            }
        });
    }

    public final void e(final C4504nZ0 c4504nZ0, final C5133sZ0 c5133sZ0) {
        i(new InterfaceC3977jO() { // from class: com.google.android.gms.internal.ads.AZ0
            @Override // com.google.android.gms.internal.ads.InterfaceC3977jO
            public final /* synthetic */ void zza(Object obj) {
                ((HZ0) obj).J(0, this.f17373a.f19075b, c4504nZ0, c5133sZ0);
            }
        });
    }

    public final void f(final C4504nZ0 c4504nZ0, final C5133sZ0 c5133sZ0) {
        i(new InterfaceC3977jO() { // from class: com.google.android.gms.internal.ads.BZ0
            @Override // com.google.android.gms.internal.ads.InterfaceC3977jO
            public final /* synthetic */ void zza(Object obj) {
                ((HZ0) obj).H(0, this.f17659a.f19075b, c4504nZ0, c5133sZ0);
            }
        });
    }

    public final void g(final C4504nZ0 c4504nZ0, final C5133sZ0 c5133sZ0, final IOException iOException, final boolean z9) {
        i(new InterfaceC3977jO() { // from class: com.google.android.gms.internal.ads.CZ0
            @Override // com.google.android.gms.internal.ads.InterfaceC3977jO
            public final /* synthetic */ void zza(Object obj) {
                ((HZ0) obj).j(0, this.f17906a.f19075b, c4504nZ0, c5133sZ0, iOException, z9);
            }
        });
    }

    public final void h(final C5133sZ0 c5133sZ0) {
        i(new InterfaceC3977jO() { // from class: com.google.android.gms.internal.ads.DZ0
            @Override // com.google.android.gms.internal.ads.InterfaceC3977jO
            public final /* synthetic */ void zza(Object obj) {
                ((HZ0) obj).L(0, this.f18251a.f19075b, c5133sZ0);
            }
        });
    }

    public final void i(final InterfaceC3977jO interfaceC3977jO) {
        for (C6015zZ0 c6015zZ0 : this.f19076c) {
            final HZ0 hz0 = c6015zZ0.f35790b;
            AbstractC4634ob0.z(c6015zZ0.f35789a, new Runnable() { // from class: com.google.android.gms.internal.ads.EZ0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    interfaceC3977jO.zza(hz0);
                }
            });
        }
    }

    public GZ0() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
