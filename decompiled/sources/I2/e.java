package I2;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1597a = 100;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1598b = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f1600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f1601e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f1602f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f1603g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Bitmap.Config f1604h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Bitmap.Config f1605i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private M2.c f1606j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ColorSpace f1607k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f1608l;

    public e() {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.f1604h = config;
        this.f1605i = config;
    }

    public d a() {
        return new d(this);
    }

    public Bitmap.Config b() {
        return this.f1605i;
    }

    public Bitmap.Config c() {
        return this.f1604h;
    }

    public X2.a d() {
        return null;
    }

    public ColorSpace e() {
        return this.f1607k;
    }

    public M2.c f() {
        return this.f1606j;
    }

    public boolean g() {
        return this.f1602f;
    }

    public boolean h() {
        return this.f1599c;
    }

    public boolean i() {
        return this.f1608l;
    }

    public boolean j() {
        return this.f1603g;
    }

    public int k() {
        return this.f1598b;
    }

    public int l() {
        return this.f1597a;
    }

    public boolean m() {
        return this.f1601e;
    }

    public boolean n() {
        return this.f1600d;
    }
}
