package k9;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import r9.C7108k;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f45732d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C7108k f45733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C7108k f45734f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C7108k f45735g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C7108k f45736h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C7108k f45737i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C7108k f45738j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C7108k f45739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C7108k f45740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45741c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        C7108k.a aVar = C7108k.f48467d;
        f45733e = aVar.g(":");
        f45734f = aVar.g(":status");
        f45735g = aVar.g(":method");
        f45736h = aVar.g(":path");
        f45737i = aVar.g(":scheme");
        f45738j = aVar.g(":authority");
    }

    public c(C7108k name, C7108k value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f45739a = name;
        this.f45740b = value;
        this.f45741c = name.E() + 32 + value.E();
    }

    public final C7108k a() {
        return this.f45739a;
    }

    public final C7108k b() {
        return this.f45740b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.b(this.f45739a, cVar.f45739a) && Intrinsics.b(this.f45740b, cVar.f45740b);
    }

    public int hashCode() {
        return (this.f45739a.hashCode() * 31) + this.f45740b.hashCode();
    }

    public String toString() {
        return this.f45739a.K() + ": " + this.f45740b.K();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        C7108k.a aVar = C7108k.f48467d;
        this(aVar.g(name), aVar.g(value));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(C7108k name, String value) {
        this(name, C7108k.f48467d.g(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
    }
}
