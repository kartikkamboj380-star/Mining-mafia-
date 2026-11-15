package p001a0;

import java.util.Map;
import kotlin.collections.E;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f7245a;

        public a(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f7245a = name;
        }

        public final String a() {
            return this.f7245a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return Intrinsics.b(this.f7245a, ((a) obj).f7245a);
            }
            return false;
        }

        public int hashCode() {
            return this.f7245a.hashCode();
        }

        public String toString() {
            return this.f7245a;
        }
    }

    public static final class b {
    }

    public abstract Map a();

    public abstract Object b(a aVar);

    public final c c() {
        return new c(E.v(a()), false);
    }

    public final f d() {
        return new c(E.v(a()), true);
    }
}
