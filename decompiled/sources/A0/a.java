package A0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a implements j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0000a f14c = new C0000a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f16b;

    /* JADX INFO: renamed from: A0.a$a, reason: collision with other inner class name */
    public static final class C0000a {
        public /* synthetic */ C0000a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(i iVar, int i10, Object obj) {
            if (obj == null) {
                iVar.S0(i10);
                return;
            }
            if (obj instanceof byte[]) {
                iVar.F0(i10, (byte[]) obj);
                return;
            }
            if (obj instanceof Float) {
                iVar.t(i10, ((Number) obj).floatValue());
                return;
            }
            if (obj instanceof Double) {
                iVar.t(i10, ((Number) obj).doubleValue());
                return;
            }
            if (obj instanceof Long) {
                iVar.B0(i10, ((Number) obj).longValue());
                return;
            }
            if (obj instanceof Integer) {
                iVar.B0(i10, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Short) {
                iVar.B0(i10, ((Number) obj).shortValue());
                return;
            }
            if (obj instanceof Byte) {
                iVar.B0(i10, ((Number) obj).byteValue());
                return;
            }
            if (obj instanceof String) {
                iVar.r0(i10, (String) obj);
                return;
            }
            if (obj instanceof Boolean) {
                iVar.B0(i10, ((Boolean) obj).booleanValue() ? 1L : 0L);
                return;
            }
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
        }

        public final void b(i statement, Object[] objArr) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i10 = 0;
            while (i10 < length) {
                Object obj = objArr[i10];
                i10++;
                a(statement, i10, obj);
            }
        }

        private C0000a() {
        }
    }

    public a(String query, Object[] objArr) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f15a = query;
        this.f16b = objArr;
    }

    @Override // A0.j
    public String a() {
        return this.f15a;
    }

    @Override // A0.j
    public void c(i statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        f14c.b(statement, this.f16b);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String query) {
        this(query, null);
        Intrinsics.checkNotNullParameter(query, "query");
    }
}
