package p178r7;

import android.content.Context;
import java.util.Date;
import java.util.Iterator;
import p158p7.l;
import p208u7.f;

/* JADX INFO: loaded from: classes3.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f48349f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected f f48350a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f48351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f48352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f48353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f48354e;

    private a(d dVar) {
        this.f48353d = dVar;
    }

    public static a a() {
        return f48349f;
    }

    private void d() {
        if (!this.f48352c || this.f48351b == null) {
            return;
        }
        Iterator it = c.e().a().iterator();
        while (it.hasNext()) {
            ((l) it.next()).p().e(c());
        }
    }

    public void b(Context context) {
        if (this.f48352c) {
            return;
        }
        this.f48353d.a(context);
        this.f48353d.b(this);
        this.f48353d.i();
        this.f48354e = this.f48353d.g();
        this.f48352c = true;
    }

    public Date c() {
        Date date = this.f48351b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void e() {
        Date dateA = this.f48350a.a();
        Date date = this.f48351b;
        if (date == null || dateA.after(date)) {
            this.f48351b = dateA;
            d();
        }
    }

    @Override // r7.d.a
    public void a(boolean z9) {
        if (!this.f48354e && z9) {
            e();
        }
        this.f48354e = z9;
    }
}
