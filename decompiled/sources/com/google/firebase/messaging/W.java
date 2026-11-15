package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class W extends AbstractSafeParcelable {
    public static final Parcelable.Creator<W> CREATOR = new X();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Bundle f40173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f40174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f40175c;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bundle f40176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f40177b;

        public b(String str) {
            Bundle bundle = new Bundle();
            this.f40176a = bundle;
            this.f40177b = new p190t.a();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("google.to", str);
                return;
            }
            throw new IllegalArgumentException("Invalid to: " + str);
        }

        public b a(String str, String str2) {
            this.f40177b.put(str, str2);
            return this;
        }

        public W b() {
            Bundle bundle = new Bundle();
            for (Map.Entry entry : this.f40177b.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            bundle.putAll(this.f40176a);
            this.f40176a.remove("from");
            return new W(bundle);
        }

        public b c(String str) {
            this.f40176a.putString("collapse_key", str);
            return this;
        }

        public b d(String str) {
            this.f40176a.putString("google.message_id", str);
            return this;
        }

        public b e(String str) {
            this.f40176a.putString("message_type", str);
            return this;
        }

        public b f(int i10) {
            this.f40176a.putString("google.ttl", String.valueOf(i10));
            return this;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f40178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f40179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String[] f40180c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f40181d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f40182e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String[] f40183f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f40184g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final String f40185h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final String f40186i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final String f40187j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final String f40188k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final String f40189l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final String f40190m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Uri f40191n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final String f40192o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final Integer f40193p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final Integer f40194q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final Integer f40195r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final int[] f40196s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Long f40197t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final boolean f40198u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final boolean f40199v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final boolean f40200w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final boolean f40201x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private final boolean f40202y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private final long[] f40203z;

        private static String[] j(N n10, String str) {
            Object[] objArrG = n10.g(str);
            if (objArrG == null) {
                return null;
            }
            String[] strArr = new String[objArrG.length];
            for (int i10 = 0; i10 < objArrG.length; i10++) {
                strArr[i10] = String.valueOf(objArrG[i10]);
            }
            return strArr;
        }

        public String a() {
            return this.f40181d;
        }

        public String[] b() {
            return this.f40183f;
        }

        public String c() {
            return this.f40182e;
        }

        public String d() {
            return this.f40190m;
        }

        public String e() {
            return this.f40189l;
        }

        public String f() {
            return this.f40188k;
        }

        public String g() {
            return this.f40184g;
        }

        public Uri h() {
            String str = this.f40185h;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        public Uri i() {
            return this.f40191n;
        }

        public Integer k() {
            return this.f40195r;
        }

        public Integer l() {
            return this.f40193p;
        }

        public String m() {
            return this.f40186i;
        }

        public String n() {
            return this.f40192o;
        }

        public String o() {
            return this.f40178a;
        }

        public String[] p() {
            return this.f40180c;
        }

        public String q() {
            return this.f40179b;
        }

        public Integer r() {
            return this.f40194q;
        }

        private c(N n10) {
            this.f40178a = n10.p("gcm.n.title");
            this.f40179b = n10.h("gcm.n.title");
            this.f40180c = j(n10, "gcm.n.title");
            this.f40181d = n10.p("gcm.n.body");
            this.f40182e = n10.h("gcm.n.body");
            this.f40183f = j(n10, "gcm.n.body");
            this.f40184g = n10.p("gcm.n.icon");
            this.f40186i = n10.o();
            this.f40187j = n10.p("gcm.n.tag");
            this.f40188k = n10.p("gcm.n.color");
            this.f40189l = n10.p("gcm.n.click_action");
            this.f40190m = n10.p("gcm.n.android_channel_id");
            this.f40191n = n10.f();
            this.f40185h = n10.p("gcm.n.image");
            this.f40192o = n10.p("gcm.n.ticker");
            this.f40193p = n10.b("gcm.n.notification_priority");
            this.f40194q = n10.b("gcm.n.visibility");
            this.f40195r = n10.b("gcm.n.notification_count");
            this.f40198u = n10.a("gcm.n.sticky");
            this.f40199v = n10.a("gcm.n.local_only");
            this.f40200w = n10.a("gcm.n.default_sound");
            this.f40201x = n10.a("gcm.n.default_vibrate_timings");
            this.f40202y = n10.a("gcm.n.default_light_settings");
            this.f40197t = n10.j("gcm.n.event_time");
            this.f40196s = n10.e();
            this.f40203z = n10.q();
        }
    }

    public W(Bundle bundle) {
        this.f40173a = bundle;
    }

    private int N(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    public String I0() {
        return this.f40173a.getString("google.to");
    }

    public String J() {
        String string = this.f40173a.getString("google.message_id");
        return string == null ? this.f40173a.getString("message_id") : string;
    }

    public String Q() {
        return this.f40173a.getString("message_type");
    }

    public int R0() {
        Object obj = this.f40173a.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }

    public c S() {
        if (this.f40175c == null && N.t(this.f40173a)) {
            this.f40175c = new c(new N(this.f40173a));
        }
        return this.f40175c;
    }

    public int T() {
        String string = this.f40173a.getString("google.original_priority");
        if (string == null) {
            string = this.f40173a.getString("google.priority");
        }
        return N(string);
    }

    void V0(Intent intent) {
        intent.putExtras(this.f40173a);
    }

    public int W() {
        String string = this.f40173a.getString("google.delivered_priority");
        if (string == null) {
            if (UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(this.f40173a.getString("google.priority_reduced"))) {
                return 2;
            }
            string = this.f40173a.getString("google.priority");
        }
        return N(string);
    }

    public String a() {
        return this.f40173a.getString("collapse_key");
    }

    public long a0() {
        Object obj = this.f40173a.get("google.sent_time");
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return 0L;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid sent time: " + obj);
            return 0L;
        }
    }

    public Map j() {
        if (this.f40174b == null) {
            this.f40174b = AbstractC6716e.a.a(this.f40173a);
        }
        return this.f40174b;
    }

    public String v() {
        return this.f40173a.getString("from");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        X.c(this, parcel, i10);
    }
}
