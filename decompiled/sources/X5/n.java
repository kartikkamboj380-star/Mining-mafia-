package X5;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n {

    static class a implements m, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private transient Object f6719a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final m f6720b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile transient boolean f6721c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        transient Object f6722d;

        a(m mVar) {
            this.f6720b = (m) j.h(mVar);
        }

        @Override // X5.m
        public Object get() {
            if (!this.f6721c) {
                synchronized (this.f6719a) {
                    try {
                        if (!this.f6721c) {
                            Object obj = this.f6720b.get();
                            this.f6722d = obj;
                            this.f6721c = true;
                            return obj;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return e.a(this.f6722d);
        }

        public String toString() {
            Object obj;
            StringBuilder sb = new StringBuilder();
            sb.append("Suppliers.memoize(");
            if (this.f6721c) {
                obj = "<supplier that returned " + this.f6722d + ">";
            } else {
                obj = this.f6720b;
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    static class b implements m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final m f6723d = new m() { // from class: X5.o
            @Override // X5.m
            public final Object get() {
                return n.b.a();
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f6724a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile m f6725b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f6726c;

        b(m mVar) {
            this.f6725b = (m) j.h(mVar);
        }

        public static /* synthetic */ Void a() {
            throw new IllegalStateException();
        }

        @Override // X5.m
        public Object get() {
            m mVar = this.f6725b;
            m mVar2 = f6723d;
            if (mVar != mVar2) {
                synchronized (this.f6724a) {
                    try {
                        if (this.f6725b != mVar2) {
                            Object obj = this.f6725b.get();
                            this.f6726c = obj;
                            this.f6725b = mVar2;
                            return obj;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return e.a(this.f6726c);
        }

        public String toString() {
            Object obj = this.f6725b;
            StringBuilder sb = new StringBuilder();
            sb.append("Suppliers.memoize(");
            if (obj == f6723d) {
                obj = "<supplier that returned " + this.f6726c + ">";
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    private static class c implements m, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f6727a;

        c(Object obj) {
            this.f6727a = obj;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return f.a(this.f6727a, ((c) obj).f6727a);
            }
            return false;
        }

        @Override // X5.m
        public Object get() {
            return this.f6727a;
        }

        public int hashCode() {
            return f.b(this.f6727a);
        }

        public String toString() {
            return "Suppliers.ofInstance(" + this.f6727a + ")";
        }
    }

    public static m a(m mVar) {
        if ((mVar instanceof b) || (mVar instanceof a)) {
            return mVar;
        }
        return mVar instanceof Serializable ? new a(mVar) : new b(mVar);
    }

    public static m b(Object obj) {
        return new c(obj);
    }
}
