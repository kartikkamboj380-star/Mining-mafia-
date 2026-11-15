package p087i6;

import G6.a;
import G6.b;
import p137n6.p;

/* JADX INFO: loaded from: classes3.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f45095a;

    public l(a aVar) {
        this.f45095a = aVar;
    }

    public static /* synthetic */ void a(e eVar, b bVar) {
        ((p028c7.a) bVar.get()).a("firebase", eVar);
        g.f().b("Registering RemoteConfig Rollouts subscriber");
    }

    public void b(p pVar) {
        if (pVar == null) {
            g.f().k("Didn't successfully register with UserMetadata for rollouts listener");
        } else {
            final e eVar = new e(pVar);
            this.f45095a.a(new a.InterfaceC0026a() { // from class: i6.k
                @Override // G6.a.InterfaceC0026a
                public final void a(b bVar) {
                    l.a(eVar, bVar);
                }
            });
        }
    }
}
