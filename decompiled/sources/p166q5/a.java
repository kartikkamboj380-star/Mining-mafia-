package p166q5;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.WorkSourceUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p070h.w;
import p106k5.b;
import p106k5.h;
import p106k5.i;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f48069r = TimeUnit.DAYS.toMillis(366);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static volatile ScheduledExecutorService f48070s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Object f48071t = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static volatile e f48072u = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f48073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PowerManager.WakeLock f48074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f48075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Future f48076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f48077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set f48078f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f48079g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f48080h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    b f48081i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Clock f48082j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private WorkSource f48083k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f48084l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f48085m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f48086n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Map f48087o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AtomicInteger f48088p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ScheduledExecutorService f48089q;

    public a(Context context, int i10, String str) {
        String packageName = context.getPackageName();
        this.f48073a = new Object();
        this.f48075c = 0;
        this.f48078f = new HashSet();
        this.f48079g = true;
        this.f48082j = DefaultClock.getInstance();
        this.f48087o = new HashMap();
        this.f48088p = new AtomicInteger(0);
        Preconditions.checkNotNull(context, "WakeLock: context must not be null");
        Preconditions.checkNotEmpty(str, "WakeLock: wakeLockName must not be empty");
        this.f48086n = context.getApplicationContext();
        this.f48085m = str;
        this.f48081i = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f48084l = str;
        } else {
            String strValueOf = String.valueOf(str);
            this.f48084l = strValueOf.length() != 0 ? "*gcore*:".concat(strValueOf) : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new i(sb.toString());
        }
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(i10, str);
        this.f48074b = wakeLockNewWakeLock;
        if (WorkSourceUtil.hasWorkSourcePermission(context)) {
            WorkSource workSourceFromPackage = WorkSourceUtil.fromPackage(context, Strings.isEmptyOrWhitespace(packageName) ? context.getPackageName() : packageName);
            this.f48083k = workSourceFromPackage;
            if (workSourceFromPackage != null) {
                i(wakeLockNewWakeLock, workSourceFromPackage);
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f48070s;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f48071t) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f48070s;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        h.a();
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f48070s = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f48089q = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public static /* synthetic */ void e(a aVar) {
        synchronized (aVar.f48073a) {
            try {
                if (aVar.b()) {
                    Log.e("WakeLock", String.valueOf(aVar.f48084l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    aVar.g();
                    if (aVar.b()) {
                        aVar.f48075c = 1;
                        aVar.h(0);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final String f(String str) {
        if (this.f48079g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    private final void g() {
        if (this.f48078f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f48078f);
        this.f48078f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        w.a(arrayList.get(0));
        throw null;
    }

    private final void h(int i10) {
        synchronized (this.f48073a) {
            try {
                if (b()) {
                    if (this.f48079g) {
                        int i11 = this.f48075c - 1;
                        this.f48075c = i11;
                        if (i11 > 0) {
                            return;
                        }
                    } else {
                        this.f48075c = 0;
                    }
                    g();
                    Iterator it = this.f48087o.values().iterator();
                    while (it.hasNext()) {
                        ((d) it.next()).f48091a = 0;
                    }
                    this.f48087o.clear();
                    Future future = this.f48076d;
                    if (future != null) {
                        future.cancel(false);
                        this.f48076d = null;
                        this.f48077e = 0L;
                    }
                    this.f48080h = 0;
                    if (this.f48074b.isHeld()) {
                        try {
                            try {
                                this.f48074b.release();
                                if (this.f48081i != null) {
                                    this.f48081i = null;
                                }
                            } catch (RuntimeException e10) {
                                if (!e10.getClass().equals(RuntimeException.class)) {
                                    throw e10;
                                }
                                Log.e("WakeLock", String.valueOf(this.f48084l).concat(" failed to release!"), e10);
                                if (this.f48081i != null) {
                                    this.f48081i = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.f48081i != null) {
                                this.f48081i = null;
                            }
                            throw th;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f48084l).concat(" should be held!"));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e10) {
            Log.wtf("WakeLock", e10.toString());
        }
    }

    public void a(long j10) {
        this.f48088p.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f48069r), 1L);
        if (j10 > 0) {
            jMax = Math.min(j10, jMax);
        }
        synchronized (this.f48073a) {
            try {
                if (!b()) {
                    this.f48081i = b.a(false, null);
                    this.f48074b.acquire();
                    this.f48082j.elapsedRealtime();
                }
                this.f48075c++;
                this.f48080h++;
                f(null);
                d dVar = (d) this.f48087o.get(null);
                if (dVar == null) {
                    dVar = new d(null);
                    this.f48087o.put(null, dVar);
                }
                dVar.f48091a++;
                long jElapsedRealtime = this.f48082j.elapsedRealtime();
                long j11 = Long.MAX_VALUE - jElapsedRealtime > jMax ? jElapsedRealtime + jMax : Long.MAX_VALUE;
                if (j11 > this.f48077e) {
                    this.f48077e = j11;
                    Future future = this.f48076d;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.f48076d = this.f48089q.schedule(new Runnable() { // from class: q5.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.e(this.f48090a);
                        }
                    }, jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean b() {
        boolean z9;
        synchronized (this.f48073a) {
            z9 = this.f48075c > 0;
        }
        return z9;
    }

    public void c() {
        if (this.f48088p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f48084l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f48073a) {
            try {
                f(null);
                if (this.f48087o.containsKey(null)) {
                    d dVar = (d) this.f48087o.get(null);
                    if (dVar != null) {
                        int i10 = dVar.f48091a - 1;
                        dVar.f48091a = i10;
                        if (i10 == 0) {
                            this.f48087o.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f48084l).concat(" counter does not exist"));
                }
                h(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(boolean z9) {
        synchronized (this.f48073a) {
            this.f48079g = z9;
        }
    }
}
