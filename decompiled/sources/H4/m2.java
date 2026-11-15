package H4;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes2.dex */
public final class m2 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<m2> CREATOR = new n2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m2[] f1377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f1378h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f1379i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1380j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1381k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1382l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1383m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f1384v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f1385w;

    public m2() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public static m2 J() {
        return new m2("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    private static int N(DisplayMetrics displayMetrics) {
        int i10 = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i10 <= 400) {
            return 32;
        }
        return i10 <= 720 ? 50 : 90;
    }

    public static int a(DisplayMetrics displayMetrics) {
        return (int) (N(displayMetrics) * displayMetrics.density);
    }

    public static m2 j() {
        return new m2("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    public static m2 v() {
        return new m2("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f1371a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f1372b);
        SafeParcelWriter.writeInt(parcel, 4, this.f1373c);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f1374d);
        SafeParcelWriter.writeInt(parcel, 6, this.f1375e);
        SafeParcelWriter.writeInt(parcel, 7, this.f1376f);
        SafeParcelWriter.writeTypedArray(parcel, 8, this.f1377g, i10, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.f1378h);
        SafeParcelWriter.writeBoolean(parcel, 10, this.f1379i);
        SafeParcelWriter.writeBoolean(parcel, 11, this.f1380j);
        SafeParcelWriter.writeBoolean(parcel, 12, this.f1381k);
        SafeParcelWriter.writeBoolean(parcel, 13, this.f1382l);
        SafeParcelWriter.writeBoolean(parcel, 14, this.f1383m);
        SafeParcelWriter.writeBoolean(parcel, 15, this.f1384v);
        SafeParcelWriter.writeBoolean(parcel, 16, this.f1385w);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public m2(Context context, B4.f fVar) {
        this(context, new B4.f[]{fVar});
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00e8  */
    public m2(Context context, B4.f[] fVarArr) {
        int iC;
        int i10;
        int iN;
        String string;
        int dimensionPixelSize;
        B4.f fVar = fVarArr[0];
        this.f1374d = false;
        boolean zH = fVar.h();
        this.f1379i = zH;
        this.f1383m = B4.z.f(fVar);
        this.f1384v = B4.z.g(fVar);
        boolean zD = B4.z.d(fVar);
        this.f1385w = zD;
        if (zH) {
            B4.f fVar2 = B4.f.f226i;
            this.f1375e = fVar2.f();
            iC = fVar2.c();
            this.f1372b = iC;
        } else if (this.f1384v) {
            this.f1375e = fVar.f();
            iC = B4.z.h(fVar);
            this.f1372b = iC;
        } else if (zD) {
            this.f1375e = fVar.f();
            iC = B4.z.e(fVar);
            this.f1372b = iC;
        } else {
            this.f1375e = fVar.f();
            iC = fVar.c();
            this.f1372b = iC;
        }
        boolean z9 = this.f1375e == -1;
        boolean z10 = iC == -2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z9) {
            C0654z.a();
            if (context.getResources().getConfiguration().orientation == 2) {
                DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                if (((int) (displayMetrics2.heightPixels / displayMetrics2.density)) < 600) {
                    C0654z.a();
                    DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager != null) {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        defaultDisplay.getRealMetrics(displayMetrics3);
                        int i11 = displayMetrics3.heightPixels;
                        int i12 = displayMetrics3.widthPixels;
                        defaultDisplay.getMetrics(displayMetrics3);
                        int i13 = displayMetrics3.heightPixels;
                        int i14 = displayMetrics3.widthPixels;
                        if (i13 == i11 && i14 == i12) {
                            int i15 = displayMetrics.widthPixels;
                            C0654z.a();
                            int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
                            dimensionPixelSize = i15 - (identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0);
                            this.f1376f = dimensionPixelSize;
                        } else {
                            dimensionPixelSize = displayMetrics.widthPixels;
                            this.f1376f = dimensionPixelSize;
                        }
                    } else {
                        dimensionPixelSize = displayMetrics.widthPixels;
                        this.f1376f = dimensionPixelSize;
                    }
                } else {
                    dimensionPixelSize = displayMetrics.widthPixels;
                    this.f1376f = dimensionPixelSize;
                }
            } else {
                dimensionPixelSize = displayMetrics.widthPixels;
                this.f1376f = dimensionPixelSize;
            }
            double d10 = dimensionPixelSize / displayMetrics.density;
            i10 = (int) d10;
            if (d10 - ((double) i10) >= 0.01d) {
                i10++;
            }
        } else {
            i10 = this.f1375e;
            C0654z.a();
            this.f1376f = L4.g.B(displayMetrics, this.f1375e);
        }
        if (z10) {
            iN = N(displayMetrics);
        } else {
            iN = this.f1372b;
        }
        C0654z.a();
        this.f1373c = L4.g.B(displayMetrics, iN);
        if (!z9 && !z10) {
            if (this.f1384v || this.f1385w) {
                int i16 = this.f1375e;
                int i17 = this.f1372b;
                StringBuilder sb = new StringBuilder(String.valueOf(i16).length() + 1 + String.valueOf(i17).length() + 3);
                sb.append(i16);
                sb.append("x");
                sb.append(i17);
                sb.append("_as");
                string = sb.toString();
            } else if (zH) {
                string = "320x50_mb";
            } else {
                this.f1371a = fVar.toString();
            }
            this.f1371a = string;
        } else {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 1 + String.valueOf(iN).length() + 3);
            sb2.append(i10);
            sb2.append("x");
            sb2.append(iN);
            sb2.append("_as");
            this.f1371a = sb2.toString();
        }
        int length = fVarArr.length;
        if (length > 1) {
            this.f1377g = new m2[length];
            for (int i18 = 0; i18 < fVarArr.length; i18++) {
                this.f1377g[i18] = new m2(context, fVarArr[i18]);
            }
        } else {
            this.f1377g = null;
        }
        this.f1378h = false;
        this.f1380j = false;
    }

    m2(String str, int i10, int i11, boolean z9, int i12, int i13, m2[] m2VarArr, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.f1371a = str;
        this.f1372b = i10;
        this.f1373c = i11;
        this.f1374d = z9;
        this.f1375e = i12;
        this.f1376f = i13;
        this.f1377g = m2VarArr;
        this.f1378h = z10;
        this.f1379i = z11;
        this.f1380j = z12;
        this.f1381k = z13;
        this.f1382l = z14;
        this.f1383m = z15;
        this.f1384v = z16;
        this.f1385w = z17;
    }
}
