package p082i1;

import android.content.Context;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p012b1.n;
import p192t1.AbstractC7125c;
import p192t1.AbstractC7126d;

/* JADX INFO: loaded from: classes.dex */
public interface d {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Function0 f45003a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f45004b = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f45005c = true;

        public static /* synthetic */ a d(a aVar, Context context, double d10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                d10 = AbstractC7126d.a(context);
            }
            return aVar.c(context, d10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long e(double d10, Context context) {
            return (long) (d10 * AbstractC7126d.g(context));
        }

        public final d b() {
            j aVar;
            k iVar = this.f45005c ? new i() : new p082i1.b();
            if (this.f45004b) {
                Function0 function0 = this.f45003a;
                if (function0 == null) {
                    throw new IllegalStateException("maxSizeBytesFactory == null");
                }
                long jLongValue = ((Number) function0.invoke()).longValue();
                aVar = jLongValue > 0 ? new h(jLongValue, iVar) : new p082i1.a(iVar);
            } else {
                aVar = new p082i1.a(iVar);
            }
            return new g(aVar, iVar);
        }

        public final a c(final Context context, final double d10) {
            if (0.0d > d10 || d10 > 1.0d) {
                throw new IllegalArgumentException("percent must be in the range [0.0, 1.0].");
            }
            this.f45003a = new Function0() { // from class: i1.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Long.valueOf(d.a.e(d10, context));
                }
            };
            return this;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f45006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f45007b;

        public b(String str, Map map) {
            this.f45006a = str;
            this.f45007b = AbstractC7125c.d(map);
        }

        public final Map a() {
            return this.f45007b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.b(this.f45006a, bVar.f45006a) && Intrinsics.b(this.f45007b, bVar.f45007b);
        }

        public int hashCode() {
            return (this.f45006a.hashCode() * 31) + this.f45007b.hashCode();
        }

        public String toString() {
            return "Key(key=" + this.f45006a + ", extras=" + this.f45007b + ')';
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n f45008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f45009b;

        public c(n nVar, Map map) {
            this.f45008a = nVar;
            this.f45009b = AbstractC7125c.d(map);
        }

        public final Map a() {
            return this.f45009b;
        }

        public final n b() {
            return this.f45008a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.b(this.f45008a, cVar.f45008a) && Intrinsics.b(this.f45009b, cVar.f45009b);
        }

        public int hashCode() {
            return (this.f45008a.hashCode() * 31) + this.f45009b.hashCode();
        }

        public String toString() {
            return "Value(image=" + this.f45008a + ", extras=" + this.f45009b + ')';
        }
    }

    long a();

    c b(b bVar);

    void clear();

    void d(long j10);

    void e(b bVar, c cVar);
}
