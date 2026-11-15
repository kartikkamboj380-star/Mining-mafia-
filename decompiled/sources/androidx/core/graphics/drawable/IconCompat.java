package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final PorterDuff.Mode f9299k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f9301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f9302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f9303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9305f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f9306g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    PorterDuff.Mode f9307h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f9308i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f9309j;

    static class a {
        static int a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon resource", e12);
                return 0;
            }
        }

        static String b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon package", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon package", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon package", e12);
                return null;
            }
        }

        static int c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e10);
                return -1;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e11);
                return -1;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e12);
                return -1;
            }
        }

        static Uri d(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon uri", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon uri", e12);
                return null;
            }
        }

        static Icon e(IconCompat iconCompat, Context context) {
            Icon iconCreateWithBitmap;
            switch (iconCompat.f9300a) {
                case -1:
                    return (Icon) iconCompat.f9301b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f9301b);
                    break;
                case 2:
                    iconCreateWithBitmap = Icon.createWithResource(iconCompat.g(), iconCompat.f9304e);
                    break;
                case 3:
                    iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f9301b, iconCompat.f9304e, iconCompat.f9305f);
                    break;
                case 4:
                    iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f9301b);
                    break;
                case 5:
                    iconCreateWithBitmap = Build.VERSION.SDK_INT < 26 ? Icon.createWithBitmap(IconCompat.a((Bitmap) iconCompat.f9301b, false)) : b.a((Bitmap) iconCompat.f9301b);
                    break;
                case 6:
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30) {
                        iconCreateWithBitmap = d.a(iconCompat.i());
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.i());
                        }
                        InputStream inputStreamJ = iconCompat.j(context);
                        if (inputStreamJ == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.i());
                        }
                        if (i10 < 26) {
                            iconCreateWithBitmap = Icon.createWithBitmap(IconCompat.a(BitmapFactory.decodeStream(inputStreamJ), false));
                        } else {
                            iconCreateWithBitmap = b.a(BitmapFactory.decodeStream(inputStreamJ));
                        }
                    }
                    break;
            }
            ColorStateList colorStateList = iconCompat.f9306g;
            if (colorStateList != null) {
                iconCreateWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f9307h;
            if (mode != IconCompat.f9299k) {
                iconCreateWithBitmap.setTintMode(mode);
            }
            return iconCreateWithBitmap;
        }
    }

    static class b {
        static Icon a(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    static class c {
        static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    static class d {
        static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f9300a = -1;
        this.f9302c = null;
        this.f9303d = null;
        this.f9304e = 0;
        this.f9305f = 0;
        this.f9306g = null;
        this.f9307h = f9299k;
        this.f9308i = null;
    }

    static Bitmap a(Bitmap bitmap, boolean z9) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f10 = iMin;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z9) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat b(Bitmap bitmap) {
        N.b.c(bitmap);
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.f9301b = bitmap;
        return iconCompat;
    }

    public static IconCompat c(Bitmap bitmap) {
        N.b.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f9301b = bitmap;
        return iconCompat;
    }

    public static IconCompat d(Resources resources, String str, int i10) {
        N.b.c(str);
        if (i10 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f9304e = i10;
        if (resources != null) {
            try {
                iconCompat.f9301b = resources.getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f9301b = str;
        }
        iconCompat.f9309j = str;
        return iconCompat;
    }

    private static String p(int i10) {
        switch (i10) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public Bitmap e() {
        int i10 = this.f9300a;
        if (i10 == -1) {
            Object obj = this.f9301b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i10 == 1) {
            return (Bitmap) this.f9301b;
        }
        if (i10 == 5) {
            return a((Bitmap) this.f9301b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public int f() {
        int i10 = this.f9300a;
        if (i10 == -1) {
            return a.a(this.f9301b);
        }
        if (i10 == 2) {
            return this.f9304e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String g() {
        int i10 = this.f9300a;
        if (i10 == -1) {
            return a.b(this.f9301b);
        }
        if (i10 == 2) {
            String str = this.f9309j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f9301b).split(":", -1)[0] : this.f9309j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int h() {
        int i10 = this.f9300a;
        return i10 == -1 ? a.c(this.f9301b) : i10;
    }

    public Uri i() {
        int i10 = this.f9300a;
        if (i10 == -1) {
            return a.d(this.f9301b);
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f9301b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream j(Context context) {
        Uri uriI = i();
        String scheme = uriI.getScheme();
        if (HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriI);
            } catch (Exception e10) {
                Log.w("IconCompat", "Unable to load image from URI: " + uriI, e10);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f9301b));
        } catch (FileNotFoundException e11) {
            Log.w("IconCompat", "Unable to load image from path: " + uriI, e11);
            return null;
        }
    }

    public void k() {
        this.f9307h = PorterDuff.Mode.valueOf(this.f9308i);
        switch (this.f9300a) {
            case -1:
                Parcelable parcelable = this.f9303d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f9301b = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f9303d;
                if (parcelable2 != null) {
                    this.f9301b = parcelable2;
                    return;
                }
                byte[] bArr = this.f9302c;
                this.f9301b = bArr;
                this.f9300a = 3;
                this.f9304e = 0;
                this.f9305f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f9302c, Charset.forName("UTF-16"));
                this.f9301b = str;
                if (this.f9300a == 2 && this.f9309j == null) {
                    this.f9309j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f9301b = this.f9302c;
                return;
        }
    }

    public void l(boolean z9) {
        this.f9308i = this.f9307h.name();
        switch (this.f9300a) {
            case -1:
                if (z9) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f9303d = (Parcelable) this.f9301b;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z9) {
                    this.f9303d = (Parcelable) this.f9301b;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f9301b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f9302c = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f9302c = ((String) this.f9301b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f9302c = (byte[]) this.f9301b;
                return;
            case 4:
            case 6:
                this.f9302c = this.f9301b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    public Bundle m() {
        Bundle bundle = new Bundle();
        switch (this.f9300a) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.f9301b);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.f9301b);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.f9301b);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.f9301b);
                break;
        }
        bundle.putInt(HandleInvocationsFromAdViewer.KEY_AD_TYPE, this.f9300a);
        bundle.putInt("int1", this.f9304e);
        bundle.putInt("int2", this.f9305f);
        bundle.putString("string1", this.f9309j);
        ColorStateList colorStateList = this.f9306g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f9307h;
        if (mode != f9299k) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    public Icon n() {
        return o(null);
    }

    public Icon o(Context context) {
        return a.e(this, context);
    }

    public String toString() {
        if (this.f9300a == -1) {
            return String.valueOf(this.f9301b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(p(this.f9300a));
        switch (this.f9300a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f9301b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f9301b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f9309j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(f())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f9304e);
                if (this.f9305f != 0) {
                    sb.append(" off=");
                    sb.append(this.f9305f);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f9301b);
                break;
        }
        if (this.f9306g != null) {
            sb.append(" tint=");
            sb.append(this.f9306g);
        }
        if (this.f9307h != f9299k) {
            sb.append(" mode=");
            sb.append(this.f9307h);
        }
        sb.append(")");
        return sb.toString();
    }

    IconCompat(int i10) {
        this.f9302c = null;
        this.f9303d = null;
        this.f9304e = 0;
        this.f9305f = 0;
        this.f9306g = null;
        this.f9307h = f9299k;
        this.f9308i = null;
        this.f9300a = i10;
    }
}
