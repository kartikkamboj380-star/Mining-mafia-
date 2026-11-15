package p253z2;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public enum n {
    UNKNOWN(-1),
    VISIBLE(1),
    INVISIBLE(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f51019a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f51018h = p189s8.a.a(c());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f51012b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final n[] f51013c = values();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    n(int i10) {
        this.f51019a = i10;
    }
}
