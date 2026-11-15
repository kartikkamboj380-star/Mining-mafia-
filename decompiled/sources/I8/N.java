package I8;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class N extends kotlin.coroutines.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1731b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1732a;

    public static final class a implements CoroutineContext.b {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public N(String str) {
        super(f1731b);
        this.f1732a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof N) && Intrinsics.b(this.f1732a, ((N) obj).f1732a);
    }

    public int hashCode() {
        return this.f1732a.hashCode();
    }

    public final String l1() {
        return this.f1732a;
    }

    public String toString() {
        return "CoroutineName(" + this.f1732a + ')';
    }
}
