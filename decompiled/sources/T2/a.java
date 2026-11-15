package T2;

import S1.d;
import S1.i;
import Y1.k;
import android.graphics.Bitmap;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;

/* JADX INFO: loaded from: classes.dex */
public class a extends U2.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f5705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f5706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d f5707e;

    public a(int i10, int i11) {
        k.b(Boolean.valueOf(i10 > 0));
        k.b(Boolean.valueOf(i11 > 0));
        this.f5705c = i10;
        this.f5706d = i11;
    }

    @Override // U2.a, U2.d
    public d a() {
        if (this.f5707e == null) {
            this.f5707e = new i(String.format(null, "i%dr%d", Integer.valueOf(this.f5705c), Integer.valueOf(this.f5706d)));
        }
        return this.f5707e;
    }

    @Override // U2.a
    public void d(Bitmap bitmap) {
        NativeBlurFilter.a(bitmap, this.f5705c, this.f5706d);
    }
}
