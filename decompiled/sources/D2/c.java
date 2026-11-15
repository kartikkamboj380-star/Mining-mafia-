package D2;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f455c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f456d = new c("UNKNOWN", null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f458b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public interface b {
        c a(byte[] bArr, int i10);

        int b();
    }

    public c(String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f457a = name;
        this.f458b = str;
    }

    public final String a() {
        return this.f457a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.b(this.f457a, cVar.f457a) && Intrinsics.b(this.f458b, cVar.f458b);
    }

    public int hashCode() {
        int iHashCode = this.f457a.hashCode() * 31;
        String str = this.f458b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return this.f457a;
    }
}
