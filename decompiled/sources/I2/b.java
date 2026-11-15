package I2;

import Y1.k;
import com.google.android.gms.common.api.Api;
import java.util.Arrays;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f1580c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Lazy f1581d = p129m8.g.a(new Function0() { // from class: I2.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return b.e();
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1583b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Pattern d() {
            Object value = b.f1581d.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (Pattern) value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String f(int i10) {
            return i10 == Integer.MAX_VALUE ? "" : String.valueOf(i10);
        }

        public final b b(int i10) {
            k.b(Boolean.valueOf(i10 >= 0));
            return new b(i10, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }

        public final b c(String str) {
            if (str == null) {
                return null;
            }
            try {
                String[] strArrSplit = d().split(str);
                k.b(Boolean.valueOf(strArrSplit.length == 4));
                k.b(Boolean.valueOf(Intrinsics.b(strArrSplit[0], "bytes")));
                String str2 = strArrSplit[1];
                Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
                int i10 = Integer.parseInt(str2);
                String str3 = strArrSplit[2];
                Intrinsics.checkNotNullExpressionValue(str3, "get(...)");
                int i11 = Integer.parseInt(str3);
                String str4 = strArrSplit[3];
                Intrinsics.checkNotNullExpressionValue(str4, "get(...)");
                int i12 = Integer.parseInt(str4);
                k.b(Boolean.valueOf(i11 > i10));
                k.b(Boolean.valueOf(i12 > i11));
                return i11 < i12 - 1 ? new b(i10, i11) : new b(i10, Api.BaseClientBuilder.API_PRIORITY_OTHER);
            } catch (IllegalArgumentException e10) {
                H h10 = H.f45976a;
                String str5 = String.format(null, "Invalid Content-Range header value: \"%s\"", Arrays.copyOf(new Object[]{str}, 1));
                Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
                throw new IllegalArgumentException(str5, e10);
            }
        }

        public final b e(int i10) {
            k.b(Boolean.valueOf(i10 > 0));
            return new b(0, i10);
        }

        private a() {
        }
    }

    public b(int i10, int i11) {
        this.f1582a = i10;
        this.f1583b = i11;
    }

    public static final b d(int i10) {
        return f1580c.b(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pattern e() {
        return Pattern.compile("[-/ ]");
    }

    public static final b g(int i10) {
        return f1580c.e(i10);
    }

    public final boolean c(b bVar) {
        return bVar != null && this.f1582a <= bVar.f1582a && bVar.f1583b <= this.f1583b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.b(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.d(obj, "null cannot be cast to non-null type com.facebook.imagepipeline.common.BytesRange");
        b bVar = (b) obj;
        return this.f1582a == bVar.f1582a && this.f1583b == bVar.f1583b;
    }

    public final String f() {
        H h10 = H.f45976a;
        a aVar = f1580c;
        String str = String.format(null, "bytes=%s-%s", Arrays.copyOf(new Object[]{aVar.f(this.f1582a), aVar.f(this.f1583b)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public int hashCode() {
        return (this.f1582a * 31) + this.f1583b;
    }

    public String toString() {
        H h10 = H.f45976a;
        a aVar = f1580c;
        String str = String.format(null, "%s-%s", Arrays.copyOf(new Object[]{aVar.f(this.f1582a), aVar.f(this.f1583b)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
