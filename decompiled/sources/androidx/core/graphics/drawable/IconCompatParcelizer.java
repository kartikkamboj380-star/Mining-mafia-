package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.a;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f9300a = aVar.p(iconCompat.f9300a, 1);
        iconCompat.f9302c = aVar.j(iconCompat.f9302c, 2);
        iconCompat.f9303d = aVar.r(iconCompat.f9303d, 3);
        iconCompat.f9304e = aVar.p(iconCompat.f9304e, 4);
        iconCompat.f9305f = aVar.p(iconCompat.f9305f, 5);
        iconCompat.f9306g = (ColorStateList) aVar.r(iconCompat.f9306g, 6);
        iconCompat.f9308i = aVar.t(iconCompat.f9308i, 7);
        iconCompat.f9309j = aVar.t(iconCompat.f9309j, 8);
        iconCompat.k();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.x(true, true);
        iconCompat.l(aVar.f());
        int i10 = iconCompat.f9300a;
        if (-1 != i10) {
            aVar.F(i10, 1);
        }
        byte[] bArr = iconCompat.f9302c;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f9303d;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int i11 = iconCompat.f9304e;
        if (i11 != 0) {
            aVar.F(i11, 4);
        }
        int i12 = iconCompat.f9305f;
        if (i12 != 0) {
            aVar.F(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f9306g;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        String str = iconCompat.f9308i;
        if (str != null) {
            aVar.J(str, 7);
        }
        String str2 = iconCompat.f9309j;
        if (str2 != null) {
            aVar.J(str2, 8);
        }
    }
}
