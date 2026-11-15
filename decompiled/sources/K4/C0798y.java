package K4;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.ads.AT;
import com.google.android.gms.internal.ads.AbstractC3892ii;
import com.google.android.gms.internal.ads.BT;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.services.UnityAdsConstants;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: K4.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0798y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f2769a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f2770b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f2771c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f2772d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f2773e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f2774f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BT f2775g;

    protected static final String o(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put("User-Agent", G4.t.g().R(context, str2));
        com.google.common.util.concurrent.p pVarB = new N(context).b(0, str, map, null);
        try {
            return (String) pVarB.get(((Integer) H4.B.c().d(AbstractC3892ii.f29715V5)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            String strValueOf = String.valueOf(str);
            int i10 = AbstractC0786o0.f2696b;
            L4.p.d("Interrupted while retrieving a response from: ".concat(strValueOf), e10);
            pVarB.cancel(true);
            return null;
        } catch (TimeoutException e11) {
            String strValueOf2 = String.valueOf(str);
            int i11 = AbstractC0786o0.f2696b;
            L4.p.d("Timeout while retrieving a response from: ".concat(strValueOf2), e11);
            pVarB.cancel(true);
            return null;
        } catch (Exception e12) {
            String strValueOf3 = String.valueOf(str);
            int i12 = AbstractC0786o0.f2696b;
            L4.p.d("Error retrieving a response from: ".concat(strValueOf3), e12);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006a A[Catch: all -> 0x0029, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0013, B:7:0x0018, B:12:0x0034, B:14:0x003c, B:16:0x0051, B:19:0x0063, B:11:0x002b, B:20:0x006a, B:21:0x006c), top: B:26:0x000b, inners: #1, #2 }] */
    private final Uri p(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        synchronized (this.f2769a) {
            if (TextUtils.isEmpty(this.f2770b)) {
                G4.t.g();
                try {
                    str5 = new String(IOUtils.readInputStreamFully(context.openFileInput("debug_signals_id.txt"), true), "UTF-8");
                } catch (IOException unused) {
                    int i10 = AbstractC0786o0.f2696b;
                    L4.p.a("Error reading from internal storage.");
                    str5 = "";
                }
                this.f2770b = str5;
                if (TextUtils.isEmpty(str5)) {
                    G4.t.g();
                    this.f2770b = UUID.randomUUID().toString();
                    G4.t.g();
                    String str6 = this.f2770b;
                    try {
                        FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        fileOutputStreamOpenFileOutput.write(str6.getBytes(StandardCharsets.UTF_8));
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Exception e10) {
                        int i11 = AbstractC0786o0.f2696b;
                        L4.p.d("Error writing to file in internal storage.", e10);
                    }
                    str4 = this.f2770b;
                } else {
                    str4 = this.f2770b;
                }
            } else {
                str4 = this.f2770b;
            }
            throw th;
        }
        builderBuildUpon.appendQueryParameter("linkedDeviceId", str4);
        builderBuildUpon.appendQueryParameter("adSlotPath", str2);
        builderBuildUpon.appendQueryParameter("afmaVersion", str3);
        return builderBuildUpon.build();
    }

    public final void a(BT bt) {
        this.f2775g = bt;
    }

    public final BT b() {
        return this.f2775g;
    }

    public final void c(Context context) {
        BT bt;
        if (!((Boolean) H4.B.c().d(AbstractC3892ii.Ga)).booleanValue() || (bt = this.f2775g) == null) {
            return;
        }
        bt.p(new BinderC0795v(this, context), AT.DEBUG_MENU);
    }

    final boolean d(Context context, String str, String str2) {
        String strO = o(context, p(context, (String) H4.B.c().d(AbstractC3892ii.f29685S5), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strO)) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.a("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(strO.trim());
            String strOptString = jSONObject.optString("gct");
            this.f2774f = jSONObject.optString("status");
            if (((Boolean) H4.B.c().d(AbstractC3892ii.Ga)).booleanValue()) {
                String str3 = this.f2774f;
                boolean z9 = "0".equals(str3) || CommonGetHeaderBiddingToken.HB_TOKEN_VERSION.equals(str3);
                j(z9);
                InterfaceC0790q0 interfaceC0790q0R = G4.t.l().r();
                if (!z9) {
                    str = "";
                }
                interfaceC0790q0R.J0(str);
            }
            synchronized (this.f2769a) {
                this.f2771c = strOptString;
            }
            return true;
        } catch (JSONException e10) {
            int i11 = AbstractC0786o0.f2696b;
            L4.p.g("Fail to get in app preview response json.", e10);
            return false;
        }
    }

    public final boolean e(Context context, String str, String str2) {
        String strO = o(context, p(context, (String) H4.B.c().d(AbstractC3892ii.f29695T5), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strO)) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.a("Not linked for debug signals.");
            return false;
        }
        try {
            boolean zEquals = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(new JSONObject(strO.trim()).optString("debug_mode"));
            j(zEquals);
            if (((Boolean) H4.B.c().d(AbstractC3892ii.Ga)).booleanValue()) {
                InterfaceC0790q0 interfaceC0790q0R = G4.t.l().r();
                if (true != zEquals) {
                    str = "";
                }
                interfaceC0790q0R.J0(str);
            }
            return zEquals;
        } catch (JSONException e10) {
            int i11 = AbstractC0786o0.f2696b;
            L4.p.g("Fail to get debug mode response json.", e10);
            return false;
        }
    }

    public final void f(Context context, String str, String str2) {
        G4.t.g();
        F0.C(context, p(context, (String) H4.B.c().d(AbstractC3892ii.f29675R5), str, str2));
    }

    public final boolean g(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !m()) {
            return false;
        }
        int i10 = AbstractC0786o0.f2696b;
        L4.p.a("Sending troubleshooting signals to the server.");
        h(context, str, str2, str3);
        return true;
    }

    public final void h(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = p(context, (String) H4.B.c().d(AbstractC3892ii.f29705U5), str3, str).buildUpon();
        builderBuildUpon.appendQueryParameter("debugData", str2);
        G4.t.g();
        F0.q(context, str, builderBuildUpon.build().toString());
    }

    public final String i() {
        String str;
        synchronized (this.f2769a) {
            str = this.f2771c;
        }
        return str;
    }

    public final void j(boolean z9) {
        synchronized (this.f2769a) {
            try {
                this.f2773e = z9;
                if (((Boolean) H4.B.c().d(AbstractC3892ii.Ga)).booleanValue()) {
                    G4.t.l().r().z0(z9);
                    BT bt = this.f2775g;
                    if (bt != null) {
                        bt.c(z9);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean k() {
        boolean z9;
        synchronized (this.f2769a) {
            z9 = this.f2773e;
        }
        return z9;
    }

    public final void l(boolean z9) {
        synchronized (this.f2769a) {
            this.f2772d = z9;
        }
    }

    public final boolean m() {
        boolean z9;
        synchronized (this.f2769a) {
            z9 = this.f2772d;
        }
        return z9;
    }

    protected final void n(Context context, String str, boolean z9, boolean z10) {
        if (context instanceof Activity) {
            F0.f2598l.post(new RunnableC0797x(this, context, str, z9, z10));
        } else {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.e("Can not create dialog without Activity Context");
        }
    }
}
