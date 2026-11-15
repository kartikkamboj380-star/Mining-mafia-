package p058f7;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public interface c {

    public enum a {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f43755e = p189s8.a.a(c());
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f43756a;

        public b(String sessionId) {
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            this.f43756a = sessionId;
        }

        public final String a() {
            return this.f43756a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.b(this.f43756a, ((b) obj).f43756a);
        }

        public int hashCode() {
            return this.f43756a.hashCode();
        }

        public String toString() {
            return "SessionDetails(sessionId=" + this.f43756a + ')';
        }
    }

    boolean a();

    void b(b bVar);

    a c();
}
