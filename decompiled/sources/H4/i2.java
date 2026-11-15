package H4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Bundle f1307a = new Bundle();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f1308b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1309c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1310d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Bundle f1311e = new Bundle();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Bundle f1312f = new Bundle();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f1313g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f1314h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f1315i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f1316j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f1317k = 60000;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f1318l = B4.t.b.DEFAULT.c();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f1319m = 0;

    public final h2 a() {
        Bundle bundle = this.f1307a;
        Bundle bundle2 = this.f1311e;
        List list = this.f1308b;
        boolean z9 = this.f1309c;
        int i10 = this.f1310d;
        int i11 = this.f1314h;
        String str = this.f1315i;
        List list2 = this.f1316j;
        int i12 = this.f1318l;
        return new h2(8, -1L, bundle, -1, list, z9, i10, false, null, null, null, null, bundle2, this.f1312f, this.f1313g, null, null, false, null, i11, str, list2, this.f1317k, null, i12, this.f1319m, 0L);
    }

    public final i2 b(Bundle bundle) {
        this.f1307a = bundle;
        return this;
    }

    public final i2 c(List list) {
        this.f1308b = list;
        return this;
    }

    public final i2 d(boolean z9) {
        this.f1309c = z9;
        return this;
    }

    public final i2 e(int i10) {
        this.f1310d = i10;
        return this;
    }

    public final i2 f(int i10) {
        this.f1314h = i10;
        return this;
    }

    public final i2 g(String str) {
        this.f1315i = str;
        return this;
    }

    public final i2 h(int i10) {
        this.f1317k = i10;
        return this;
    }

    public final i2 i(long j10) {
        this.f1319m = j10;
        return this;
    }
}
