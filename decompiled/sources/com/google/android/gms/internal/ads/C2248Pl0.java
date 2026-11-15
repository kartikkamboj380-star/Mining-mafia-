package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Pl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2248Pl0 implements InterfaceC1781Gl0, InterfaceC1573Cl0, InterfaceC2560Vl0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final C5991zN0 f22165t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4024jl0 f22167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ExecutorService f22168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3145cl0 f22169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f22170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f22171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f22172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f22173h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final double f22174i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f22175j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f22176k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AtomicBoolean f22177l = new AtomicBoolean(false);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f22178m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f22179n = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Object f22180o = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final C4379ma f22181p = C4505na.d0();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List f22182q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f22183r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final HashMap f22184s = new HashMap();

    static {
        C5865yN0 c5865yN0D0 = C5991zN0.d0();
        c5865yN0D0.A(17);
        f22165t = (C5991zN0) c5865yN0D0.w();
    }

    public C2248Pl0(Context context, InterfaceC4024jl0 interfaceC4024jl0, ExecutorService executorService, InterfaceC3145cl0 interfaceC3145cl0, Random random, String str, long j10, long j11, double d10, String str2, long j12) {
        this.f22166a = context;
        this.f22167b = interfaceC4024jl0;
        this.f22168c = executorService;
        this.f22169d = interfaceC3145cl0;
        this.f22171f = str;
        this.f22172g = j10;
        this.f22173h = j11;
        this.f22174i = d10;
        this.f22175j = str2;
        this.f22176k = j12;
        this.f22170e = random.nextDouble() < d10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2560Vl0
    public final void a(InterfaceC2508Ul0 interfaceC2508Ul0) {
        synchronized (this.f22178m) {
            this.f22181p.K(interfaceC2508Ul0.zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1781Gl0
    public final void b(int i10, long j10, Throwable th, String str) {
        long jLongValue;
        if (this.f22170e) {
            synchronized (this.f22179n) {
                try {
                    List list = this.f22182q;
                    synchronized (this.f22180o) {
                        try {
                            HashMap map = this.f22184s;
                            Integer numValueOf = Integer.valueOf(i10);
                            Long l10 = (Long) map.get(numValueOf);
                            if (l10 == null) {
                                l10 = 0L;
                            }
                            jLongValue = 1 + l10.longValue();
                            map.put(numValueOf, Long.valueOf(jLongValue));
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    list.add(new C2092Ml0(i10, j10, th, str, jLongValue));
                    if (!this.f22183r) {
                        this.f22183r = true;
                        this.f22167b.a(new Runnable() { // from class: com.google.android.gms.internal.ads.Ol0
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.f21666a.c();
                            }
                        }, this.f22173h);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    final void c() {
        C4379ma c4379ma;
        AbstractC5931yu0 abstractC5931yu0U;
        String string;
        synchronized (this.f22178m) {
            c4379ma = (C4379ma) this.f22181p.clone();
        }
        synchronized (this.f22179n) {
            List list = this.f22182q;
            abstractC5931yu0U = AbstractC5931yu0.u(list);
            list.clear();
            this.f22183r = false;
        }
        int size = abstractC5931yu0U.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            C2092Ml0 c2092Ml0 = (C2092Ml0) abstractC5931yu0U.get(i10);
            if (i11 >= this.f22172g) {
                d((C4505na) c4379ma.w());
                c4379ma.B();
                i11 = 0;
            }
            C1706Fa c1706FaD0 = C1758Ga.d0();
            c1706FaD0.A(c2092Ml0.f20907a);
            c1706FaD0.B(c2092Ml0.f20908b);
            c1706FaD0.E(c2092Ml0.f20911e);
            String str = c2092Ml0.f20910d;
            if (str != null) {
                c1706FaD0.F(str);
            }
            Throwable th = c2092Ml0.f20909c;
            c1706FaD0.G(th == null ? 2 : 3);
            if (th != null) {
                c1706FaD0.C(th.getClass().getName());
                try {
                    StringWriter stringWriter = new StringWriter();
                    try {
                        PrintWriter printWriter = new PrintWriter(stringWriter);
                        try {
                            th.printStackTrace(printWriter);
                            string = stringWriter.toString();
                            printWriter.close();
                            stringWriter.close();
                        } catch (Throwable th2) {
                            try {
                                printWriter.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        try {
                            stringWriter.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } catch (IOException unused) {
                    string = "";
                }
                c1706FaD0.D(string);
            }
            c4379ma.A((C1758Ga) c1706FaD0.w());
            i10++;
            i11++;
        }
        if (i11 > 0) {
            d((C4505na) c4379ma.w());
            c4379ma.B();
        }
    }

    protected final void d(C4505na c4505na) {
        try {
            C1989Kl0 c1989Kl0D0 = C2041Ll0.d0();
            c1989Kl0D0.B(f22165t);
            C1885Il0 c1885Il0D0 = C1937Jl0.d0();
            c1885Il0D0.A(c4505na);
            c1989Kl0D0.A((C1937Jl0) c1885Il0D0.w());
            this.f22169d.a(this.f22171f, ((C2041Ll0) c1989Kl0D0.w()).i(), CommonGatewayClient.HEADER_PROTOBUF);
        } catch (RuntimeException unused) {
        }
    }

    final /* synthetic */ void e() {
        int i10;
        if (!this.f22170e || this.f22177l.getAndSet(true)) {
            return;
        }
        Context context = this.f22166a;
        String str = this.f22175j;
        double d10 = this.f22174i;
        long j10 = this.f22176k;
        Locale locale = Locale.getDefault();
        C4379ma c4379maD0 = C4505na.d0();
        c4379maD0.C(Build.VERSION.SDK_INT);
        c4379maD0.D(Build.MODEL);
        c4379maD0.E(locale.getLanguage());
        c4379maD0.F(locale.getCountry());
        c4379maD0.I(str);
        c4379maD0.G(context.getPackageName());
        c4379maD0.M(j10);
        if (d10 > 0.0d) {
            c4379maD0.L((int) (1.0d / d10));
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            c4379maD0.H(packageManager.getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (Exception unused) {
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                i10 = 5;
            } else if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                i10 = 4;
            } else if (packageManager.hasSystemFeature("android.hardware.type.pc")) {
                i10 = 7;
            } else {
                UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
                i10 = (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) ? 2 : 6;
            }
            c4379maD0.O(i10);
        } catch (RuntimeException unused2) {
        }
        C4505na c4505na = (C4505na) c4379maD0.w();
        synchronized (this.f22178m) {
            this.f22181p.x(c4505na);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1573Cl0
    public final com.google.common.util.concurrent.p zza() {
        return AbstractC5685wx0.e(new Runnable() { // from class: com.google.android.gms.internal.ads.Nl0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f21336a.e();
            }
        }, this.f22168c);
    }
}
