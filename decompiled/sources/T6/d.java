package T6;

import Y6.m;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class d extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final R6.a f5784c = R6.a.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f5785b;

    d(m mVar) {
        this.f5785b = mVar;
    }

    private boolean g(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            try {
                e.d((String) entry.getKey(), (String) entry.getValue());
            } catch (IllegalArgumentException e10) {
                f5784c.j(e10.getLocalizedMessage());
                return false;
            }
        }
        return true;
    }

    private boolean h(m mVar) {
        return i(mVar, 0);
    }

    private boolean i(m mVar, int i10) {
        if (mVar == null) {
            return false;
        }
        if (i10 > 1) {
            f5784c.j("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        for (Map.Entry entry : mVar.y().entrySet()) {
            if (!l((String) entry.getKey())) {
                f5784c.j("invalid CounterId:" + ((String) entry.getKey()));
                return false;
            }
            if (!m((Long) entry.getValue())) {
                f5784c.j("invalid CounterValue:" + entry.getValue());
                return false;
            }
        }
        Iterator it = mVar.F().iterator();
        while (it.hasNext()) {
            if (!i((m) it.next(), i10 + 1)) {
                return false;
            }
        }
        return true;
    }

    private boolean j(m mVar) {
        if (mVar.x() > 0) {
            return true;
        }
        Iterator it = mVar.F().iterator();
        while (it.hasNext()) {
            if (((m) it.next()).x() > 0) {
                return true;
            }
        }
        return false;
    }

    private boolean k(m mVar) {
        return mVar.getName().startsWith("_st_");
    }

    private boolean l(String str) {
        if (str == null) {
            return false;
        }
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            f5784c.j("counterId is empty");
            return false;
        }
        if (strTrim.length() <= 100) {
            return true;
        }
        f5784c.j("counterId exceeded max length 100");
        return false;
    }

    private boolean m(Long l10) {
        return l10 != null;
    }

    private boolean n(m mVar) {
        Long l10 = (Long) mVar.y().get(X6.b.FRAMES_TOTAL.toString());
        return l10 != null && l10.compareTo((Long) 0L) > 0;
    }

    private boolean o(m mVar, int i10) {
        if (mVar == null) {
            f5784c.j("TraceMetric is null");
            return false;
        }
        if (i10 > 1) {
            f5784c.j("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        if (!q(mVar.getName())) {
            f5784c.j("invalid TraceId:" + mVar.getName());
            return false;
        }
        if (!p(mVar)) {
            f5784c.j("invalid TraceDuration:" + mVar.B());
            return false;
        }
        if (!mVar.G()) {
            f5784c.j("clientStartTimeUs is null.");
            return false;
        }
        if (!k(mVar) || n(mVar)) {
            Iterator it = mVar.F().iterator();
            while (it.hasNext()) {
                if (!o((m) it.next(), i10 + 1)) {
                    return false;
                }
            }
            return g(mVar.z());
        }
        f5784c.j("non-positive totalFrames in screen trace " + mVar.getName());
        return false;
    }

    private boolean p(m mVar) {
        return mVar != null && mVar.B() > 0;
    }

    private boolean q(String str) {
        if (str == null) {
            return false;
        }
        String strTrim = str.trim();
        return !strTrim.isEmpty() && strTrim.length() <= 100;
    }

    @Override // T6.e
    public boolean c() {
        if (!o(this.f5785b, 0)) {
            f5784c.j("Invalid Trace:" + this.f5785b.getName());
            return false;
        }
        if (!j(this.f5785b) || h(this.f5785b)) {
            return true;
        }
        f5784c.j("Invalid Counters for Trace:" + this.f5785b.getName());
        return false;
    }
}
