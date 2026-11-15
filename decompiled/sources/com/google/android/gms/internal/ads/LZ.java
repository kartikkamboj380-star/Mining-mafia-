package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class LZ {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2376Rx0 f20543c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InterfaceC2925b00 f20546f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f20548h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f20549i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C2799a00 f20550j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private C3502fb0 f20551k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f20541a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f20542b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f20544d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f20545e = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f20547g = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f20552l = false;

    LZ(C5011rb0 c5011rb0, C2799a00 c2799a00, C2376Rx0 c2376Rx0) {
        this.f20549i = c5011rb0.f32991b.f32672b.f29471r;
        this.f20550j = c2799a00;
        this.f20543c = c2376Rx0;
        this.f20548h = C3679h00.a(c5011rb0);
        List list = c5011rb0.f32991b.f32671a;
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f20541a.put((C3502fb0) list.get(i10), Integer.valueOf(i10));
        }
        this.f20542b.addAll(list);
    }

    private final synchronized boolean e() {
        if (this.f20552l) {
            return false;
        }
        List list = this.f20542b;
        if (!list.isEmpty() && ((C3502fb0) list.get(0)).f28438v0 && !this.f20544d.isEmpty()) {
            return false;
        }
        if (!d()) {
            List list2 = this.f20544d;
            if (list2.size() < this.f20549i && f(false)) {
                return true;
            }
        }
        return false;
    }

    private final synchronized boolean f(boolean z9) {
        try {
            for (C3502fb0 c3502fb0 : this.f20542b) {
                Integer num = (Integer) this.f20541a.get(c3502fb0);
                int iIntValue = num != null ? num.intValue() : Api.BaseClientBuilder.API_PRIORITY_OTHER;
                if (z9 || !this.f20545e.contains(c3502fb0.f28434t0)) {
                    int i10 = this.f20547g;
                    if (iIntValue < i10) {
                        return true;
                    }
                    if (iIntValue > i10) {
                        break;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized boolean g() {
        try {
            Iterator it = this.f20544d.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) this.f20541a.get((C3502fb0) it.next());
                if ((num != null ? num.intValue() : Api.BaseClientBuilder.API_PRIORITY_OTHER) < this.f20547g) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized boolean h() {
        return f(true) || g();
    }

    private final synchronized void i() {
        this.f20550j.d(this.f20551k);
        InterfaceC2925b00 interfaceC2925b00 = this.f20546f;
        if (interfaceC2925b00 != null) {
            this.f20543c.k(interfaceC2925b00);
        } else {
            this.f20543c.l(new C3301e00(3, this.f20548h));
        }
    }

    final synchronized C3502fb0 a() {
        try {
            if (e()) {
                int i10 = 0;
                while (true) {
                    List list = this.f20542b;
                    if (i10 >= list.size()) {
                        break;
                    }
                    C3502fb0 c3502fb0 = (C3502fb0) list.get(i10);
                    String str = c3502fb0.f28434t0;
                    Set set = this.f20545e;
                    if (!set.contains(str)) {
                        if (c3502fb0.f28438v0) {
                            this.f20552l = true;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            set.add(str);
                        }
                        this.f20544d.add(c3502fb0);
                        return (C3502fb0) list.remove(i10);
                    }
                    i10++;
                }
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    final synchronized void b(InterfaceC2925b00 interfaceC2925b00, C3502fb0 c3502fb0) {
        this.f20552l = false;
        this.f20544d.remove(c3502fb0);
        if (d()) {
            interfaceC2925b00.e();
            return;
        }
        Integer num = (Integer) this.f20541a.get(c3502fb0);
        int iIntValue = num != null ? num.intValue() : Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (iIntValue > this.f20547g) {
            this.f20550j.f(c3502fb0);
            return;
        }
        if (this.f20546f != null) {
            this.f20550j.f(this.f20551k);
        }
        this.f20547g = iIntValue;
        this.f20546f = interfaceC2925b00;
        this.f20551k = c3502fb0;
        if (h()) {
            return;
        }
        i();
    }

    final synchronized void c(Throwable th, C3502fb0 c3502fb0) {
        this.f20552l = false;
        this.f20544d.remove(c3502fb0);
        this.f20545e.remove(c3502fb0.f28434t0);
        if (d() || h()) {
            return;
        }
        i();
    }

    final synchronized boolean d() {
        return this.f20543c.isDone();
    }
}
