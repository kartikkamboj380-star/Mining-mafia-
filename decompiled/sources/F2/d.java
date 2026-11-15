package F2;

import c9.D;
import c9.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Exception {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f704c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t f706b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(D response) {
            Intrinsics.checkNotNullParameter(response, "response");
            D dW = response.W();
            Integer numValueOf = dW != null ? Integer.valueOf(dW.G()) : null;
            D dW2 = response.W();
            return new d(numValueOf, dW2 != null ? dW2.S() : null);
        }

        private a() {
        }
    }

    public d(Integer num, t tVar) {
        this.f705a = num;
        this.f706b = tVar;
    }
}
