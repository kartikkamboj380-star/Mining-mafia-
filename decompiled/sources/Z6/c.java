package Z6;

import java.util.Iterator;
import java.util.Set;
import p057f6.C6982c;
import p057f6.InterfaceC6983d;
import p057f6.q;

/* JADX INFO: loaded from: classes3.dex */
public class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f7165b;

    c(Set set, d dVar) {
        this.f7164a = d(set);
        this.f7165b = dVar;
    }

    public static /* synthetic */ i b(InterfaceC6983d interfaceC6983d) {
        return new c(interfaceC6983d.c(f.class), d.a());
    }

    public static C6982c c() {
        return C6982c.e(i.class).b(q.o(f.class)).f(new p057f6.g() { // from class: Z6.b
            @Override // p057f6.g
            public final Object a(InterfaceC6983d interfaceC6983d) {
                return c.b(interfaceC6983d);
            }
        }).d();
    }

    private static String d(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            sb.append(fVar.b());
            sb.append('/');
            sb.append(fVar.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // Z6.i
    public String a() {
        if (this.f7165b.b().isEmpty()) {
            return this.f7164a;
        }
        return this.f7164a + ' ' + d(this.f7165b.b());
    }
}
