package H4;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: H4.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0609j1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f1328g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f1330i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f1331j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f1333l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f1334m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f1336o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashSet f1322a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bundle f1323b = new Bundle();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f1324c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet f1325d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Bundle f1326e = new Bundle();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet f1327f = new HashSet();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f1329h = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f1332k = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f1335n = 60000;

    final /* synthetic */ String A() {
        return this.f1328g;
    }

    final /* synthetic */ List B() {
        return this.f1329h;
    }

    final /* synthetic */ String C() {
        return this.f1330i;
    }

    final /* synthetic */ String a() {
        return this.f1331j;
    }

    final /* synthetic */ int b() {
        return this.f1332k;
    }

    final /* synthetic */ boolean c() {
        return this.f1333l;
    }

    final /* synthetic */ String d() {
        return this.f1334m;
    }

    final /* synthetic */ int e() {
        return this.f1335n;
    }

    final /* synthetic */ long f() {
        return this.f1336o;
    }

    public final void g(String str) {
        this.f1322a.add(str);
    }

    public final void h(Bundle bundle) {
        this.f1323b.putAll(bundle);
    }

    public final void i(Class cls, Bundle bundle) {
        this.f1323b.putBundle(cls.getName(), bundle);
    }

    public final void j(String str) {
        this.f1325d.add(str);
    }

    public final void k(String str) {
        this.f1325d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    public final void l(String str) {
        this.f1328g = str;
    }

    public final void m(List list) {
        List list2 = this.f1329h;
        list2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (TextUtils.isEmpty(str)) {
                L4.p.f("neighboring content URL should not be null or empty");
            } else {
                list2.add(str);
            }
        }
    }

    public final void n(String str) {
        this.f1330i = str;
    }

    public final void o(String str) {
        this.f1331j = str;
    }

    public final void p(boolean z9) {
        this.f1332k = z9 ? 1 : 0;
    }

    public final void q(String str, String str2) {
        this.f1326e.putString(str, str2);
    }

    public final void r(String str) {
        this.f1327f.add(str);
    }

    public final void s(boolean z9) {
        this.f1333l = z9;
    }

    public final void t(String str) {
        this.f1334m = str;
    }

    final /* synthetic */ HashSet u() {
        return this.f1322a;
    }

    final /* synthetic */ Bundle v() {
        return this.f1323b;
    }

    final /* synthetic */ HashMap w() {
        return this.f1324c;
    }

    final /* synthetic */ HashSet x() {
        return this.f1325d;
    }

    final /* synthetic */ Bundle y() {
        return this.f1326e;
    }

    final /* synthetic */ HashSet z() {
        return this.f1327f;
    }
}
