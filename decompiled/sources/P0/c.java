package P0;

import S0.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements O0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Q0.h f4645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f4646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f4647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f4648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f4649e;

    public interface a {
        void b(List list);

        void c(List list);
    }

    public c(Q0.h tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f4645a = tracker;
        this.f4646b = new ArrayList();
        this.f4647c = new ArrayList();
    }

    private final void h(a aVar, Object obj) {
        if (this.f4646b.isEmpty() || aVar == null) {
            return;
        }
        if (obj == null || c(obj)) {
            aVar.c(this.f4646b);
        } else {
            aVar.b(this.f4646b);
        }
    }

    @Override // O0.a
    public void a(Object obj) {
        this.f4648d = obj;
        h(this.f4649e, obj);
    }

    public abstract boolean b(u uVar);

    public abstract boolean c(Object obj);

    public final boolean d(String workSpecId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        Object obj = this.f4648d;
        return obj != null && c(obj) && this.f4647c.contains(workSpecId);
    }

    public final void e(Iterable workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        this.f4646b.clear();
        this.f4647c.clear();
        List list = this.f4646b;
        for (Object obj : workSpecs) {
            if (b((u) obj)) {
                list.add(obj);
            }
        }
        List list2 = this.f4646b;
        List list3 = this.f4647c;
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            list3.add(((u) it.next()).f5393a);
        }
        if (this.f4646b.isEmpty()) {
            this.f4645a.f(this);
        } else {
            this.f4645a.c(this);
        }
        h(this.f4649e, this.f4648d);
    }

    public final void f() {
        if (this.f4646b.isEmpty()) {
            return;
        }
        this.f4646b.clear();
        this.f4645a.f(this);
    }

    public final void g(a aVar) {
        if (this.f4649e != aVar) {
            this.f4649e = aVar;
            h(aVar, this.f4648d);
        }
    }
}
