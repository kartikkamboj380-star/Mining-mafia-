package p077h6;

import G6.a;
import android.os.Bundle;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p087i6.g;
import p097j6.e;
import p097j6.f;
import p107k6.b;
import p107k6.c;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f44791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile p097j6.a f44792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile b f44793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f44794d;

    public d(a aVar) {
        this(aVar, new c(), new f());
    }

    public static /* synthetic */ void a(d dVar, G6.b bVar) {
        dVar.getClass();
        g.f().b("AnalyticsConnector now available.");
        p037d6.a aVar = (p037d6.a) bVar.get();
        e eVar = new e(aVar);
        e eVar2 = new e();
        if (g(aVar, eVar2) == null) {
            g.f().k("Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        g.f().b("Registered Firebase Analytics listener.");
        p097j6.d dVar2 = new p097j6.d();
        p097j6.c cVar = new p097j6.c(eVar, UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE, TimeUnit.MILLISECONDS);
        synchronized (dVar) {
            try {
                Iterator it = dVar.f44794d.iterator();
                while (it.hasNext()) {
                    dVar2.a((p107k6.a) it.next());
                }
                eVar2.d(dVar2);
                eVar2.e(cVar);
                dVar.f44793c = dVar2;
                dVar.f44792b = cVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void c(d dVar, p107k6.a aVar) {
        synchronized (dVar) {
            try {
                if (dVar.f44793c instanceof c) {
                    dVar.f44794d.add(aVar);
                }
                dVar.f44793c.a(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void f() {
        this.f44791a.a(new a.InterfaceC0026a() { // from class: h6.c
            @Override // G6.a.InterfaceC0026a
            public final void a(G6.b bVar) {
                d.a(this.f44790a, bVar);
            }
        });
    }

    private static p037d6.a.InterfaceC0411a g(p037d6.a aVar, e eVar) {
        p037d6.a.InterfaceC0411a interfaceC0411aA = aVar.a("clx", eVar);
        if (interfaceC0411aA != null) {
            return interfaceC0411aA;
        }
        g.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
        p037d6.a.InterfaceC0411a interfaceC0411aA2 = aVar.a("crash", eVar);
        if (interfaceC0411aA2 != null) {
            g.f().k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
        }
        return interfaceC0411aA2;
    }

    public p097j6.a d() {
        return new p097j6.a() { // from class: h6.b
            @Override // p097j6.a
            public final void a(String str, Bundle bundle) {
                this.f44789a.f44792b.a(str, bundle);
            }
        };
    }

    public b e() {
        return new b() { // from class: h6.a
            @Override // p107k6.b
            public final void a(p107k6.a aVar) {
                d.c(this.f44788a, aVar);
            }
        };
    }

    public d(a aVar, b bVar, p097j6.a aVar2) {
        this.f44791a = aVar;
        this.f44793c = bVar;
        this.f44794d = new ArrayList();
        this.f44792b = aVar2;
        f();
    }
}
