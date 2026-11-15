package com.pgl.ssdk.ces;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.pgl.ssdk.a5;
import com.pgl.ssdk.aa;
import com.pgl.ssdk.ab;
import com.pgl.ssdk.ac;
import com.pgl.ssdk.ad;
import com.pgl.ssdk.ae;
import com.pgl.ssdk.af;
import com.pgl.ssdk.ag;
import com.pgl.ssdk.ah;
import com.pgl.ssdk.ai;
import com.pgl.ssdk.aj;
import com.pgl.ssdk.ak;
import com.pgl.ssdk.al;
import com.pgl.ssdk.am;
import com.pgl.ssdk.an;
import com.pgl.ssdk.ao;
import com.pgl.ssdk.ar;
import com.pgl.ssdk.aw;
import com.pgl.ssdk.ax;
import com.pgl.ssdk.ay;
import com.pgl.ssdk.az;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.f;
import com.pgl.ssdk.u;
import com.pgl.ssdk.v;
import com.pgl.ssdk.w;
import com.pgl.ssdk.x;
import com.pgl.ssdk.y;
import com.pgl.ssdk.z;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile b f41973a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f41974b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map<String, Object> f41975c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f41976d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static aw.a f41977e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f41979g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f41980h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f41981i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f41982j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f41986n;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f41978f = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f41983k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f41984l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f41985m = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f41987o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f41988p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f41989q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f41990r = true;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                f.c();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.pgl.ssdk.ces.b$b, reason: collision with other inner class name */
    class RunnableC0390b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f41992a;

        RunnableC0390b(String str) {
            this.f41992a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!TextUtils.isEmpty(this.f41992a) && this.f41992a.equals("AdShow")) {
                ab.b(b.this.f41979g);
            }
            al.a(b.this.f41979g).a();
            aa.b(b.this.f41979g);
        }
    }

    private b(Context context, String str) {
        this.f41979g = context;
        this.f41980h = str;
    }

    public static b a(Context context, String str, int i10, int i11, String str2) {
        if (f41973a == null) {
            synchronized (b.class) {
                try {
                    if (f41973a == null) {
                        if (context == null) {
                            context = ab.a().getApplicationContext();
                        }
                        if (context == null) {
                            f41976d = 4;
                            return null;
                        }
                        a(i10);
                        aw.a aVarB = aw.b(context, "nms");
                        if (aVarB != null) {
                            f41976d = aVarB.f41970a;
                            f41977e = aVarB;
                            return null;
                        }
                        b bVar = new b(context, str);
                        f41973a = bVar;
                        bVar.f41981i = i11;
                        f41973a.f41982j = str2;
                        f41973a.b(context);
                        f41973a.e(a(context));
                        z.a(context);
                        f41976d = 0;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f41973a;
    }

    public static String b() {
        if (e() != null) {
            return e().f41983k;
        }
        return null;
    }

    public static String c() {
        b bVarE = e();
        if (bVarE == null || !bVarE.f41985m || TextUtils.isEmpty(bVarE.f41984l)) {
            return null;
        }
        return bVarE.f41984l;
    }

    public static int d() {
        return f41976d;
    }

    public static b e() {
        return f41973a;
    }

    public static aw.a f() {
        return f41977e;
    }

    public String g() {
        return a5.a();
    }

    public void h() {
        this.f41987o = true;
        a5.a(this.f41979g, this.f41980h);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (az.a(ax.a(this.f41979g, "pgl_init_report", 0L), jCurrentTimeMillis)) {
            int i10 = f41973a.f41989q;
            if ((i10 > 0 && i10 < 100 && Math.random() * 100.0d < i10) || i10 == 100) {
                a("Start", (Map<String, Object>) null);
            }
        } else {
            a("Start", (Map<String, Object>) null);
            ax.b(this.f41979g, "pgl_init_report", jCurrentTimeMillis);
        }
        a("Start");
        if (this.f41990r) {
            ar.a(new a(), 20000L);
        }
    }

    private void b(Context context) {
        if (context == null || f41974b) {
            return;
        }
        try {
            com.pgl.ssdk.ces.a.meta(101, null, UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
            com.pgl.ssdk.ces.a.meta(102, null, this.f41980h);
            com.pgl.ssdk.ces.a.meta(114, null, Integer.valueOf(this.f41981i));
            StringBuilder sb = new StringBuilder();
            sb.append(ab.h(context));
            com.pgl.ssdk.ces.a.meta(105, null, sb.toString());
            com.pgl.ssdk.ces.a.meta(152, null, ab.i(context));
            com.pgl.ssdk.ces.a.meta(153, null, ab.d(context));
            com.pgl.ssdk.ces.a.meta(106, null, ab.f(context));
            com.pgl.ssdk.ces.a.meta(107, null, ab.e(context));
            com.pgl.ssdk.ces.a.meta(108, null, ab.c(context));
            com.pgl.ssdk.ces.a.meta(109, null, ab.d());
            com.pgl.ssdk.ces.a.meta(110, null, ab.c());
            com.pgl.ssdk.ces.a.meta(115, null, this.f41982j);
            f41974b = true;
        } catch (Throwable unused) {
        }
    }

    private void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f41986n = str;
        com.pgl.ssdk.ces.a.meta(104, null, str);
    }

    public synchronized void d(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f41984l)) {
            com.pgl.ssdk.ces.a.meta(111, null, str);
            this.f41984l = str;
            a5.b();
        }
    }

    public synchronized void c(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f41983k)) {
            this.f41983k = str;
            com.pgl.ssdk.ces.a.meta(103, null, str);
            a5.b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void b(String str) {
        byte b10;
        int iIntValue;
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                switch (next.hashCode()) {
                    case -417749689:
                        if (!next.equals("touch_trace_enabled")) {
                            b10 = -1;
                        } else {
                            b10 = 4;
                        }
                        break;
                    case -257777372:
                        if (!next.equals("init_prob")) {
                            b10 = -1;
                        } else {
                            b10 = 5;
                        }
                        break;
                    case -93508180:
                        if (!next.equals("autoctl_detect_enable")) {
                            b10 = -1;
                        } else {
                            b10 = 0;
                        }
                        break;
                    case 449342513:
                        if (!next.equals("craw_ratio")) {
                            b10 = -1;
                        } else {
                            b10 = 3;
                        }
                        break;
                    case 944591168:
                        if (!next.equals("report_ratio")) {
                            b10 = -1;
                        } else {
                            b10 = 1;
                        }
                        break;
                    case 1286849298:
                        if (!next.equals("app_switch")) {
                            b10 = -1;
                        } else {
                            b10 = 2;
                        }
                        break;
                    default:
                        b10 = -1;
                        break;
                }
                if (b10 != 0) {
                    if (b10 != 1) {
                        if (b10 != 2) {
                            if (b10 != 3) {
                                if (b10 != 4) {
                                    if (b10 == 5 && (obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue()) >= 0 && iIntValue <= 100) {
                                        this.f41989q = iIntValue;
                                    }
                                } else if (obj instanceof Boolean) {
                                    y.f42050g = ((Boolean) obj).booleanValue();
                                }
                            } else if ((obj instanceof Integer) && ((Integer) obj).intValue() > 0) {
                                f.f42013b = ((Integer) obj).intValue();
                            }
                        } else if (obj instanceof Boolean) {
                            this.f41990r = ((Boolean) obj).booleanValue();
                        }
                    } else if ((obj instanceof Integer) && ((Integer) obj).intValue() > 0) {
                        this.f41988p = ((Integer) obj).intValue();
                    }
                } else if (obj instanceof Boolean) {
                    ak.f41921b = ((Boolean) obj).booleanValue();
                }
            }
        } catch (JSONException unused) {
        }
    }

    private static String a(Context context) {
        String strA = ax.a(context, "iid");
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String string = UUID.randomUUID().toString();
        ax.b(context, "iid", string);
        return string;
    }

    public static void a(int i10) {
        an.a(i10);
    }

    public static String a() {
        if (e() != null) {
            return e().f41980h;
        }
        return null;
    }

    public void a(String str, String str2, String str3, String str4) {
        c(str2);
        d(str4);
        try {
            h();
        } catch (Throwable unused) {
        }
    }

    public Map<String, String> a(String str, byte[] bArr) {
        HashMap map = new HashMap();
        if (str == null) {
            str = "";
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        String str2 = (String) com.pgl.ssdk.ces.a.meta(224, this.f41979g, new Object[]{str, bArr});
        if (!TextUtils.isEmpty(str2)) {
            map.put("X-Armors", str2);
        }
        return map;
    }

    public void a(String str, Map<String, Object> map) {
        try {
            ar.a(new ao(this.f41979g, 222, new Object[]{str, map}), "Start".equals(str) ? 10000L : 0L);
        } catch (Throwable unused) {
        }
    }

    public Object a(int i10, Object obj) {
        if (i10 == 123) {
            return af.a(this.f41979g);
        }
        if (i10 == 121) {
            return ad.a();
        }
        if (i10 == 122) {
            return ad.b();
        }
        if (i10 == 126) {
            return ad.b(this.f41979g);
        }
        if (i10 == 128) {
            return ad.c(this.f41979g);
        }
        if (i10 == 120) {
            return ac.c();
        }
        if (i10 == 124) {
            return ag.c(this.f41979g);
        }
        if (i10 == 130) {
            return ag.a(this.f41979g);
        }
        if (i10 == 145) {
            return ah.c(this.f41979g);
        }
        if (i10 == 125) {
            return ag.b(this.f41979g);
        }
        if (i10 == 129) {
            return ae.f(this.f41979g);
        }
        if (i10 == 141) {
            return ae.e(this.f41979g);
        }
        if (i10 == 134) {
            return ak.a(this.f41979g).b();
        }
        if (i10 == 140) {
            return al.a(this.f41979g).e();
        }
        if (i10 == 144) {
            return al.a(this.f41979g).d();
        }
        if (i10 == 133) {
            return a(obj);
        }
        if (i10 == 135) {
            return v.e();
        }
        if (i10 == 201) {
            return ad.a(this.f41979g);
        }
        if (i10 == 202) {
            return ad.c();
        }
        if (i10 == 236) {
            return ay.a((String) obj);
        }
        if (i10 == 142) {
            return ab.g(this.f41979g);
        }
        if (i10 == 143) {
            return ah.a(this.f41979g);
        }
        if (i10 == 146) {
            try {
                return v.b();
            } catch (Throwable unused) {
                return null;
            }
        }
        if (i10 == 147) {
            return Boolean.valueOf(ab.j(this.f41979g));
        }
        if (i10 == 148) {
            return u.b(this.f41979g);
        }
        if (i10 == 149) {
            return w.a(this.f41979g);
        }
        if (i10 == 150) {
            return Integer.valueOf(x.a());
        }
        if (i10 == 151) {
            return w.c();
        }
        if (i10 == 161) {
            return Boolean.valueOf(v.f());
        }
        if (i10 == 163) {
            return aj.a();
        }
        if (i10 == 169) {
            return Boolean.valueOf(aa.a(this.f41979g));
        }
        if (i10 == 170) {
            return Integer.valueOf(y.b((String) obj));
        }
        if (i10 == 203) {
            return ab.b();
        }
        if (i10 == 205) {
            return Integer.valueOf(ab.k(this.f41979g));
        }
        if (i10 == 204) {
            return Integer.valueOf(ae.a(this.f41979g));
        }
        if (i10 == 206) {
            return ah.b(this.f41979g);
        }
        return null;
    }

    public void a(MotionEvent motionEvent) {
        y.a(motionEvent, this.f41979g);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public synchronized void a(Map<String, Object> map) {
        byte b10;
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    try {
                        for (String str : map.keySet()) {
                            Object obj = map.get(str);
                            if (obj != null) {
                                switch (str.hashCode()) {
                                    case -2021683300:
                                        if (str.equals(PglSSConfig.CUSTOMINFO_KEY_TRANSFER_HOST)) {
                                            b10 = 2;
                                        } else {
                                            b10 = -1;
                                        }
                                        break;
                                    case -1195280656:
                                        if (str.equals(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR)) {
                                            b10 = 5;
                                        } else {
                                            b10 = -1;
                                        }
                                        break;
                                    case 156851746:
                                        if (str.equals(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS)) {
                                            b10 = 3;
                                        } else {
                                            b10 = -1;
                                        }
                                        break;
                                    case 398905722:
                                        if (str.equals(PglSSConfig.CUSTOMINFO_KEY_CHECKCLAZZ)) {
                                            b10 = 0;
                                        } else {
                                            b10 = -1;
                                        }
                                        break;
                                    case 485444716:
                                        if (str.equals(PglSSConfig.CUSTOMINFO_KEY_TARGET_IDC)) {
                                            b10 = 4;
                                        } else {
                                            b10 = -1;
                                        }
                                        break;
                                    case 500804551:
                                        if (str.equals(PglSSConfig.CUSTOMINFO_KEY_IPV6)) {
                                            b10 = 1;
                                        } else {
                                            b10 = -1;
                                        }
                                        break;
                                    default:
                                        b10 = -1;
                                        break;
                                }
                                if (b10 != 0) {
                                    if (b10 != 1) {
                                        if (b10 != 2) {
                                            if (b10 != 3) {
                                                if (b10 != 4) {
                                                    if (b10 == 5 && (obj instanceof String)) {
                                                        b((String) obj);
                                                    }
                                                } else if (obj instanceof String) {
                                                    an.b((String) obj);
                                                }
                                            } else if (obj instanceof Set) {
                                                Set set = (Set) obj;
                                                com.pgl.ssdk.ces.a.meta(165, null, Boolean.valueOf(set.contains("boot")));
                                                com.pgl.ssdk.ces.a.meta(166, null, Boolean.valueOf(set.contains("mnc")));
                                                com.pgl.ssdk.ces.a.meta(167, null, Boolean.valueOf(set.contains("mcc")));
                                                com.pgl.ssdk.ces.a.meta(168, null, Boolean.valueOf(set.contains("gaid")));
                                                this.f41985m = set.contains("gaid");
                                            }
                                        } else if (obj instanceof String) {
                                            an.a((String) obj);
                                        }
                                    } else if (obj instanceof String) {
                                        String str2 = (String) obj;
                                        if (!TextUtils.isEmpty(str2)) {
                                            am.a(str2);
                                        }
                                    }
                                } else if (obj instanceof String) {
                                    String strA = ai.a((String) obj);
                                    if (!TextUtils.isEmpty(strA)) {
                                        com.pgl.ssdk.ces.a.meta(159, null, strA);
                                    }
                                }
                            }
                        }
                        if (f41975c == null) {
                            f41975c = new HashMap();
                        }
                        f41975c.putAll(map);
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private String a(Object obj) {
        Map<String, Object> map;
        if (!(obj instanceof String) || !"Start".equals((String) obj) || (map = f41975c) == null || map.isEmpty()) {
            return "{}";
        }
        try {
            return new JSONObject(f41975c).toString();
        } catch (Exception unused) {
            return "{}";
        }
    }

    public void a(String str) {
        ar.b(new RunnableC0390b(str));
    }
}
