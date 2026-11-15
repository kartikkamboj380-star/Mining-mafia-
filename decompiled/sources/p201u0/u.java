package p201u0;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.m;
import p151p0.c;
import p169q8.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f49769a = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: u0.u$a$a, reason: collision with other inner class name */
        static final class C0542a extends m implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f49770a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0542a(Context context) {
                super(1);
                this.f49770a = context;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final w invoke(Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new w(this.f49770a);
            }
        }

        static final class b extends m implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f49771a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context) {
                super(1);
                this.f49771a = context;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x invoke(Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new x(this.f49771a);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final u a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            p151p0.b bVar = p151p0.b.f47734a;
            if (bVar.a() >= 11) {
                return new A(context);
            }
            if (bVar.a() >= 5) {
                return new C(context);
            }
            if (bVar.a() == 4) {
                return new B(context);
            }
            if (bVar.b() >= 11) {
                return (u) c.f47737a.a(context, "TopicsManager", new C0542a(context));
            }
            if (bVar.b() >= 9) {
                return (u) c.f47737a.a(context, "TopicsManager", new b(context));
            }
            return null;
        }

        private a() {
        }
    }

    public abstract Object a(C7136b c7136b, b bVar);
}
