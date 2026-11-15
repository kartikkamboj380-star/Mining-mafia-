package p042e1;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import p012b1.r;
import p012b1.u;
import p022c1.EnumC1204j;
import p132n1.o;

/* JADX INFO: loaded from: classes.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bitmap f43238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f43239b;

    public static final class a implements j.a {
        @Override // e1.j.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(Bitmap bitmap, o oVar, r rVar) {
            return new b(bitmap, oVar);
        }
    }

    public b(Bitmap bitmap, o oVar) {
        this.f43238a = bitmap;
        this.f43239b = oVar;
    }

    @Override // p042e1.j
    public Object a(p169q8.b bVar) {
        return new l(u.c(new BitmapDrawable(this.f43239b.c().getResources(), this.f43238a)), false, EnumC1204j.MEMORY);
    }
}
