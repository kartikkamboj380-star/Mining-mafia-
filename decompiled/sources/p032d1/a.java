package p032d1;

import I8.K;
import p192t1.AbstractC7127e;
import p192t1.k;
import p192t1.l;
import r9.AbstractC7112o;
import r9.T;

/* JADX INFO: loaded from: classes.dex */
public interface a {

    /* JADX INFO: renamed from: d1.a$a, reason: collision with other inner class name */
    public static final class C0408a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private T f42869a;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f42874f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private AbstractC7112o f42870b = l.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private double f42871c = 0.02d;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f42872d = 10485760;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f42873e = 262144000;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private K f42875g = AbstractC7127e.a();

        public final a a() {
            long jK;
            T t10 = this.f42869a;
            if (t10 == null) {
                throw new IllegalStateException("directory == null");
            }
            double d10 = this.f42871c;
            if (d10 > 0.0d) {
                try {
                    jK = kotlin.ranges.b.k((long) (d10 * k.a(this.f42870b, t10)), this.f42872d, this.f42873e);
                } catch (Exception unused) {
                    jK = this.f42872d;
                }
            } else {
                jK = this.f42874f;
            }
            return new e(jK, t10, this.f42870b, this.f42875g);
        }

        public final C0408a b(T t10) {
            this.f42869a = t10;
            return this;
        }
    }

    public interface b {
        c a();

        void abort();

        T getData();

        T getMetadata();
    }

    public interface c extends AutoCloseable {
        b E0();

        T getData();

        T getMetadata();
    }

    b a(String str);

    c b(String str);

    AbstractC7112o getFileSystem();
}
