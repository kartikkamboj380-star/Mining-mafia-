package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3027bp implements N4.B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Date f26932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f26933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f26934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f26935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Location f26936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f26937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C2191Oj f26938g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f26940i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f26939h = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f26941j = new HashMap();

    public C3027bp(Date date, int i10, Set set, Location location, boolean z9, int i11, C2191Oj c2191Oj, List list, boolean z10, int i12, String str) {
        this.f26932a = date;
        this.f26933b = i10;
        this.f26934c = set;
        this.f26936e = location;
        this.f26935d = z9;
        this.f26937f = i11;
        this.f26938g = c2191Oj;
        this.f26940i = z10;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2.startsWith("custom:")) {
                    String[] strArrSplit = str2.split(":", 3);
                    if (strArrSplit.length == 3) {
                        String str3 = strArrSplit[2];
                        if ("true".equals(str3)) {
                            this.f26941j.put(strArrSplit[1], Boolean.TRUE);
                        } else if ("false".equals(str3)) {
                            this.f26941j.put(strArrSplit[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.f26939h.add(str2);
                }
            }
        }
    }

    @Override // N4.B
    public final com.google.android.gms.ads.nativead.c a() {
        return C2191Oj.a(this.f26938g);
    }

    @Override // N4.f
    public final int b() {
        return this.f26937f;
    }

    @Override // N4.f
    public final boolean c() {
        return this.f26940i;
    }

    @Override // N4.f
    public final boolean d() {
        return this.f26935d;
    }

    @Override // N4.B
    public final E4.e e() {
        Parcelable.Creator<C2191Oj> creator = C2191Oj.CREATOR;
        E4.e.a aVar = new E4.e.a();
        C2191Oj c2191Oj = this.f26938g;
        if (c2191Oj == null) {
            return aVar.a();
        }
        int i10 = c2191Oj.f21644a;
        if (i10 == 2) {
            aVar.b(c2191Oj.f21648e);
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    aVar.e(c2191Oj.f21650g);
                    aVar.d(c2191Oj.f21651h);
                }
            }
            H4.a2 a2Var = c2191Oj.f21649f;
            if (a2Var != null) {
                aVar.h(new B4.x(a2Var));
            }
            aVar.b(c2191Oj.f21648e);
        }
        aVar.g(c2191Oj.f21645b);
        aVar.c(c2191Oj.f21646c);
        aVar.f(c2191Oj.f21647d);
        return aVar.a();
    }

    @Override // N4.B
    public final boolean f() {
        return this.f26939h.contains("6");
    }

    @Override // N4.f
    public final Set g() {
        return this.f26934c;
    }

    @Override // N4.B
    public final boolean zza() {
        return this.f26939h.contains("3");
    }

    @Override // N4.B
    public final Map zzb() {
        return this.f26941j;
    }
}
