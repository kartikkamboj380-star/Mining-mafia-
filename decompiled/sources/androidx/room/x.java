package androidx.room;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class x implements A0.j, A0.i {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f10921i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final TreeMap f10922j = new TreeMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f10923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile String f10924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f10925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double[] f10926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f10927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[][] f10928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f10929g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f10930h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final x a(String query, int i10) {
            Intrinsics.checkNotNullParameter(query, "query");
            TreeMap treeMap = x.f10922j;
            synchronized (treeMap) {
                Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
                if (entryCeilingEntry == null) {
                    Unit unit = Unit.f45918a;
                    x xVar = new x(i10, null);
                    xVar.n(query, i10);
                    return xVar;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                x sqliteQuery = (x) entryCeilingEntry.getValue();
                sqliteQuery.n(query, i10);
                Intrinsics.checkNotNullExpressionValue(sqliteQuery, "sqliteQuery");
                return sqliteQuery;
            }
        }

        public final void b() {
            TreeMap treeMap = x.f10922j;
            if (treeMap.size() <= 15) {
                return;
            }
            int size = treeMap.size() - 10;
            Iterator it = treeMap.descendingKeySet().iterator();
            Intrinsics.checkNotNullExpressionValue(it, "queryPool.descendingKeySet().iterator()");
            while (true) {
                int i10 = size - 1;
                if (size <= 0) {
                    return;
                }
                it.next();
                it.remove();
                size = i10;
            }
        }

        private a() {
        }
    }

    public /* synthetic */ x(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    public static final x h(String str, int i10) {
        return f10921i.a(str, i10);
    }

    @Override // A0.i
    public void B0(int i10, long j10) {
        this.f10929g[i10] = 2;
        this.f10925c[i10] = j10;
    }

    @Override // A0.i
    public void F0(int i10, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f10929g[i10] = 5;
        this.f10928f[i10] = value;
    }

    @Override // A0.i
    public void S0(int i10) {
        this.f10929g[i10] = 1;
    }

    @Override // A0.j
    public String a() {
        String str = this.f10924b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // A0.j
    public void c(A0.i statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        int iJ = j();
        if (1 > iJ) {
            return;
        }
        int i10 = 1;
        while (true) {
            int i11 = this.f10929g[i10];
            if (i11 == 1) {
                statement.S0(i10);
            } else if (i11 == 2) {
                statement.B0(i10, this.f10925c[i10]);
            } else if (i11 == 3) {
                statement.t(i10, this.f10926d[i10]);
            } else if (i11 == 4) {
                String str = this.f10927e[i10];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.r0(i10, str);
            } else if (i11 == 5) {
                byte[] bArr = this.f10928f[i10];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.F0(i10, bArr);
            }
            if (i10 == iJ) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public int j() {
        return this.f10930h;
    }

    public final void n(String query, int i10) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f10924b = query;
        this.f10930h = i10;
    }

    @Override // A0.i
    public void r0(int i10, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f10929g[i10] = 4;
        this.f10927e[i10] = value;
    }

    public final void release() {
        TreeMap treeMap = f10922j;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f10923a), this);
            f10921i.b();
            Unit unit = Unit.f45918a;
        }
    }

    @Override // A0.i
    public void t(int i10, double d10) {
        this.f10929g[i10] = 3;
        this.f10926d[i10] = d10;
    }

    private x(int i10) {
        this.f10923a = i10;
        int i11 = i10 + 1;
        this.f10929g = new int[i11];
        this.f10925c = new long[i11];
        this.f10926d = new double[i11];
        this.f10927e = new String[i11];
        this.f10928f = new byte[i11][];
    }
}
