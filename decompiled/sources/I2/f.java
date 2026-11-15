package I2;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public enum f {
    LOW,
    MEDIUM,
    HIGH;


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f1614f = p189s8.a.a(c());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f1609a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(f priority1, f priority2) {
            Intrinsics.checkNotNullParameter(priority1, "priority1");
            Intrinsics.checkNotNullParameter(priority2, "priority2");
            return priority1.ordinal() > priority2.ordinal() ? priority1 : priority2;
        }

        private a() {
        }
    }

    public static final f d(f fVar, f fVar2) {
        return f1609a.a(fVar, fVar2);
    }
}
