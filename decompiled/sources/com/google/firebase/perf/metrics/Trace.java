package com.google.firebase.perf.metrics;

import T6.e;
import W6.k;
import X6.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class Trace extends com.google.firebase.perf.application.b implements Parcelable, V6.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f40442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Trace f40443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final GaugeManager f40444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f40445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f40446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f40447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f40448g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f40449h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final k f40450i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final X6.a f40451j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private l f40452k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private l f40453l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final R6.a f40439m = R6.a.e();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Map f40440v = new ConcurrentHashMap();

    @Keep
    public static final Parcelable.Creator<Trace> CREATOR = new a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final Parcelable.Creator f40441w = new b();

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, false, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Trace[] newArray(int i10) {
            return new Trace[i10];
        }
    }

    class b implements Parcelable.Creator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, true, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Trace[] newArray(int i10) {
            return new Trace[i10];
        }
    }

    /* synthetic */ Trace(Parcel parcel, boolean z9, a aVar) {
        this(parcel, z9);
    }

    private void b(String str, String str2) {
        if (l()) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Trace '%s' has been stopped", this.f40445d));
        }
        if (!this.f40447f.containsKey(str) && this.f40447f.size() >= 5) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", 5));
        }
        e.d(str, str2);
    }

    public static Trace c(String str) {
        return new Trace(str);
    }

    private com.google.firebase.perf.metrics.a m(String str) {
        com.google.firebase.perf.metrics.a aVar = (com.google.firebase.perf.metrics.a) this.f40446e.get(str);
        if (aVar != null) {
            return aVar;
        }
        com.google.firebase.perf.metrics.a aVar2 = new com.google.firebase.perf.metrics.a(str);
        this.f40446e.put(str, aVar2);
        return aVar2;
    }

    private void n(l lVar) {
        if (this.f40449h.isEmpty()) {
            return;
        }
        Trace trace = (Trace) this.f40449h.get(this.f40449h.size() - 1);
        if (trace.f40453l == null) {
            trace.f40453l = lVar;
        }
    }

    @Override // V6.b
    public void a(V6.a aVar) {
        if (aVar == null) {
            f40439m.j("Unable to add new SessionId to the Trace. Continuing without it.");
        } else {
            if (!j() || l()) {
                return;
            }
            this.f40448g.add(aVar);
        }
    }

    Map d() {
        return this.f40446e;
    }

    @Override // android.os.Parcelable
    @Keep
    public int describeContents() {
        return 0;
    }

    l e() {
        return this.f40453l;
    }

    public String f() {
        return this.f40445d;
    }

    protected void finalize() throws Throwable {
        try {
            if (k()) {
                f40439m.k("Trace '%s' is started but not stopped when it is destructed!", this.f40445d);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    List g() {
        List listUnmodifiableList;
        synchronized (this.f40448g) {
            try {
                ArrayList arrayList = new ArrayList();
                for (V6.a aVar : this.f40448g) {
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        return listUnmodifiableList;
    }

    @Keep
    public String getAttribute(@NonNull String str) {
        return (String) this.f40447f.get(str);
    }

    @NonNull
    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.f40447f);
    }

    @Keep
    public long getLongMetric(@NonNull String str) {
        com.google.firebase.perf.metrics.a aVar = str != null ? (com.google.firebase.perf.metrics.a) this.f40446e.get(str.trim()) : null;
        if (aVar == null) {
            return 0L;
        }
        return aVar.a();
    }

    l h() {
        return this.f40452k;
    }

    List i() {
        return this.f40449h;
    }

    @Keep
    public void incrementMetric(@NonNull String str, long j10) {
        String strE = e.e(str);
        if (strE != null) {
            f40439m.d("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, strE);
            return;
        }
        if (!j()) {
            f40439m.k("Cannot increment metric '%s' for trace '%s' because it's not started", str, this.f40445d);
        } else {
            if (l()) {
                f40439m.k("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, this.f40445d);
                return;
            }
            com.google.firebase.perf.metrics.a aVarM = m(str.trim());
            aVarM.c(j10);
            f40439m.b("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(aVarM.a()), this.f40445d);
        }
    }

    boolean j() {
        return this.f40452k != null;
    }

    boolean k() {
        return j() && !l();
    }

    boolean l() {
        return this.f40453l != null;
    }

    @Keep
    public void putAttribute(@NonNull String str, @NonNull String str2) {
        boolean z9;
        try {
            str = str.trim();
            str2 = str2.trim();
            b(str, str2);
            f40439m.b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.f40445d);
            z9 = true;
        } catch (Exception e10) {
            f40439m.d("Can not set attribute '%s' with value '%s' (%s)", str, str2, e10.getMessage());
            z9 = false;
        }
        if (z9) {
            this.f40447f.put(str, str2);
        }
    }

    @Keep
    public void putMetric(@NonNull String str, long j10) {
        String strE = e.e(str);
        if (strE != null) {
            f40439m.d("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, strE);
            return;
        }
        if (!j()) {
            f40439m.k("Cannot set value for metric '%s' for trace '%s' because it's not started", str, this.f40445d);
        } else if (l()) {
            f40439m.k("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, this.f40445d);
        } else {
            m(str.trim()).d(j10);
            f40439m.b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j10), this.f40445d);
        }
    }

    @Keep
    public void removeAttribute(@NonNull String str) {
        if (l()) {
            f40439m.c("Can't remove a attribute from a Trace that's stopped.");
        } else {
            this.f40447f.remove(str);
        }
    }

    @Keep
    public void start() {
        if (!com.google.firebase.perf.config.a.g().K()) {
            f40439m.a("Trace feature is disabled.");
            return;
        }
        String strF = e.f(this.f40445d);
        if (strF != null) {
            f40439m.d("Cannot start trace '%s'. Trace name is invalid.(%s)", this.f40445d, strF);
            return;
        }
        if (this.f40452k != null) {
            f40439m.d("Trace '%s' has already started, should not start again!", this.f40445d);
            return;
        }
        this.f40452k = this.f40451j.a();
        registerForAppState();
        V6.a aVarPerfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f40442a);
        a(aVarPerfSession);
        if (aVarPerfSession.e()) {
            this.f40444c.collectGaugeMetricOnce(aVarPerfSession.d());
        }
    }

    @Keep
    public void stop() {
        if (!j()) {
            f40439m.d("Trace '%s' has not been started so unable to stop!", this.f40445d);
            return;
        }
        if (l()) {
            f40439m.d("Trace '%s' has already stopped, should not stop again!", this.f40445d);
            return;
        }
        SessionManager.getInstance().unregisterForSessionUpdates(this.f40442a);
        unregisterForAppState();
        l lVarA = this.f40451j.a();
        this.f40453l = lVarA;
        if (this.f40443b == null) {
            n(lVarA);
            if (this.f40445d.isEmpty()) {
                f40439m.c("Trace name is empty, no log is sent to server");
                return;
            }
            this.f40450i.x(new com.google.firebase.perf.metrics.b(this).a(), getAppState());
            if (SessionManager.getInstance().perfSession().e()) {
                this.f40444c.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().d());
            }
        }
    }

    @Override // android.os.Parcelable
    @Keep
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeParcelable(this.f40443b, 0);
        parcel.writeString(this.f40445d);
        parcel.writeList(this.f40449h);
        parcel.writeMap(this.f40446e);
        parcel.writeParcelable(this.f40452k, 0);
        parcel.writeParcelable(this.f40453l, 0);
        synchronized (this.f40448g) {
            parcel.writeList(this.f40448g);
        }
    }

    private Trace(String str) {
        this(str, k.k(), new X6.a(), com.google.firebase.perf.application.a.b(), GaugeManager.getInstance());
    }

    public Trace(String str, k kVar, X6.a aVar, com.google.firebase.perf.application.a aVar2) {
        this(str, kVar, aVar, aVar2, GaugeManager.getInstance());
    }

    public Trace(String str, k kVar, X6.a aVar, com.google.firebase.perf.application.a aVar2, GaugeManager gaugeManager) {
        super(aVar2);
        this.f40442a = new WeakReference(this);
        this.f40443b = null;
        this.f40445d = str.trim();
        this.f40449h = new ArrayList();
        this.f40446e = new ConcurrentHashMap();
        this.f40447f = new ConcurrentHashMap();
        this.f40451j = aVar;
        this.f40450i = kVar;
        this.f40448g = Collections.synchronizedList(new ArrayList());
        this.f40444c = gaugeManager;
    }

    private Trace(Parcel parcel, boolean z9) {
        super(z9 ? null : com.google.firebase.perf.application.a.b());
        this.f40442a = new WeakReference(this);
        this.f40443b = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.f40445d = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f40449h = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f40446e = concurrentHashMap;
        this.f40447f = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, com.google.firebase.perf.metrics.a.class.getClassLoader());
        this.f40452k = (l) parcel.readParcelable(l.class.getClassLoader());
        this.f40453l = (l) parcel.readParcelable(l.class.getClassLoader());
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        this.f40448g = listSynchronizedList;
        parcel.readList(listSynchronizedList, V6.a.class.getClassLoader());
        if (z9) {
            this.f40450i = null;
            this.f40451j = null;
            this.f40444c = null;
        } else {
            this.f40450i = k.k();
            this.f40451j = new X6.a();
            this.f40444c = GaugeManager.getInstance();
        }
    }
}
