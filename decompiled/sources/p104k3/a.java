package p104k3;

import c9.InterfaceC1217e;
import c9.p;
import c9.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f45601a = new a();

    private a() {
    }

    public static final void a(z client, Object tag) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(tag, "tag");
        p pVarE = client.e();
        for (InterfaceC1217e interfaceC1217e : pVarE.j()) {
            if (Intrinsics.b(tag, interfaceC1217e.j().l())) {
                interfaceC1217e.cancel();
                return;
            }
        }
        for (InterfaceC1217e interfaceC1217e2 : pVarE.k()) {
            if (Intrinsics.b(tag, interfaceC1217e2.j().l())) {
                interfaceC1217e2.cancel();
                return;
            }
        }
    }
}
