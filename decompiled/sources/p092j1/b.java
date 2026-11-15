package p092j1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p132n1.o;

/* JADX INFO: loaded from: classes.dex */
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f45409a = a.f45411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f45410b = new p102k1.a();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f45411a = new a();

        private a() {
        }
    }

    /* JADX INFO: renamed from: j1.b$b, reason: collision with other inner class name */
    public static final class C0447b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o f45412a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final q f45413b;

        public C0447b(q qVar) {
            this.f45413b = qVar;
        }

        public final o a() {
            return this.f45412a;
        }

        public final q b() {
            return this.f45413b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0447b)) {
                return false;
            }
            C0447b c0447b = (C0447b) obj;
            return Intrinsics.b(this.f45412a, c0447b.f45412a) && Intrinsics.b(this.f45413b, c0447b.f45413b);
        }

        public int hashCode() {
            o oVar = this.f45412a;
            int iHashCode = (oVar != null ? oVar.hashCode() : 0) * 31;
            q qVar = this.f45413b;
            return iHashCode + (qVar != null ? qVar.hashCode() : 0);
        }

        public String toString() {
            return "ReadResult(request=" + this.f45412a + ", response=" + this.f45413b + ')';
        }
    }

    Object a(q qVar, o oVar, o oVar2, p169q8.b bVar);

    Object b(q qVar, o oVar, q qVar2, o oVar2, p169q8.b bVar);

    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f45414b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f45415c = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q f45416a;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public c(q qVar) {
            this.f45416a = qVar;
        }

        public final q a() {
            return this.f45416a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.b(this.f45416a, ((c) obj).f45416a);
        }

        public int hashCode() {
            q qVar = this.f45416a;
            if (qVar != null) {
                return qVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "WriteResult(response=" + this.f45416a + ')';
        }

        private c() {
            this.f45416a = null;
        }
    }
}
