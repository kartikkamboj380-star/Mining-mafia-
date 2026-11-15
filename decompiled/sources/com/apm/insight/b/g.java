package com.apm.insight.b;

import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.apm.insight.runtime.p;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f12763r = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f12764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f12765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f12766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f12767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f12768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f f12769f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f12770g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f12771h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f12772i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f12773j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f12774k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f12775l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.apm.insight.b.e f12776m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile boolean f12777n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f12778o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final p f12779p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile boolean f12780q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Runnable f12781s;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f12790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f12791b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f12792c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f12793d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f12794e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        StackTraceElement[] f12795f;

        private a() {
        }

        /* synthetic */ a(byte b10) {
            this();
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        a f12796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f12797b;

        final void a(a aVar) {
            throw null;
        }
    }

    public interface c {
    }

    public static class d {
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f12798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f12799b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f12800c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f12801d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f12802e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f12803f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        long f12804g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        String f12805h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f12806i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f12807j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private d f12808k;

        public final JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("msg", g.a(this.f12805h));
                jSONObject.put("cpuDuration", this.f12804g);
                jSONObject.put("duration", this.f12803f);
                jSONObject.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, this.f12801d);
                jSONObject.put("count", this.f12802e);
                jSONObject.put("messageCount", this.f12802e);
                jSONObject.put("lastDuration", this.f12799b - this.f12800c);
                jSONObject.put("start", this.f12798a);
                jSONObject.put("end", this.f12799b);
                jSONObject.put("block_uuid", (Object) null);
                jSONObject.put("sblock_uuid", (Object) null);
                jSONObject.put("belong_frame", false);
                return jSONObject;
            } catch (JSONException e10) {
                e10.printStackTrace();
                return jSONObject;
            }
        }

        final void b() {
            this.f12801d = -1;
            this.f12802e = -1;
            this.f12803f = -1L;
            this.f12805h = null;
            this.f12807j = null;
            this.f12808k = null;
            this.f12806i = null;
        }
    }

    public g() {
        this((byte) 0);
    }

    static /* synthetic */ b c() {
        return null;
    }

    static /* synthetic */ p e() {
        return null;
    }

    private g(byte b10) {
        this.f12765b = 0;
        this.f12766c = 0;
        this.f12767d = 100;
        this.f12768e = TTAdConstant.MATE_VALID;
        this.f12770g = -1L;
        this.f12771h = -1L;
        this.f12772i = -1;
        this.f12773j = -1L;
        this.f12777n = false;
        this.f12778o = false;
        this.f12780q = false;
        this.f12781s = new Runnable() { // from class: com.apm.insight.b.g.2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f12784b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f12783a = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f12785c = -1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f12786d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f12787e = 0;

            @Override // java.lang.Runnable
            public final void run() {
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (g.c().f12796a != null) {
                    throw null;
                }
                a aVar = new a((byte) 0);
                if (this.f12785c == g.this.f12766c) {
                    this.f12786d++;
                } else {
                    this.f12786d = 0;
                    this.f12787e = 0;
                    this.f12784b = jUptimeMillis;
                }
                this.f12785c = g.this.f12766c;
                int i10 = this.f12786d;
                if (i10 > 0 && i10 - this.f12787e >= g.f12763r && this.f12783a != 0 && jUptimeMillis - this.f12784b > 700 && g.this.f12780q) {
                    aVar.f12795f = Looper.getMainLooper().getThread().getStackTrace();
                    this.f12787e = this.f12786d;
                }
                aVar.f12793d = g.this.f12780q;
                aVar.f12792c = (jUptimeMillis - this.f12783a) - 300;
                aVar.f12790a = jUptimeMillis;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                this.f12783a = jUptimeMillis2;
                aVar.f12791b = jUptimeMillis2 - jUptimeMillis;
                aVar.f12794e = g.this.f12766c;
                g.e().a(g.this.f12781s, 300L);
                g.c().a(aVar);
            }
        };
        this.f12764a = new c() { // from class: com.apm.insight.b.g.1
        };
        this.f12779p = null;
    }

    static /* synthetic */ int d(g gVar) {
        int i10 = gVar.f12765b;
        gVar.f12765b = i10 + 1;
        return i10;
    }

    public final JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        try {
            int i10 = 0;
            for (e eVar : this.f12769f.a()) {
                if (eVar != null) {
                    i10++;
                    jSONArray.put(eVar.a().put("id", i10));
                }
            }
        } catch (Throwable unused) {
        }
        return jSONArray;
    }

    public final void a() {
        if (this.f12777n) {
            return;
        }
        this.f12777n = true;
        this.f12767d = 100;
        this.f12768e = 300;
        this.f12769f = new f(100);
        this.f12776m = new com.apm.insight.b.e() { // from class: com.apm.insight.b.g.3
            @Override // com.apm.insight.b.e
            public final boolean a() {
                return true;
            }

            @Override // com.apm.insight.b.e
            public final void b(String str) {
                super.b(str);
                g.d(g.this);
                g.a(g.this, false, com.apm.insight.b.e.f12757a);
                g gVar = g.this;
                gVar.f12774k = gVar.f12775l;
                g.this.f12775l = "no message running";
                g.this.f12780q = false;
            }

            @Override // com.apm.insight.b.e
            public final void a(String str) {
                g.this.f12780q = true;
                g.this.f12775l = str;
                super.a(str);
                g.a(g.this, true, com.apm.insight.b.e.f12757a);
            }
        };
        h.a();
        h.a(this.f12776m);
        j.a(j.a());
    }

    static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f12809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f12810b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private e f12811c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<e> f12812d = new ArrayList();

        f(int i10) {
            this.f12809a = i10;
        }

        final e a(int i10) {
            e eVar = this.f12811c;
            if (eVar != null) {
                eVar.f12801d = i10;
                this.f12811c = null;
                return eVar;
            }
            e eVar2 = new e();
            eVar2.f12801d = i10;
            return eVar2;
        }

        final void a(e eVar) {
            int size = this.f12812d.size();
            int i10 = this.f12809a;
            if (size < i10) {
                this.f12812d.add(eVar);
                this.f12810b = this.f12812d.size();
                return;
            }
            int i11 = this.f12810b % i10;
            this.f12810b = i11;
            e eVar2 = this.f12812d.set(i11, eVar);
            eVar2.b();
            this.f12811c = eVar2;
            this.f12810b++;
        }

        final List<e> a() {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            if (this.f12812d.size() == this.f12809a) {
                for (int i11 = this.f12810b; i11 < this.f12812d.size(); i11++) {
                    arrayList.add(this.f12812d.get(i11));
                }
                while (i10 < this.f12810b - 1) {
                    arrayList.add(this.f12812d.get(i10));
                    i10++;
                }
            } else {
                while (i10 < this.f12812d.size()) {
                    arrayList.add(this.f12812d.get(i10));
                    i10++;
                }
            }
            return arrayList;
        }
    }

    private void a(int i10, long j10, String str) {
        a(i10, j10, str, true);
    }

    private void a(int i10, long j10, String str, boolean z9) {
        this.f12778o = true;
        e eVarA = this.f12769f.a(i10);
        eVarA.f12803f = j10 - this.f12770g;
        if (z9) {
            long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            eVarA.f12804g = jCurrentThreadTimeMillis - this.f12773j;
            this.f12773j = jCurrentThreadTimeMillis;
        } else {
            eVarA.f12804g = -1L;
        }
        eVarA.f12802e = this.f12765b;
        eVarA.f12805h = str;
        eVarA.f12806i = this.f12774k;
        eVarA.f12798a = this.f12770g;
        eVarA.f12799b = j10;
        eVarA.f12800c = this.f12771h;
        this.f12769f.a(eVarA);
        this.f12765b = 0;
        this.f12770g = j10;
    }

    public final e a(long j10) {
        e eVar = new e();
        eVar.f12805h = this.f12775l;
        eVar.f12806i = this.f12774k;
        eVar.f12803f = j10 - this.f12771h;
        eVar.f12804g = 0 - this.f12773j;
        eVar.f12802e = this.f12765b;
        return eVar;
    }

    public static String a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "unknown message";
        }
        try {
            String[] strArrSplit = str.split(":");
            String str3 = strArrSplit.length == 2 ? strArrSplit[1] : "";
            if (str.contains("{") && str.contains("}")) {
                str2 = str.split("\\{")[0];
                try {
                    str = str2 + str.split("\\}")[1];
                } catch (Throwable unused) {
                    return str2;
                }
            } else {
                str2 = str;
            }
            if (str.contains("@")) {
                String[] strArrSplit2 = str.split("@");
                if (strArrSplit2.length > 1) {
                    str = strArrSplit2[0];
                }
            }
            if (str.contains("(") && str.contains(")") && !str.endsWith(" null")) {
                String[] strArrSplit3 = str.split("\\(");
                if (strArrSplit3.length > 1) {
                    str = strArrSplit3[1];
                }
                str = str.replace(")", "");
            }
            if (str.startsWith(" ")) {
                str = str.replace(" ", "");
            }
            return str + str3;
        } catch (Throwable unused2) {
            return str;
        }
    }

    static /* synthetic */ void a(g gVar, boolean z9, long j10) {
        int i10 = gVar.f12766c + 1;
        gVar.f12766c = i10;
        gVar.f12766c = i10 & 65535;
        gVar.f12778o = false;
        if (gVar.f12770g < 0) {
            gVar.f12770g = j10;
        }
        if (gVar.f12771h < 0) {
            gVar.f12771h = j10;
        }
        if (gVar.f12772i < 0) {
            gVar.f12772i = Process.myTid();
            gVar.f12773j = SystemClock.currentThreadTimeMillis();
        }
        long j11 = j10 - gVar.f12770g;
        int i11 = gVar.f12768e;
        if (j11 > i11) {
            long j12 = gVar.f12771h;
            if (j10 - j12 <= i11) {
                gVar.a(9, j10, gVar.f12775l);
            } else if (z9) {
                if (gVar.f12765b == 0) {
                    gVar.a(1, j10, "no message running");
                } else {
                    gVar.a(9, j12, gVar.f12774k);
                    gVar.a(1, j10, "no message running", false);
                }
            } else if (gVar.f12765b == 0) {
                gVar.a(8, j10, gVar.f12775l, true);
            } else {
                gVar.a(9, j12, gVar.f12774k, false);
                gVar.a(8, j10, gVar.f12775l, true);
            }
        }
        gVar.f12771h = j10;
    }
}
