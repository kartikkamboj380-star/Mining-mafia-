package p145o4;

import java.util.Set;
import p125m4.c;
import p125m4.h;
import p125m4.i;
import p125m4.j;

/* JADX INFO: loaded from: classes2.dex */
final class q implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f47258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f47259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t f47260c;

    q(Set set, p pVar, t tVar) {
        this.f47258a = set;
        this.f47259b = pVar;
        this.f47260c = tVar;
    }

    @Override // p125m4.j
    public i a(String str, Class cls, c cVar, h hVar) {
        if (this.f47258a.contains(cVar)) {
            return new s(this.f47259b, str, cVar, hVar, this.f47260c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, this.f47258a));
    }
}
