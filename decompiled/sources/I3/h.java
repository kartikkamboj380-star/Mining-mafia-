package I3;

import c9.E;
import c9.x;
import kotlin.jvm.internal.Intrinsics;
import r9.AbstractC7100c;
import r9.C7105h;
import r9.InterfaceC7107j;
import r9.c0;
import r9.r;

/* JADX INFO: loaded from: classes.dex */
public final class h extends E {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final E f1635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f1636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC7107j f1637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f1638e;

    public static final class a extends r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f1639b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c0 c0Var, h hVar) {
            super(c0Var);
            this.f1639b = hVar;
        }

        @Override // r9.r, r9.c0
        public long s(C7105h sink, long j10) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            long jS = super.s(sink, j10);
            h hVar = this.f1639b;
            if (jS != -1) {
                hVar.f1638e += jS;
            }
            hVar.f1636c.a(hVar.f1638e, hVar.f1635b.j(), jS == -1);
            return jS;
        }
    }

    public h(E responseBody, f progressListener) {
        Intrinsics.checkNotNullParameter(responseBody, "responseBody");
        Intrinsics.checkNotNullParameter(progressListener, "progressListener");
        this.f1635b = responseBody;
        this.f1636c = progressListener;
    }

    private final c0 M(c0 c0Var) {
        return new a(c0Var, this);
    }

    public final long N() {
        return this.f1638e;
    }

    @Override // c9.E
    public InterfaceC7107j e1() {
        if (this.f1637d == null) {
            this.f1637d = AbstractC7100c.a().b(M(this.f1635b.e1()));
        }
        InterfaceC7107j interfaceC7107j = this.f1637d;
        if (interfaceC7107j != null) {
            return interfaceC7107j;
        }
        Intrinsics.r("bufferedSource");
        return null;
    }

    @Override // c9.E
    public long j() {
        return this.f1635b.j();
    }

    @Override // c9.E
    public x n() {
        return this.f1635b.n();
    }
}
