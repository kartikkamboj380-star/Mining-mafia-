package Q4;

import H4.C0654z;
import H4.h2;
import K4.F0;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.AbstractC3892ii;
import com.google.android.gms.internal.ads.C3269dk0;
import com.google.android.gms.internal.ads.C3772hk0;
import com.google.android.gms.internal.ads.C3897ik0;
import com.google.android.gms.internal.ads.C4795pt;
import com.google.android.gms.internal.ads.EnumC5746xR;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f4819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Z f4820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f4821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f4822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final PackageInfo f4823e;

    C(Context context, long j10, PackageInfo packageInfo, Z z9, ScheduledExecutorService scheduledExecutorService) {
        this.f4819a = context;
        this.f4821c = j10;
        this.f4823e = packageInfo;
        this.f4820b = z9;
        this.f4822d = scheduledExecutorService;
    }

    public static String c(String str) {
        return str == null ? "" : F0.Y(str, "f8L7o2HxjA4p9Z1nQw3E5r6T8yU2iCv0B9kM4sD1f7G3hJ5lK2z0X9cW8vQ6b5N3m1Rg8F2o0Lp7A1e9I4u3Y2t0H8x6W5v4Z1n9Q2w7E3r5T8y6U1i0C9vB8k7M4s3D1f2G0h9J5l8K4z7X3cW2v1Q0b9N8m6A5r4F3o2Lp1E0u9I8y7Y6t5H4x3W2v1Z0n9Q8w7E6r5T4y3U2i1C0v9B8k7M6s5D4f3G2h1J0l9K8z7X6cW5v4Q3b2N1m0Rg9F8o7Lp6A5e4I3u2Y1t0H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2v1Z0n0Q9w8E7r6T5y4U3i2C1v0B9k8M7s6D5f4G3h2J1l0K9z8X7cW6v5Q4b3N2m1R0g9F8o7L6p5A4e3I2u1Y0t9H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2");
    }

    private final boolean e() {
        return this.f4820b.j().size() >= ((Integer) H4.B.c().d(AbstractC3892ii.f29538D8)).intValue();
    }

    private static final void f(Bundle bundle, EnumC5746xR enumC5746xR) {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29548E8)).booleanValue()) {
            bundle.putLong(enumC5746xR.c(), G4.t.o().currentTimeMillis());
        }
    }

    private static final void g(Bundle bundle, int i10) {
        bundle.putBoolean("sod_h", false);
        bundle.putInt("cmr", i10 - 1);
    }

    public final void a(String str, M m10) {
        String string;
        if (TextUtils.isEmpty(str) || e()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("params", m10.f4844a);
            jSONObject2.put("signal_dictionary", C0654z.a().v(m10.f4849f));
            jSONObject.put("sr", jSONObject2);
            String str2 = m10.f4846c;
            if (TextUtils.isEmpty(str2)) {
                string = "";
            } else {
                jSONObject.put("rs", Base64.encodeToString(c(str2).getBytes(StandardCharsets.UTF_8), 10));
                jSONObject.put("ts_ms", G4.t.o().currentTimeMillis());
                string = jSONObject.toString();
            }
        } catch (JSONException e10) {
            G4.t.l().j(e10, "DiskCachingManager.createStringToWrite");
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.f4820b.a(str, string);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final M b(C4795pt c4795pt, final BinderC0947w binderC0947w, Bundle bundle) {
        M m10;
        M m11;
        f(bundle, EnumC5746xR.SIGNAL_ON_DISK_VALIDATION_START);
        M m12 = null;
        if (G4.t.l().r().v()) {
            this.f4820b.i();
            g(bundle, 7);
        } else {
            PackageInfo packageInfo = this.f4823e;
            if (packageInfo != null) {
                Z z9 = this.f4820b;
                Context context = this.f4819a;
                String strE = z9.e();
                int iF = z9.f();
                String strG = z9.g();
                int iH = z9.h();
                if (TextUtils.equals(context.getApplicationInfo().packageName, strE) && iF == packageInfo.versionCode && TextUtils.equals(Build.MODEL, strG) && iH == Build.VERSION.SDK_INT) {
                    for (Map.Entry entry : z9.j().entrySet()) {
                        try {
                            long j10 = new JSONObject((String) entry.getValue()).getLong("ts_ms");
                            try {
                                if (G4.t.o().currentTimeMillis() - j10 > ((Long) H4.B.c().d(AbstractC3892ii.f29528C8)).longValue()) {
                                    m11 = m12;
                                } else {
                                    C3269dk0 c3269dk0J = C3772hk0.i(context).j(((Long) H4.B.c().d(AbstractC3892ii.f29786c4)).longValue(), G4.t.l().r().v());
                                    m11 = m12;
                                    C3269dk0 c3269dk0J2 = C3897ik0.i(context).j(((Long) H4.B.c().d(AbstractC3892ii.f29797d4)).longValue(), G4.t.l().r().v());
                                    if ((c3269dk0J.b() == -1 || c3269dk0J.b() <= j10) && (c3269dk0J2.b() == -1 || c3269dk0J2.b() <= j10)) {
                                    }
                                    m12 = m11;
                                }
                                z9.b((String) entry.getKey());
                            } catch (IOException | JSONException unused) {
                            }
                        } catch (IOException | JSONException unused2) {
                            m11 = m12;
                        }
                        m12 = m11;
                    }
                    m10 = m12;
                } else {
                    m10 = null;
                    z9.i();
                    z9.d(context.getApplicationInfo().packageName, packageInfo.versionCode, Build.MODEL, Build.VERSION.SDK_INT);
                }
                f(bundle, EnumC5746xR.SIGNAL_ON_DISK_VALIDATION_END);
                if (G4.t.o().currentTimeMillis() - this.f4821c > ((Long) H4.B.c().d(AbstractC3892ii.f30042z8)).longValue()) {
                    g(bundle, 2);
                    return m10;
                }
                f(bundle, EnumC5746xR.SIGNAL_ON_DISK_CACHE_KEY_START);
                String str = c4795pt.f32493a;
                String str2 = c4795pt.f32494b;
                h2 h2Var = c4795pt.f32496d;
                String string = h2Var.f1304v.toString();
                String string2 = h2Var.f1293c.toString();
                String str3 = h2Var.f1299i;
                String str4 = h2Var.f1278G;
                String strValueOf = String.valueOf(h2Var.f1305w);
                int length = String.valueOf(str).length();
                int length2 = String.valueOf(str2).length();
                int length3 = String.valueOf(string).length();
                int length4 = String.valueOf(string2).length();
                StringBuilder sb = new StringBuilder(length + length2 + length3 + length4 + String.valueOf(str3).length() + String.valueOf(str4).length() + strValueOf.length());
                sb.append(str);
                sb.append(str2);
                sb.append(string);
                sb.append(string2);
                sb.append(str3);
                sb.append(str4);
                sb.append(strValueOf);
                final String strP = L4.g.p(sb.toString());
                if (TextUtils.isEmpty(strP)) {
                    g(bundle, 3);
                    return m10;
                }
                f(bundle, EnumC5746xR.SIGNAL_ON_DISK_CACHE_KEY_END);
                f(bundle, EnumC5746xR.SIGNAL_ON_DISK_READ_AND_REMOVE_START);
                String strB = this.f4820b.b(strP);
                f(bundle, EnumC5746xR.SIGNAL_ON_DISK_READ_AND_REMOVE_END);
                if (!e()) {
                    final C4795pt c4795pt2 = new C4795pt(str, str2, c4795pt.f32495c, h2Var, 2, strP);
                    this.f4822d.schedule(new Runnable() { // from class: Q4.b
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.f4896a.d(strP, binderC0947w, c4795pt2);
                        }
                    }, ((Long) H4.B.c().d(AbstractC3892ii.f29518B8)).longValue(), TimeUnit.MILLISECONDS);
                }
                if (TextUtils.isEmpty(strB)) {
                    g(bundle, 4);
                    return m10;
                }
                f(bundle, EnumC5746xR.SIGNAL_ON_DISK_DECODE_START);
                try {
                    JSONObject jSONObject = new JSONObject(strB);
                    String string3 = jSONObject.getString("sr");
                    if (TextUtils.isEmpty(string3)) {
                        g(bundle, 8);
                        return m10;
                    }
                    String string4 = jSONObject.getString("rs");
                    if (TextUtils.isEmpty(string4)) {
                        g(bundle, 9);
                        return m10;
                    }
                    String strC = c(new String(Base64.decode(string4, 10), StandardCharsets.UTF_8));
                    f(bundle, EnumC5746xR.SIGNAL_ON_DISK_DECODE_END);
                    try {
                        M m13 = new M(new JsonReader(new StringReader(string3)), m10);
                        m13.f4846c = strC;
                        m13.f4848e = bundle;
                        bundle.putBoolean("sod_h", true);
                        return m13;
                    } catch (IOException e10) {
                        g(bundle, 6);
                        G4.t.l().j(e10, "DiskCachingManager.getSignalResponse");
                        return null;
                    }
                } catch (JSONException e11) {
                    g(bundle, 5);
                    G4.t.l().j(e11, "DiskCachingManager.getSignalResponse");
                    return null;
                }
            }
            this.f4820b.i();
            g(bundle, 10);
        }
        return null;
    }

    final /* synthetic */ void d(String str, BinderC0947w binderC0947w, C4795pt c4795pt) {
        if (this.f4820b.c(str) || e()) {
            return;
        }
        binderC0947w.N2(com.google.android.gms.dynamic.b.N0(this.f4819a), c4795pt, null);
    }
}
