package H3;

import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b extends U2.b {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final a f1207D = new a(null);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final ReadableMap f1208B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final H3.a f1209C;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ b b(a aVar, U2.c cVar, ReadableMap readableMap, H3.a aVar2, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                aVar2 = H3.a.DEFAULT;
            }
            return aVar.a(cVar, readableMap, aVar2);
        }

        public final b a(U2.c builder, ReadableMap readableMap, H3.a cacheControl) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            Intrinsics.checkNotNullParameter(cacheControl, "cacheControl");
            return new b(builder, readableMap, cacheControl, null);
        }

        private a() {
        }
    }

    public /* synthetic */ b(U2.c cVar, ReadableMap readableMap, H3.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, readableMap, aVar);
    }

    public final H3.a A() {
        return this.f1209C;
    }

    public final ReadableMap B() {
        return this.f1208B;
    }

    private b(U2.c cVar, ReadableMap readableMap, H3.a aVar) {
        super(cVar);
        this.f1208B = readableMap;
        this.f1209C = aVar;
    }
}
