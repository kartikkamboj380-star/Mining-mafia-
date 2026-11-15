package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.C6182d0;
import com.google.android.gms.internal.measurement.C6184d2;
import com.google.android.gms.internal.measurement.C6211g2;
import com.google.android.gms.internal.measurement.C6229i2;
import com.google.android.gms.internal.measurement.C6238j2;
import com.google.android.gms.internal.measurement.C6256l2;
import com.google.android.gms.internal.measurement.C6265m2;
import com.google.android.gms.internal.measurement.C6286o5;
import com.google.android.gms.internal.measurement.C6321s5;
import com.google.android.gms.internal.measurement.C6336u2;
import com.google.android.gms.internal.measurement.InterfaceC6350v7;
import com.google.android.gms.internal.measurement.Q7;
import com.google.android.gms.internal.measurement.R7;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class P2 extends AbstractC6502b6 implements InterfaceC6574l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f37660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Map f37661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Map f37662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Map f37663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f37664h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f37665i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final p190t.j f37666j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final InterfaceC6350v7 f37667k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map f37668l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Map f37669m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f37670n;

    P2(q6 q6Var) {
        super(q6Var);
        this.f37660d = new p190t.a();
        this.f37661e = new p190t.a();
        this.f37662f = new p190t.a();
        this.f37663g = new p190t.a();
        this.f37664h = new p190t.a();
        this.f37668l = new p190t.a();
        this.f37669m = new p190t.a();
        this.f37670n = new p190t.a();
        this.f37665i = new p190t.a();
        this.f37666j = new I2(this, 20);
        this.f37667k = new J2(this);
    }

    private final void q(String str) throws Throwable {
        j();
        h();
        Preconditions.checkNotEmpty(str);
        Map map = this.f37664h;
        if (map.get(str) == null) {
            C6602p c6602pN0 = this.f37773b.F0().N0(str);
            if (c6602pN0 != null) {
                C6256l2 c6256l2 = (C6256l2) t(str, c6602pN0.f38248a).p();
                r(str, c6256l2);
                this.f37660d.put(str, u((C6265m2) c6256l2.p()));
                map.put(str, (C6265m2) c6256l2.p());
                s(str, (C6265m2) c6256l2.p());
                this.f37668l.put(str, c6256l2.A());
                this.f37669m.put(str, c6602pN0.f38249b);
                this.f37670n.put(str, c6602pN0.f38250c);
                return;
            }
            this.f37660d.put(str, null);
            this.f37662f.put(str, null);
            this.f37661e.put(str, null);
            this.f37663g.put(str, null);
            map.put(str, null);
            this.f37668l.put(str, null);
            this.f37669m.put(str, null);
            this.f37670n.put(str, null);
            this.f37665i.put(str, null);
        }
    }

    private final void r(String str, C6256l2 c6256l2) {
        HashSet hashSet = new HashSet();
        p190t.a aVar = new p190t.a();
        p190t.a aVar2 = new p190t.a();
        p190t.a aVar3 = new p190t.a();
        Iterator it = c6256l2.z().iterator();
        while (it.hasNext()) {
            hashSet.add(((C6229i2) it.next()).C());
        }
        for (int i10 = 0; i10 < c6256l2.s(); i10++) {
            C6238j2 c6238j2 = (C6238j2) c6256l2.t(i10).p();
            if (c6238j2.s().isEmpty()) {
                this.f37374a.a().r().a("EventConfig contained null event name");
            } else {
                String strS = c6238j2.s();
                String strB = p136n5.w.b(c6238j2.s());
                if (!TextUtils.isEmpty(strB)) {
                    c6238j2.t(strB);
                    c6256l2.u(i10, c6238j2);
                }
                if (c6238j2.u() && c6238j2.w()) {
                    aVar.put(strS, Boolean.TRUE);
                }
                if (c6238j2.x() && c6238j2.y()) {
                    aVar2.put(c6238j2.s(), Boolean.TRUE);
                }
                if (c6238j2.z()) {
                    if (c6238j2.A() < 2 || c6238j2.A() > 65535) {
                        this.f37374a.a().r().c("Invalid sampling rate. Event name, sample rate", c6238j2.s(), Integer.valueOf(c6238j2.A()));
                    } else {
                        aVar3.put(c6238j2.s(), Integer.valueOf(c6238j2.A()));
                    }
                }
            }
        }
        this.f37661e.put(str, hashSet);
        this.f37662f.put(str, aVar);
        this.f37663g.put(str, aVar2);
        this.f37665i.put(str, aVar3);
    }

    private final void s(final String str, C6265m2 c6265m2) {
        if (c6265m2.M() == 0) {
            this.f37666j.e(str);
            return;
        }
        X2 x10 = this.f37374a;
        x10.a().w().b("EES programs found", Integer.valueOf(c6265m2.M()));
        com.google.android.gms.internal.measurement.E3 e10 = (com.google.android.gms.internal.measurement.E3) c6265m2.L().get(0);
        try {
            C6182d0 c6182d0 = new C6182d0();
            c6182d0.a("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.O2
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return new C6321s5("internal.remoteConfig", new K2(this.f37648a, str));
                }
            });
            c6182d0.a("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.L2
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    final P2 p10 = this.f37604a;
                    final String str2 = str;
                    return new R7("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.N2
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            P2 p11 = p10;
                            C6636u c6636uF0 = p11.f37773b.F0();
                            String str3 = str2;
                            C6653w2 c6653w2J0 = c6636uF0.J0(str3);
                            HashMap map = new HashMap();
                            map.put("platform", "android");
                            map.put("package_name", str3);
                            p11.f37374a.w().A();
                            map.put("gmp_version", 133005L);
                            if (c6653w2J0 != null) {
                                String strD0 = c6653w2J0.D0();
                                if (strD0 != null) {
                                    map.put("app_version", strD0);
                                }
                                map.put("app_version_int", Long.valueOf(c6653w2J0.F0()));
                                map.put("dynamite_version", Long.valueOf(c6653w2J0.b()));
                            }
                            return map;
                        }
                    });
                }
            });
            c6182d0.a("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.M2
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return new Q7(this.f37615a.f37667k);
                }
            });
            c6182d0.f(e10);
            this.f37666j.d(str, c6182d0);
            x10.a().w().c("EES program loaded for appId, activities", str, Integer.valueOf(e10.D().D()));
            Iterator it = e10.D().C().iterator();
            while (it.hasNext()) {
                x10.a().w().b("EES program activity", ((com.google.android.gms.internal.measurement.B3) it.next()).C());
            }
        } catch (com.google.android.gms.internal.measurement.D0 unused) {
            this.f37374a.a().o().b("Failed to load EES program. appId", str);
        }
    }

    private final C6265m2 t(String str, byte[] bArr) {
        if (bArr == null) {
            return C6265m2.W();
        }
        try {
            C6265m2 c6265m2 = (C6265m2) ((C6256l2) u6.W(C6265m2.V(), bArr)).p();
            this.f37374a.a().w().c("Parsed config. version, gmp_app_id", c6265m2.C() ? Long.valueOf(c6265m2.D()) : null, c6265m2.E() ? c6265m2.F() : null);
            return c6265m2;
        } catch (C6286o5 e10) {
            this.f37374a.a().r().c("Unable to merge remote config. appId", C6612q2.x(str), e10);
            return C6265m2.W();
        } catch (RuntimeException e11) {
            this.f37374a.a().r().c("Unable to merge remote config. appId", C6612q2.x(str), e11);
            return C6265m2.W();
        }
    }

    private static final Map u(C6265m2 c6265m2) {
        p190t.a aVar = new p190t.a();
        if (c6265m2 != null) {
            for (C6336u2 c6336u2 : c6265m2.G()) {
                aVar.put(c6336u2.C(), c6336u2.D());
            }
        }
        return aVar;
    }

    private static final p136n5.v v(int i10) {
        int i11 = i10 - 1;
        if (i11 == 1) {
            return p136n5.v.AD_STORAGE;
        }
        if (i11 == 2) {
            return p136n5.v.ANALYTICS_STORAGE;
        }
        if (i11 == 3) {
            return p136n5.v.AD_USER_DATA;
        }
        if (i11 != 4) {
            return null;
        }
        return p136n5.v.AD_PERSONALIZATION;
    }

    protected final void A(String str) {
        h();
        this.f37669m.put(str, null);
    }

    final void B(String str) {
        h();
        this.f37664h.remove(str);
    }

    protected final boolean C(String str, byte[] bArr, String str2, String str3) throws Throwable {
        j();
        h();
        Preconditions.checkNotEmpty(str);
        C6256l2 c6256l2 = (C6256l2) t(str, bArr).p();
        r(str, c6256l2);
        s(str, (C6265m2) c6256l2.p());
        this.f37664h.put(str, (C6265m2) c6256l2.p());
        this.f37668l.put(str, c6256l2.A());
        this.f37669m.put(str, str2);
        this.f37670n.put(str, str3);
        this.f37660d.put(str, u((C6265m2) c6256l2.p()));
        this.f37773b.F0().Y(str, new ArrayList(c6256l2.w()));
        try {
            c6256l2.x();
            bArr = ((C6265m2) c6256l2.p()).a();
        } catch (RuntimeException e10) {
            this.f37374a.a().r().c("Unable to serialize reduced-size config. Storing full config instead. appId", C6612q2.x(str), e10);
        }
        C6636u c6636uF0 = this.f37773b.F0();
        Preconditions.checkNotEmpty(str);
        c6636uF0.h();
        c6636uF0.j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (c6636uF0.u0().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                c6636uF0.f37374a.a().o().b("Failed to update remote config (got 0). appId", C6612q2.x(str));
            }
        } catch (SQLiteException e11) {
            c6636uF0.f37374a.a().o().c("Error storing remote config. appId", C6612q2.x(str), e11);
        }
        c6256l2.y();
        this.f37664h.put(str, (C6265m2) c6256l2.p());
        return true;
    }

    final boolean D(String str, String str2) throws Throwable {
        Boolean bool;
        h();
        q(str);
        if (H(str) && z6.N(str2)) {
            return true;
        }
        if (I(str) && z6.r0(str2)) {
            return true;
        }
        Map map = (Map) this.f37662f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final boolean E(String str, String str2) throws Throwable {
        Boolean bool;
        h();
        q(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f37663g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final Set F(String str) {
        h();
        q(str);
        return (Set) this.f37661e.get(str);
    }

    final int G(String str, String str2) throws Throwable {
        Integer num;
        h();
        q(str);
        Map map = (Map) this.f37665i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    final boolean H(String str) {
        return UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(f(str, "measurement.upload.blacklist_internal"));
    }

    final boolean I(String str) {
        return UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(f(str, "measurement.upload.blacklist_public"));
    }

    final boolean J(String str) throws Throwable {
        h();
        q(str);
        Map map = this.f37661e;
        if (map.get(str) != null) {
            return ((Set) map.get(str)).contains("device_model") || ((Set) map.get(str)).contains("device_info");
        }
        return false;
    }

    final boolean K(String str) throws Throwable {
        h();
        q(str);
        Map map = this.f37661e;
        if (map.get(str) != null) {
            return ((Set) map.get(str)).contains("os_version") || ((Set) map.get(str)).contains("device_info");
        }
        return false;
    }

    final boolean L(String str) throws Throwable {
        h();
        q(str);
        Map map = this.f37661e;
        return map.get(str) != null && ((Set) map.get(str)).contains("user_id");
    }

    final boolean M(String str) throws Throwable {
        h();
        q(str);
        Map map = this.f37661e;
        return map.get(str) != null && ((Set) map.get(str)).contains("google_signals");
    }

    final boolean N(String str) throws Throwable {
        h();
        q(str);
        Map map = this.f37661e;
        return map.get(str) != null && ((Set) map.get(str)).contains("app_instance_id");
    }

    final boolean O(String str) throws Throwable {
        h();
        q(str);
        Map map = this.f37661e;
        return map.get(str) != null && ((Set) map.get(str)).contains("enhanced_user_id");
    }

    final boolean P(String str, p136n5.v vVar) throws Throwable {
        h();
        q(str);
        C6211g2 c6211g2R = R(str);
        if (c6211g2R == null) {
            return false;
        }
        for (com.google.android.gms.internal.measurement.U1 u10 : c6211g2R.C()) {
            if (vVar == v(u10.D())) {
                if (u10.E() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    final p136n5.v Q(String str, p136n5.v vVar) {
        h();
        q(str);
        C6211g2 c6211g2R = R(str);
        if (c6211g2R == null) {
            return null;
        }
        for (com.google.android.gms.internal.measurement.W1 w10 : c6211g2R.D()) {
            if (vVar == v(w10.D())) {
                return v(w10.E());
            }
        }
        return null;
    }

    final C6211g2 R(String str) {
        h();
        q(str);
        C6265m2 c6265m2W = w(str);
        if (c6265m2W == null || !c6265m2W.P()) {
            return null;
        }
        return c6265m2W.Q();
    }

    final boolean S(String str) {
        h();
        q(str);
        C6211g2 c6211g2R = R(str);
        return c6211g2R == null || !c6211g2R.F() || c6211g2R.G();
    }

    final SortedSet T(String str) {
        h();
        q(str);
        TreeSet treeSet = new TreeSet();
        C6211g2 c6211g2R = R(str);
        if (c6211g2R != null) {
            Iterator it = c6211g2R.E().iterator();
            while (it.hasNext()) {
                treeSet.add(((C6184d2) it.next()).C());
            }
        }
        return treeSet;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC6574l
    public final String f(String str, String str2) throws Throwable {
        h();
        q(str);
        Map map = (Map) this.f37660d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6502b6
    protected final boolean l() {
        return false;
    }

    final p136n5.u m(String str, p136n5.v vVar) {
        h();
        q(str);
        C6211g2 c6211g2R = R(str);
        if (c6211g2R == null) {
            return p136n5.u.UNINITIALIZED;
        }
        for (com.google.android.gms.internal.measurement.U1 u10 : c6211g2R.H()) {
            if (v(u10.D()) == vVar) {
                int iE = u10.E() - 1;
                if (iE != 1) {
                    return iE != 2 ? p136n5.u.UNINITIALIZED : p136n5.u.DENIED;
                }
                return p136n5.u.GRANTED;
            }
        }
        return p136n5.u.UNINITIALIZED;
    }

    final boolean n(String str) throws Throwable {
        h();
        q(str);
        C6211g2 c6211g2R = R(str);
        if (c6211g2R == null) {
            return false;
        }
        for (com.google.android.gms.internal.measurement.U1 u10 : c6211g2R.C()) {
            if (u10.D() == 3 && u10.F() == 3) {
                return true;
            }
        }
        return false;
    }

    final /* synthetic */ C6182d0 o(String str) throws Throwable {
        j();
        Preconditions.checkNotEmpty(str);
        C6602p c6602pN0 = this.f37773b.F0().N0(str);
        if (c6602pN0 == null) {
            return null;
        }
        this.f37374a.a().w().b("Populate EES config from database on cache miss. appId", str);
        s(str, t(str, c6602pN0.f38248a));
        return (C6182d0) this.f37666j.h().get(str);
    }

    final /* synthetic */ Map p() {
        return this.f37660d;
    }

    protected final C6265m2 w(String str) {
        j();
        h();
        Preconditions.checkNotEmpty(str);
        q(str);
        return (C6265m2) this.f37664h.get(str);
    }

    final String x(String str) {
        h();
        q(str);
        return (String) this.f37668l.get(str);
    }

    protected final String y(String str) {
        h();
        return (String) this.f37669m.get(str);
    }

    protected final String z(String str) {
        h();
        return (String) this.f37670n.get(str);
    }
}
