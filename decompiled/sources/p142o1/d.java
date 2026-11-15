package p142o1;

import kotlin.jvm.internal.Intrinsics;
import p169q8.b;

/* JADX INFO: loaded from: classes.dex */
public final class d implements h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f47160c;

    public d(f fVar) {
        this.f47160c = fVar;
    }

    @Override // p142o1.h
    public Object a(b bVar) {
        return this.f47160c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.b(this.f47160c, ((d) obj).f47160c);
    }

    public int hashCode() {
        return this.f47160c.hashCode();
    }

    public String toString() {
        return "RealSizeResolver(size=" + this.f47160c + ')';
    }
}
