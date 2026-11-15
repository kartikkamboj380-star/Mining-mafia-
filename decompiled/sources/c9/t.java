package c9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.AbstractC7033c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements Iterable, A8.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f12239b = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f12240a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f12241a = new ArrayList(20);

        public final a a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            b bVar = t.f12239b;
            bVar.e(name);
            bVar.f(value, name);
            c(name, value);
            return this;
        }

        public final a b(String line) {
            Intrinsics.checkNotNullParameter(line, "line");
            int iY = StringsKt.Y(line, ':', 1, false, 4, null);
            if (iY != -1) {
                String strSubstring = line.substring(0, iY);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = line.substring(iY + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                c(strSubstring, strSubstring2);
                return this;
            }
            if (line.charAt(0) != ':') {
                c("", line);
                return this;
            }
            String strSubstring3 = line.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String).substring(startIndex)");
            c("", strSubstring3);
            return this;
        }

        public final a c(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f12241a.add(name);
            this.f12241a.add(StringsKt.U0(value).toString());
            return this;
        }

        public final a d(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            t.f12239b.e(name);
            c(name, value);
            return this;
        }

        public final t e() {
            return new t((String[]) this.f12241a.toArray(new String[0]), null);
        }

        public final String f(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            int size = this.f12241a.size() - 2;
            int iB = p199t8.c.b(size, 0, -2);
            if (iB > size) {
                return null;
            }
            while (!StringsKt.y(name, (String) this.f12241a.get(size), true)) {
                if (size == iB) {
                    return null;
                }
                size -= 2;
            }
            return (String) this.f12241a.get(size + 1);
        }

        public final List g() {
            return this.f12241a;
        }

        public final a h(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            int i10 = 0;
            while (i10 < this.f12241a.size()) {
                if (StringsKt.y(name, (String) this.f12241a.get(i10), true)) {
                    this.f12241a.remove(i10);
                    this.f12241a.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        public final a i(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            b bVar = t.f12239b;
            bVar.e(name);
            bVar.f(value, name);
            h(name);
            c(name, value);
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if ('!' > cCharAt || cCharAt >= 127) {
                    throw new IllegalArgumentException(d9.e.t("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void f(String str, String str2) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(d9.e.t("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i10), str2));
                    sb.append(d9.e.H(str2) ? "" : ": " + str);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String g(String[] strArr, String str) {
            int length = strArr.length - 2;
            int iB = p199t8.c.b(length, 0, -2);
            if (iB > length) {
                return null;
            }
            while (!StringsKt.y(str, strArr[length], true)) {
                if (length == iB) {
                    return null;
                }
                length -= 2;
            }
            return strArr[length + 1];
        }

        public final t a(Map headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            return h(headers);
        }

        public final t h(Map map) {
            Intrinsics.checkNotNullParameter(map, "<this>");
            String[] strArr = new String[map.size() * 2];
            int i10 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                String string = StringsKt.U0(str).toString();
                String string2 = StringsKt.U0(str2).toString();
                e(string);
                f(string2, string);
                strArr[i10] = string;
                strArr[i10 + 1] = string2;
                i10 += 2;
            }
            return new t(strArr, null);
        }

        public final t i(String... namesAndValues) {
            Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
            if (namesAndValues.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            String[] strArr = (String[]) namesAndValues.clone();
            int length = strArr.length;
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                String str = strArr[i11];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr[i11] = StringsKt.U0(str).toString();
            }
            int iB = p199t8.c.b(0, strArr.length - 1, 2);
            if (iB >= 0) {
                while (true) {
                    String str2 = strArr[i10];
                    String str3 = strArr[i10 + 1];
                    e(str2);
                    f(str3, str2);
                    if (i10 == iB) {
                        break;
                    }
                    i10 += 2;
                }
            }
            return new t(strArr, null);
        }

        private b() {
        }
    }

    public /* synthetic */ t(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr);
    }

    public final int a() {
        return size();
    }

    public final String b(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return f12239b.g(this.f12240a, name);
    }

    public final String e(int i10) {
        return this.f12240a[i10 * 2];
    }

    public boolean equals(Object obj) {
        return (obj instanceof t) && Arrays.equals(this.f12240a, ((t) obj).f12240a);
    }

    public final Set g() {
        TreeSet treeSet = new TreeSet(StringsKt.z(kotlin.jvm.internal.H.f45976a));
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            treeSet.add(e(i10));
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f12240a);
    }

    public final a i() {
        a aVar = new a();
        CollectionsKt.y(aVar.g(), this.f12240a);
        return aVar;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i10 = 0; i10 < size; i10++) {
            pairArr[i10] = p129m8.q.a(e(i10), k(i10));
        }
        return AbstractC7033c.a(pairArr);
    }

    public final Map j() {
        TreeMap treeMap = new TreeMap(StringsKt.z(kotlin.jvm.internal.H.f45976a));
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strE = e(i10);
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = strE.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(k(i10));
        }
        return treeMap;
    }

    public final String k(int i10) {
        return this.f12240a[(i10 * 2) + 1];
    }

    public final List l(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            if (StringsKt.y(name, e(i10), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(k(i10));
            }
        }
        if (arrayList == null) {
            return CollectionsKt.i();
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    public final int size() {
        return this.f12240a.length / 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strE = e(i10);
            String strK = k(i10);
            sb.append(strE);
            sb.append(": ");
            if (d9.e.H(strE)) {
                strK = "██";
            }
            sb.append(strK);
            sb.append("\n");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    private t(String[] strArr) {
        this.f12240a = strArr;
    }
}
