package B4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class t {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List f256f = Arrays.asList("MA", "T", "PG", "G");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f261e;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f262a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f263b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f264c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f265d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private b f266e = b.DEFAULT;

        public t a() {
            return new t(this.f262a, this.f263b, this.f264c, this.f265d, this.f266e, null);
        }

        public a b(String str) {
            if (str == null || "".equals(str)) {
                this.f264c = null;
                return this;
            }
            if ("G".equals(str) || "PG".equals(str) || "T".equals(str) || "MA".equals(str)) {
                this.f264c = str;
                return this;
            }
            L4.p.f("Invalid value passed to setMaxAdContentRating: ".concat(str));
            return this;
        }

        public a c(int i10) {
            if (i10 == -1 || i10 == 0 || i10 == 1) {
                this.f262a = i10;
                return this;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 57);
            sb.append("Invalid value passed to setTagForChildDirectedTreatment: ");
            sb.append(i10);
            L4.p.f(sb.toString());
            return this;
        }

        public a d(int i10) {
            if (i10 == -1 || i10 == 0 || i10 == 1) {
                this.f263b = i10;
                return this;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 52);
            sb.append("Invalid value passed to setTagForUnderAgeOfConsent: ");
            sb.append(i10);
            L4.p.f(sb.toString());
            return this;
        }

        public a e(List list) {
            List list2 = this.f265d;
            list2.clear();
            if (list != null) {
                list2.addAll(list);
            }
            return this;
        }
    }

    public enum b {
        DEFAULT(0),
        ENABLED(1),
        DISABLED(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f271a;

        b(int i10) {
            this.f271a = i10;
        }

        public int c() {
            return this.f271a;
        }
    }

    /* synthetic */ t(int i10, int i11, String str, List list, b bVar, byte[] bArr) {
        this.f257a = i10;
        this.f258b = i11;
        this.f259c = str;
        this.f260d = list;
        this.f261e = bVar;
    }

    public String a() {
        String str = this.f259c;
        return str == null ? "" : str;
    }

    public b b() {
        return this.f261e;
    }

    public int c() {
        return this.f257a;
    }

    public int d() {
        return this.f258b;
    }

    public List e() {
        return new ArrayList(this.f260d);
    }
}
