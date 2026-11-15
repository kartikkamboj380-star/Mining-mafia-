package G4;

import H4.B;
import H4.C0654z;
import K4.AbstractC0786o0;
import K4.F0;
import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.AbstractC2315Qt;
import com.google.android.gms.internal.ads.AbstractC3265di0;
import com.google.android.gms.internal.ads.AbstractC3503fc;
import com.google.android.gms.internal.ads.AbstractC3892ii;
import com.google.android.gms.internal.ads.AbstractC5685wx0;
import com.google.android.gms.internal.ads.C1721Fh0;
import com.google.android.gms.internal.ads.C4005jc;
import com.google.android.gms.internal.ads.C4127ka;
import com.google.android.gms.internal.ads.C4253la;
import com.google.android.gms.internal.ads.C5012rc;
import com.google.android.gms.internal.ads.C5781xi0;
import com.google.android.gms.internal.ads.InterfaceC4509nc;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements Runnable, InterfaceC4509nc {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final long f950G = System.currentTimeMillis();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Executor f957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C1721Fh0 f958h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Context f959i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Context f960j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private L4.a f961k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final L4.a f962l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f963m;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f965w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f951a = new Vector();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f952b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicReference f953c = new AtomicReference();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final CountDownLatch f964v = new CountDownLatch(1);

    public k(Context context, L4.a aVar) {
        this.f959i = context;
        this.f960j = context;
        this.f961k = aVar;
        this.f962l = aVar;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.f957g = executorServiceNewCachedThreadPool;
        boolean zBooleanValue = ((Boolean) B.c().d(AbstractC3892ii.f29807e3)).booleanValue();
        this.f963m = zBooleanValue;
        this.f958h = C1721Fh0.a(context, executorServiceNewCachedThreadPool, zBooleanValue);
        this.f955e = ((Boolean) B.c().d(AbstractC3892ii.f29774b3)).booleanValue();
        this.f956f = ((Boolean) B.c().d(AbstractC3892ii.f29818f3)).booleanValue();
        if (((Boolean) B.c().d(AbstractC3892ii.f29796d3)).booleanValue()) {
            this.f965w = 2;
        } else {
            this.f965w = 1;
        }
        if (!((Boolean) B.c().d(AbstractC3892ii.f29918o4)).booleanValue()) {
            this.f954d = m();
        }
        if (((Boolean) B.c().d(AbstractC3892ii.f29841h4)).booleanValue()) {
            AbstractC2315Qt.f22473a.execute(this);
            return;
        }
        C0654z.a();
        if (L4.g.G()) {
            AbstractC2315Qt.f22473a.execute(this);
        } else {
            run();
        }
    }

    private final void q() {
        List<Object[]> list = this.f951a;
        InterfaceC4509nc interfaceC4509ncS = s();
        if (list.isEmpty() || interfaceC4509ncS == null) {
            return;
        }
        for (Object[] objArr : list) {
            try {
                int length = objArr.length;
                if (length == 1) {
                    interfaceC4509ncS.g((MotionEvent) objArr[0]);
                } else if (length == 3) {
                    interfaceC4509ncS.c(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            } catch (NullPointerException unused) {
            }
        }
        this.f951a.clear();
    }

    private final void r(boolean z9) {
        String str = this.f961k.f3097a;
        Context contextT = t(this.f959i);
        C4127ka c4127kaH0 = C4253la.h0();
        c4127kaH0.B(z9);
        c4127kaH0.A(str);
        this.f952b.set(C5012rc.x(contextT, (C4253la) c4127kaH0.w()));
    }

    private final InterfaceC4509nc s() {
        return p() == 2 ? (InterfaceC4509nc) this.f953c.get() : (InterfaceC4509nc) this.f952b.get();
    }

    private static final Context t(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private static final C4005jc u(Context context, L4.a aVar, boolean z9, boolean z10) {
        C4127ka c4127kaH0 = C4253la.h0();
        c4127kaH0.B(z9);
        c4127kaH0.A(aVar.f3097a);
        return C4005jc.a(t(context), (C4253la) c4127kaH0.w(), z10);
    }

    public final boolean a() {
        try {
            this.f964v.await();
            return true;
        } catch (InterruptedException e10) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.g("Interrupted during GADSignals creation.", e10);
            return false;
        }
    }

    public final String b(Context context, byte[] bArr) {
        InterfaceC4509nc interfaceC4509ncS;
        if (!a() || (interfaceC4509ncS = s()) == null) {
            return "";
        }
        q();
        try {
            return interfaceC4509ncS.e(t(context));
        } catch (NullPointerException unused) {
            return "";
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4509nc
    public final void c(int i10, int i11, int i12) {
        InterfaceC4509nc interfaceC4509ncS = s();
        if (interfaceC4509ncS == null) {
            this.f951a.add(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)});
            return;
        }
        q();
        try {
            interfaceC4509ncS.c(i10, i11, i12);
        } catch (NullPointerException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4509nc
    public final String d(final Context context) {
        try {
            return (String) AbstractC5685wx0.d(new Callable() { // from class: G4.j
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.f948a.b(context, null);
                }
            }, this.f957g).get(((Integer) B.c().d(AbstractC3892ii.f29994v3)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            return Integer.toString(17);
        } catch (TimeoutException unused2) {
            return AbstractC3503fc.a(context, this.f962l.f3097a, f950G, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4509nc
    public final String e(Context context) {
        return b(context, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4509nc
    public final String f(Context context, String str, View view) {
        return h(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4509nc
    public final void g(MotionEvent motionEvent) {
        InterfaceC4509nc interfaceC4509ncS = s();
        if (interfaceC4509ncS == null) {
            this.f951a.add(new Object[]{motionEvent});
            return;
        }
        q();
        try {
            interfaceC4509ncS.g(motionEvent);
        } catch (NullPointerException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4509nc
    public final String h(Context context, String str, View view, Activity activity) {
        if (!a()) {
            return "";
        }
        InterfaceC4509nc interfaceC4509ncS = s();
        if (((Boolean) B.c().d(AbstractC3892ii.fc)).booleanValue()) {
            t.g();
            F0.o(view, 4, null);
        }
        if (interfaceC4509ncS == null) {
            return "";
        }
        q();
        try {
            return interfaceC4509ncS.h(t(context), str, view, activity);
        } catch (NullPointerException unused) {
            return "";
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4509nc
    public final void i(StackTraceElement[] stackTraceElementArr) {
        InterfaceC4509nc interfaceC4509ncS;
        InterfaceC4509nc interfaceC4509ncS2;
        if (((Boolean) B.c().d(AbstractC3892ii.f29523C3)).booleanValue()) {
            if (this.f964v.getCount() != 0 || (interfaceC4509ncS2 = s()) == null) {
                return;
            }
            try {
                interfaceC4509ncS2.i(stackTraceElementArr);
                return;
            } catch (NullPointerException unused) {
                return;
            }
        }
        if (!a() || (interfaceC4509ncS = s()) == null) {
            return;
        }
        try {
            interfaceC4509ncS.i(stackTraceElementArr);
        } catch (NullPointerException unused2) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4509nc
    public final void j(View view) {
        InterfaceC4509nc interfaceC4509ncS = s();
        if (interfaceC4509ncS != null) {
            try {
                interfaceC4509ncS.j(view);
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4509nc
    public final String k(Context context, View view, Activity activity) {
        try {
            if (!((Boolean) B.c().d(AbstractC3892ii.ec)).booleanValue()) {
                InterfaceC4509nc interfaceC4509ncS = s();
                if (((Boolean) B.c().d(AbstractC3892ii.fc)).booleanValue()) {
                    t.g();
                    F0.o(view, 2, null);
                }
                return interfaceC4509ncS != null ? interfaceC4509ncS.k(context, view, activity) : "";
            }
            if (!a()) {
                return "";
            }
            InterfaceC4509nc interfaceC4509ncS2 = s();
            if (((Boolean) B.c().d(AbstractC3892ii.fc)).booleanValue()) {
                t.g();
                F0.o(view, 2, null);
            }
            return interfaceC4509ncS2 != null ? interfaceC4509ncS2.k(context, view, activity) : "";
        } catch (NullPointerException unused) {
            return "";
        }
    }

    public final String l() {
        int i10 = this.f965w;
        int i11 = i10 - 1;
        if (i10 != 0) {
            return i11 != 0 ? CommonGetHeaderBiddingToken.HB_TOKEN_VERSION : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
        }
        throw null;
    }

    protected final boolean m() {
        Context context = this.f959i;
        h hVar = new h(this);
        C1721Fh0 c1721Fh0 = this.f958h;
        return new C5781xi0(this.f959i, AbstractC3265di0.b(context, c1721Fh0), hVar, ((Boolean) B.c().d(AbstractC3892ii.f29785c3)).booleanValue()).d(1);
    }

    final /* synthetic */ void n(boolean z9) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            u(this.f960j, this.f962l, z9, this.f963m).m();
        } catch (NullPointerException e10) {
            this.f958h.c(2027, System.currentTimeMillis() - jCurrentTimeMillis, e10);
        }
    }

    final /* synthetic */ C1721Fh0 o() {
        return this.f958h;
    }

    protected final int p() {
        if (!this.f955e || this.f954d) {
            return this.f965w;
        }
        return 1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) B.c().d(AbstractC3892ii.f29918o4)).booleanValue()) {
                this.f954d = m();
            }
            boolean z9 = this.f961k.f3100d;
            final boolean z10 = false;
            if (!((Boolean) B.c().d(AbstractC3892ii.f29531D1)).booleanValue() && z9) {
                z10 = true;
            }
            if (p() == 1) {
                r(z10);
                if (this.f965w == 2) {
                    this.f957g.execute(new Runnable() { // from class: G4.i
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.f946a.n(z10);
                        }
                    });
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    C4005jc c4005jcU = u(this.f959i, this.f961k, z10, this.f963m);
                    this.f953c.set(c4005jcU);
                    if (this.f956f && !c4005jcU.b()) {
                        this.f965w = 1;
                        r(z10);
                    }
                } catch (NullPointerException e10) {
                    this.f965w = 1;
                    r(z10);
                    this.f958h.c(2031, System.currentTimeMillis() - jCurrentTimeMillis, e10);
                }
            }
            this.f964v.countDown();
            this.f959i = null;
            this.f961k = null;
        } catch (Throwable th) {
            this.f964v.countDown();
            this.f959i = null;
            this.f961k = null;
            throw th;
        }
    }
}
