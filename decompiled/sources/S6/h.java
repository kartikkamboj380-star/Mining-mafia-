package S6;

import W6.k;
import X6.o;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends com.google.firebase.perf.application.b implements V6.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final R6.a f5515i = R6.a.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f5516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GaugeManager f5517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f5518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Y6.h.b f5519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final WeakReference f5520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f5521f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f5522g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f5523h;

    private h(k kVar) {
        this(kVar, com.google.firebase.perf.application.a.b(), GaugeManager.getInstance());
    }

    public static h c(k kVar) {
        return new h(kVar);
    }

    private boolean h() {
        return this.f5519d.m();
    }

    private boolean i() {
        return this.f5519d.o();
    }

    private static boolean j(String str) {
        if (str.length() > 128) {
            return false;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt <= 31 || cCharAt > 127) {
                return false;
            }
        }
        return true;
    }

    @Override // V6.b
    public void a(V6.a aVar) {
        if (aVar == null) {
            f5515i.j("Unable to add new SessionId to the Network Trace. Continuing without it.");
        } else {
            if (!h() || i()) {
                return;
            }
            this.f5516a.add(aVar);
        }
    }

    public Y6.h b() {
        SessionManager.getInstance().unregisterForSessionUpdates(this.f5520e);
        unregisterForAppState();
        Y6.k[] kVarArrB = V6.a.b(d());
        if (kVarArrB != null) {
            this.f5519d.h(Arrays.asList(kVarArrB));
        }
        Y6.h hVar = (Y6.h) this.f5519d.build();
        if (!U6.d.c(this.f5521f)) {
            f5515i.a("Dropping network request from a 'User-Agent' that is not allowed");
            return hVar;
        }
        if (this.f5522g) {
            if (this.f5523h) {
                f5515i.a("This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response");
            }
            return hVar;
        }
        this.f5518c.w(hVar, getAppState());
        this.f5522g = true;
        return hVar;
    }

    List d() {
        List listUnmodifiableList;
        synchronized (this.f5516a) {
            try {
                ArrayList arrayList = new ArrayList();
                for (V6.a aVar : this.f5516a) {
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

    public long e() {
        return this.f5519d.l();
    }

    public String f() {
        return this.f5519d.getUrl();
    }

    public boolean g() {
        return this.f5519d.n();
    }

    public h k(Map map) {
        this.f5519d.i().p(map);
        return this;
    }

    public h l(String str) {
        Y6.h.d dVar;
        if (str != null) {
            Y6.h.d dVar2 = Y6.h.d.HTTP_METHOD_UNKNOWN;
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            switch (upperCase) {
                case "OPTIONS":
                    dVar = Y6.h.d.OPTIONS;
                    break;
                case "GET":
                    dVar = Y6.h.d.GET;
                    break;
                case "PUT":
                    dVar = Y6.h.d.PUT;
                    break;
                case "HEAD":
                    dVar = Y6.h.d.HEAD;
                    break;
                case "POST":
                    dVar = Y6.h.d.POST;
                    break;
                case "PATCH":
                    dVar = Y6.h.d.PATCH;
                    break;
                case "TRACE":
                    dVar = Y6.h.d.TRACE;
                    break;
                case "CONNECT":
                    dVar = Y6.h.d.CONNECT;
                    break;
                case "DELETE":
                    dVar = Y6.h.d.DELETE;
                    break;
                default:
                    dVar = Y6.h.d.HTTP_METHOD_UNKNOWN;
                    break;
            }
            this.f5519d.r(dVar);
        }
        return this;
    }

    public h m(int i10) {
        this.f5519d.s(i10);
        return this;
    }

    public void n() {
        this.f5523h = true;
    }

    public h o() {
        this.f5519d.t(Y6.h.e.GENERIC_CLIENT_ERROR);
        return this;
    }

    public h p(long j10) {
        this.f5519d.u(j10);
        return this;
    }

    public h q(long j10) {
        V6.a aVarPerfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f5520e);
        this.f5519d.q(j10);
        a(aVarPerfSession);
        if (aVarPerfSession.e()) {
            this.f5517b.collectGaugeMetricOnce(aVarPerfSession.d());
        }
        return this;
    }

    public h r(String str) {
        if (str == null) {
            this.f5519d.k();
            return this;
        }
        if (j(str)) {
            this.f5519d.w(str);
            return this;
        }
        f5515i.j("The content type of the response is not a valid content-type:" + str);
        return this;
    }

    public h s(long j10) {
        this.f5519d.x(j10);
        return this;
    }

    public h t(long j10) {
        this.f5519d.y(j10);
        return this;
    }

    public h u(long j10) {
        this.f5519d.z(j10);
        if (SessionManager.getInstance().perfSession().e()) {
            this.f5517b.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().d());
        }
        return this;
    }

    public h v(long j10) {
        this.f5519d.A(j10);
        return this;
    }

    public h x(String str) {
        if (str != null) {
            this.f5519d.B(o.e(o.d(str), 2000));
        }
        return this;
    }

    public h y(String str) {
        this.f5521f = str;
        return this;
    }

    public h(k kVar, com.google.firebase.perf.application.a aVar, GaugeManager gaugeManager) {
        super(aVar);
        this.f5519d = Y6.h.T();
        this.f5520e = new WeakReference(this);
        this.f5518c = kVar;
        this.f5517b = gaugeManager;
        this.f5516a = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }
}
