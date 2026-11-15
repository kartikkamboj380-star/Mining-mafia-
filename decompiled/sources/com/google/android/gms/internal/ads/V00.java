package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class V00 implements InterfaceC4375mY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4627oY f24151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5130sY f24152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2128Nd0 f24153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f24154d;

    public V00(C2128Nd0 c2128Nd0, InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0, InterfaceC4627oY interfaceC4627oY, InterfaceC5130sY interfaceC5130sY) {
        this.f24153c = c2128Nd0;
        this.f24154d = interfaceExecutorServiceC1805Gx0;
        this.f24152b = interfaceC5130sY;
        this.f24151a = interfaceC4627oY;
    }

    static final String e(String str, int i10) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(i10).length());
        sb.append("Error from: ");
        sb.append(str);
        sb.append(", code: ");
        sb.append(i10);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4375mY
    public final boolean a(C5011rb0 c5011rb0, C3502fb0 c3502fb0) {
        return !c3502fb0.f28433t.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4375mY
    public final com.google.common.util.concurrent.p b(final C5011rb0 c5011rb0, final C3502fb0 c3502fb0) {
        final C4753pY c4753pYA;
        Iterator it = c3502fb0.f28433t.iterator();
        while (true) {
            if (!it.hasNext()) {
                c4753pYA = null;
                break;
            }
            try {
                c4753pYA = this.f24151a.a((String) it.next(), c3502fb0.f28437v);
                break;
            } catch (C1761Gb0 unused) {
            }
        }
        if (c4753pYA == null) {
            return AbstractC5685wx0.c(new HZ("Unable to instantiate mediation adapter class."));
        }
        C2575Vt c2575Vt = new C2575Vt();
        c4753pYA.f32420c.i2(new S00(this, c4753pYA, c2575Vt));
        if (c3502fb0.f28381M) {
            Bundle bundle = c5011rb0.f32990a.f31840a.f35795d.f1303m;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        C2128Nd0 c2128Nd0 = this.f24153c;
        EnumC1817Hd0 enumC1817Hd0 = EnumC1817Hd0.ADAPTER_LOAD_AD_SYN;
        Objects.requireNonNull(c2128Nd0);
        return AbstractC5897yd0.d(new InterfaceC5267td0() { // from class: com.google.android.gms.internal.ads.U00
            @Override // com.google.android.gms.internal.ads.InterfaceC5267td0
            public final /* synthetic */ void zza() {
                this.f23885a.c(c5011rb0, c3502fb0, c4753pYA);
            }
        }, this.f24154d, enumC1817Hd0, c2128Nd0).j(EnumC1817Hd0.ADAPTER_LOAD_AD_ACK).e(c2575Vt).j(EnumC1817Hd0.ADAPTER_WRAP_ADAPTER).b(new InterfaceC4386md0() { // from class: com.google.android.gms.internal.ads.T00
            @Override // com.google.android.gms.internal.ads.InterfaceC4386md0
            public final /* synthetic */ Object zza(Object obj) {
                return this.f23361a.d(c5011rb0, c3502fb0, c4753pYA, (Void) obj);
            }
        }).i();
    }

    final /* synthetic */ void c(C5011rb0 c5011rb0, C3502fb0 c3502fb0, C4753pY c4753pY) {
        this.f24152b.a(c5011rb0, c3502fb0, c4753pY);
    }

    final /* synthetic */ Object d(C5011rb0 c5011rb0, C3502fb0 c3502fb0, C4753pY c4753pY, Void r10) {
        return this.f24152b.b(c5011rb0, c3502fb0, c4753pY);
    }
}
