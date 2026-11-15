package p202u1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    public static final class a extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f49778a = new a();

        private a() {
            super(null);
        }
    }

    public static final class b extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Throwable f49779a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.f49779a = error;
        }

        public final Throwable a() {
            return this.f49779a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.b(this.f49779a, ((b) obj).f49779a);
        }

        public int hashCode() {
            return this.f49779a.hashCode();
        }

        public String toString() {
            return "Failure(error=" + this.f49779a + ")";
        }
    }

    public static final class c extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f49780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f49781b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f49782c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f49783d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String code, String id_token, String state, String user) {
            super(null);
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(id_token, "id_token");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(user, "user");
            this.f49780a = code;
            this.f49781b = id_token;
            this.f49782c = state;
            this.f49783d = user;
        }

        public final String a() {
            return this.f49780a;
        }

        public final String b() {
            return this.f49781b;
        }

        public final String c() {
            return this.f49782c;
        }

        public final String d() {
            return this.f49783d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.b(this.f49780a, cVar.f49780a) && Intrinsics.b(this.f49781b, cVar.f49781b) && Intrinsics.b(this.f49782c, cVar.f49782c) && Intrinsics.b(this.f49783d, cVar.f49783d);
        }

        public int hashCode() {
            return (((((this.f49780a.hashCode() * 31) + this.f49781b.hashCode()) * 31) + this.f49782c.hashCode()) * 31) + this.f49783d.hashCode();
        }

        public String toString() {
            return "Success(code=" + this.f49780a + ", id_token=" + this.f49781b + ", state=" + this.f49782c + ", user=" + this.f49783d + ")";
        }
    }

    public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private g() {
    }
}
