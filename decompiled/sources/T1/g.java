package T1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class g implements k, V1.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Class f5659r = g.class;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f5660s = TimeUnit.HOURS.toMillis(2);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f5661t = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f5662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f5663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CountDownLatch f5664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f5665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final S1.c f5666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Set f5667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f5668g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f5669h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p033d2.a f5670i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final f f5671j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final j f5672k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final S1.a f5673l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f5674m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final b f5675n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final p053f2.a f5676o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Object f5677p = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f5678q;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (g.this.f5677p) {
                g.this.p();
            }
            g.this.f5678q = true;
            g.this.f5664c.countDown();
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f5680a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f5681b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f5682c = -1;

        b() {
        }

        public synchronized long a() {
            return this.f5682c;
        }

        public synchronized long b() {
            return this.f5681b;
        }

        public synchronized void c(long j10, long j11) {
            if (this.f5680a) {
                this.f5681b += j10;
                this.f5682c += j11;
            }
        }

        public synchronized boolean d() {
            return this.f5680a;
        }

        public synchronized void e() {
            this.f5680a = false;
            this.f5682c = -1L;
            this.f5681b = -1L;
        }

        public synchronized void f(long j10, long j11) {
            this.f5682c = j11;
            this.f5681b = j10;
            this.f5680a = true;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f5683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f5684b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f5685c;

        public c(long j10, long j11, long j12) {
            this.f5683a = j10;
            this.f5684b = j11;
            this.f5685c = j12;
        }
    }

    public g(f fVar, j jVar, c cVar, S1.c cVar2, S1.a aVar, V1.b bVar, Executor executor, boolean z9) {
        this.f5662a = cVar.f5684b;
        long j10 = cVar.f5685c;
        this.f5663b = j10;
        this.f5665d = j10;
        this.f5670i = p033d2.a.d();
        this.f5671j = fVar;
        this.f5672k = jVar;
        this.f5668g = -1L;
        this.f5666e = cVar2;
        this.f5669h = cVar.f5683a;
        this.f5673l = aVar;
        this.f5675n = new b();
        this.f5676o = p053f2.d.a();
        this.f5674m = z9;
        this.f5667f = new HashSet();
        if (bVar != null) {
            bVar.a(this);
        }
        if (!z9) {
            this.f5664c = new CountDownLatch(0);
        } else {
            this.f5664c = new CountDownLatch(1);
            executor.execute(new a());
        }
    }

    private R1.a l(f.b bVar, S1.d dVar, String str) {
        R1.a aVarF;
        synchronized (this.f5677p) {
            aVarF = bVar.f(dVar);
            this.f5667f.add(str);
            this.f5675n.c(aVarF.size(), 1L);
        }
        return aVarF;
    }

    private void m(long j10, S1.c.a aVar) throws IOException {
        try {
            Collection<f.a> collectionN = n(this.f5671j.h());
            long jB = this.f5675n.b();
            long j11 = jB - j10;
            int i10 = 0;
            long j12 = 0;
            for (f.a aVar2 : collectionN) {
                if (j12 > j11) {
                    break;
                }
                long jE = this.f5671j.e(aVar2);
                this.f5667f.remove(aVar2.getId());
                if (jE > 0) {
                    i10++;
                    j12 += jE;
                    l lVarE = l.a().j(aVar2.getId()).g(aVar).i(jE).f(jB - j12).e(j10);
                    S1.c cVar = this.f5666e;
                    if (cVar != null) {
                        cVar.g(lVarE);
                    }
                    lVarE.b();
                }
            }
            this.f5675n.c(-j12, -i10);
            this.f5671j.b();
        } catch (IOException e10) {
            this.f5673l.a(S1.a.EnumC0079a.EVICTION, f5659r, "evictAboveSize: " + e10.getMessage(), e10);
            throw e10;
        }
    }

    private Collection n(Collection collection) {
        long jNow = this.f5676o.now() + f5660s;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            f.a aVar = (f.a) it.next();
            if (aVar.getTimestamp() > jNow) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        Collections.sort(arrayList2, this.f5672k.get());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    private void o() {
        synchronized (this.f5677p) {
            try {
                boolean zP = p();
                s();
                long jB = this.f5675n.b();
                if (jB > this.f5665d && !zP) {
                    this.f5675n.e();
                    p();
                }
                long j10 = this.f5665d;
                if (jB > j10) {
                    m((j10 * 9) / 10, S1.c.a.CACHE_FULL);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p() {
        long jNow = this.f5676o.now();
        if (this.f5675n.d()) {
            long j10 = this.f5668g;
            if (j10 != -1 && jNow - j10 <= f5661t) {
                return false;
            }
        }
        return q();
    }

    private boolean q() {
        boolean z9;
        long j10;
        long jNow = this.f5676o.now();
        long j11 = f5660s + jNow;
        Set hashSet = (this.f5674m && this.f5667f.isEmpty()) ? this.f5667f : this.f5674m ? new HashSet() : null;
        try {
            long jA = 0;
            long jMax = -1;
            int iA = 0;
            boolean z10 = false;
            int i10 = 0;
            int i11 = 0;
            z9 = false;
            for (f.a aVar : this.f5671j.h()) {
                try {
                    i10++;
                    jA += aVar.a();
                    if (aVar.getTimestamp() > j11) {
                        i11++;
                        iA = (int) (((long) iA) + aVar.a());
                        j10 = j11;
                        jMax = Math.max(aVar.getTimestamp() - jNow, jMax);
                        z10 = true;
                    } else {
                        j10 = j11;
                        if (this.f5674m) {
                            Y1.k.g(hashSet);
                            hashSet.add(aVar.getId());
                        }
                    }
                    j11 = j10;
                } catch (IOException e10) {
                    e = e10;
                    this.f5673l.a(S1.a.EnumC0079a.GENERIC_IO, f5659r, "calcFileCacheSize: " + e.getMessage(), e);
                    return z9;
                }
            }
            if (z10) {
                this.f5673l.a(S1.a.EnumC0079a.READ_INVALID_ENTRY, f5659r, "Future timestamp found in " + i11 + " files , with a total size of " + iA + " bytes, and a maximum time delta of " + jMax + "ms", null);
            }
            long j12 = i10;
            if (this.f5675n.a() != j12 || this.f5675n.b() != jA) {
                if (this.f5674m && this.f5667f != hashSet) {
                    Y1.k.g(hashSet);
                    this.f5667f.clear();
                    this.f5667f.addAll(hashSet);
                }
                this.f5675n.f(jA, j12);
            }
            this.f5668g = jNow;
            return true;
        } catch (IOException e11) {
            e = e11;
            z9 = false;
        }
    }

    private f.b r(String str, S1.d dVar) {
        o();
        return this.f5671j.d(str, dVar);
    }

    private void s() {
        if (this.f5670i.f(this.f5671j.isExternal() ? p033d2.a.EnumC0410a.EXTERNAL : p033d2.a.EnumC0410a.INTERNAL, this.f5663b - this.f5675n.b())) {
            this.f5665d = this.f5662a;
        } else {
            this.f5665d = this.f5663b;
        }
    }

    @Override // T1.k
    public void a() {
        synchronized (this.f5677p) {
            try {
                this.f5671j.a();
                this.f5667f.clear();
                S1.c cVar = this.f5666e;
                if (cVar != null) {
                    cVar.d();
                }
            } catch (IOException | NullPointerException e10) {
                this.f5673l.a(S1.a.EnumC0079a.EVICTION, f5659r, "clearAll: " + e10.getMessage(), e10);
            }
            this.f5675n.e();
        }
    }

    @Override // T1.k
    public R1.a b(S1.d dVar) {
        R1.a aVarG;
        l lVarD = l.a().d(dVar);
        try {
            try {
                synchronized (this.f5677p) {
                    try {
                        List listB = S1.e.b(dVar);
                        String str = null;
                        aVarG = null;
                        for (int i10 = 0; i10 < listB.size(); i10++) {
                            str = (String) listB.get(i10);
                            lVarD.j(str);
                            aVarG = this.f5671j.g(str, dVar);
                            if (aVarG != null) {
                                break;
                            }
                        }
                        if (aVarG == null) {
                            S1.c cVar = this.f5666e;
                            if (cVar != null) {
                                cVar.h(lVarD);
                            }
                            this.f5667f.remove(str);
                        } else {
                            Y1.k.g(str);
                            S1.c cVar2 = this.f5666e;
                            if (cVar2 != null) {
                                cVar2.f(lVarD);
                            }
                            this.f5667f.add(str);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                lVarD.b();
                return aVarG;
            } catch (IOException e10) {
                this.f5673l.a(S1.a.EnumC0079a.GENERIC_IO, f5659r, "getResource", e10);
                lVarD.h(e10);
                S1.c cVar3 = this.f5666e;
                if (cVar3 != null) {
                    cVar3.c(lVarD);
                }
                lVarD.b();
                return null;
            }
        } catch (Throwable th2) {
            lVarD.b();
            throw th2;
        }
    }

    @Override // T1.k
    public boolean c(S1.d dVar) throws Throwable {
        String str;
        IOException e10;
        String str2 = null;
        try {
            try {
                synchronized (this.f5677p) {
                    try {
                        List listB = S1.e.b(dVar);
                        int i10 = 0;
                        while (i10 < listB.size()) {
                            String str3 = (String) listB.get(i10);
                            if (this.f5671j.c(str3, dVar)) {
                                this.f5667f.add(str3);
                                return true;
                            }
                            i10++;
                            str2 = str3;
                        }
                        return false;
                    } catch (Throwable th) {
                        str = str2;
                        th = th;
                        try {
                            throw th;
                        } catch (IOException e11) {
                            e10 = e11;
                            l lVarH = l.a().d(dVar).j(str).h(e10);
                            S1.c cVar = this.f5666e;
                            if (cVar != null) {
                                cVar.c(lVarH);
                            }
                            lVarH.b();
                            return false;
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e12) {
            str = null;
            e10 = e12;
        }
    }

    @Override // T1.k
    public boolean d(S1.d dVar) {
        synchronized (this.f5677p) {
            if (f(dVar)) {
                return true;
            }
            try {
                List listB = S1.e.b(dVar);
                for (int i10 = 0; i10 < listB.size(); i10++) {
                    String str = (String) listB.get(i10);
                    if (this.f5671j.f(str, dVar)) {
                        this.f5667f.add(str);
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // T1.k
    public void e(S1.d dVar) {
        synchronized (this.f5677p) {
            try {
                List listB = S1.e.b(dVar);
                for (int i10 = 0; i10 < listB.size(); i10++) {
                    String str = (String) listB.get(i10);
                    this.f5671j.remove(str);
                    this.f5667f.remove(str);
                }
            } catch (IOException e10) {
                this.f5673l.a(S1.a.EnumC0079a.DELETE_FILE, f5659r, "delete: " + e10.getMessage(), e10);
            }
        }
    }

    @Override // T1.k
    public boolean f(S1.d dVar) {
        synchronized (this.f5677p) {
            try {
                List listB = S1.e.b(dVar);
                for (int i10 = 0; i10 < listB.size(); i10++) {
                    if (this.f5667f.contains((String) listB.get(i10))) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // T1.k
    public R1.a g(S1.d dVar, S1.j jVar) {
        String strA;
        l lVarD = l.a().d(dVar);
        S1.c cVar = this.f5666e;
        if (cVar != null) {
            cVar.a(lVarD);
        }
        synchronized (this.f5677p) {
            strA = S1.e.a(dVar);
        }
        lVarD.j(strA);
        try {
            try {
                f.b bVarR = r(strA, dVar);
                try {
                    bVarR.g(jVar, dVar);
                    R1.a aVarL = l(bVarR, dVar, strA);
                    lVarD.i(aVarL.size()).f(this.f5675n.b());
                    S1.c cVar2 = this.f5666e;
                    if (cVar2 != null) {
                        cVar2.e(lVarD);
                    }
                    if (!bVarR.e()) {
                        Z1.a.i(f5659r, "Failed to delete temp file");
                    }
                    lVarD.b();
                    return aVarL;
                } catch (Throwable th) {
                    if (!bVarR.e()) {
                        Z1.a.i(f5659r, "Failed to delete temp file");
                    }
                    throw th;
                }
            } catch (IOException e10) {
                lVarD.h(e10);
                S1.c cVar3 = this.f5666e;
                if (cVar3 != null) {
                    cVar3.b(lVarD);
                }
                Z1.a.j(f5659r, "Failed inserting a file into the cache", e10);
                throw e10;
            }
        } catch (Throwable th2) {
            lVarD.b();
            throw th2;
        }
    }
}
