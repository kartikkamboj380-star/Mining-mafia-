package X5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f6709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f6710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a f6711c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f6712d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f6713e;

        static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            String f6714a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f6715b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            a f6716c;

            a() {
            }
        }

        private a a() {
            a aVar = new a();
            this.f6711c.f6716c = aVar;
            this.f6711c = aVar;
            return aVar;
        }

        private b b(Object obj) {
            a().f6715b = obj;
            return this;
        }

        private static boolean d(Object obj) {
            if (obj instanceof CharSequence) {
                return ((CharSequence) obj).length() == 0;
            }
            if (obj instanceof Collection) {
                return ((Collection) obj).isEmpty();
            }
            if (obj instanceof Map) {
                return ((Map) obj).isEmpty();
            }
            if (obj instanceof g) {
                return !((g) obj).c();
            }
            return obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        public b c(Object obj) {
            return b(obj);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x002c  */
        /* JADX WARN: Code duplicated, block: B:13:0x0033  */
        /* JADX WARN: Code duplicated, block: B:18:0x0059  */
        public String toString() {
            String str;
            boolean z9 = this.f6712d;
            boolean z10 = this.f6713e;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f6709a);
            sb.append('{');
            String str2 = "";
            for (a aVar = this.f6710b.f6716c; aVar != null; aVar = aVar.f6716c) {
                Object obj = aVar.f6715b;
                if (obj == null) {
                    if (!z9) {
                        sb.append(str2);
                        str = aVar.f6714a;
                        if (str != null) {
                            sb.append(str);
                            sb.append('=');
                        }
                        if (obj == null && obj.getClass().isArray()) {
                            String strDeepToString = Arrays.deepToString(new Object[]{obj});
                            sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                        } else {
                            sb.append(obj);
                        }
                        str2 = ", ";
                    }
                } else if (!z10 || !d(obj)) {
                    sb.append(str2);
                    str = aVar.f6714a;
                    if (str != null) {
                        sb.append(str);
                        sb.append('=');
                    }
                    if (obj == null) {
                        sb.append(obj);
                    } else {
                        sb.append(obj);
                    }
                    str2 = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }

        private b(String str) {
            a aVar = new a();
            this.f6710b = aVar;
            this.f6711c = aVar;
            this.f6712d = false;
            this.f6713e = false;
            this.f6709a = (String) j.h(str);
        }
    }

    public static b a(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
