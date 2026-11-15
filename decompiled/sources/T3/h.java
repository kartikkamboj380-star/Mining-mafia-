package T3;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public enum h {
    CREATE,
    UPDATE,
    DELETE;


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f5748f = p189s8.a.a(c());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f5743a = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: T3.h$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0085a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f5749a;

            static {
                int[] iArr = new int[h.values().length];
                try {
                    iArr[h.CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[h.UPDATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[h.DELETE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f5749a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(h type) {
            Intrinsics.checkNotNullParameter(type, "type");
            int i10 = C0085a.f5749a[type.ordinal()];
            if (i10 == 1) {
                return "create";
            }
            if (i10 == 2) {
                return "update";
            }
            if (i10 == 3) {
                return "delete";
            }
            throw new p129m8.k();
        }

        private a() {
        }
    }

    static {
        p064g3.b.a("LayoutAnimationType", p064g3.a.ERROR);
    }
}
