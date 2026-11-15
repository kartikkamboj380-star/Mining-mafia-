package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class M4 extends AbstractC6530f2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile E4 f37618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile E4 f37619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected E4 f37620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f37621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.google.android.gms.internal.measurement.J0 f37622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f37623h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile E4 f37624i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private E4 f37625j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f37626k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Object f37627l;

    public M4(X2 x10) {
        super(x10);
        this.f37627l = new Object();
        this.f37621f = new ConcurrentHashMap();
    }

    private final void F(String str, E4 e10, boolean z9) {
        E4 e11;
        E4 e12 = this.f37618c == null ? this.f37619d : this.f37618c;
        if (e10.f37505b == null) {
            e11 = new E4(e10.f37504a, str != null ? r(str, "Activity") : null, e10.f37506c, e10.f37508e, e10.f37509f);
        } else {
            e11 = e10;
        }
        this.f37619d = this.f37618c;
        this.f37618c = e11;
        X2 x10 = this.f37374a;
        x10.b().t(new G4(this, e11, e12, x10.e().elapsedRealtime(), z9));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b3  */
    private final void G(E4 e10, E4 e11, long j10, boolean z9, Bundle bundle) {
        boolean z10;
        long j11;
        h();
        boolean z11 = false;
        if (e11 != null) {
            if (e11.f37506c == e10.f37506c && Objects.equals(e11.f37505b, e10.f37505b) && Objects.equals(e11.f37504a, e10.f37504a)) {
                z10 = false;
            } else {
                z10 = true;
            }
        } else {
            z10 = true;
        }
        if (z9 && this.f37620e != null) {
            z11 = true;
        }
        if (z10) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            z6.k0(e10, bundle2, true);
            if (e11 != null) {
                String str = e11.f37504a;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = e11.f37505b;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", e11.f37506c);
            }
            if (z11) {
                L5 l10 = this.f37374a.z().f37643f;
                long j12 = j10 - l10.f37609b;
                l10.f37609b = j10;
                if (j12 > 0) {
                    this.f37374a.C().Z(bundle2, j12);
                }
            }
            X2 x10 = this.f37374a;
            if (!x10.w().N()) {
                bundle2.putLong("_mst", 1L);
            }
            boolean z12 = e10.f37508e;
            String str3 = true != z12 ? "auto" : "app";
            long jCurrentTimeMillis = x10.e().currentTimeMillis();
            if (z12) {
                long j13 = e10.f37509f;
                if (j13 == 0) {
                    j11 = jCurrentTimeMillis;
                } else {
                    j11 = j13;
                }
            } else {
                j11 = jCurrentTimeMillis;
            }
            this.f37374a.B().u(str3, "_vs", j11, bundle2);
        }
        if (z11) {
            o(this.f37620e, true, j10);
        }
        this.f37620e = e10;
        if (e10.f37508e) {
            this.f37625j = e10;
        }
        this.f37374a.J().u(e10);
    }

    private final void o(E4 e10, boolean z9, long j10) {
        X2 x10 = this.f37374a;
        x10.M().k(x10.e().elapsedRealtime());
        if (!x10.z().f37643f.d(e10 != null && e10.f37507d, z9, j10) || e10 == null) {
            return;
        }
        e10.f37507d = false;
    }

    private final E4 p(com.google.android.gms.internal.measurement.J0 j10) {
        Preconditions.checkNotNull(j10);
        Integer numValueOf = Integer.valueOf(j10.f36306a);
        Map map = this.f37621f;
        E4 e10 = (E4) map.get(numValueOf);
        if (e10 == null) {
            E4 e11 = new E4(null, r(j10.f36307b, "Activity"), this.f37374a.C().p0());
            map.put(numValueOf, e11);
            e10 = e11;
        }
        return this.f37624i != null ? this.f37624i : e10;
    }

    final /* synthetic */ void A(Bundle bundle, E4 e10, E4 e11, long j10) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        G(e10, e11, j10, true, this.f37374a.C().t(null, "screen_view", bundle, null, false));
    }

    final /* synthetic */ void B(E4 e10, E4 e11, long j10, boolean z9, Bundle bundle) {
        G(e10, e11, j10, z9, null);
    }

    final /* synthetic */ void C(E4 e10, boolean z9, long j10) {
        o(e10, false, j10);
    }

    final /* synthetic */ E4 D() {
        return this.f37625j;
    }

    final /* synthetic */ void E(E4 e10) {
        this.f37625j = null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6530f2
    protected final boolean m() {
        return false;
    }

    public final E4 q(boolean z9) {
        j();
        h();
        if (!z9) {
            return this.f37620e;
        }
        E4 e10 = this.f37620e;
        return e10 != null ? e10 : this.f37625j;
    }

    final String r(String str, String str2) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str3 = length > 0 ? strArrSplit[length - 1] : "";
        X2 x10 = this.f37374a;
        return str3.length() > x10.w().x(null, false) ? str3.substring(0, x10.w().x(null, false)) : str3;
    }

    public final void s(Bundle bundle, long j10) {
        synchronized (this.f37627l) {
            try {
                if (!this.f37626k) {
                    this.f37374a.a().t().a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle.getString("screen_name");
                if (string != null && (string.length() <= 0 || string.length() > this.f37374a.w().x(null, false))) {
                    this.f37374a.a().t().b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle.getString("screen_class");
                if (string2 != null && (string2.length() <= 0 || string2.length() > this.f37374a.w().x(null, false))) {
                    this.f37374a.a().t().b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                }
                if (string2 == null) {
                    com.google.android.gms.internal.measurement.J0 j11 = this.f37622g;
                    string2 = j11 != null ? r(j11.f36307b, "Activity") : "Activity";
                }
                E4 e10 = this.f37618c;
                if (this.f37623h && e10 != null) {
                    this.f37623h = false;
                    boolean zEquals = Objects.equals(e10.f37505b, string2);
                    boolean zEquals2 = Objects.equals(e10.f37504a, string);
                    if (zEquals && zEquals2) {
                        this.f37374a.a().t().a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                X2 x10 = this.f37374a;
                x10.a().w().c("Logging screen view with name, class", string == null ? "null" : string, string2 == null ? "null" : string2);
                E4 e11 = this.f37618c == null ? this.f37619d : this.f37618c;
                E4 e12 = new E4(string, string2, x10.C().p0(), true, j10);
                this.f37618c = e12;
                this.f37619d = e11;
                this.f37624i = e12;
                x10.b().t(new F4(this, bundle, e12, e11, x10.e().elapsedRealtime()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t(com.google.android.gms.internal.measurement.J0 j10, String str, String str2) {
        X2 x10 = this.f37374a;
        if (!x10.w().N()) {
            x10.a().t().a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        E4 e10 = this.f37618c;
        if (e10 == null) {
            x10.a().t().a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        Map map = this.f37621f;
        Integer numValueOf = Integer.valueOf(j10.f36306a);
        if (map.get(numValueOf) == null) {
            x10.a().t().a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = r(j10.f36307b, "Activity");
        }
        String str3 = e10.f37505b;
        String str4 = e10.f37504a;
        boolean zEquals = Objects.equals(str3, str2);
        boolean zEquals2 = Objects.equals(str4, str);
        if (zEquals && zEquals2) {
            x10.a().t().a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > x10.w().x(null, false))) {
            x10.a().t().b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > x10.w().x(null, false))) {
            x10.a().t().b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        x10.a().w().c("Setting current screen to name, class", str == null ? "null" : str, str2);
        E4 e11 = new E4(str, str2, x10.C().p0());
        map.put(numValueOf, e11);
        F(j10.f36307b, e11, true);
    }

    public final E4 u() {
        return this.f37618c;
    }

    public final void v(com.google.android.gms.internal.measurement.J0 j10, Bundle bundle) {
        Bundle bundle2;
        if (!this.f37374a.w().N() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f37621f.put(Integer.valueOf(j10.f36306a), new E4(bundle2.getString(MediationMetaData.KEY_NAME), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void w(com.google.android.gms.internal.measurement.J0 j10) {
        Object obj = this.f37627l;
        synchronized (obj) {
            this.f37626k = true;
            if (!Objects.equals(j10, this.f37622g)) {
                synchronized (obj) {
                    this.f37622g = j10;
                    this.f37623h = false;
                    X2 x10 = this.f37374a;
                    if (x10.w().N()) {
                        this.f37624i = null;
                        x10.b().t(new L4(this));
                    }
                }
            }
        }
        X2 x11 = this.f37374a;
        if (!x11.w().N()) {
            this.f37618c = this.f37624i;
            x11.b().t(new H4(this));
            return;
        }
        F(j10.f36307b, p(j10), false);
        C0 c0M = this.f37374a.M();
        X2 x12 = c0M.f37374a;
        x12.b().t(new RunnableC6496b0(c0M, x12.e().elapsedRealtime()));
    }

    public final void x(com.google.android.gms.internal.measurement.J0 j10) {
        synchronized (this.f37627l) {
            this.f37626k = false;
            this.f37623h = true;
        }
        X2 x10 = this.f37374a;
        long jElapsedRealtime = x10.e().elapsedRealtime();
        if (!x10.w().N()) {
            this.f37618c = null;
            x10.b().t(new I4(this, jElapsedRealtime));
        } else {
            E4 e4P = p(j10);
            this.f37619d = this.f37618c;
            this.f37618c = null;
            x10.b().t(new J4(this, e4P, jElapsedRealtime));
        }
    }

    public final void y(com.google.android.gms.internal.measurement.J0 j10, Bundle bundle) {
        E4 e10;
        if (!this.f37374a.w().N() || bundle == null || (e10 = (E4) this.f37621f.get(Integer.valueOf(j10.f36306a))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", e10.f37506c);
        bundle2.putString(MediationMetaData.KEY_NAME, e10.f37504a);
        bundle2.putString("referrer_name", e10.f37505b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void z(com.google.android.gms.internal.measurement.J0 j10) {
        synchronized (this.f37627l) {
            try {
                if (Objects.equals(this.f37622g, j10)) {
                    this.f37622g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.f37374a.w().N()) {
            this.f37621f.remove(Integer.valueOf(j10.f36306a));
        }
    }
}
