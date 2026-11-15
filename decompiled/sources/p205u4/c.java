package p205u4;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p125m4.k;
import p145o4.i;
import p145o4.p;
import p145o4.u;
import p155p4.e;
import p155p4.m;
import p215v4.x;
import p225w4.InterfaceC7144d;
import p235x4.b;

/* JADX INFO: loaded from: classes2.dex */
public class c implements e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f49910f = Logger.getLogger(u.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f49911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f49912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f49913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC7144d f49914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f49915e;

    public c(Executor executor, e eVar, x xVar, InterfaceC7144d interfaceC7144d, b bVar) {
        this.f49912b = executor;
        this.f49913c = eVar;
        this.f49911a = xVar;
        this.f49914d = interfaceC7144d;
        this.f49915e = bVar;
    }

    public static /* synthetic */ Object b(c cVar, p pVar, i iVar) {
        cVar.f49914d.v0(pVar, iVar);
        cVar.f49911a.b(pVar, 1);
        return null;
    }

    public static /* synthetic */ void c(final c cVar, final p pVar, k kVar, i iVar) {
        cVar.getClass();
        try {
            m mVar = cVar.f49913c.get(pVar.b());
            if (mVar == null) {
                String str = String.format("Transport backend '%s' is not registered", pVar.b());
                f49910f.warning(str);
                kVar.a(new IllegalArgumentException(str));
            } else {
                final i iVarA = mVar.a(iVar);
                cVar.f49915e.c(new b.a() { // from class: u4.b
                    @Override // x4.b.a
                    public final Object a() {
                        return c.b(this.f49907a, pVar, iVarA);
                    }
                });
                kVar.a(null);
            }
        } catch (Exception e10) {
            f49910f.warning("Error scheduling event " + e10.getMessage());
            kVar.a(e10);
        }
    }

    @Override // p205u4.e
    public void a(final p pVar, final i iVar, final k kVar) {
        this.f49912b.execute(new Runnable() { // from class: u4.a
            @Override // java.lang.Runnable
            public final void run() {
                c.c(this.f49903a, pVar, kVar, iVar);
            }
        });
    }
}
