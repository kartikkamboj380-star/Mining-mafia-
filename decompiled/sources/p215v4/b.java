package p215v4;

import java.util.Map;
import p245y4.a;

/* JADX INFO: loaded from: classes2.dex */
final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f50120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f50121b;

    b(a aVar, Map map) {
        if (aVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.f50120a = aVar;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f50121b = map;
    }

    @Override // p215v4.f
    a e() {
        return this.f50120a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f50120a.equals(fVar.e()) && this.f50121b.equals(fVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // p215v4.f
    Map h() {
        return this.f50121b;
    }

    public int hashCode() {
        return ((this.f50120a.hashCode() ^ 1000003) * 1000003) ^ this.f50121b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f50120a + ", values=" + this.f50121b + "}";
    }
}
