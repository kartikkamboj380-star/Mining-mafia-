package p191t0;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.m;
import p151p0.b;
import p151p0.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0534a f49478a = new C0534a(null);

    /* JADX INFO: renamed from: t0.a$a, reason: collision with other inner class name */
    public static final class C0534a {

        /* JADX INFO: renamed from: t0.a$a$a, reason: collision with other inner class name */
        static final class C0535a extends m implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f49479a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0535a(Context context) {
                super(1);
                this.f49479a = context;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new c(this.f49479a);
            }
        }

        public /* synthetic */ C0534a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            StringBuilder sb = new StringBuilder();
            sb.append("AdServicesInfo.version=");
            b bVar = b.f47734a;
            sb.append(bVar.a());
            Log.d("MeasurementManager", sb.toString());
            if (bVar.a() >= 5) {
                return new f(context);
            }
            if (bVar.b() >= 9) {
                return (a) c.f47737a.a(context, "MeasurementManager", new C0535a(context));
            }
            return null;
        }

        private C0534a() {
        }
    }

    public abstract Object a(p169q8.b bVar);

    public abstract Object b(Uri uri, InputEvent inputEvent, p169q8.b bVar);

    public abstract Object c(Uri uri, p169q8.b bVar);
}
