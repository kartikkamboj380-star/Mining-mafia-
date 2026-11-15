package com.google.android.gms.internal.ads;

import H4.C0654z;
import K4.AbstractC0786o0;
import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.tenjin.android.config.TenjinConsts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class BT implements InterfaceC3361eU, InterfaceC4239lT {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MT f17602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3487fU f17603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C4365mT f17604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C5624wT f17605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C4113kT f17606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ZT f17607f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final IT f17608g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final IT f17609h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f17610i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Context f17611j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f17612k;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private JSONObject f17617p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f17620s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f17621t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f17622u;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map f17613l = new HashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Map f17614m = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f17615n = new HashMap();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f17616o = "{}";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f17618q = Long.MAX_VALUE;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private EnumC5750xT f17619r = EnumC5750xT.NONE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private AT f17623v = AT.UNKNOWN;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f17624w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f17625x = "";

    BT(MT mt, C3487fU c3487fU, C4365mT c4365mT, Context context, L4.a aVar, C5624wT c5624wT, ZT zt, IT it, IT it2, String str) {
        this.f17602a = mt;
        this.f17603b = c3487fU;
        this.f17604c = c4365mT;
        this.f17606e = new C4113kT(context);
        this.f17610i = aVar.f3097a;
        this.f17612k = str;
        this.f17605d = c5624wT;
        this.f17607f = zt;
        this.f17608g = it;
        this.f17609h = it2;
        this.f17611j = context;
        G4.t.s().a(this);
    }

    private final void A() {
        G4.t.l().r().E0(i());
    }

    private final synchronized void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            u(jSONObject.optBoolean("isTestMode", false), false);
            v((EnumC5750xT) Enum.valueOf(EnumC5750xT.class, jSONObject.optString("gesture", "NONE")), false);
            this.f17616o = jSONObject.optString("networkExtras", "{}");
            this.f17618q = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x000a, B:10:0x001c, B:15:0x0029, B:20:0x0038, B:16:0x002d, B:18:0x0033), top: B:27:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0033 A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x000a, B:10:0x001c, B:15:0x0029, B:20:0x0038, B:16:0x002d, B:18:0x0033), top: B:27:0x0001 }] */
    private final synchronized void u(boolean z9, boolean z10) {
        try {
            if (this.f17620s != z9) {
                this.f17620s = z9;
                if (z9) {
                    if (!((Boolean) H4.B.c().d(AbstractC3892ii.Ga)).booleanValue() || !G4.t.s().k()) {
                        y();
                    } else if (!t()) {
                        z();
                    }
                } else if (!t()) {
                    z();
                }
                if (z10) {
                    A();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void v(EnumC5750xT enumC5750xT, boolean z9) {
        try {
            if (this.f17619r != enumC5750xT) {
                if (t()) {
                    z();
                }
                this.f17619r = enumC5750xT;
                if (t()) {
                    y();
                }
                if (z9) {
                    A();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized JSONObject w() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.f17613l.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                for (C4617oT c4617oT : (List) entry.getValue()) {
                    if (c4617oT.a()) {
                        jSONArray.put(c4617oT.e());
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put((String) entry.getKey(), jSONArray);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    private final void x() {
        this.f17622u = true;
        this.f17605d.a();
        this.f17602a.b(this);
        this.f17603b.b(this);
        this.f17604c.b(this);
        this.f17607f.y6(this);
        AbstractC2759Zh abstractC2759Zh = AbstractC3892ii.Va;
        if (!TextUtils.isEmpty((CharSequence) H4.B.c().d(abstractC2759Zh))) {
            this.f17608g.a(PreferenceManager.getDefaultSharedPreferences(this.f17611j), Arrays.asList(((String) H4.B.c().d(abstractC2759Zh)).split(",")));
        }
        AbstractC2759Zh abstractC2759Zh2 = AbstractC3892ii.Wa;
        if (!TextUtils.isEmpty((CharSequence) H4.B.c().d(abstractC2759Zh2))) {
            this.f17609h.a(this.f17611j.getSharedPreferences(TenjinConsts.AD_NETWORK_ADMOB, 0), Arrays.asList(((String) H4.B.c().d(abstractC2759Zh2)).split(",")));
        }
        a(G4.t.l().r().w());
        this.f17625x = G4.t.l().r().E();
    }

    private final synchronized void y() {
        int iOrdinal = this.f17619r.ordinal();
        if (iOrdinal == 1) {
            this.f17603b.c();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.f17604c.c();
        }
    }

    private final synchronized void z() {
        int iOrdinal = this.f17619r.ordinal();
        if (iOrdinal == 1) {
            this.f17603b.d();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.f17604c.d();
        }
    }

    public final void b() {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.ra)).booleanValue()) {
            if (((Boolean) H4.B.c().d(AbstractC3892ii.Ga)).booleanValue() && G4.t.l().r().F()) {
                x();
                return;
            }
            String strW = G4.t.l().r().w();
            if (TextUtils.isEmpty(strW)) {
                return;
            }
            try {
                if (new JSONObject(strW).optBoolean("isTestMode", false)) {
                    x();
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0011  */
    public final void c(boolean z9) {
        if (this.f17622u) {
            if (z9) {
                if (!this.f17620s) {
                    y();
                    return;
                }
            }
        } else if (z9) {
            x();
            if (!this.f17620s) {
                y();
                return;
            }
        }
        if (t()) {
            return;
        }
        z();
    }

    public final void d(boolean z9) {
        if (!this.f17622u && z9) {
            x();
        }
        u(z9, true);
    }

    public final synchronized boolean e() {
        return this.f17620s;
    }

    public final void f(EnumC5750xT enumC5750xT) {
        v(enumC5750xT, true);
    }

    public final EnumC5750xT g() {
        return this.f17619r;
    }

    public final synchronized String h() {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.ra)).booleanValue() && t()) {
            if (this.f17618q < G4.t.o().currentTimeMillis() / 1000) {
                this.f17616o = "{}";
                this.f17618q = Long.MAX_VALUE;
                return "";
            }
            if (!this.f17616o.equals("{}")) {
                return this.f17616o;
            }
        }
        return "";
    }

    public final synchronized String i() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.f17620s);
            jSONObject.put("gesture", this.f17619r);
            if (this.f17618q > G4.t.o().currentTimeMillis() / 1000) {
                jSONObject.put("networkExtras", this.f17616o);
                jSONObject.put("networkExtrasExpirationSecs", this.f17618q);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized void j(String str, long j10) {
        this.f17616o = str;
        this.f17618q = j10;
        A();
    }

    public final synchronized void k(String str) {
        this.f17625x = str;
        G4.t.l().r().L0(this.f17625x);
    }

    public final synchronized void l(String str, C4617oT c4617oT) {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.ra)).booleanValue() && t()) {
            if (this.f17621t >= ((Integer) H4.B.c().d(AbstractC3892ii.ta)).intValue()) {
                int i10 = AbstractC0786o0.f2696b;
                L4.p.f("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            Map map = this.f17613l;
            if (!map.containsKey(str)) {
                map.put(str, new ArrayList());
            }
            this.f17621t++;
            ((List) map.get(str)).add(c4617oT);
            if (((Boolean) H4.B.c().d(AbstractC3892ii.Pa)).booleanValue()) {
                String strB = c4617oT.b();
                this.f17614m.put(strB, c4617oT);
                Map map2 = this.f17615n;
                if (map2.containsKey(strB)) {
                    List list = (List) map2.get(strB);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C2575Vt) it.next()).b(c4617oT);
                    }
                    list.clear();
                }
            }
        }
    }

    public final synchronized void m(long j10) {
        this.f17624w += j10;
    }

    public final boolean n() {
        return this.f17624w < ((Long) H4.B.c().d(AbstractC3892ii.Ma)).longValue();
    }

    public final synchronized com.google.common.util.concurrent.p o(String str) {
        C2575Vt c2575Vt;
        try {
            c2575Vt = new C2575Vt();
            Map map = this.f17614m;
            if (map.containsKey(str)) {
                c2575Vt.b((C4617oT) map.get(str));
            } else {
                Map map2 = this.f17615n;
                if (!map2.containsKey(str)) {
                    map2.put(str, new ArrayList());
                }
                ((List) map2.get(str)).add(c2575Vt);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c2575Vt;
    }

    public final synchronized void p(H4.M0 m10, AT at) {
        if (!t()) {
            try {
                m10.D0(AbstractC3127cc0.d(18, null, null));
                return;
            } catch (RemoteException unused) {
                int i10 = AbstractC0786o0.f2696b;
                L4.p.f("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) H4.B.c().d(AbstractC3892ii.ra)).booleanValue()) {
            this.f17623v = at;
            this.f17602a.d(m10, new C3900im(this), new C2895am(this.f17607f), new C2143Nl(this));
            return;
        } else {
            try {
                m10.D0(AbstractC3127cc0.d(1, null, null));
                return;
            } catch (RemoteException unused2) {
                int i11 = AbstractC0786o0.f2696b;
                L4.p.f("Ad inspector had an internal error.");
                return;
            }
        }
        throw th;
    }

    public final synchronized void q(JSONObject jSONObject) {
        this.f17617p = jSONObject;
    }

    public final boolean r() {
        return this.f17617p != null;
    }

    public final synchronized JSONObject s() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("platform", "ANDROID");
                String str = this.f17612k;
                if (!TextUtils.isEmpty(str)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                    sb.append("afma-sdk-a-v");
                    sb.append(str);
                    jSONObject.put("sdkVersion", sb.toString());
                }
                jSONObject.put("internalSdkVersion", this.f17610i);
                jSONObject.put("osVersion", Build.VERSION.RELEASE);
                jSONObject.put("adapters", this.f17605d.b());
                if (((Boolean) H4.B.c().d(AbstractC3892ii.Sa)).booleanValue()) {
                    String strX = G4.t.l().x();
                    if (!TextUtils.isEmpty(strX)) {
                        jSONObject.put("plugin", strX);
                    }
                }
                if (this.f17618q < G4.t.o().currentTimeMillis() / 1000) {
                    this.f17616o = "{}";
                }
                jSONObject.put("networkExtras", this.f17616o);
                jSONObject.put("adSlots", w());
                jSONObject.put("appInfo", this.f17606e.a());
                String strD = G4.t.l().r().zzi().d();
                if (!TextUtils.isEmpty(strD)) {
                    jSONObject.put("cld", new JSONObject(strD));
                }
                if (((Boolean) H4.B.c().d(AbstractC3892ii.Ha)).booleanValue() && (jSONObject2 = this.f17617p) != null) {
                    String string = jSONObject2.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 13);
                    sb2.append("Server data: ");
                    sb2.append(string);
                    String string2 = sb2.toString();
                    int i10 = AbstractC0786o0.f2696b;
                    L4.p.a(string2);
                    jSONObject.put("serverData", this.f17617p);
                }
                if (((Boolean) H4.B.c().d(AbstractC3892ii.Ga)).booleanValue()) {
                    jSONObject.put("openAction", this.f17623v);
                    jSONObject.put("gesture", this.f17619r);
                }
                jSONObject.put("isGamRegisteredTestDevice", G4.t.s().k());
                G4.t.g();
                C0654z.a();
                jSONObject.put("isSimulator", L4.g.D());
                if (((Boolean) H4.B.c().d(AbstractC3892ii.Ua)).booleanValue()) {
                    jSONObject.put("uiStorage", new JSONObject(this.f17625x));
                }
                if (!TextUtils.isEmpty((CharSequence) H4.B.c().d(AbstractC3892ii.Wa))) {
                    jSONObject.put("gmaDisk", this.f17609h.b());
                }
                if (!TextUtils.isEmpty((CharSequence) H4.B.c().d(AbstractC3892ii.Va))) {
                    jSONObject.put("userDisk", this.f17608g.b());
                }
            } catch (JSONException e10) {
                G4.t.l().k(e10, "Inspector.toJson");
                int i11 = AbstractC0786o0.f2696b;
                L4.p.g("Ad inspector encountered an error", e10);
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public final synchronized boolean t() {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.Ga)).booleanValue()) {
            return this.f17620s || G4.t.s().k();
        }
        return this.f17620s;
    }
}
