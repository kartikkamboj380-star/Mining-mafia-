package Y8;

import Z8.A;
import Z8.D;
import Z8.k;
import Z8.u;
import Z8.v;
import Z8.x;
import Z8.z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f7051d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f7052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a9.b f7053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f7054c;

    public static final class a extends b {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
            super(new d(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, false, null, 131071, null), a9.c.a(), null);
        }
    }

    public /* synthetic */ b(d dVar, a9.b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, bVar);
    }

    public final Object a(T8.a deserializer, String string) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(string, "string");
        z zVarA = A.a(this, string);
        Object objM = new x(this, D.OBJ, zVarA, deserializer.a(), null).m(deserializer);
        zVarA.t();
        return objM;
    }

    public final String b(T8.e serializer, Object obj) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        v vVar = new v();
        try {
            u.a(this, vVar, serializer, obj);
            return vVar.toString();
        } finally {
            vVar.g();
        }
    }

    public final d c() {
        return this.f7052a;
    }

    public a9.b d() {
        return this.f7053b;
    }

    public final k e() {
        return this.f7054c;
    }

    private b(d dVar, a9.b bVar) {
        this.f7052a = dVar;
        this.f7053b = bVar;
        this.f7054c = new k();
    }
}
