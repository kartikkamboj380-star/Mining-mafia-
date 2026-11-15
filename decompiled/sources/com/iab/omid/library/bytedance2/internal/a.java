package com.iab.omid.library.bytedance2.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f41762f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.bytedance2.utils.f f41763a = new com.iab.omid.library.bytedance2.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f41764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f41765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f41766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f41767e;

    private a(d dVar) {
        this.f41766d = dVar;
    }

    public static a a() {
        return f41762f;
    }

    private void c() {
        if (!this.f41765c || this.f41764b == null) {
            return;
        }
        Iterator<com.iab.omid.library.bytedance2.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public Date b() {
        Date date = this.f41764b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f41763a.a();
        Date date = this.f41764b;
        if (date == null || dateA.after(date)) {
            this.f41764b = dateA;
            c();
        }
    }

    public void a(@NonNull Context context) {
        if (this.f41765c) {
            return;
        }
        this.f41766d.a(context);
        this.f41766d.a(this);
        this.f41766d.e();
        this.f41767e = this.f41766d.c();
        this.f41765c = true;
    }

    @Override // com.iab.omid.library.bytedance2.internal.d.a
    public void a(boolean z9) {
        if (!this.f41767e && z9) {
            d();
        }
        this.f41767e = z9;
    }
}
