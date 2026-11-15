package I8;

import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public enum Q {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f1740f = p189s8.a.a(c());

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1741a;

        static {
            int[] iArr = new int[Q.values().length];
            try {
                iArr[Q.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Q.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Q.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Q.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f1741a = iArr;
        }
    }

    public final void d(Function2 function2, Object obj, p169q8.b bVar) {
        int i10 = a.f1741a[ordinal()];
        if (i10 == 1) {
            O8.a.b(function2, obj, bVar);
            return;
        }
        if (i10 == 2) {
            p169q8.c.a(function2, obj, bVar);
        } else if (i10 == 3) {
            O8.b.a(function2, obj, bVar);
        } else if (i10 != 4) {
            throw new p129m8.k();
        }
    }

    public final boolean e() {
        return this == LAZY;
    }
}
