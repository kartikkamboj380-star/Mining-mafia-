package U3;

import java.util.Locale;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public enum q {
    VISIBLE,
    HIDDEN,
    SCROLL;


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f5998f = p189s8.a.a(c());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f5993a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final q a(String overflow) {
            Intrinsics.checkNotNullParameter(overflow, "overflow");
            String lowerCase = overflow.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            int iHashCode = lowerCase.hashCode();
            if (iHashCode == -1217487446) {
                if (lowerCase.equals("hidden")) {
                    return q.HIDDEN;
                }
                return null;
            }
            if (iHashCode == -907680051) {
                if (lowerCase.equals("scroll")) {
                    return q.SCROLL;
                }
                return null;
            }
            if (iHashCode == 466743410 && lowerCase.equals("visible")) {
                return q.VISIBLE;
            }
            return null;
        }

        private a() {
        }
    }

    public static final q d(String str) {
        return f5993a.a(str);
    }
}
