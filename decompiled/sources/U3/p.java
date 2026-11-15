package U3;

import java.util.Locale;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public enum p {
    SOLID,
    DASHED,
    DOTTED;


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f5992f = p189s8.a.a(c());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f5987a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final p a(String outlineStyle) {
            Intrinsics.checkNotNullParameter(outlineStyle, "outlineStyle");
            String lowerCase = outlineStyle.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            int iHashCode = lowerCase.hashCode();
            if (iHashCode == -1338941519) {
                if (lowerCase.equals("dashed")) {
                    return p.DASHED;
                }
                return null;
            }
            if (iHashCode == -1325970902) {
                if (lowerCase.equals("dotted")) {
                    return p.DOTTED;
                }
                return null;
            }
            if (iHashCode == 109618859 && lowerCase.equals("solid")) {
                return p.SOLID;
            }
            return null;
        }

        private a() {
        }
    }

    public static final p d(String str) {
        return f5987a.a(str);
    }
}
