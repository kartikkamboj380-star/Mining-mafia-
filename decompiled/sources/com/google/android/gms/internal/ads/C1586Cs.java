package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Cs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1586Cs implements InterfaceC1898Is {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final List f17956l = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f17957m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RN0 f17958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashMap f17959b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f17962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f17963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C1742Fs f17964g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f17960c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f17961d = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f17965h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private HashSet f17966i = new HashSet();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f17967j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f17968k = false;

    public C1586Cs(Context context, L4.a aVar, C1742Fs c1742Fs, String str, C1690Es c1690Es) {
        Preconditions.checkNotNull(c1742Fs, "SafeBrowsing config is not present.");
        this.f17962e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f17959b = new LinkedHashMap();
        this.f17964g = c1742Fs;
        Iterator it = c1742Fs.f18857e.iterator();
        while (it.hasNext()) {
            this.f17966i.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.f17966i.remove("cookie".toLowerCase(Locale.ENGLISH));
        RN0 rn0G0 = XO0.g0();
        rn0G0.P(9);
        if (str != null) {
            rn0G0.B(str);
            rn0G0.C(str);
        }
        SN0 sn0D0 = TN0.d0();
        String str2 = this.f17964g.f18853a;
        if (str2 != null) {
            sn0D0.A(str2);
        }
        rn0G0.D((TN0) sn0D0.w());
        JO0 jo0D0 = KO0.d0();
        jo0D0.C(Wrappers.packageManager(this.f17962e).isCallerInstantApp());
        String str3 = aVar.f3097a;
        if (str3 != null) {
            jo0D0.A(str3);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.f17962e);
        if (apkVersion > 0) {
            jo0D0.B(apkVersion);
        }
        rn0G0.L((KO0) jo0D0.w());
        this.f17958a = rn0G0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1898Is
    public final void a(String str, Map map, int i10) {
        synchronized (this.f17965h) {
            if (i10 == 3) {
                try {
                    this.f17968k = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            LinkedHashMap linkedHashMap = this.f17959b;
            if (linkedHashMap.containsKey(str)) {
                if (i10 == 3) {
                    ((HO0) linkedHashMap.get(str)).E(4);
                }
                return;
            }
            HO0 ho0F0 = IO0.f0();
            int iA = GO0.a(i10);
            if (iA != 0) {
                ho0F0.E(iA);
            }
            ho0F0.A(linkedHashMap.size());
            ho0F0.B(str);
            C3476fO0 c3476fO0D0 = C3854iO0.d0();
            if (!this.f17966i.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.f17966i.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        C3225dO0 c3225dO0D0 = C3350eO0.d0();
                        c3225dO0D0.A(AbstractC5231tL0.A(str2));
                        c3225dO0D0.B(AbstractC5231tL0.A(str3));
                        c3476fO0D0.A((C3350eO0) c3225dO0D0.w());
                    }
                }
            }
            ho0F0.C((C3854iO0) c3476fO0D0.w());
            linkedHashMap.put(str, ho0F0);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1898Is
    public final void b() {
        synchronized (this.f17965h) {
            this.f17959b.keySet();
            com.google.common.util.concurrent.p pVarA = AbstractC5685wx0.a(Collections.EMPTY_MAP);
            InterfaceC3294dx0 interfaceC3294dx0 = new InterfaceC3294dx0() { // from class: com.google.android.gms.internal.ads.ys
                @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
                public final /* synthetic */ com.google.common.util.concurrent.p zza(Object obj) {
                    return this.f35473a.e((Map) obj);
                }
            };
            InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0 = AbstractC2315Qt.f22479g;
            com.google.common.util.concurrent.p pVarJ = AbstractC5685wx0.j(pVarA, interfaceC3294dx0, interfaceExecutorServiceC1805Gx0);
            com.google.common.util.concurrent.p pVarI = AbstractC5685wx0.i(pVarJ, 10L, TimeUnit.SECONDS, AbstractC2315Qt.f22476d);
            AbstractC5685wx0.r(pVarJ, new C5800xs(this, pVarI), interfaceExecutorServiceC1805Gx0);
            f17956l.add(pVarI);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1898Is
    public final void c(View view) {
        Bitmap bitmapCreateBitmap;
        if (this.f17964g.f18855c && !this.f17967j) {
            G4.t.g();
            final Bitmap bitmap = null;
            if (view != null) {
                try {
                    boolean zIsDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    Bitmap drawingCache = view.getDrawingCache();
                    bitmapCreateBitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
                    try {
                        view.setDrawingCacheEnabled(zIsDrawingCacheEnabled);
                    } catch (RuntimeException e10) {
                        e = e10;
                        int i10 = AbstractC0786o0.f2696b;
                        L4.p.d("Fail to capture the web view", e);
                    }
                } catch (RuntimeException e11) {
                    e = e11;
                    bitmapCreateBitmap = null;
                }
                if (bitmapCreateBitmap == null) {
                    try {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width == 0 || height == 0) {
                            int i11 = AbstractC0786o0.f2696b;
                            L4.p.f("Width or height of view is zero");
                        } else {
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                            Canvas canvas = new Canvas(bitmapCreateBitmap2);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap = bitmapCreateBitmap2;
                        }
                    } catch (RuntimeException e12) {
                        int i12 = AbstractC0786o0.f2696b;
                        L4.p.d("Fail to capture the webview", e12);
                    }
                } else {
                    bitmap = bitmapCreateBitmap;
                }
            }
            if (bitmap == null) {
                AbstractC1846Hs.a("Failed to capture the webview bitmap.");
            } else {
                this.f17967j = true;
                K4.F0.U(new Runnable() { // from class: com.google.android.gms.internal.ads.Bs
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f17725a.d(bitmap);
                    }
                });
            }
        }
    }

    final /* synthetic */ void d(Bitmap bitmap) {
        C5105sL0 c5105sL0A = AbstractC5231tL0.a();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, c5105sL0A);
        synchronized (this.f17965h) {
            RN0 rn0 = this.f17958a;
            BO0 bo0D0 = DO0.d0();
            bo0D0.B(c5105sL0A.a());
            bo0D0.A(ClipboardModule.MIMETYPE_PNG);
            bo0D0.C(2);
            rn0.K((DO0) bo0D0.w());
        }
    }

    final /* synthetic */ com.google.common.util.concurrent.p e(Map map) {
        int length;
        HO0 ho0;
        com.google.common.util.concurrent.p pVarK;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (jSONArrayOptJSONArray != null) {
                        Object obj = this.f17965h;
                        synchronized (obj) {
                            try {
                                length = jSONArrayOptJSONArray.length();
                                synchronized (obj) {
                                    ho0 = (HO0) this.f17959b.get(str);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (ho0 == null) {
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
                            sb.append("Cannot find the corresponding resource object for ");
                            sb.append(str);
                            AbstractC1846Hs.a(sb.toString());
                        } else {
                            for (int i10 = 0; i10 < length; i10++) {
                                ho0.D(jSONArrayOptJSONArray.getJSONObject(i10).getString("threat_type"));
                            }
                            this.f17963f = (length > 0) | this.f17963f;
                        }
                    }
                }
            } catch (JSONException e10) {
                if (((Boolean) AbstractC5152sj.f33223a.e()).booleanValue()) {
                    int i11 = AbstractC0786o0.f2696b;
                    L4.p.b("Failed to get SafeBrowsing metadata", e10);
                }
                return AbstractC5685wx0.c(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.f17963f) {
            synchronized (this.f17965h) {
                this.f17958a.P(10);
            }
        }
        boolean z9 = this.f17963f;
        if (!(z9 && this.f17964g.f18859g) && (!(this.f17968k && this.f17964g.f18858f) && (z9 || !this.f17964g.f18856d))) {
            return AbstractC5685wx0.a(null);
        }
        synchronized (this.f17965h) {
            try {
                Iterator it = this.f17959b.values().iterator();
                while (it.hasNext()) {
                    this.f17958a.F((IO0) ((HO0) it.next()).w());
                }
                RN0 rn0 = this.f17958a;
                rn0.M(this.f17960c);
                rn0.O(this.f17961d);
                if (AbstractC1846Hs.b()) {
                    String strA = rn0.A();
                    String strG = rn0.G();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strA).length() + 38 + String.valueOf(strG).length() + 15);
                    sb2.append("Sending SB report\n  url: ");
                    sb2.append(strA);
                    sb2.append("\n  clickUrl: ");
                    sb2.append(strG);
                    sb2.append("\n  resources: \n");
                    StringBuilder sb3 = new StringBuilder(sb2.toString());
                    for (IO0 io0 : rn0.E()) {
                        sb3.append("    [");
                        sb3.append(io0.e0());
                        sb3.append("] ");
                        sb3.append(io0.d0());
                    }
                    AbstractC1846Hs.a(sb3.toString());
                }
                com.google.common.util.concurrent.p pVarB = new K4.N(this.f17962e).b(1, this.f17964g.f18854b, null, ((XO0) rn0.w()).i());
                if (AbstractC1846Hs.b()) {
                    pVarB.e(RunnableC1482As.f17422a, AbstractC2315Qt.f22473a);
                }
                pVarK = AbstractC5685wx0.k(pVarB, C6052zs.f35868a, AbstractC2315Qt.f22479g);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pVarK;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1898Is
    public final void j(String str) {
        synchronized (this.f17965h) {
            try {
                if (str == null) {
                    this.f17958a.I();
                } else {
                    this.f17958a.H(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1898Is
    public final C1742Fs zza() {
        return this.f17964g;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1898Is
    public final boolean zzc() {
        return this.f17964g.f18855c && !this.f17967j;
    }
}
