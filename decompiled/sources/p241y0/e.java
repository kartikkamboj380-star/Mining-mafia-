package p241y0;

import A0.g;
import androidx.room.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f50773e = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f50775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f50776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f50777d;

    public static final class a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final C0558a f50778h = new C0558a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f50779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f50780b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f50781c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f50782d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f50783e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f50784f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f50785g;

        /* JADX INFO: renamed from: y0.e$a$a, reason: collision with other inner class name */
        public static final class C0558a {
            public /* synthetic */ C0558a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final boolean a(String str) {
                if (str.length() == 0) {
                    return false;
                }
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (i10 < str.length()) {
                    char cCharAt = str.charAt(i10);
                    int i13 = i12 + 1;
                    if (i12 == 0 && cCharAt != '(') {
                        return false;
                    }
                    if (cCharAt == '(') {
                        i11++;
                    } else if (cCharAt == ')' && (i11 = i11 - 1) == 0 && i12 != str.length() - 1) {
                        return false;
                    }
                    i10++;
                    i12 = i13;
                }
                return i11 == 0;
            }

            public final boolean b(String current, String str) {
                Intrinsics.checkNotNullParameter(current, "current");
                if (Intrinsics.b(current, str)) {
                    return true;
                }
                if (!a(current)) {
                    return false;
                }
                String strSubstring = current.substring(1, current.length() - 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return Intrinsics.b(StringsKt.U0(strSubstring).toString(), str);
            }

            private C0558a() {
            }
        }

        public a(String name, String type, boolean z9, int i10, String str, int i11) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f50779a = name;
            this.f50780b = type;
            this.f50781c = z9;
            this.f50782d = i10;
            this.f50783e = str;
            this.f50784f = i11;
            this.f50785g = a(type);
        }

        private final int a(String str) {
            if (str == null) {
                return 5;
            }
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String upperCase = str.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (StringsKt.P(upperCase, "INT", false, 2, null)) {
                return 3;
            }
            if (StringsKt.P(upperCase, "CHAR", false, 2, null) || StringsKt.P(upperCase, "CLOB", false, 2, null) || StringsKt.P(upperCase, "TEXT", false, 2, null)) {
                return 2;
            }
            if (StringsKt.P(upperCase, "BLOB", false, 2, null)) {
                return 5;
            }
            return (StringsKt.P(upperCase, "REAL", false, 2, null) || StringsKt.P(upperCase, "FLOA", false, 2, null) || StringsKt.P(upperCase, "DOUB", false, 2, null)) ? 4 : 1;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a) || this.f50782d != ((a) obj).f50782d) {
                return false;
            }
            a aVar = (a) obj;
            if (!Intrinsics.b(this.f50779a, aVar.f50779a) || this.f50781c != aVar.f50781c) {
                return false;
            }
            if (this.f50784f == 1 && aVar.f50784f == 2 && (str3 = this.f50783e) != null && !f50778h.b(str3, aVar.f50783e)) {
                return false;
            }
            if (this.f50784f == 2 && aVar.f50784f == 1 && (str2 = aVar.f50783e) != null && !f50778h.b(str2, this.f50783e)) {
                return false;
            }
            int i10 = this.f50784f;
            return (i10 == 0 || i10 != aVar.f50784f || ((str = this.f50783e) == null ? aVar.f50783e == null : f50778h.b(str, aVar.f50783e))) && this.f50785g == aVar.f50785g;
        }

        public int hashCode() {
            return (((((this.f50779a.hashCode() * 31) + this.f50785g) * 31) + (this.f50781c ? 1231 : 1237)) * 31) + this.f50782d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Column{name='");
            sb.append(this.f50779a);
            sb.append("', type='");
            sb.append(this.f50780b);
            sb.append("', affinity='");
            sb.append(this.f50785g);
            sb.append("', notNull=");
            sb.append(this.f50781c);
            sb.append(", primaryKeyPosition=");
            sb.append(this.f50782d);
            sb.append(", defaultValue='");
            String str = this.f50783e;
            if (str == null) {
                str = "undefined";
            }
            sb.append(str);
            sb.append("'}");
            return sb.toString();
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(g database, String tableName) {
            Intrinsics.checkNotNullParameter(database, "database");
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            return f.f(database, tableName);
        }

        private b() {
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f50786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f50787b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f50788c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f50789d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List f50790e;

        public c(String referenceTable, String onDelete, String onUpdate, List columnNames, List referenceColumnNames) {
            Intrinsics.checkNotNullParameter(referenceTable, "referenceTable");
            Intrinsics.checkNotNullParameter(onDelete, "onDelete");
            Intrinsics.checkNotNullParameter(onUpdate, "onUpdate");
            Intrinsics.checkNotNullParameter(columnNames, "columnNames");
            Intrinsics.checkNotNullParameter(referenceColumnNames, "referenceColumnNames");
            this.f50786a = referenceTable;
            this.f50787b = onDelete;
            this.f50788c = onUpdate;
            this.f50789d = columnNames;
            this.f50790e = referenceColumnNames;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (Intrinsics.b(this.f50786a, cVar.f50786a) && Intrinsics.b(this.f50787b, cVar.f50787b) && Intrinsics.b(this.f50788c, cVar.f50788c) && Intrinsics.b(this.f50789d, cVar.f50789d)) {
                return Intrinsics.b(this.f50790e, cVar.f50790e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f50786a.hashCode() * 31) + this.f50787b.hashCode()) * 31) + this.f50788c.hashCode()) * 31) + this.f50789d.hashCode()) * 31) + this.f50790e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f50786a + "', onDelete='" + this.f50787b + " +', onUpdate='" + this.f50788c + "', columnNames=" + this.f50789d + ", referenceColumnNames=" + this.f50790e + '}';
        }
    }

    public static final class d implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f50791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f50792b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f50793c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f50794d;

        public d(int i10, int i11, String from, String to) {
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to, "to");
            this.f50791a = i10;
            this.f50792b = i11;
            this.f50793c = from;
            this.f50794d = to;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(d other) {
            Intrinsics.checkNotNullParameter(other, "other");
            int i10 = this.f50791a - other.f50791a;
            return i10 == 0 ? this.f50792b - other.f50792b : i10;
        }

        public final String d() {
            return this.f50793c;
        }

        public final int e() {
            return this.f50791a;
        }

        public final String f() {
            return this.f50794d;
        }
    }

    /* JADX INFO: renamed from: y0.e$e, reason: collision with other inner class name */
    public static final class C0559e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f50795e = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f50796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f50797b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f50798c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List f50799d;

        /* JADX INFO: renamed from: y0.e$e$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
        public C0559e(String name, boolean z9, List columns, List orders) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(columns, "columns");
            Intrinsics.checkNotNullParameter(orders, "orders");
            this.f50796a = name;
            this.f50797b = z9;
            this.f50798c = columns;
            this.f50799d = orders;
            if (orders.isEmpty()) {
                int size = columns.size();
                orders = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    orders.add(l.ASC.name());
                }
            }
            this.f50799d = orders;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0559e)) {
                return false;
            }
            C0559e c0559e = (C0559e) obj;
            if (this.f50797b == c0559e.f50797b && Intrinsics.b(this.f50798c, c0559e.f50798c) && Intrinsics.b(this.f50799d, c0559e.f50799d)) {
                return StringsKt.J(this.f50796a, "index_", false, 2, null) ? StringsKt.J(c0559e.f50796a, "index_", false, 2, null) : Intrinsics.b(this.f50796a, c0559e.f50796a);
            }
            return false;
        }

        public int hashCode() {
            return ((((((StringsKt.J(this.f50796a, "index_", false, 2, null) ? -1184239155 : this.f50796a.hashCode()) * 31) + (this.f50797b ? 1 : 0)) * 31) + this.f50798c.hashCode()) * 31) + this.f50799d.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f50796a + "', unique=" + this.f50797b + ", columns=" + this.f50798c + ", orders=" + this.f50799d + "'}";
        }
    }

    public e(String name, Map columns, Set foreignKeys, Set set) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(foreignKeys, "foreignKeys");
        this.f50774a = name;
        this.f50775b = columns;
        this.f50776c = foreignKeys;
        this.f50777d = set;
    }

    public static final e a(g gVar, String str) {
        return f50773e.a(gVar, str);
    }

    public boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!Intrinsics.b(this.f50774a, eVar.f50774a) || !Intrinsics.b(this.f50775b, eVar.f50775b) || !Intrinsics.b(this.f50776c, eVar.f50776c)) {
            return false;
        }
        Set set2 = this.f50777d;
        if (set2 == null || (set = eVar.f50777d) == null) {
            return true;
        }
        return Intrinsics.b(set2, set);
    }

    public int hashCode() {
        return (((this.f50774a.hashCode() * 31) + this.f50775b.hashCode()) * 31) + this.f50776c.hashCode();
    }

    public String toString() {
        return "TableInfo{name='" + this.f50774a + "', columns=" + this.f50775b + ", foreignKeys=" + this.f50776c + ", indices=" + this.f50777d + '}';
    }
}
