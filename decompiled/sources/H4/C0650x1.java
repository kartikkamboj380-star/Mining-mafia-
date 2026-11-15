package H4;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.AbstractC3892ii;
import com.google.android.gms.internal.ads.AbstractC3894ij;
import com.google.android.gms.internal.ads.AbstractC4040jt0;
import com.google.android.gms.internal.ads.BinderC5162so;
import com.google.android.gms.internal.ads.C1730Fm;
import com.google.android.gms.internal.ads.C2145Nm;
import com.google.android.gms.internal.ads.C2197Om;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: H4.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0650x1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Set f1453m = new HashSet(Arrays.asList(B4.b.APP_OPEN_AD, B4.b.INTERSTITIAL, B4.b.REWARDED));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static C0650x1 f1454n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C0627p1 f1455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C1 f1456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C0624o1 f1457c;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private B0 f1464j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f1458d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f1459e = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f1461g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1462h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f1463i = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private B4.n f1465k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private B4.t f1466l = new B4.t.a().a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayList f1460f = new ArrayList();

    private C0650x1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InitializationStatus b(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1730Fm c1730Fm = (C1730Fm) it.next();
            map.put(c1730Fm.f18831a, new C2145Nm(c1730Fm.f18832b ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, c1730Fm.f18834d, c1730Fm.f18833c));
        }
        return new C2197Om(map);
    }

    private final void c(B4.t tVar) {
        B0 b10 = this.f1464j;
        if (b10 == null) {
            return;
        }
        try {
            b10.M0(new U1(tVar));
        } catch (RemoteException e10) {
            L4.p.d("Unable to set request configuration parcel.", e10);
        }
    }

    private final void d(Context context) {
        if (this.f1464j == null) {
            this.f1464j = (B0) new C0636t(C0654z.b(), context).d(context, false);
        }
    }

    private final void e(String str) {
        B0 b10 = this.f1464j;
        if (b10 == null) {
            return;
        }
        try {
            b10.zze();
            this.f1464j.F1(null, com.google.android.gms.dynamic.b.N0(null));
        } catch (RemoteException e10) {
            L4.p.g("MobileAdsSettingManager initialization failed", e10);
        }
    }

    public static C0650x1 f() {
        C0650x1 c0650x1;
        synchronized (C0650x1.class) {
            try {
                if (f1454n == null) {
                    f1454n = new C0650x1();
                }
                c0650x1 = f1454n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0650x1;
    }

    final /* synthetic */ void A(boolean z9) {
        this.f1461g = false;
    }

    final /* synthetic */ void B(boolean z9) {
        this.f1462h = true;
    }

    final /* synthetic */ B4.n a() {
        return this.f1465k;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00a2 A[Catch: all -> 0x004e, TryCatch #1 {all -> 0x004e, blocks: (B:26:0x0034, B:28:0x003b, B:33:0x0053, B:35:0x005c, B:40:0x006f, B:42:0x0080, B:44:0x0092, B:51:0x00d5, B:52:0x00ea, B:45:0x00a2, B:47:0x00b0, B:49:0x00c2, B:50:0x00cd, B:37:0x0064, B:39:0x006a), top: B:60:0x0034, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b0 A[Catch: all -> 0x004e, TryCatch #1 {all -> 0x004e, blocks: (B:26:0x0034, B:28:0x003b, B:33:0x0053, B:35:0x005c, B:40:0x006f, B:42:0x0080, B:44:0x0092, B:51:0x00d5, B:52:0x00ea, B:45:0x00a2, B:47:0x00b0, B:49:0x00c2, B:50:0x00cd, B:37:0x0064, B:39:0x006a), top: B:60:0x0034, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c2 A[Catch: all -> 0x004e, TryCatch #1 {all -> 0x004e, blocks: (B:26:0x0034, B:28:0x003b, B:33:0x0053, B:35:0x005c, B:40:0x006f, B:42:0x0080, B:44:0x0092, B:51:0x00d5, B:52:0x00ea, B:45:0x00a2, B:47:0x00b0, B:49:0x00c2, B:50:0x00cd, B:37:0x0064, B:39:0x006a), top: B:60:0x0034, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00cd A[Catch: all -> 0x004e, TryCatch #1 {all -> 0x004e, blocks: (B:26:0x0034, B:28:0x003b, B:33:0x0053, B:35:0x005c, B:40:0x006f, B:42:0x0080, B:44:0x0092, B:51:0x00d5, B:52:0x00ea, B:45:0x00a2, B:47:0x00b0, B:49:0x00c2, B:50:0x00cd, B:37:0x0064, B:39:0x006a), top: B:60:0x0034, inners: #0 }] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void g(Context context, String str, OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.f1458d) {
            try {
                if (this.f1461g) {
                    if (onInitializationCompleteListener != null) {
                        this.f1460f.add(onInitializationCompleteListener);
                    }
                    return;
                }
                if (this.f1462h) {
                    if (onInitializationCompleteListener != null) {
                        onInitializationCompleteListener.onInitializationComplete(n());
                    }
                    return;
                }
                this.f1461g = true;
                if (onInitializationCompleteListener != null) {
                    this.f1460f.add(onInitializationCompleteListener);
                }
                if (context == null) {
                    throw new IllegalArgumentException("Context cannot be null.");
                }
                synchronized (this.f1463i) {
                    byte[] bArr = null;
                    Object[] objArr = 0;
                    Object[] objArr2 = 0;
                    try {
                        try {
                            d(context);
                            B0 b10 = this.f1464j;
                            if (b10 != null) {
                                b10.L4(new BinderC0647w1(this, bArr));
                                this.f1464j.b6(new BinderC5162so());
                            }
                            if (this.f1466l.c() != -1 || this.f1466l.d() != -1) {
                                c(this.f1466l);
                            }
                        } catch (RemoteException e10) {
                            L4.p.g("MobileAdsSettingManager initialization failed", e10);
                        }
                        AbstractC3892ii.a(context);
                        if (((Boolean) AbstractC3894ij.f30044a.e()).booleanValue()) {
                            if (((Boolean) B.c().d(AbstractC3892ii.Fc)).booleanValue()) {
                                L4.p.a("Initializing on bg thread");
                                ThreadPoolExecutor threadPoolExecutor = L4.c.f3104a;
                                final Object[] objArr3 = objArr2 == true ? 1 : 0;
                                threadPoolExecutor.execute(new Runnable(objArr3) { // from class: H4.u1
                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        this.f1436a.v(null);
                                    }
                                });
                            } else if (((Boolean) AbstractC3894ij.f30045b.e()).booleanValue()) {
                                if (((Boolean) B.c().d(AbstractC3892ii.Fc)).booleanValue()) {
                                    ExecutorService executorService = L4.c.f3105b;
                                    final Object[] objArr4 = objArr == true ? 1 : 0;
                                    executorService.execute(new Runnable(objArr4) { // from class: H4.s1
                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            this.f1430a.w(null);
                                        }
                                    });
                                } else {
                                    L4.p.a("Initializing on calling thread");
                                    e(null);
                                }
                            } else {
                                L4.p.a("Initializing on calling thread");
                                e(null);
                            }
                        } else if (((Boolean) AbstractC3894ij.f30045b.e()).booleanValue()) {
                            if (((Boolean) B.c().d(AbstractC3892ii.Fc)).booleanValue()) {
                                ExecutorService executorService2 = L4.c.f3105b;
                                final String objArr5 = objArr == true ? 1 : 0;
                                executorService2.execute(new Runnable(objArr5) { // from class: H4.s1
                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        this.f1430a.w(null);
                                    }
                                });
                            } else {
                                L4.p.a("Initializing on calling thread");
                                e(null);
                            }
                        } else {
                            L4.p.a("Initializing on calling thread");
                            e(null);
                        }
                        this.f1455a = new C0627p1(context);
                        this.f1456b = new C1(context);
                        this.f1457c = new C0624o1(context);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h() {
        synchronized (this.f1458d) {
            this.f1462h = false;
            this.f1461g = false;
            this.f1460f.clear();
        }
        synchronized (this.f1463i) {
            try {
                B0 b10 = this.f1464j;
                if (b10 != null) {
                    b10.p();
                }
            } catch (RemoteException e10) {
                L4.p.d("Unable to stop the SDK.", e10);
            }
            this.f1464j = null;
            C0627p1 c0627p1 = this.f1455a;
            if (c0627p1 != null) {
                c0627p1.a();
                this.f1455a = null;
            }
            C1 c10 = this.f1456b;
            if (c10 != null) {
                c10.a();
                this.f1456b = null;
            }
            C0624o1 c0624o1 = this.f1457c;
            if (c0624o1 != null) {
                c0624o1.a();
                this.f1457c = null;
            }
        }
    }

    public final Status i(Context context, List list, S4.a aVar) {
        Status status;
        boolean z9 = false;
        AbstractC3892ii.a(context);
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            S4.b bVar = (S4.b) it.next();
            String strValueOf = String.valueOf(bVar.a());
            String strC = bVar.c();
            StringBuilder sb = new StringBuilder(strValueOf.length() + 1 + String.valueOf(strC).length());
            sb.append(strValueOf);
            sb.append("#");
            sb.append(strC);
            String string = sb.toString();
            map.put(string, Integer.valueOf(((Integer) L4.g.m(map, string, 0)).intValue() + 1));
        }
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            if (((Integer) ((Map.Entry) it2.next()).getValue()).intValue() > 1) {
                hashSet.add("Preload configurations include duplicated ad unit IDs and ad format combinations");
                z9 = true;
                break;
            }
        }
        HashMap map2 = new HashMap();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            S4.b bVar2 = (S4.b) it3.next();
            B4.b bVarA = bVar2.a();
            if (f1453m.contains(bVar2.a())) {
                map2.put(bVarA, Integer.valueOf(((Integer) L4.g.m(map2, bVarA, 0)).intValue() + 1));
                if (bVar2.d() > 15) {
                    hashSet.add(String.format(Locale.US, "Preload configurations' buffer size exceeds the maximum limit %d for %s", 15, bVarA.name()));
                } else if (bVar2.d() < 0) {
                    hashSet.add(String.format(Locale.US, "Preload configurations' buffer size less than 0 for %s", bVarA.name()));
                }
            } else {
                hashSet.add("PreloadConfiguration ad format is not supported:".concat(String.valueOf(bVar2.a())));
            }
            z9 = true;
        }
        EnumMap enumMap = new EnumMap(B4.b.class);
        enumMap.put(B4.b.APP_OPEN_AD, (Integer) B.c().d(AbstractC3892ii.f29985u5));
        enumMap.put(B4.b.INTERSTITIAL, (Integer) B.c().d(AbstractC3892ii.f29963s5));
        enumMap.put(B4.b.REWARDED, (Integer) B.c().d(AbstractC3892ii.f29974t5));
        for (Map.Entry entry : map2.entrySet()) {
            B4.b bVar3 = (B4.b) entry.getKey();
            int iIntValue = ((Integer) entry.getValue()).intValue();
            Integer num = (Integer) L4.g.m(enumMap, bVar3, 0);
            if (iIntValue > num.intValue()) {
                hashSet.add(String.format(Locale.US, "Preload configurations' size exceeds the maximum limit %d for %s", num, bVar3.name()));
                z9 = true;
            }
        }
        if (z9) {
            StringBuilder sb2 = new StringBuilder();
            Iterator it4 = hashSet.iterator();
            while (it4.hasNext()) {
                sb2.append((String) it4.next());
                if (it4.hasNext()) {
                    sb2.append(", ");
                }
            }
            String string2 = sb2.toString();
            L4.p.c(string2);
            status = new Status(13, string2);
        } else {
            status = Status.RESULT_SUCCESS;
        }
        String statusMessage = status.getStatusMessage();
        if (statusMessage == null) {
            statusMessage = "";
        }
        Preconditions.checkArgument(status.isSuccess(), statusMessage);
        synchronized (this.f1459e) {
            ArrayList arrayList = new ArrayList();
            Iterator it5 = list.iterator();
            while (it5.hasNext()) {
                arrayList.add(L4.g.A(context, (S4.b) it5.next(), 1));
            }
            try {
                B4.y.a(context).i6(arrayList, new BinderC0630q1(this, aVar));
            } catch (RemoteException e10) {
                L4.p.d("Unable to start preload.", e10);
                return Status.RESULT_INTERNAL_ERROR;
            }
        }
        return Status.RESULT_SUCCESS;
    }

    public final void j(float f10) {
        boolean z9 = true;
        Preconditions.checkArgument(f10 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f10 <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.f1463i) {
            if (this.f1464j == null) {
                z9 = false;
            }
            Preconditions.checkState(z9, "MobileAds.initialize() must be called prior to setting the app volume.");
            B0 b10 = this.f1464j;
            if (b10 == null) {
                return;
            }
            try {
                b10.m0(f10);
            } catch (RemoteException e10) {
                L4.p.d("Unable to set app volume.", e10);
            }
        }
    }

    public final void k(boolean z9) {
        synchronized (this.f1463i) {
            Preconditions.checkState(this.f1464j != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            B0 b10 = this.f1464j;
            if (b10 == null) {
                return;
            }
            try {
                b10.U(z9);
            } catch (RemoteException e10) {
                L4.p.d("Unable to set app mute state.", e10);
            }
        }
    }

    public final void l(Context context, String str) {
        synchronized (this.f1463i) {
            Preconditions.checkState(this.f1464j != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            B0 b10 = this.f1464j;
            if (b10 == null) {
                return;
            }
            try {
                b10.y1(com.google.android.gms.dynamic.b.N0(context), str);
            } catch (RemoteException e10) {
                L4.p.d("Unable to open debug menu.", e10);
            }
        }
    }

    public final void m(Class cls) {
        synchronized (this.f1463i) {
            B0 b10 = this.f1464j;
            if (b10 == null) {
                return;
            }
            try {
                b10.o0(cls.getCanonicalName());
            } catch (RemoteException e10) {
                L4.p.d("Unable to register RtbAdapter", e10);
            }
        }
    }

    public final InitializationStatus n() {
        synchronized (this.f1463i) {
            Preconditions.checkState(this.f1464j != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            B0 b10 = this.f1464j;
            if (b10 == null) {
                return new InitializationStatus() { // from class: H4.t1
                    @Override // com.google.android.gms.ads.initialization.InitializationStatus
                    public final /* synthetic */ Map getAdapterStatusMap() {
                        HashMap map = new HashMap();
                        map.put("com.google.android.gms.ads.MobileAds", new C0632r1(this.f1434a));
                        return map;
                    }
                };
            }
            try {
                return b(b10.a());
            } catch (RemoteException unused) {
                L4.p.c("Unable to get Initialization status.");
                return new InitializationStatus() { // from class: H4.t1
                    @Override // com.google.android.gms.ads.initialization.InitializationStatus
                    public final /* synthetic */ Map getAdapterStatusMap() {
                        HashMap map = new HashMap();
                        map.put("com.google.android.gms.ads.MobileAds", new C0632r1(this.f1434a));
                        return map;
                    }
                };
            }
        }
    }

    public final void o(Context context) {
        synchronized (this.f1463i) {
            d(context);
            B0 b10 = this.f1464j;
            if (b10 == null) {
                return;
            }
            try {
                b10.f();
            } catch (RemoteException unused) {
                L4.p.c("Unable to disable mediation adapter initialization.");
            }
        }
    }

    public final void p(Context context, B4.n nVar) {
        synchronized (this.f1463i) {
            try {
                d(context);
                B0 b10 = this.f1464j;
                if (b10 == null) {
                    return;
                }
                this.f1465k = nVar;
                try {
                    b10.b1(new BinderC0644v1(null));
                } catch (RemoteException unused) {
                    L4.p.c("Unable to open the ad inspector.");
                    if (nVar != null) {
                        nVar.a(new B4.c(0, "Ad inspector had an internal error.", MobileAds.ERROR_DOMAIN));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String q() {
        synchronized (this.f1463i) {
            Preconditions.checkState(this.f1464j != null, "MobileAds.initialize() must be called prior to getting version string.");
            B0 b10 = this.f1464j;
            if (b10 == null) {
                return "";
            }
            try {
                return AbstractC4040jt0.a(b10.e());
            } catch (RemoteException e10) {
                L4.p.d("Unable to get internal version.", e10);
                return "";
            }
        }
    }

    public final B4.t r() {
        return this.f1466l;
    }

    public final void s(B4.t tVar) {
        Preconditions.checkArgument(tVar != null, "Null passed to setRequestConfiguration.");
        synchronized (this.f1463i) {
            try {
                B4.t tVar2 = this.f1466l;
                this.f1466l = tVar;
                if (this.f1464j == null) {
                    return;
                }
                if (tVar2.c() != tVar.c() || tVar2.d() != tVar.d()) {
                    c(tVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean t(boolean z9) {
        synchronized (this.f1463i) {
            Preconditions.checkState(this.f1464j != null, "MobileAds.initialize() must be called prior to enable/disable the publisher first-party ID.");
            B0 b10 = this.f1464j;
            if (b10 == null) {
                return false;
            }
            try {
                b10.S0(z9);
                return true;
            } catch (RemoteException e10) {
                String str = z9 ? "enable" : "disable";
                StringBuilder sb = new StringBuilder(str.length() + 40);
                sb.append("Unable to ");
                sb.append(str);
                sb.append(" the publisher first-party ID.");
                L4.p.d(sb.toString(), e10);
                return false;
            }
        }
    }

    public final void u(String str) {
        synchronized (this.f1463i) {
            Preconditions.checkState(this.f1464j != null, "MobileAds.initialize() must be called prior to setting the plugin.");
            B0 b10 = this.f1464j;
            if (b10 == null) {
                return;
            }
            try {
                b10.b0(str);
            } catch (RemoteException e10) {
                L4.p.d("Unable to set plugin.", e10);
            }
        }
    }

    final /* synthetic */ void v(String str) {
        synchronized (this.f1463i) {
            e(null);
        }
    }

    final /* synthetic */ void w(String str) {
        synchronized (this.f1463i) {
            e(null);
        }
    }

    final /* synthetic */ Object y() {
        return this.f1458d;
    }

    final /* synthetic */ ArrayList z() {
        return this.f1460f;
    }
}
