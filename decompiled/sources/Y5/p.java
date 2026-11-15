package Y5;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static abstract class a implements X5.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f6929a = new C0118a("KEY", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f6930b = new b("VALUE", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ a[] f6931c = c();

        /* JADX INFO: renamed from: Y5.p$a$a, reason: collision with other inner class name */
        final enum C0118a extends a {
            C0118a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // X5.c
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getKey();
            }
        }

        final enum b extends a {
            b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // X5.c
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getValue();
            }
        }

        private a(String str, int i10) {
            super(str, i10);
        }

        private static /* synthetic */ a[] c() {
            return new a[]{f6929a, f6930b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f6931c.clone();
        }

        /* synthetic */ a(String str, int i10, o oVar) {
            this(str, i10);
        }
    }

    static boolean a(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    static String b(Map map) {
        StringBuilder sbA = e.a(map.size());
        sbA.append('{');
        boolean z9 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z9) {
                sbA.append(", ");
            }
            sbA.append(entry.getKey());
            sbA.append('=');
            sbA.append(entry.getValue());
            z9 = false;
        }
        sbA.append('}');
        return sbA.toString();
    }

    static X5.c c() {
        return a.f6930b;
    }
}
